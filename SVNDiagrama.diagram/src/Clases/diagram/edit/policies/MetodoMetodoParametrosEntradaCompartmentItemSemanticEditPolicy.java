/*
 * 
 */
package Clases.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MetodoMetodoParametrosEntradaCompartmentItemSemanticEditPolicy
		extends Clases.diagram.edit.policies.ClasesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MetodoMetodoParametrosEntradaCompartmentItemSemanticEditPolicy() {
		super(Clases.diagram.providers.ClasesElementTypes.Metodo_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Clases.diagram.providers.ClasesElementTypes.Parametro_3003 == req
				.getElementType()) {
			return getGEFWrapper(new Clases.diagram.edit.commands.ParametroCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
