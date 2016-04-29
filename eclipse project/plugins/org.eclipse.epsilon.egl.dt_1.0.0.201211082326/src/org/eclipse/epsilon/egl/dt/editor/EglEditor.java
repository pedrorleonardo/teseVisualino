/*******************************************************************************
 * Copyright (c) 2008 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.egl.dt.editor;

import java.util.List;

import org.eclipse.epsilon.common.dt.editor.AbstractModuleEditor;
import org.eclipse.epsilon.common.dt.editor.outline.ModuleElementLabelProvider;
import org.eclipse.epsilon.common.module.IModule;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.dt.editor.outline.EglModuleElementLabelProvider;
import org.eclipse.epsilon.eol.dt.editor.EolEditor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;


public class EglEditor extends AbstractModuleEditor {
	
	public static final String ID = "org.eclipse.epsilon.egl.dt.editor.EglEditor";

	private final EolEditor eolEditor = new EolEditor();
	
	public EglEditor() {
		setBackgroundColor(new Color(Display.getCurrent(), 251, 242, 184));
		setDocumentProvider(new EglProvider());
		addTemplateContributor(new EglEditorStaticTemplateContributor());
	}
		
	@Override
	public void init(IEditorSite site, IEditorInput input) {
		super.init(site, input);
		
		// Syntax highlight according to partitioning
		setSourceViewerConfiguration(new EglConfiguration(super.getSourceViewerConfiguration()));
	}

	@Override
	public List<String> getKeywords() {
		return eolEditor.getKeywords();
	}

	@Override
	public List<String> getBuiltinVariables() {
		List<String> vars = eolEditor.getBuiltinVariables();
		
		vars.add("out");
		vars.add("TemplateFactory");
		
		vars.add("openTag");
		vars.add("openOutputTag");
		vars.add("closeTag");
		
		return vars;
	}
	
	@Override
	public List<String> getTypes() {
		List<String> types = super.getTypes();
		
		types.add("Template");
		
		return types;
	}

	@Override
	public IModule createModule() {
		return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
	}

	@Override
	public ModuleElementLabelProvider createModuleElementLabelProvider() {
		return new EglModuleElementLabelProvider();
	}

	@Override
	protected boolean supportsHyperlinks() {
		return true;
	}
	
	@Override
	protected boolean supportsDirtyTextParsing() {
		return true;
	}
}
