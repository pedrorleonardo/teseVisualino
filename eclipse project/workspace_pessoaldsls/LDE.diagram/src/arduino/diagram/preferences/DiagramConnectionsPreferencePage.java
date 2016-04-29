/*
 * 
 */
package arduino.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.ConnectionsPreferencePage;

import arduino.diagram.part.ArduinoDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramConnectionsPreferencePage extends ConnectionsPreferencePage {

	/**
	 * @generated
	 */
	public DiagramConnectionsPreferencePage() {
		setPreferenceStore(ArduinoDiagramEditorPlugin.getInstance()
				.getPreferenceStore());
	}
}
