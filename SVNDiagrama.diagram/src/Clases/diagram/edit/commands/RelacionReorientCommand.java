/*
 * 
 */
package Clases.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class RelacionReorientCommand extends EditElementCommand {

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
	public RelacionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Clases.Relacion) {
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
		if (!(oldEnd instanceof Clases.Clase && newEnd instanceof Clases.Clase)) {
			return false;
		}
		Clases.Clase target = getLink().getDestino();
		if (!(getLink().eContainer() instanceof Clases.Diagrama)) {
			return false;
		}
		Clases.Diagrama container = (Clases.Diagrama) getLink().eContainer();
		return Clases.diagram.edit.policies.ClasesBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelacion_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Clases.Clase && newEnd instanceof Clases.Clase)) {
			return false;
		}
		Clases.Clase source = getLink().getOrigen();
		if (!(getLink().eContainer() instanceof Clases.Diagrama)) {
			return false;
		}
		Clases.Diagrama container = (Clases.Diagrama) getLink().eContainer();
		return Clases.diagram.edit.policies.ClasesBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistRelacion_4001(container,
						getLink(), source, getNewTarget());
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
		getLink().setOrigen(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setDestino(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Clases.Relacion getLink() {
		return (Clases.Relacion) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Clases.Clase getOldSource() {
		return (Clases.Clase) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Clases.Clase getNewSource() {
		return (Clases.Clase) newEnd;
	}

	/**
	 * @generated
	 */
	protected Clases.Clase getOldTarget() {
		return (Clases.Clase) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Clases.Clase getNewTarget() {
		return (Clases.Clase) newEnd;
	}
}
