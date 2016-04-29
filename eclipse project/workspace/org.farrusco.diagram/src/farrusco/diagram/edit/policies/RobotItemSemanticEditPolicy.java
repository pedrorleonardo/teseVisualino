/*
 * 
 */
package farrusco.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import farrusco.diagram.edit.commands.BumpersCreateCommand;
import farrusco.diagram.edit.commands.DistanciaCreateCommand;
import farrusco.diagram.edit.commands.EsperaCreateCommand;
import farrusco.diagram.edit.commands.LEDCreateCommand;
import farrusco.diagram.edit.commands.MotorCreateCommand;
import farrusco.diagram.edit.commands.ParaleloCreateCommand;
import farrusco.diagram.edit.commands.PrioridadeCreateCommand;
import farrusco.diagram.edit.commands.SequencialCreateCommand;
import farrusco.diagram.edit.commands.ServoCreateCommand;
import farrusco.diagram.providers.FarruscoElementTypes;

/**
 * @generated
 */
public class RobotItemSemanticEditPolicy extends
		FarruscoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RobotItemSemanticEditPolicy() {
		super(FarruscoElementTypes.Robot_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FarruscoElementTypes.Distancia_2001 == req.getElementType()) {
			return getGEFWrapper(new DistanciaCreateCommand(req));
		}
		if (FarruscoElementTypes.Bumpers_2002 == req.getElementType()) {
			return getGEFWrapper(new BumpersCreateCommand(req));
		}
		if (FarruscoElementTypes.Espera_2003 == req.getElementType()) {
			return getGEFWrapper(new EsperaCreateCommand(req));
		}
		if (FarruscoElementTypes.Motor_2004 == req.getElementType()) {
			return getGEFWrapper(new MotorCreateCommand(req));
		}
		if (FarruscoElementTypes.Servo_2005 == req.getElementType()) {
			return getGEFWrapper(new ServoCreateCommand(req));
		}
		if (FarruscoElementTypes.LED_2006 == req.getElementType()) {
			return getGEFWrapper(new LEDCreateCommand(req));
		}
		if (FarruscoElementTypes.Prioridade_2007 == req.getElementType()) {
			return getGEFWrapper(new PrioridadeCreateCommand(req));
		}
		if (FarruscoElementTypes.Paralelo_2008 == req.getElementType()) {
			return getGEFWrapper(new ParaleloCreateCommand(req));
		}
		if (FarruscoElementTypes.Sequencial_2009 == req.getElementType()) {
			return getGEFWrapper(new SequencialCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}