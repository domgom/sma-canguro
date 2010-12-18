/*
 * 
 */
package Clases.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClaseClaseMetodosCompartmentItemSemanticEditPolicy extends
		Clases.diagram.edit.policies.ClasesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClaseClaseMetodosCompartmentItemSemanticEditPolicy() {
		super(Clases.diagram.providers.ClasesElementTypes.Clase_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Clases.diagram.providers.ClasesElementTypes.Metodo_3002 == req
				.getElementType()) {
			return getGEFWrapper(new Clases.diagram.edit.commands.MetodoCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
