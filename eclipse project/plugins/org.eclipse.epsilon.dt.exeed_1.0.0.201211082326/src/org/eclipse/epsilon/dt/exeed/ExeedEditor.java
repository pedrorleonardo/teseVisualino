/*******************************************************************************
 * Copyright (c) 2008-2012 The University of York, Antonio García-Domínguez
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 *     Antonio García-Domínguez - cleaning up
 ******************************************************************************/
package org.eclipse.epsilon.dt.exeed;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.presentation.EcoreEditor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceSetItemProvider;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.emf.dt.EmfRegistryManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;

public class ExeedEditor extends EcoreEditor {
	private static final class RegisteredEPackageResourceFactory implements Resource.Factory {
		public Resource createResource(URI uri) {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toString().replace("platform:/resource/", "")));
			String nsUri = "";
			try {
				InputStream is = file.getContents();
				InputStreamReader r = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(r);
				nsUri = br.readLine();
			}
			catch (Exception e) {
				LogUtil.log(e);
			}
			
			return EPackage.Registry.INSTANCE.getEPackage(nsUri).eResource();
		}
	}

	private final class SwitchableResourceSetItemProvider extends ResourceItemProviderAdapterFactory {
		@Override
		public Adapter createResourceSetAdapter() {
			return new ResourceSetItemProvider(this) {
				@Override
				public Collection<Resource> getChildren(Object object)
				  {
				    ResourceSet resourceSet = (ResourceSet)object;
				    if (showAllResources) {
				    	return resourceSet.getResources();
				    }
				    else {
						ArrayList<Resource> list = new ArrayList<Resource>();
						list.add(resourceSet.getResources().get(0));
						return list;
				    }
				  }
			};
		}
	}

	private class IDXMIResourceFactoryImpl extends XMIResourceFactoryImpl {
		@Override
		public Resource createResource(URI arg0) {
			IDXMIResource resource = new IDXMIResource(arg0);
			resource.setTrackingModification(true);
			Adapter adapter = new Adapter() {
	
				public Notifier getTarget() {
					return null;
				}
	
				public boolean isAdapterForType(Object type) {
					return false;
				}
	
				public void notifyChanged(Notification notification) {
					if (ExeedEditor.this.getViewer() != null) {
						Display.getDefault().syncExec(new Runnable() {
							public void run() {
								ExeedEditor.this.getViewer().refresh();
							}
						});
					}
				}
	
				public void setTarget(Notifier newTarget) {
					
				}
				
			};
			
			resource.eAdapters().add(adapter);
			return resource;
		}
	}

	private static class IDXMIResource extends XMIResourceImpl {
		public IDXMIResource(URI uri) {
			super(uri);
		}
		
		@Override
		protected boolean useUUIDs() {
			return true;
		}
	}

	private ExeedItemProviderAdapterFactory exeedItemProviderAdapterFactory = null;
	private ImageTextProvider imageTextProvider = null;

	private boolean showAllResources
		= getPlugin().getPreferenceStore().getBoolean(ExeedPreferencePage.SHOW_ALL_RESOURCES);
	private boolean showReferenceNamesInCreateActions
		= !getPlugin().getPreferenceStore().getBoolean(ExeedPreferencePage.HIDE_REFERENCE_NAMES);;
	private boolean sortProperties
		= !getPlugin().getPreferenceStore().getBoolean(ExeedPreferencePage.KEEP_PROPERTY_DECLARATION_ORDER);

	@Override
	public Diagnostic analyzeResourceProblems(Resource resource, Exception exception) {
		return Diagnostic.OK_INSTANCE;
	}

	protected String getPluginId() {
		return getPlugin().getPluginId();
	}

	protected ExeedPlugin getPlugin() {
		return ExeedPlugin.getDefault();
	}

	public ExeedItemProviderAdapterFactory getItemProviderAdapterFactory() {
		return exeedItemProviderAdapterFactory;
	}

	public void refresh() {
		currentViewer.refresh();
	}

	public ExeedEditor() {
		super();

		// Clear the adapter factory produced by the superclass and refill it
		// with our own selection of adapter factories
		exeedItemProviderAdapterFactory = new ExeedItemProviderAdapterFactory(getPlugin());
	    adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	    adapterFactory.addAdapterFactory(new SwitchableResourceSetItemProvider());
		adapterFactory.addAdapterFactory(exeedItemProviderAdapterFactory);

		// Recreate the editing domain with the new adapter factory and our own extension to factory map
		editingDomain = new AdapterFactoryEditingDomain(
			adapterFactory, editingDomain.getCommandStack(), new HashMap<Resource, Boolean>());

		final Map<String, Object> extensionToFactoryMap =
				editingDomain.getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionToFactoryMap.put("xml", new GenericXMLResourceFactoryImpl());

		// We shouldn't override the existing "*" default, which is the ECore
		// RegistryReader$ResourceFactoryDescriptor.
		// Otherwise, some models will not be loaded correctly (e.g. Papyrus UML
		// models).
		//
		//extensionToFactoryMap.put("*", new IDXMIResourceFactoryImpl());
		//
		// I will leave "model" as the 'generic' extension for models, though,
		// which is the usual convention followed throughout Epsilon's docs.

		extensionToFactoryMap.put("model", new IDXMIResourceFactoryImpl());
		extensionToFactoryMap.put("bim", new ResourceFactoryImpl() {
			@Override
			public Resource createResource(URI uri) {
				return new BinaryResourceImpl(uri);
			}
		});
		extensionToFactoryMap.put("registered", new RegisteredEPackageResourceFactory());
	}

	@Override
	public ExeedPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new ExeedPropertySheetPage(editingDomain, ExeedEditor.this, getPlugin());
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}
		return (ExeedPropertySheetPage) propertySheetPage;
	}

	@Override
	protected void createContextMenuForGen(StructuredViewer viewer) {
	    MenuManager contextMenu = new MenuManager("#PopUp");
	    contextMenu.add(new Separator("additions"));
	    contextMenu.setRemoveAllWhenShown(true);
	    contextMenu.addMenuListener(this);
	    Menu menu= contextMenu.createContextMenu(viewer.getControl());
	    viewer.getControl().setMenu(menu);
	    getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

	    int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
	    final Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
	    viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers,
			new ExeedEditingDomainViewerDropAdapter(editingDomain, viewer, getPlugin()));
	}

	protected void registerCustomMetamodels() {
		
	}
	
	@Override
	public void createPages() {
		EmfRegistryManager.getInstance();
		registerCustomMetamodels();
		
		super.createPages();
		
		TreeViewer viewer = (TreeViewer) getViewer();
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				event.getSource();
			}
		});

		Resource mainResource = this.getEditingDomain().getResourceSet().getResources().get(0);
		InMemoryEmfModel model = new InMemoryEmfModel(mainResource);
		model.setCachingEnabled(false);

		imageTextProvider = new ImageTextProvider(model, getPlugin(), this);
		exeedItemProviderAdapterFactory.setImageTextProvider(imageTextProvider);
		((ExeedActionBarContributor) this.getActionBarContributor()).setProvider(imageTextProvider);
	}

	public ImageTextProvider getImageTextProvider() {
		return imageTextProvider;
	}

	public boolean isShowAllResources() {
		return showAllResources;
	}

	public void setShowAllResources(boolean showAllResources) {
		this.showAllResources = showAllResources;
	}

	public boolean isSortProperties() {
		return sortProperties;
	}

	public void setSortProperties(boolean sortProperties) {
		this.sortProperties = sortProperties;
	}

	public boolean isShowReferenceNamesInCreateActions() {
		return showReferenceNamesInCreateActions;
	}

	public void setShowReferenceNamesInCreateActions(boolean showReferenceNamesInCreateActions) {
		this.showReferenceNamesInCreateActions = showReferenceNamesInCreateActions;
	}

}
