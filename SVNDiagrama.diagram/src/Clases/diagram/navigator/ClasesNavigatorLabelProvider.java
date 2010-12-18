/*
 * 
 */
package Clases.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class ClasesNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Clases.diagram.part.ClasesDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Clases.diagram.part.ClasesDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Clases.diagram.navigator.ClasesNavigatorItem
				&& !isOwnView(((Clases.diagram.navigator.ClasesNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Clases.diagram.navigator.ClasesNavigatorGroup) {
			Clases.diagram.navigator.ClasesNavigatorGroup group = (Clases.diagram.navigator.ClasesNavigatorGroup) element;
			return Clases.diagram.part.ClasesDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof Clases.diagram.navigator.ClasesNavigatorItem) {
			Clases.diagram.navigator.ClasesNavigatorItem navigatorItem = (Clases.diagram.navigator.ClasesNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (Clases.diagram.part.ClasesVisualIDRegistry.getVisualID(view)) {
		case Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?diagrama?Diagrama", Clases.diagram.providers.ClasesElementTypes.Diagrama_1000); //$NON-NLS-1$
		case Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?diagrama?Clase", Clases.diagram.providers.ClasesElementTypes.Clase_2001); //$NON-NLS-1$
		case Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?diagrama?Parametro", Clases.diagram.providers.ClasesElementTypes.Parametro_3003); //$NON-NLS-1$
		case Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?diagrama?Relacion", Clases.diagram.providers.ClasesElementTypes.Relacion_4001); //$NON-NLS-1$
		case Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?diagrama?Atributo", Clases.diagram.providers.ClasesElementTypes.Atributo_3001); //$NON-NLS-1$
		case Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?diagrama?Metodo", Clases.diagram.providers.ClasesElementTypes.Metodo_3002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Clases.diagram.part.ClasesDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null
				&& elementType != null
				&& Clases.diagram.providers.ClasesElementTypes
						.isKnownElementType(elementType)) {
			image = Clases.diagram.providers.ClasesElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof Clases.diagram.navigator.ClasesNavigatorGroup) {
			Clases.diagram.navigator.ClasesNavigatorGroup group = (Clases.diagram.navigator.ClasesNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Clases.diagram.navigator.ClasesNavigatorItem) {
			Clases.diagram.navigator.ClasesNavigatorItem navigatorItem = (Clases.diagram.navigator.ClasesNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Clases.diagram.part.ClasesVisualIDRegistry.getVisualID(view)) {
		case Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
			return getDiagrama_1000Text(view);
		case Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID:
			return getClase_2001Text(view);
		case Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID:
			return getParametro_3003Text(view);
		case Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
			return getRelacion_4001Text(view);
		case Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
			return getAtributo_3001Text(view);
		case Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID:
			return getMetodo_3002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDiagrama_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getClase_2001Text(View view) {
		IParser parser = Clases.diagram.providers.ClasesParserProvider
				.getParser(
						Clases.diagram.providers.ClasesElementTypes.Clase_2001,
						view.getElement() != null ? view.getElement() : view,
						Clases.diagram.part.ClasesVisualIDRegistry
								.getType(Clases.diagram.edit.parts.ClaseNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Clases.diagram.part.ClasesDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParametro_3003Text(View view) {
		IParser parser = Clases.diagram.providers.ClasesParserProvider
				.getParser(
						Clases.diagram.providers.ClasesElementTypes.Parametro_3003,
						view.getElement() != null ? view.getElement() : view,
						Clases.diagram.part.ClasesVisualIDRegistry
								.getType(Clases.diagram.edit.parts.ParametroNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Clases.diagram.part.ClasesDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRelacion_4001Text(View view) {
		IParser parser = Clases.diagram.providers.ClasesParserProvider
				.getParser(
						Clases.diagram.providers.ClasesElementTypes.Relacion_4001,
						view.getElement() != null ? view.getElement() : view,
						Clases.diagram.part.ClasesVisualIDRegistry
								.getType(Clases.diagram.edit.parts.RelacionNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Clases.diagram.part.ClasesDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtributo_3001Text(View view) {
		IParser parser = Clases.diagram.providers.ClasesParserProvider
				.getParser(
						Clases.diagram.providers.ClasesElementTypes.Atributo_3001,
						view.getElement() != null ? view.getElement() : view,
						Clases.diagram.part.ClasesVisualIDRegistry
								.getType(Clases.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Clases.diagram.part.ClasesDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMetodo_3002Text(View view) {
		IParser parser = Clases.diagram.providers.ClasesParserProvider
				.getParser(
						Clases.diagram.providers.ClasesElementTypes.Metodo_3002,
						view.getElement() != null ? view.getElement() : view,
						Clases.diagram.part.ClasesVisualIDRegistry
								.getType(Clases.diagram.edit.parts.MetodoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Clases.diagram.part.ClasesDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return Clases.diagram.edit.parts.DiagramaEditPart.MODEL_ID
				.equals(Clases.diagram.part.ClasesVisualIDRegistry
						.getModelID(view));
	}

}
