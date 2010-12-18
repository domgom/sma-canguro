/*
 * 
 */
package Clases.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ClasesElementTypes {

	/**
	 * @generated
	 */
	private ClasesElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Diagrama_1000 = getElementType("SVNDiagrama.diagram.Diagrama_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Clase_2001 = getElementType("SVNDiagrama.diagram.Clase_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Atributo_3001 = getElementType("SVNDiagrama.diagram.Atributo_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Metodo_3002 = getElementType("SVNDiagrama.diagram.Metodo_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Parametro_3003 = getElementType("SVNDiagrama.diagram.Parametro_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Relacion_4001 = getElementType("SVNDiagrama.diagram.Relacion_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return Clases.diagram.part.ClasesDiagramEditorPlugin
						.getInstance().getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Diagrama_1000,
					Clases.ClasesPackage.eINSTANCE.getDiagrama());

			elements.put(Clase_2001, Clases.ClasesPackage.eINSTANCE.getClase());

			elements.put(Atributo_3001,
					Clases.ClasesPackage.eINSTANCE.getAtributo());

			elements.put(Metodo_3002,
					Clases.ClasesPackage.eINSTANCE.getMetodo());

			elements.put(Parametro_3003,
					Clases.ClasesPackage.eINSTANCE.getParametro());

			elements.put(Relacion_4001,
					Clases.ClasesPackage.eINSTANCE.getRelacion());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Diagrama_1000);
			KNOWN_ELEMENT_TYPES.add(Clase_2001);
			KNOWN_ELEMENT_TYPES.add(Atributo_3001);
			KNOWN_ELEMENT_TYPES.add(Metodo_3002);
			KNOWN_ELEMENT_TYPES.add(Parametro_3003);
			KNOWN_ELEMENT_TYPES.add(Relacion_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return Diagrama_1000;
		case Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID:
			return Clase_2001;
		case Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return Atributo_3001;
		case Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID:
			return Metodo_3002;
		case Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID:
			return Parametro_3003;
		case Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return Relacion_4001;
		}
		return null;
	}

}
