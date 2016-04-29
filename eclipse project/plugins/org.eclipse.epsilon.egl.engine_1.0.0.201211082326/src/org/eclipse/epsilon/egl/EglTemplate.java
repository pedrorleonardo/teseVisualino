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
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.egl.execute.context.IEglContext;
import org.eclipse.epsilon.egl.formatter.CompositeFormatter;
import org.eclipse.epsilon.egl.formatter.Formatter;
import org.eclipse.epsilon.egl.formatter.NullFormatter;
import org.eclipse.epsilon.egl.internal.EglModule;
import org.eclipse.epsilon.egl.internal.EglResult;
import org.eclipse.epsilon.egl.merge.DefaultMerger;
import org.eclipse.epsilon.egl.merge.Merger;
import org.eclipse.epsilon.egl.spec.EglTemplateSpecification;
import org.eclipse.epsilon.egl.spec.EglTemplateSpecificationFactory;
import org.eclipse.epsilon.egl.status.ProtectedRegionWarning;
import org.eclipse.epsilon.egl.traceability.Template;

public class EglTemplate extends AbstractEglTemplate {

	protected final String name;
	protected final Template template;
	
	private Formatter formatter;
	private String contents = "";
	private boolean processed = false;
	
	// For tests
	protected EglTemplate(URI path, IEglContext context) throws Exception {
		this(new EglTemplateSpecificationFactory(new NullFormatter()).fromResource(path.toString(), path), context);
	}

	public EglTemplate(EglTemplateSpecification spec, IEglContext context) throws Exception {
		this(spec.getName(), context, spec.createTemplate(), spec.getDefaultFormatter());
		
		spec.parseInto(module);
	}
	
	private EglTemplate(String name, IEglContext context, Template template, Formatter formatter) {
		super(new EglModule(context));
		
		this.name     = name;
		this.template = template;
		this.formatter = formatter;
	}
	
	public String getName() {
		return name;
	}

	public void populate(String name, Object value) {
		template.addVariable(name, value);
	}
	
	public String process() throws EglRuntimeException {
		final EglResult result = module.execute(template, formatter);
		
		contents = result.generatedText;
		processed = true;

		return contents;
	}
	
	public String merge(String existing) throws EglRuntimeException {
		if (!isProcessed()) process();
		 
		final Merger merger = new DefaultMerger(module.getContext().getPartitioner(),
				                                contents,
				                                existing);
		
		final String result = merger.merge();
		
		for (ProtectedRegionWarning warning : merger.getMergeWarnings()) {
			addProtectedRegionWarning(warning);
		}
		
		return result;
	}
	
	protected void addProtectedRegionWarning(ProtectedRegionWarning warning) {
		module.getContext().addStatusMessage(warning);
	}
	
	protected String getContents() {
		return contents;
	}
	
	protected boolean isProcessed() {
		return processed;
	}
	
	public Formatter getFormatter() {
		return formatter;
	}
	
	public void setFormatter(Formatter formatter) {
		this.formatter = formatter;
	}
	
	public void setFormatters(Formatter... formatters) {
		setFormatters(Arrays.asList(formatters));
	}
	
	public void setFormatters(Collection<Formatter> formatters) {
		setFormatter(new CompositeFormatter(formatters));
	}

	public Template getTemplate() {
		return template;
	}
	
	// TODO merge traceability template class into here?
}
