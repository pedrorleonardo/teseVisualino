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
package org.eclipse.epsilon.examples.standalone.etl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.examples.standalone.EpsilonStandaloneExample;

/**
 * This example demonstrates using the 
 * Epsilon Transformation Language, the M2M language
 * of Epsilon, in a stand-alone manner 
 * @author Dimitrios Kolovos
 */
public class EtlStandaloneExample extends EpsilonStandaloneExample {
	
	public static void main(String[] args) throws Exception {
		new EtlStandaloneExample().execute();
	}
	
	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("Source", "models/Tree.xmi", "models/Tree.ecore", true, false));
		models.add(createEmfModel("Target", "models/Copy.xmi", "models/Tree.ecore", false, true));
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return "etl/Demo.etl";
	}

	@Override
	public void postProcess() {
		
	}

}
