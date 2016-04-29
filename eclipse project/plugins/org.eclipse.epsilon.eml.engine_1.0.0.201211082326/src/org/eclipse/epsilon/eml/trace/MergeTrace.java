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
package org.eclipse.epsilon.eml.trace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

import org.eclipse.epsilon.ecl.trace.Match;
import org.eclipse.epsilon.eml.MergeRule;

public class MergeTrace extends ArrayList{
	
	public void add(Match match, Collection targets, MergeRule rule){
		Merge merge = new Merge();
		merge.match = match;
		merge.setTargets(targets);
		merge.setRule(rule);
		add(merge);
	}
	
	public Merges getMerges(Match match){
		ListIterator li = listIterator();
		Merges merges = new Merges();
		while (li.hasNext()){
			Merge merge = (Merge)li.next();
			if (merge.getMatch() == match) {
				merges.add(merge);
			}
		}
		return merges;
	}

	public Merges getMerges(Match match, MergeRule mergeRule){
		ListIterator li = listIterator();
		Merges merges = new Merges();
		while (li.hasNext()){
			Merge merge = (Merge)li.next();
			if (merge.getMatch() == match && merge.getRule() == mergeRule) {
				merges.add(merge);
			}
		}
		return merges;
	}
	/*
	public Merges getMerges(Object left, Object right){
		ListIterator li = listIterator();
		Merges merges = new Merges();
		while (li.hasNext()){
			Merge merge = (Merge)li.next();
			if (merge.contains(left,right)){
				merges.add(merge);
			}
		}
		return merges;
	}
	
	public Merges getMerges(Object left, Object right, MergeRule rule){
		ListIterator li = listIterator();
		Merges merges = new Merges();
		while (li.hasNext()){
			Merge merge = (Merge)li.next();
			if (merge.contains(left,right) && merge.getRule() == rule){
				merges.add(merge);
			}
		}
		return merges;
	}*/
}
