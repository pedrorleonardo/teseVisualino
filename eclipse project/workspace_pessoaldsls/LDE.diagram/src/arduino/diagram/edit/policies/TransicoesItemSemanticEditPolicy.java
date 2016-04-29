/*
 * 
 */
package arduino.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import arduino.diagram.providers.ArduinoElementTypes;

/**
 * @generated
 */
public class TransicoesItemSemanticEditPolicy extends
		ArduinoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TransicoesItemSemanticEditPolicy() {
		super(ArduinoElementTypes.Transicoes_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
