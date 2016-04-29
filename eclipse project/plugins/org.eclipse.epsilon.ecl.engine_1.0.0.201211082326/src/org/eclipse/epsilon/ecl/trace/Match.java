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
package org.eclipse.epsilon.ecl.trace;

import org.eclipse.epsilon.ecl.MatchRule;
import org.eclipse.epsilon.eol.types.EolMap;

public class Match {
	
	/**
	 * The left object of the match
	 */
	protected Object left;
	
	/**
	 * The right object of the match
	 */
	protected Object right;
	
	/**
	 * The result of the ECL match rule
	 */
	protected boolean matching;
	
	/**
	 * The ECL match rule that created the match
	 */
	protected MatchRule rule;
	
	/**
	 * If the match is user-specified or has
	 * been calculated by ECL
	 */
	protected boolean userSpecified = false;
	
	/**
	 * Additional info that the user can attach
	 * in the do part of the match rule
	 */
	protected EolMap info = new EolMap();
	
	public Match() {
		matching = false;
	}
	
	public Match(Object left, Object right, boolean matching){
		this.left = left;
		this.right = right;
		this.matching = matching;
	}
	
	public MatchRule getRule() {
		return rule;
	}

	public void setRule(MatchRule rule) {
		this.rule = rule;
	}
	
	public boolean isMatching() {
		return matching;
	}
	
	public void setMatching(boolean matching) {
		this.matching = matching;
	}
	
	public Object getLeft() {
		return left;
	}
	
	public void setLeft(Object left) {
		this.left = left;
	}
	
	public Object getRight() {
		return right;
	}
	
	public void setRight(Object right) {
		this.right = right;
	}
	
	public boolean contains(Object left, Object right){
		//boolean contains = (this.left == left && this.right == right) || (this.left == right && this.right == left);
		//return contains;
		return this.left == left && this.right == right;
	}
	
	public boolean contains(Object object){
		return (this.left == object || this.right == object);
	}
	
	@Override
	public String toString(){
		return toString(left) + " <-> " + toString(right);
	}
	
	public boolean isUserSpecified() {
		return userSpecified;
	}

	public void setUserSpecified(boolean userSpecified) {
		this.userSpecified = userSpecified;
	}

	public String toString(Object o){
		if (o != null) return o.toString();
		else return "";
	}

	public EolMap getInfo() {
		return info;
	}

	public void setInfo(EolMap info) {
		this.info = info;
	}
	
	
}
