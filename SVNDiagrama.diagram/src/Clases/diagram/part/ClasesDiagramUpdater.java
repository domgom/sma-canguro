/*
 * 
 */
package Clases.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ClasesDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesNodeDescriptor> getSemanticChildren(
			View view) {
		switch (Clases.diagram.part.ClasesVisualIDRegistry.getVisualID(view)) {
		case Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000SemanticChildren(view);
		case Clases.diagram.edit.parts.ClaseClaseAtributosCompartmentEditPart.VISUAL_ID:
			return getClaseClaseAtributosCompartment_7001SemanticChildren(view);
		case Clases.diagram.edit.parts.ClaseClaseMetodosCompartmentEditPart.VISUAL_ID:
			return getClaseClaseMetodosCompartment_7002SemanticChildren(view);
		case Clases.diagram.edit.parts.MetodoMetodoParametrosEntradaCompartmentEditPart.VISUAL_ID:
			return getMetodoMetodoParametrosEntradaCompartment_7003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesNodeDescriptor> getDiagrama_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Clases.Diagrama modelElement = (Clases.Diagrama) view.getElement();
		LinkedList<Clases.diagram.part.ClasesNodeDescriptor> result = new LinkedList<Clases.diagram.part.ClasesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getClases().iterator(); it.hasNext();) {
			Clases.Clase childElement = (Clases.Clase) it.next();
			int visualID = Clases.diagram.part.ClasesVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID) {
				result.add(new Clases.diagram.part.ClasesNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesNodeDescriptor> getClaseClaseAtributosCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clases.Clase modelElement = (Clases.Clase) containerView.getElement();
		LinkedList<Clases.diagram.part.ClasesNodeDescriptor> result = new LinkedList<Clases.diagram.part.ClasesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAtributos().iterator(); it
				.hasNext();) {
			Clases.Atributo childElement = (Clases.Atributo) it.next();
			int visualID = Clases.diagram.part.ClasesVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID) {
				result.add(new Clases.diagram.part.ClasesNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesNodeDescriptor> getClaseClaseMetodosCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clases.Clase modelElement = (Clases.Clase) containerView.getElement();
		LinkedList<Clases.diagram.part.ClasesNodeDescriptor> result = new LinkedList<Clases.diagram.part.ClasesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMetodos().iterator(); it
				.hasNext();) {
			Clases.Metodo childElement = (Clases.Metodo) it.next();
			int visualID = Clases.diagram.part.ClasesVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID) {
				result.add(new Clases.diagram.part.ClasesNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesNodeDescriptor> getMetodoMetodoParametrosEntradaCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Clases.Metodo modelElement = (Clases.Metodo) containerView.getElement();
		LinkedList<Clases.diagram.part.ClasesNodeDescriptor> result = new LinkedList<Clases.diagram.part.ClasesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParametrosEntrada().iterator(); it
				.hasNext();) {
			Clases.Parametro childElement = (Clases.Parametro) it.next();
			int visualID = Clases.diagram.part.ClasesVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID) {
				result.add(new Clases.diagram.part.ClasesNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getContainedLinks(
			View view) {
		switch (Clases.diagram.part.ClasesVisualIDRegistry.getVisualID(view)) {
		case Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000ContainedLinks(view);
		case Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID:
			return getClase_2001ContainedLinks(view);
		case Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3001ContainedLinks(view);
		case Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID:
			return getMetodo_3002ContainedLinks(view);
		case Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID:
			return getParametro_3003ContainedLinks(view);
		case Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getIncomingLinks(
			View view) {
		switch (Clases.diagram.part.ClasesVisualIDRegistry.getVisualID(view)) {
		case Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID:
			return getClase_2001IncomingLinks(view);
		case Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3001IncomingLinks(view);
		case Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID:
			return getMetodo_3002IncomingLinks(view);
		case Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID:
			return getParametro_3003IncomingLinks(view);
		case Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (Clases.diagram.part.ClasesVisualIDRegistry.getVisualID(view)) {
		case Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID:
			return getClase_2001OutgoingLinks(view);
		case Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3001OutgoingLinks(view);
		case Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID:
			return getMetodo_3002OutgoingLinks(view);
		case Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID:
			return getParametro_3003OutgoingLinks(view);
		case Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getDiagrama_1000ContainedLinks(
			View view) {
		Clases.Diagrama modelElement = (Clases.Diagrama) view.getElement();
		LinkedList<Clases.diagram.part.ClasesLinkDescriptor> result = new LinkedList<Clases.diagram.part.ClasesLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getClase_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getAtributo_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getMetodo_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getParametro_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getRelacion_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getClase_2001IncomingLinks(
			View view) {
		Clases.Clase modelElement = (Clases.Clase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Clases.diagram.part.ClasesLinkDescriptor> result = new LinkedList<Clases.diagram.part.ClasesLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relacion_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getAtributo_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getMetodo_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getParametro_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getRelacion_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getClase_2001OutgoingLinks(
			View view) {
		Clases.Clase modelElement = (Clases.Clase) view.getElement();
		LinkedList<Clases.diagram.part.ClasesLinkDescriptor> result = new LinkedList<Clases.diagram.part.ClasesLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relacion_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getAtributo_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getMetodo_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getParametro_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Clases.diagram.part.ClasesLinkDescriptor> getRelacion_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<Clases.diagram.part.ClasesLinkDescriptor> getContainedTypeModelFacetLinks_Relacion_4001(
			Clases.Diagrama container) {
		LinkedList<Clases.diagram.part.ClasesLinkDescriptor> result = new LinkedList<Clases.diagram.part.ClasesLinkDescriptor>();
		for (Iterator<?> links = container.getRelaciones().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Clases.Relacion) {
				continue;
			}
			Clases.Relacion link = (Clases.Relacion) linkObject;
			if (Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID != Clases.diagram.part.ClasesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clases.Clase dst = link.getDestino();
			Clases.Clase src = link.getOrigen();
			result.add(new Clases.diagram.part.ClasesLinkDescriptor(src, dst,
					link,
					Clases.diagram.providers.ClasesElementTypes.Relacion_4001,
					Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Clases.diagram.part.ClasesLinkDescriptor> getIncomingTypeModelFacetLinks_Relacion_4001(
			Clases.Clase target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Clases.diagram.part.ClasesLinkDescriptor> result = new LinkedList<Clases.diagram.part.ClasesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != Clases.ClasesPackage.eINSTANCE
					.getRelacion_Destino()
					|| false == setting.getEObject() instanceof Clases.Relacion) {
				continue;
			}
			Clases.Relacion link = (Clases.Relacion) setting.getEObject();
			if (Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID != Clases.diagram.part.ClasesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clases.Clase src = link.getOrigen();
			result.add(new Clases.diagram.part.ClasesLinkDescriptor(src,
					target, link,
					Clases.diagram.providers.ClasesElementTypes.Relacion_4001,
					Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Clases.diagram.part.ClasesLinkDescriptor> getOutgoingTypeModelFacetLinks_Relacion_4001(
			Clases.Clase source) {
		Clases.Diagrama container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Clases.Diagrama) {
				container = (Clases.Diagrama) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<Clases.diagram.part.ClasesLinkDescriptor> result = new LinkedList<Clases.diagram.part.ClasesLinkDescriptor>();
		for (Iterator<?> links = container.getRelaciones().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Clases.Relacion) {
				continue;
			}
			Clases.Relacion link = (Clases.Relacion) linkObject;
			if (Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID != Clases.diagram.part.ClasesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Clases.Clase dst = link.getDestino();
			Clases.Clase src = link.getOrigen();
			if (src != source) {
				continue;
			}
			result.add(new Clases.diagram.part.ClasesLinkDescriptor(src, dst,
					link,
					Clases.diagram.providers.ClasesElementTypes.Relacion_4001,
					Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID));
		}
		return result;
	}

}
