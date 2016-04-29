/*
 * 
 */
package farrusco.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import farrusco.Behavior;
import farrusco.Filho;
import farrusco.Node;
import farrusco.Robot;
import farrusco.diagram.edit.policies.FarruscoBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class FilhoReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public FilhoReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Filho) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Behavior && newEnd instanceof Behavior)) {
			return false;
		}
		if (getLink().getTarget().size() != 1) {
			return false;
		}
		Node target = (Node) getLink().getTarget().get(0);
		if (!(getLink().eContainer() instanceof Robot)) {
			return false;
		}
		Robot container = (Robot) getLink().eContainer();
		return FarruscoBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistFilho_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Node && newEnd instanceof Node)) {
			return false;
		}
		if (getLink().getSource().size() != 1) {
			return false;
		}
		Behavior source = (Behavior) getLink().getSource().get(0);
		if (!(getLink().eContainer() instanceof Robot)) {
			return false;
		}
		Robot container = (Robot) getLink().eContainer();
		return FarruscoBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistFilho_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().getSource().remove(getOldSource());
		getLink().getSource().add(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().getTarget().remove(getOldTarget());
		getLink().getTarget().add(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Filho getLink() {
		return (Filho) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Behavior getOldSource() {
		return (Behavior) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Behavior getNewSource() {
		return (Behavior) newEnd;
	}

	/**
	 * @generated
	 */
	protected Node getOldTarget() {
		return (Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Node getNewTarget() {
		return (Node) newEnd;
	}
}
