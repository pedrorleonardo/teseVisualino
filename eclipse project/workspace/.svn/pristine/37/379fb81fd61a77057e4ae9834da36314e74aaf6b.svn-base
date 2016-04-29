package org.farrusco.generate.action;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditDomain;
import org.eclipse.gef.tools.AbstractTool;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.farrusco.generate.engine.FarruscoGenerateStandAloneImpl;
import org.osgi.framework.Bundle;

public class GenerateTool extends AbstractTool {

	@Override
	protected String getCommandName() {
		return "Generate IDs";
	}

	@Override
	public void activate() {
		super.activate();

		try {

			// Fetch current editing model
			EditDomain domain = getDomain();
			if (!(domain instanceof DiagramEditDomain)) {
				throw new RuntimeException(
						"Arduino");
			}
			DiagramEditDomain diagramEditDomain = (DiagramEditDomain) domain;
			IDiagramWorkbenchPart editorPartInterface = diagramEditDomain
					.getDiagramEditorPart();
			Diagram diagramModelElement = editorPartInterface.getDiagram();
			EObject modelElement = diagramModelElement.getElement();
			org.eclipse.emf.ecore.resource.Resource modelResource = modelElement
					.eResource();
			org.eclipse.emf.common.util.URI resourceUri = modelResource
					.getURI();
			org.eclipse.emf.common.util.URI realPlatformURI = CommonPlugin
					.asLocalURI(resourceUri);
			org.eclipse.emf.common.util.URI realURI = CommonPlugin
					.resolve(realPlatformURI);
			String modelSchemeSpecificPart = realURI.path();
			
			modelSchemeSpecificPart = "C:" + modelSchemeSpecificPart;
			
			// Fetch Metamodel From Bundle
			Bundle modelPlugin = Platform.getBundle("org.farrusco");
			IPath mmPath = new Path("model/farrusco.ecore");
			URL mmPathInPlugin = FileLocator.find(modelPlugin, mmPath,
					Collections.EMPTY_MAP);
			URL realMmPath = FileLocator.toFileURL(mmPathInPlugin);
			String mmSchemeSpecificPart = realMmPath.toURI()
					.getPath();
			mmSchemeSpecificPart = mmSchemeSpecificPart.substring(1);
			// Execute EOL on that model;
			// new TrNetVisualGenerateIDsStandAloneImpl(modelSchemeSpecificPart,
			// mmSchemeSpecificPart).execute();

			// Refresh resource
			refreshProject(realURI);
			
			String outputRootPath = getOutputRootPath(realURI).getSchemeSpecificPart();
			outputRootPath = outputRootPath.substring(1);
			
			String templateRootPath = getTemplateRoot().getSchemeSpecificPart();
			templateRootPath = templateRootPath.substring(1);
			templateRootPath = "file:/" + templateRootPath;
			// Generate Code
			new FarruscoGenerateStandAloneImpl(modelSchemeSpecificPart, mmSchemeSpecificPart, outputRootPath, templateRootPath).execute();
			
			// Refresh whole project
			refreshProject(realURI);



			// Since this is a button, we want to immediately change tool.
			getDomain().loadDefaultTool();
			
			
			// Since this is a button, we want to immediately change tool.
			getDomain().loadDefaultTool();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private java.net.URI getTemplateRoot() {
		URL templatePathURL;
		java.net.URI templatePathURI = null;
		try {
			templatePathURL = getElementInPlugin("org.farrusco.generate.engine",
					"src/org/farrusco/generate/engine");
			templatePathURI = templatePathURL.toURI();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return templatePathURI;
	}

	private java.net.URI getOutputRootPath(org.eclipse.emf.common.util.URI someFIleWithinTheProject) {
		java.net.URI result = getCurrentProject(someFIleWithinTheProject)
				.getLocationURI();
		return result;
	}

	private void refreshProject(org.eclipse.emf.common.util.URI someFIleWithinTheProject)
			throws CoreException {
		IProject project = getCurrentProject(someFIleWithinTheProject);
		project.refreshLocal(IResource.DEPTH_INFINITE, null);
	}

	private IProject getCurrentProject(org.eclipse.emf.common.util.URI someFIleWithinTheProject) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IFile modelFile = root.getFileForLocation(new Path(
				someFIleWithinTheProject.toFileString()));
		IProject project = modelFile.getProject();
		return project;
	}

	private URL getElementInPlugin(String plugin, String pathInPlugin)
			throws IOException {
		Bundle trnetPlugin = Platform.getBundle(plugin);
		IPath trnetMMPath = new Path(pathInPlugin);
		URL mmPathInTrnetPlugin = FileLocator.find(trnetPlugin, trnetMMPath,
				Collections.EMPTY_MAP);
		URL realTrnetMMPath = FileLocator.toFileURL(mmPathInTrnetPlugin);
		return realTrnetMMPath;
	}
}
