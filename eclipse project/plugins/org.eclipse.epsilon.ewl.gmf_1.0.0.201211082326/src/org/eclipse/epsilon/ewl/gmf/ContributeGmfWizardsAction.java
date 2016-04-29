/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.ewl.gmf;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.epsilon.ewl.emf.AbstractContributeWizardsAction;
import org.eclipse.epsilon.ewl.emf.WorkbenchPartRefresher;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

public class ContributeGmfWizardsAction extends AbstractContributeWizardsAction {
	
	protected EObject getEObject(Object selected) {
		if (selected instanceof IGraphicalEditPart) {
			IGraphicalEditPart gep = (IGraphicalEditPart) selected;
			EObject semanticElement = gep.resolveSemanticElement();
			if (semanticElement != null) {
				return semanticElement;
			}
		}
		return null;
	}
	
	protected EditingDomain getEditingDomain() {
		return ((DiagramEditor) targetPart).getDiagramEditPart().getEditingDomain();
	}

	@Override
	protected WorkbenchPartRefresher getWorkbenchPartRefresher() {
		return new WorkbenchPartRefresher() {

			@Override
			public void refresh() {
				DiagramEditor editor = (DiagramEditor) part;
				EObject root = editor.getDiagram().getElement();
				refresh(root);
			}
			
			protected void refresh(EObject eObject) {
				List editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(eObject);
                for (Iterator it = editPolicies.iterator(); it.hasNext();) {
                        CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
                                nextEditPolicy.refresh();
                               
                }
                for (EObject content : eObject.eContents()) {
                	refresh(content);
                }
			}
			
		};
	}

}
