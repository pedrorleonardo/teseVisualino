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
package org.eclipse.epsilon.eol.execute.introspection;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.epsilon.eol.exceptions.EolIllegalPropertyException;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.execute.context.IEolContext;

public class ExtendedPropertySetter extends AbstractPropertySetter {
	
	IEolContext context = null;
	
	public ExtendedPropertySetter(IEolContext context) {
		this.context = context;
	}
	
	public void invoke(Object value) throws EolRuntimeException {
		
		Map<String, Object> extendedProperties = context.getExtendedProperties().get(object);
		if (extendedProperties == null) {
			extendedProperties = new HashMap<String, Object>();
			context.getExtendedProperties().put(object, extendedProperties);
		}
		extendedProperties.put(this.property.substring(1), value);
	}

	public Object coerce(Object value) throws EolIllegalPropertyException {
		return value;
	}

	public boolean conforms(Object value) throws EolIllegalPropertyException {
		return true;
	}

}
