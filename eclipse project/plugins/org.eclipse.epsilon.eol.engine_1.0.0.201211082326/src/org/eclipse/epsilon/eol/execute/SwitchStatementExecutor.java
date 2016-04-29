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
package org.eclipse.epsilon.eol.execute;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.flowcontrol.EolBreakException;
import org.eclipse.epsilon.eol.exceptions.flowcontrol.EolContinueException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.eol.parse.EolParser;

public class SwitchStatementExecutor extends AbstractExecutor {

	@Override
	public Object execute(AST ast, IEolContext context)
			throws EolRuntimeException {
		
		AST switchValueAst = ast.getFirstChild();
		
		Object switchValue = context.getExecutorFactory().executeAST(switchValueAst, context);
		
		AST nextCase = switchValueAst.getNextSibling();
		
		try {
			
			boolean continue_ = false;
			
			while (nextCase != null) {
				
				if (nextCase.getType() == EolParser.CASE) {
					AST caseValueAst = nextCase.getFirstChild();
					
					if (continue_ || equals(context.getExecutorFactory().executeAST(caseValueAst, context), switchValue)) {
						AST caseBodyStatement = caseValueAst.getNextSibling();
						try {
							Object result = context.getExecutorFactory().executeAST(caseBodyStatement, context);
							if (result instanceof Return) return result;
						}
						catch (EolContinueException ex) {
							continue_ = true;
						}
						
						if (!continue_) { break; }
						
					}
				}
				else if (nextCase.getType() == EolParser.DEFAULT) {
					AST defaultBodyStatement = nextCase.getFirstChild();
					Object result = context.getExecutorFactory().executeAST(defaultBodyStatement, context);
					if (result instanceof Return) return result;
					
				}
				
				nextCase = nextCase.getNextSibling();
				
			}
			
		}
		catch (EolBreakException e) {
			
		}
		
		return null;
	}
	
	protected boolean equals(Object o1, Object o2) {
		if (o1 == null && o2 == null) return true;
		if (o1 == null || o2 == null) return false;
		return o1.equals(o2);
	}
	
}
