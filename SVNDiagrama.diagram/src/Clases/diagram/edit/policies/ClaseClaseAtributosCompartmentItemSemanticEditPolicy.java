/*
 * 
 */
package Clases.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ClaseClaseAtributosCompartmentItemSemanticEditPolicy extends
		Clases.diagram.edit.policies.ClasesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ClaseClaseAtributosCompartmentItemSemanticEditPolicy() {
		super(Clases.diagram.providers.ClasesElementTypes.Clase_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Clases.diagram.providers.ClasesElementTypes.Atributo_3001 == req
				.getElementType()) {
			return getGEFWrapper(new Clases.diagram.edit.commands.AtributoCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
