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
package org.eclipse.epsilon.egl.dt.editor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.epsilon.common.dt.editor.AbstractModuleEditor;
import org.eclipse.epsilon.common.dt.editor.DefaultDamagerRepairer2;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IAutoIndentStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.IUndoManager;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.formatter.IContentFormatter;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.jface.text.hyperlink.IHyperlinkPresenter;
import org.eclipse.jface.text.information.IInformationPresenter;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

@SuppressWarnings("deprecation")
public class EglConfiguration extends SourceViewerConfiguration {

	private final SourceViewerConfiguration configuration;
	
	public EglConfiguration(SourceViewerConfiguration configuration) {
		this.configuration = configuration;
	}
	
	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		final PresentationReconciler eglReconciler = new PresentationReconciler();

		final DefaultDamagerRepairer2 defaultRepairer = new DefaultDamagerRepairer2(new RuleBasedScanner());
		eglReconciler.setRepairer(defaultRepairer, IDocument.DEFAULT_CONTENT_TYPE);
		eglReconciler.setDamager(defaultRepairer, IDocument.DEFAULT_CONTENT_TYPE);
		
		/* Need to use the PresentationReconciler from AbstractModuleEditor to syntax highlight
		 * only the EOL_SHORTCUT and EOL sections.
		 */ 
		IPresentationReconciler typicalReconciler = configuration.getPresentationReconciler(sourceViewer);
		
		eglReconciler.setRepairer(typicalReconciler.getRepairer(IDocument.DEFAULT_CONTENT_TYPE), EglProvider.EGL_EOL);
		eglReconciler.setDamager(typicalReconciler.getDamager(IDocument.DEFAULT_CONTENT_TYPE), EglProvider.EGL_EOL);
		
		eglReconciler.setRepairer(typicalReconciler.getRepairer(IDocument.DEFAULT_CONTENT_TYPE), EglProvider.EGL_EOLSHORTCUT);
		eglReconciler.setDamager(typicalReconciler.getDamager(IDocument.DEFAULT_CONTENT_TYPE), EglProvider.EGL_EOLSHORTCUT);
		
		// Highlight comment partitions
		final DefaultDamagerRepairer2 commentRepairer = new DefaultDamagerRepairer2(getCommentScanner());
		
		eglReconciler.setRepairer(commentRepairer, EglProvider.EGL_COMMENT);
		eglReconciler.setDamager(commentRepairer, EglProvider.EGL_COMMENT);
		
		
		return eglReconciler;
	}
	
	private ITokenScanner getCommentScanner() {
		final RuleBasedScanner scanner       = new RuleBasedScanner();
		final TextAttribute    textAttribute = new TextAttribute(AbstractModuleEditor.COMMENT);
		
		scanner.setDefaultReturnToken(new Token(textAttribute));
		
		return scanner;
	}

	@Override
	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
		return configuration.getAnnotationHover(sourceViewer);
	}

	@Override
	public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, String contentType) {
		return configuration.getAutoEditStrategies(sourceViewer, contentType);
	}

	@Override
	public IAutoIndentStrategy getAutoIndentStrategy(ISourceViewer sourceViewer, String contentType) {
		return configuration.getAutoIndentStrategy(sourceViewer, contentType);
	}

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		List<String> configuredContentTypes = new ArrayList<String>();
		
		// Add all of the configured content types from the original configuration object
		configuredContentTypes.addAll(Arrays.asList(configuration.getConfiguredContentTypes(sourceViewer)));
		
		// Add EGL's content types
		configuredContentTypes.add(EglProvider.EGL_COMMENT);
		configuredContentTypes.add(EglProvider.EGL_EOL);
		configuredContentTypes.add(EglProvider.EGL_EOLSHORTCUT);
		
		// Convert the list to an array
		return configuredContentTypes.toArray(new String[]{});
	}

	@Override
	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		return configuration.getConfiguredDocumentPartitioning(sourceViewer);
	}

	@Override
	public int[] getConfiguredTextHoverStateMasks(ISourceViewer sourceViewer, String contentType) {
		return configuration.getConfiguredTextHoverStateMasks(sourceViewer, contentType);
	}

	@Override
	public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
		return configuration.getContentAssistant(sourceViewer);
	}

	@Override
	public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
		return configuration.getContentFormatter(sourceViewer);
	}

	@Override
	public String[] getDefaultPrefixes(ISourceViewer sourceViewer, String contentType) {
		return configuration.getDefaultPrefixes(sourceViewer, contentType);
	}

	@Override
	public ITextDoubleClickStrategy getDoubleClickStrategy(ISourceViewer sourceViewer, String contentType) {
		return configuration.getDoubleClickStrategy(sourceViewer, contentType);
	}

	@Override
	public IHyperlinkDetector[] getHyperlinkDetectors(ISourceViewer sourceViewer) {
		return configuration.getHyperlinkDetectors(sourceViewer);
	}

	@Override
	public IHyperlinkPresenter getHyperlinkPresenter(ISourceViewer sourceViewer) {
		return configuration.getHyperlinkPresenter(sourceViewer);
	}

	@Override
	public int getHyperlinkStateMask(ISourceViewer sourceViewer) {
		return configuration.getHyperlinkStateMask(sourceViewer);
	}

	@Override
	public String[] getIndentPrefixes(ISourceViewer sourceViewer, String contentType) {
		return configuration.getIndentPrefixes(sourceViewer, contentType);
	}

	@Override
	public IInformationControlCreator getInformationControlCreator(ISourceViewer sourceViewer) {
		return configuration.getInformationControlCreator(sourceViewer);
	}

	@Override
	public IInformationPresenter getInformationPresenter(ISourceViewer sourceViewer) {
		return configuration.getInformationPresenter(sourceViewer);
	}

	@Override
	public IAnnotationHover getOverviewRulerAnnotationHover(ISourceViewer sourceViewer) {
		return configuration.getOverviewRulerAnnotationHover(sourceViewer);
	}

	@Override
	public IQuickAssistAssistant getQuickAssistAssistant(ISourceViewer sourceViewer) {
		return configuration.getQuickAssistAssistant(sourceViewer);
	}

	@Override
	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		return configuration.getReconciler(sourceViewer);
	}

	@Override
	public int getTabWidth(ISourceViewer sourceViewer) {
		return configuration.getTabWidth(sourceViewer);
	}

	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType, int stateMask) {
		return configuration.getTextHover(sourceViewer, contentType, stateMask);
	}

	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		return configuration.getTextHover(sourceViewer, contentType);
	}

	@Override
	public IUndoManager getUndoManager(ISourceViewer sourceViewer) {
		return configuration.getUndoManager(sourceViewer);
	}
}
