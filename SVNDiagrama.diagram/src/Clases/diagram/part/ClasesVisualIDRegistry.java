/*
 * 
 */
package Clases.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ClasesVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "SVNDiagrama.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (Clases.diagram.edit.parts.DiagramaEditPart.MODEL_ID.equals(view
					.getType())) {
				return Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return Clases.diagram.part.ClasesVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				Clases.diagram.part.ClasesDiagramEditorPlugin.getInstance()
						.logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Clases.ClasesPackage.eINSTANCE.getDiagrama().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Clases.Diagrama) domainElement)) {
			return Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = Clases.diagram.part.ClasesVisualIDRegistry
				.getModelID(containerView);
		if (!Clases.diagram.edit.parts.DiagramaEditPart.MODEL_ID
				.equals(containerModelID) && !"Clases".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (Clases.diagram.edit.parts.DiagramaEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Clases.diagram.part.ClasesVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			if (Clases.ClasesPackage.eINSTANCE.getClase().isSuperTypeOf(
					domainElement.eClass())) {
				return Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID;
			}
			break;
		case Clases.diagram.edit.parts.ClaseClaseAtributosCompartmentEditPart.VISUAL_ID:
			if (Clases.ClasesPackage.eINSTANCE.getAtributo().isSuperTypeOf(
					domainElement.eClass())) {
				return Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID;
			}
			break;
		case Clases.diagram.edit.parts.ClaseClaseMetodosCompartmentEditPart.VISUAL_ID:
			if (Clases.ClasesPackage.eINSTANCE.getMetodo().isSuperTypeOf(
					domainElement.eClass())) {
				return Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID;
			}
			break;
		case Clases.diagram.edit.parts.MetodoMetodoParametrosEntradaCompartmentEditPart.VISUAL_ID:
			if (Clases.ClasesPackage.eINSTANCE.getParametro().isSuperTypeOf(
					domainElement.eClass())) {
				return Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = Clases.diagram.part.ClasesVisualIDRegistry
				.getModelID(containerView);
		if (!Clases.diagram.edit.parts.DiagramaEditPart.MODEL_ID
				.equals(containerModelID) && !"Clases".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (Clases.diagram.edit.parts.DiagramaEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = Clases.diagram.part.ClasesVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			if (Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID:
			if (Clases.diagram.edit.parts.ClaseNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Clases.diagram.edit.parts.ClaseClaseAtributosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Clases.diagram.edit.parts.ClaseClaseMetodosCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			if (Clases.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID:
			if (Clases.diagram.edit.parts.MetodoNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Clases.diagram.edit.parts.MetodoMetodoParametrosEntradaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID:
			if (Clases.diagram.edit.parts.ParametroNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clases.diagram.edit.parts.ClaseClaseAtributosCompartmentEditPart.VISUAL_ID:
			if (Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clases.diagram.edit.parts.ClaseClaseMetodosCompartmentEditPart.VISUAL_ID:
			if (Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clases.diagram.edit.parts.MetodoMetodoParametrosEntradaCompartmentEditPart.VISUAL_ID:
			if (Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			if (Clases.diagram.edit.parts.RelacionNombreEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Clases.ClasesPackage.eINSTANCE.getRelacion().isSuperTypeOf(
				domainElement.eClass())) {
			return Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Clases.Diagrama element) {
		return true;
	}

}
