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
package org.eclipse.epsilon.examples.standalone.evl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.EvlUnsatisfiedConstraint;
import org.eclipse.epsilon.examples.standalone.EpsilonStandaloneExample;

/**
 * This example demonstrates using the 
 * Epsilon Validation Language, the model validation language
 * of Epsilon, in a stand-alone manner 
 * @author Dimitrios Kolovos
 */
public class EvlStandaloneExample extends EpsilonStandaloneExample {

	public static void main(String[] args) throws Exception {
		new EvlStandaloneExample().execute();
	}
	
	@Override
	public IEolExecutableModule createModule() {
		return new EvlModule();
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("Model", "models/Tree.xmi", "models/Tree.ecore", true, true));
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return "evl/Demo.evl";
	}

	@Override
	public void postProcess() {
		
		EvlModule module = (EvlModule) this.module;
		
		Collection<EvlUnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
	
		if (unsatisfied.size() > 0) {
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied");
			for (EvlUnsatisfiedConstraint uc : unsatisfied) {
				System.err.println(uc.getMessage());
			}
		}
		else {
			System.out.println("All constraints have been satisfied");
		}
	}

}
