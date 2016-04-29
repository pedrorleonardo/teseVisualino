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
package org.eclipse.epsilon.egl.dt.launching.tabs;

import org.eclipse.epsilon.egl.dt.extensions.formatter.FormatterSpecification;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

class FormatterSpecificationLabelProvider extends LabelProvider implements ITableLabelProvider {
	@Override
	public String getColumnText(Object element, int columnIndex) {
		return ((FormatterSpecification)element).getName();
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return ((FormatterSpecification)element).getIcon();
	}
}