/*
 * 
 */
package arduino.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import arduino.Acao;
import arduino.Robo;
import arduino.Transicoes;
import arduino.diagram.edit.policies.ArduinoBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TransicoesReorientCommand extends EditElementCommand {

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
	public TransicoesReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Transicoes) {
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
		if (!(oldEnd instanceof Acao && newEnd instanceof Acao)) {
			return false;
		}
		Acao target = getLink().getAcao_de_Saida();
		if (!(getLink().eContainer() instanceof Robo)) {
			return false;
		}
		Robo container = (Robo) getLink().eContainer();
		return ArduinoBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransicoes_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Acao && newEnd instanceof Acao)) {
			return false;
		}
		Acao source = getLink().getAcao_de_Entrada();
		if (!(getLink().eContainer() instanceof Robo)) {
			return false;
		}
		Robo container = (Robo) getLink().eContainer();
		return ArduinoBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransicoes_4001(container, getLink(), source,
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
		getLink().setAcao_de_Entrada(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setAcao_de_Saida(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Transicoes getLink() {
		return (Transicoes) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Acao getOldSource() {
		return (Acao) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Acao getNewSource() {
		return (Acao) newEnd;
	}

	/**
	 * @generated
	 */
	protected Acao getOldTarget() {
		return (Acao) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Acao getNewTarget() {
		return (Acao) newEnd;
	}
}
