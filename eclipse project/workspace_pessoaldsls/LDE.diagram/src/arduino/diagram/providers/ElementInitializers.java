/*
 * 
 */
package arduino.diagram.providers;

import arduino.diagram.part.ArduinoDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = ArduinoDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ArduinoDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
