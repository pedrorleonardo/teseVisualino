/*
 * 
 */
package arduino.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import arduino.diagram.edit.parts.Bumper_PressionadoEditPart;
import arduino.diagram.edit.parts.CentrarEditPart;
import arduino.diagram.edit.parts.Desligar_CorEditPart;
import arduino.diagram.edit.parts.Desligar_CoresEditPart;
import arduino.diagram.edit.parts.Desligar_IntermitenciaEditPart;
import arduino.diagram.edit.parts.Desligar_LED_VerdeEditPart;
import arduino.diagram.edit.parts.Distancia_Infra_VermelhosEditPart;
import arduino.diagram.edit.parts.FimEditPart;
import arduino.diagram.edit.parts.IfEditPart;
import arduino.diagram.edit.parts.InicioEditPart;
import arduino.diagram.edit.parts.Ligar_AzulEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_Arco_IrisEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_PoliciaEditPart;
import arduino.diagram.edit.parts.Ligar_IntermitenciaEditPart;
import arduino.diagram.edit.parts.Ligar_LED_VerdeEditPart;
import arduino.diagram.edit.parts.Ligar_VerdeEditPart;
import arduino.diagram.edit.parts.Ligar_VermelhoEditPart;
import arduino.diagram.edit.parts.Mover_AleatoriamenteEditPart;
import arduino.diagram.edit.parts.Mover_FrenteEditPart;
import arduino.diagram.edit.parts.Mover_Frente_TempoEditPart;
import arduino.diagram.edit.parts.Mover_TrasEditPart;
import arduino.diagram.edit.parts.Mover_Tras_TempoEditPart;
import arduino.diagram.edit.parts.PararEditPart;
import arduino.diagram.edit.parts.Parar_TempoEditPart;
import arduino.diagram.edit.parts.RoboEditPart;
import arduino.diagram.edit.parts.Rodar_Direita_TempoEditPart;
import arduino.diagram.edit.parts.Rodar_Esquerda_TempoEditPart;
import arduino.diagram.edit.parts.TransicoesEditPart;
import arduino.diagram.edit.parts.Virar_45_DrtEditPart;
import arduino.diagram.edit.parts.Virar_45_EsqEditPart;
import arduino.diagram.edit.parts.Virar_DireitaEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaEditPart;
import arduino.diagram.edit.parts.Virar_Max_DrtEditPart;
import arduino.diagram.edit.parts.Virar_Max_EsqEditPart;
import arduino.diagram.edit.parts.Virar_para_X_GrausEditPart;
import arduino.diagram.edit.parts.WhileEditPart;
import arduino.diagram.part.ArduinoVisualIDRegistry;
import arduino.diagram.part.Messages;

/**
 * @generated
 */
