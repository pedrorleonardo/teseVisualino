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
package org.eclipse.epsilon.egl;

import java.net.URI;

import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.egl.execute.context.IEglContext;
import org.eclipse.epsilon.egl.spec.EglTemplateSpecification;

public class EglFileGeneratingTemplateFactory extends EglTemplateFactory {
	
	protected URI   outputRoot;
	protected String outputRootPath;
	
	public EglFileGeneratingTemplateFactory() {}
	
	public EglFileGeneratingTemplateFactory(IEglContext context) {
		super(context);
	}

	public String getOutputRoot() {
		return outputRootPath;
	}
	
	public void setOutputRoot(String path) throws EglRuntimeException {
		
		outputRootPath = path;
		outputRoot     = resolveRoot(path);
	}

	@Override
	protected EglTemplate createTemplate(EglTemplateSpecification spec) throws Exception {
		return new EglFileGeneratingTemplate(spec, context, getOutputRootOrRoot(), outputRootPath);
	}
	
	protected URI getOutputRootOrRoot() {
		return outputRoot != null ? outputRoot : root;
	}
}
