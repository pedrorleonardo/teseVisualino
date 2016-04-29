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
package org.eclipse.epsilon.eol.execute;

import java.util.Collection;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.util.CollectionUtil;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.types.EolCollectionType;

public class DeleteStatementExecutor extends AbstractExecutor {

	public DeleteStatementExecutor() {
		super();
	}

	@Override
	public Object execute(AST ast, IEolContext context) throws EolRuntimeException {
		Object target = null;
		if (ast.getFirstChild() != null){
			target = context.getExecutorFactory().executeAST(ast.getFirstChild(), context);
		}
		
		Collection col = CollectionUtil.asCollection(target);
		
		for (Object instance : EolCollectionType.clone(col)) {
			//if (context.getModelRepository().isModelElement(instance)) {
			IModel model = context.getModelRepository().getOwningModel(instance);
				
			if (model != null) {
				model.deleteElement(instance);
			}	
			//else {
			//	throw new EolNotAModelElementException(ast.getFirstChild(), instance, context);
			//}
		}
		return null;
	}

}
