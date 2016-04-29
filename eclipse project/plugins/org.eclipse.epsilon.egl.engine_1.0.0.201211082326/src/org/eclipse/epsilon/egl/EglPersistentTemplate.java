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

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.epsilon.common.util.UriUtil;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.egl.execute.context.IEglContext;
import org.eclipse.epsilon.egl.spec.EglTemplateSpecification;
import org.eclipse.epsilon.egl.status.StatusMessage;
import org.eclipse.epsilon.egl.util.FileUtil;

public abstract class EglPersistentTemplate extends EglTemplate {

	protected final URI outputRoot;
	protected final String outputRootPath;

	public EglPersistentTemplate(EglTemplateSpecification spec, IEglContext context, URI outputRoot, String outputRootPath) throws Exception {
		super(spec, context);
		
		this.outputRoot     = outputRoot;
		this.outputRootPath = outputRootPath;
	}
	

	protected File resolveFile(String path) throws EglRuntimeException {
		try {
			final String encodedPath = UriUtil.encode(path, false);
			final URI resolved = UriUtil.resolve(encodedPath, outputRoot);

			if ("file".equals(resolved.getScheme()))
				return new File(resolved);

			else {
				return new File(new URI("file:///" + resolved.toString()));
			}

		} catch (URISyntaxException e) {
			throw new EglRuntimeException("Could not resolve path: " + path, e, module.getAst());
		}
	}

	/**
	 * This processes the template and stores the result in the given file,
	 * provided that this file does not exist yet. This method is here for
	 * backward compatibility only.
	 * 
	 * @deprecated Use generate(path) instead, or generate(path, false, false),
	 *             if you really know what you are doing :-)
	 * @param path
	 * @throws EglRuntimeException
	 */
	public void store(String path) throws EglRuntimeException {
		generate(path, false, false);
		printStoreDeprecationWarning("store(path, overwrite)", "generate(path, false, false)");
	}

	/**
	 * This processes the template and stores the result in the given file.
	 * If overwrite is false, an existing file will prevent the result
	 * from being written. If overwrite is true, any existing file will be
	 * overwritten, not respecting protected regions. This method is here for
	 * backward compatibility only.
	 * 
	 * @deprecated Use generate(path) instead, or generate(path, overwrite, false),
	 *             if you really know what you are doing :-)
	 * @param path
	 * @param overwrite
	 * @throws EglRuntimeException
	 */
	public void store(String path, boolean overwrite) throws EglRuntimeException {
		generate(path, overwrite, false);
		printStoreDeprecationWarning("store(path, overwrite)", "generate(path, overwrite, false)");
	}

	private void printStoreDeprecationWarning(String deprecatedCode, String replacementCode) {		
		final String message = deprecatedCode + " is deprecated and will be removed in a future version of EGL. " +
		                       "generate(path), which respects protected regions, is preferred. " +
		                       "Alternatively, use " + replacementCode + " if you really know what you are doing.";
		
		printWarning(message);
	}

	/**
	 * The preferred way of generating code from a persistent template, this
	 * stores the generation result in the given file, maintaining any protected
	 * regions.
	 * 
	 * @param path
	 * @throws EglRuntimeException
	 */
	public void generate(String path) throws EglRuntimeException {
		generate(path, true, true);
	}

	/**
	 * Fully parameterised version of generate, usually only used internally.
	 * Setting overwrite to false implies protectRegions is ignored.
	 * 
	 * @param path
	 * @param overwrite
	 * @param protectRegions
	 * @throws EglRuntimeException
	 */
	public void generate(String path, boolean overwrite, boolean protectRegions) throws EglRuntimeException {
		final File outputFile = resolveFile(path);

		if (overwrite || !outputFile.exists()) {
			if (!isProcessed()) {
				process();
			}

			doGenerate(outputFile, name(path), overwrite, protectRegions);
			module.getContext().getFineGrainedTraceManager().addDestinationResourceForUnclaimedPropertyAccesses(outputFile.getAbsolutePath());
			
		} else {
			addMessage("Existing contents of " + name(path) + " were preserved.");
		}
	}
	
	private String name(String path) {
		if (outputRootPath == null) {
			return path;
		} else {
			return new File(outputRootPath).getPath() + FileUtil.FILE_SEP + path;
		}
	}

	/**
	 * Store result of processing template in the given file. Subclasses should
	 * override to implement the specific semantics of 'storing' to a file.
	 * The result of processing the template will be available from
	 * {@link #contents}.
	 * 
	 * @param path
	 * @param targetName
	 * @param overwrite
	 * @param protectRegions
	 */
	protected abstract void doGenerate(File file, String targetName, boolean overwrite, boolean protectRegions) throws EglRuntimeException;

	
	protected void addMessage(String message) {
		module.getContext().addStatusMessage(new StatusMessage(message));
	}
}