public class ArduinoNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public ArduinoNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<ArduinoNavigatorItem> result = new ArrayList<ArduinoNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, RoboEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof ArduinoNavigatorGroup) {
			ArduinoNavigatorGroup group = (ArduinoNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ArduinoNavigatorItem) {
			ArduinoNavigatorItem navigatorItem = (ArduinoNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		 * Due to plugin.xml restrictions this code will be called only for views representing
		 * shortcuts to this diagram elements created on other diagrams. 
		 */
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement)
					.getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (ArduinoVisualIDRegistry.getVisualID(view)) {

		case WhileEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_While_2027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_While_2027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RoboEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			ArduinoNavigatorGroup links = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Robo_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_Cores_PoliciaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_Cores_Arco_IrisEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_AzulEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_VerdeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_VermelhoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_CorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_CoresEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_LED_VerdeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_LED_VerdeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_IntermitenciaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_IntermitenciaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_EsquerdaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_FrenteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_TrasEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_DireitaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Rodar_Esquerda_TempoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Rodar_Direita_TempoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_Frente_TempoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_Tras_TempoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_para_X_GrausEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_Max_DrtEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_Max_EsqEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(CentrarEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_45_EsqEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_45_DrtEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_AleatoriamenteEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(PararEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Parar_TempoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(InicioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(FimEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Bumper_PressionadoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Distancia_Infra_VermelhosEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case Mover_Frente_TempoEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Frente_Tempo_2018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Frente_Tempo_2018_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Ligar_AzulEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Azul_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Azul_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Desligar_LED_VerdeEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Desligar_LED_Verde_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Desligar_LED_Verde_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TransicoesEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ArduinoNavigatorGroup target = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Transicoes_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup source = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Transicoes_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_Cores_PoliciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_Cores_Arco_IrisEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_AzulEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_VerdeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_VermelhoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_CorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_CoresEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_LED_VerdeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_LED_VerdeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_IntermitenciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_IntermitenciaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_EsquerdaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_FrenteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_TrasEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_DireitaEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Rodar_Esquerda_TempoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Rodar_Direita_TempoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_Frente_TempoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_Tras_TempoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_para_X_GrausEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_Max_DrtEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_Max_EsqEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(CentrarEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_45_EsqEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_45_DrtEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_AleatoriamenteEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(PararEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Parar_TempoEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(InicioEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(FimEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_Cores_PoliciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_Cores_Arco_IrisEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_AzulEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_VerdeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_VermelhoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_CorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_CoresEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_LED_VerdeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_LED_VerdeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Ligar_IntermitenciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Desligar_IntermitenciaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_EsquerdaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_FrenteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_TrasEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_DireitaEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Rodar_Esquerda_TempoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Rodar_Direita_TempoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_Frente_TempoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_Tras_TempoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_para_X_GrausEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_Max_DrtEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_Max_EsqEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(CentrarEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_45_EsqEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Virar_45_DrtEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Mover_AleatoriamenteEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(PararEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(Parar_TempoEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(WhileEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(IfEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(InicioEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry.getType(FimEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case Mover_Tras_TempoEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Tras_Tempo_2019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Tras_Tempo_2019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Mover_TrasEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Tras_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Tras_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Ligar_VerdeEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Verde_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Verde_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case IfEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_If_2028_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_If_2028_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case FimEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Fim_2030_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Fim_2030_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Virar_Max_DrtEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_Max_Drt_2021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_Max_Drt_2021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Ligar_LED_VerdeEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_LED_Verde_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_LED_Verde_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case CentrarEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Centrar_2023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Centrar_2023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Cores_Arco_Iris_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Cores_Arco_Iris_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Rodar_Direita_TempoEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Rodar_Direita_Tempo_2017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Rodar_Direita_Tempo_2017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Desligar_CorEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Desligar_Cor_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Desligar_Cor_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Ligar_IntermitenciaEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Intermitencia_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Intermitencia_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Virar_EsquerdaEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_Esquerda_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_Esquerda_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Mover_AleatoriamenteEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Aleatoriamente_2026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Aleatoriamente_2026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InicioEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Inicio_2029_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Inicio_2029_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Desligar_CoresEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Desligar_Cores_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Desligar_Cores_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Ligar_Cores_PoliciaEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Cores_Policia_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Cores_Policia_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Virar_45_EsqEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_45_Esq_2024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_45_Esq_2024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Virar_45_DrtEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_45_Drt_2025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_45_Drt_2025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Ligar_VermelhoEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Vermelho_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Ligar_Vermelho_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PararEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Parar_2035_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Parar_2035_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Desligar_IntermitenciaEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Desligar_Intermitencia_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Desligar_Intermitencia_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Rodar_Esquerda_TempoEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Rodar_Esquerda_Tempo_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Rodar_Esquerda_Tempo_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Virar_Max_EsqEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_Max_Esq_2022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_Max_Esq_2022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Virar_DireitaEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_Direita_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_Direita_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Mover_FrenteEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Frente_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Mover_Frente_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Parar_TempoEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Parar_Tempo_2036_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Parar_Tempo_2036_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case Virar_para_X_GrausEditPart.VISUAL_ID: {
			LinkedList<ArduinoAbstractNavigatorItem> result = new LinkedList<ArduinoAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArduinoNavigatorGroup incominglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_para_X_Graus_2020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArduinoNavigatorGroup outgoinglinks = new ArduinoNavigatorGroup(
					Messages.NavigatorGroupName_Virar_para_X_Graus_2020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArduinoVisualIDRegistry
							.getType(TransicoesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return RoboEditPart.MODEL_ID.equals(ArduinoVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ArduinoNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ArduinoNavigatorItem> result = new ArrayList<ArduinoNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ArduinoNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<ArduinoNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView)
					&& nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ArduinoAbstractNavigatorItem) {
			ArduinoAbstractNavigatorItem abstractNavigatorItem = (ArduinoAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
