/*******************************************************************************
 * Copyright (c) 2012 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package org.eclipse.epsilon.egl.dt.extensions.fineGrainedTracePostprocessor;

import org.eclipse.epsilon.egl.engine.traceability.fine.trace.Trace;

public interface IFineGrainedTracePostprocessor {

	/**
	 * Process the fine-grained trace from the EGL execution context
	 * in some manner.
	 * 
	 * The trace is shared between all clients. Consequently,
	 * implementations of this method must not alter the trace.
	 */
	public void postprocess(Trace trace);

}
