/*******************************************************************************
 * Copyright (c) 2012 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Dimitrios Kolovos - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.egl.dt.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.dt.editor.contentassist.IAbstractModuleEditorTemplateContributor;
import org.eclipse.jface.text.templates.Template;

public class EgxEditorStaticTemplateContributor implements IAbstractModuleEditorTemplateContributor {
	
	List<Template> templates = null;
	public List<Template> getTemplates() {
		if (templates == null) {
			templates = new ArrayList<Template>();
			templates.add(new Template("transform", "transform rule", "", "rule ${rulename} \r\n\ttransform s : ${sourcemodel}!${sourcetype} {\r\n\t${cursor}\r\n}",false));
			templates.add(new Template("pre", "block executed before the rules", "", "pre ${name} {\r\n\t${cursor}\r\n}",false));
			templates.add(new Template("post", "block executed after the rules", "", "post ${name} {\r\n\t${cursor}\r\n}",false));
		}
		return templates;
	}
}
