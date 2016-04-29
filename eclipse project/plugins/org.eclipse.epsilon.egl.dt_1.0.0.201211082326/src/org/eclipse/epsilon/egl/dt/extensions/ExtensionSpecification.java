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
package org.eclipse.epsilon.egl.dt.extensions;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;

public abstract class ExtensionSpecification<T> {

	private final T implementation;
	
	@SuppressWarnings("unchecked")
	public ExtensionSpecification(IConfigurationElement extension) {
		try {
			this.implementation = (T)extension.createExecutableExtension("implementation");
		
		} catch (CoreException e) {
			throw new ExtensionLocatorException("Error encountered whilst loading formatter from extension point in: " + 
			                                    extension.getDeclaringExtension().getNamespaceIdentifier(),
			                                    e);
		}
	}

	public String getIdentifier() {
		return implementation.getClass().getCanonicalName();
	}
	
	public T instantiate() {
		return implementation;
	}
}
