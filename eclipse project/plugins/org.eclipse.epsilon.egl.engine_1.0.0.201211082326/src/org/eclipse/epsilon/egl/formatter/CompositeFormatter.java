/*******************************************************************************
 * Copyright (c) 2011 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.egl.formatter;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;


public class CompositeFormatter implements Formatter {

	private final Collection<Formatter> formatters;
	
	public CompositeFormatter(Formatter... formatters) {
		this(Arrays.asList(formatters));
	}
	
	public CompositeFormatter(Collection<Formatter> formatters) {
		this.formatters = new LinkedList<Formatter>(formatters);
	}
	
	@Override
	public String format(String text) {
		String current = text;
		
		for (Formatter formatter : formatters) {
			current = formatter.format(current);
		}
		
		return current;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CompositeFormatter))
			return false;
		
		final CompositeFormatter other = (CompositeFormatter)obj;
		
		return this.formatters.equals(other.formatters);
	}
	
	@Override
	public int hashCode() {
		return formatters.hashCode();
	}
}
