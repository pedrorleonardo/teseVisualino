/*
 * 
 */
package farrusco.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import farrusco.diagram.providers.FarruscoElementTypes;

/**
 * @generated
 */
public class FilhoItemSemanticEditPolicy extends
		FarruscoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FilhoItemSemanticEditPolicy() {
		super(FarruscoElementTypes.Filho_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}