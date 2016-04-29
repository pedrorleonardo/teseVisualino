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
package org.eclipse.epsilon.egl.dt.launching;

import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.epsilon.common.dt.launching.tabs.EpsilonLaunchConfigurationTabGroup;
import org.eclipse.epsilon.egl.dt.launching.tabs.EglGeneratedTextConfigurationTab;
import org.eclipse.epsilon.egl.dt.launching.tabs.EglSourceConfigurationTab;

public class EglLaunchConfigurationTabGroup extends EpsilonLaunchConfigurationTabGroup {

	@Override
	public ILaunchConfigurationTab getSourceConfigurationTab() {
		return new EglSourceConfigurationTab();
	}
	
	@Override
	public ILaunchConfigurationTab[] getOtherConfigurationTabs() {
		return new ILaunchConfigurationTab[]{new EglGeneratedTextConfigurationTab()};
	}
	
}
