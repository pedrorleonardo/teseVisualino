/*******************************************************************************
 * Copyright (c) 2009 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************
 *
 * $Id$
 */
package org.eclipse.epsilon.egl;

import java.io.File;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.epsilon.common.parse.AST;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.execute.context.IEglContext;
import org.eclipse.epsilon.egl.formatter.Formatter;
import org.eclipse.epsilon.eol.EolModelDefinition;
import org.eclipse.epsilon.eol.EolModelGroupDefinition;
import org.eclipse.epsilon.eol.EolOperationFactory;
import org.eclipse.epsilon.eol.EolOperations;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.IEolLibraryModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;

public class EglTemplateFactoryModuleAdapter implements IEolExecutableModule {

	private final EglTemplateFactory factory;
	private EglTemplate current;
	
	public EglTemplateFactoryModuleAdapter(EglTemplateFactory factory) {
		this.factory = factory;
	}
	
	public boolean parse(File file) throws Exception {
		current = factory.load(file);
		return getParseProblems().isEmpty();
	}
	
	public boolean parse(URI uri) throws Exception {
		current = factory.load(uri);
		return getParseProblems().isEmpty();
	}
	
	public boolean parse(String code) throws Exception {
		current = factory.prepare(code);
		return getParseProblems().isEmpty();
	}
	
	public boolean parse(String code, File file) throws Exception {
		current = factory.load(code, file);
		return current.getParseProblems().isEmpty();
	}
	
	public List<ParseProblem> getParseProblems() {
		return current == null ? new LinkedList<ParseProblem>() : current.getParseProblems();
	}

	public Object execute() throws EolRuntimeException {
		return current == null ? null : current.process();
	}
		
	public AST getAst() { 
		return current == null ? null : current.getAst(); 
	}
	
	public void reset() {
		current = null;
	}

	public void buildModel() throws Exception {}


	public List<?> getChildren() { 
		return current == null ? Collections.EMPTY_LIST : current.getChildren(); 
	}

	public IEglContext getContext() {
		return factory.getContext();
	}

	public List<EolModelDefinition> getDeclaredModelDefinitions() {
		return current.getDeclaredModelDefinitions();
	}

	public List<EolModelGroupDefinition> getDeclaredModelGroupDefinitions() {
		return current.getDeclaredModelGroupDefinitions();
	}

	public EolOperations getDeclaredOperations() {
		return current.getDeclaredOperations();
	}

	public List<?> getImports() {
		return current.getImports();
	}

	public Set<EolModelDefinition> getModelDefinitions() {
		return current.getModelDefinitions();
	}

	public Set<EolModelGroupDefinition> getModelGroupDefinitions() {
		return current.getModelGroupDefinitions();
	}

	public EolOperationFactory getOperationFactory() {
		return current.getOperationFactory();
	}

	public EolOperations getOperations() {
		
		return current.getOperations();
	}

	public void setOperationFactory(EolOperationFactory operationFactory) {
		current.setOperationFactory(operationFactory);
	}

	public void setDefaultFormatters(Collection<Formatter> defaultFormatters) {
		factory.setDefaultFormatters(defaultFormatters);
	}

	@Override
	public IEolLibraryModule getParent() {
		return null;
	}

	@Override
	public void setParent(IEolLibraryModule parent) {
		// do nothing
	}

	@Override
	public URI getSourceUri() {
		return null;
	}
}
