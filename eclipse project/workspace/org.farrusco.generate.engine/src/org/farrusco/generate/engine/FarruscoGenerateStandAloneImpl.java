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
package org.farrusco.generate.engine;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.egl.formatter.language.JavaFormatter;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;


/**
 * This example demonstrates using the 
 * Epsilon Object Language, the core language
 * of Epsilon, in a stand-alone manner 
 * @author Dimitrios Kolovos
 */
public class FarruscoGenerateStandAloneImpl extends FarruscoCompileStandAlone {
	
	private String coreModelAbsolutePath;
	private String coreMetamodelAbsolutePath;
	private String outputRootPath;
	private String templateRoot;
	
	
	public FarruscoGenerateStandAloneImpl(String coreModelAbsolutePath, String coreMetamodelAbsolutePath, String outputRootPath, String templateRoot){
		this.coreModelAbsolutePath = coreModelAbsolutePath;
		this.coreMetamodelAbsolutePath = coreMetamodelAbsolutePath;
		this.outputRootPath = outputRootPath;
		this.templateRoot = templateRoot;
	}
	
	@Override
	public IEolExecutableModule createModule() {
		EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		
		factory.setDefaultFormatter(new JavaFormatter());
		
		try {
			factory.setOutputRoot(outputRootPath);
			factory.setTemplateRoot(templateRoot);
		} catch (EglRuntimeException e1) {
			e1.printStackTrace();
		}
		
		EglTemplateFactoryModuleAdapter template = new EglTemplateFactoryModuleAdapter(factory);
		
		return template;
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("CoreModel", coreModelAbsolutePath, coreMetamodelAbsolutePath, true, false));
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return "RunDemo.egl";
	}

	@Override
	public void postProcess() {
		System.out.println(result);
	}
	
}
