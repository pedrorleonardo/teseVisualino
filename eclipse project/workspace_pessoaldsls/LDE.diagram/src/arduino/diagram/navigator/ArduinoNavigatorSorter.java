/*
 * 
 */
package arduino.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import arduino.diagram.part.ArduinoVisualIDRegistry;

/**
 * @generated
 */
public class ArduinoNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ArduinoNavigatorItem) {
			ArduinoNavigatorItem item = (ArduinoNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ArduinoVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
