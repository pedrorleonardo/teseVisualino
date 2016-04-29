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
package org.eclipse.epsilon.eml.strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.common.util.CollectionUtil;
import org.eclipse.epsilon.ecl.trace.Match;
import org.eclipse.epsilon.eml.MergeRule;
import org.eclipse.epsilon.eml.MergeRules;
import org.eclipse.epsilon.eml.execute.context.IEmlContext;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;
import org.eclipse.epsilon.erl.rules.INamedRule;
import org.eclipse.epsilon.etl.strategy.DefaultTransformationStrategy;


public class DefaultMergingStrategy extends DefaultTransformationStrategy implements IMergingStrategy{
	
	protected IEmlContext context = null;
	
	public void mergeModels(IEmlContext context) throws EolRuntimeException {
		
		this.context = context;
		
		for (Match match : context.getMatchTrace().getMatches()) {
			MergeRules rules = context.getModule().getMergeRules().getRulesFor(match, context);
			for (INamedRule rule : rules) {
				MergeRule mergeRule = (MergeRule) rule;
				if (!mergeRule.isLazy(context) && !mergeRule.hasMerged(match)) {
					mergeRule.merge(match, context);
				}
			}
		}
		
		transformModels(context);
	}

	public Collection getEquivalents(Object source, IEolContext context,
			List<String> rules) throws EolRuntimeException {
		
		if (!getExcluded().contains(source)) {
			return super.getEquivalents(source, context, rules);
		}
		else {
			return merge(source, context, rules);
		}
	}

	
	//TODO : Implement this
	private Collection merge(Object source, IEolContext context_,
			List<String> rules) throws EolRuntimeException {
		
		List<Match> matches = context.getMatchTrace().getMatches(source);
		
		List targets = CollectionUtil.createDefaultList();
		
		for (Match match : matches) {
			for (INamedRule rule : context.getModule().getMergeRules().getRulesFor(match, context)) {
				MergeRule mergeRule = (MergeRule) rule;
				if (rules == null || rules.contains(rule.getName())) {
					
					Collection merged = mergeRule.merge(match, context);
					
					if (!mergeRule.isPrimary(context)) {
						targets.addAll(merged);
					}
					else {
						int i = 0;
						for (Object target : merged) {
							targets.add(i, target);
							i++;
						}
					}
				}
			}
		}
		return targets;
	}


	//TODO : Improve performance by turning this into a HashSet?
	protected List<Object> excluded = null;
	
	public List<Object> getExcluded() {
		if (excluded == null) {
			excluded = new ArrayList<Object>();
			for (Match match : context.getMatchTrace().getMatches()) {
				excluded.add(match.getLeft());
				excluded.add(match.getRight());
			}
		}
		return excluded;
	}
	
}
