/*
 * 
 */
package farrusco.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import farrusco.diagram.part.FarruscoVisualIDRegistry;

/**
 * @generated
 */
public class FarruscoNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof FarruscoNavigatorItem) {
			FarruscoNavigatorItem item = (FarruscoNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return FarruscoVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
