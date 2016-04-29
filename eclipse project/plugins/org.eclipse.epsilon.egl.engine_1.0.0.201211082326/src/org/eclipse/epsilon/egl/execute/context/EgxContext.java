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
package org.eclipse.epsilon.egl.execute.context;

import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.egl.traceability.Template;

public class EgxContext extends EglContext {
	
	protected Template baseTemplate = null;
	
	public EgxContext(EglTemplateFactory templateFactory) {
		super(templateFactory);
	}
	
	@Override
	public Template getBaseTemplate() {
		if (baseTemplate == null) {
			baseTemplate = new EgxModuleTemplateAdapter((EgxModule) module);
		}
		return baseTemplate;
	}
	
	public void setBaseTemplate(Template baseTemplate) {
		this.baseTemplate = baseTemplate;
	}
	
}
