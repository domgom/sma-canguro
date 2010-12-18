/*
 * 
 */
package Clases.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ClasesParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser claseNombre_5004Parser;

	/**
	 * @generated
	 */
	private IParser getClaseNombre_5004Parser() {
		if (claseNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { Clases.ClasesPackage.eINSTANCE
					.getClase_Nombre() };
			Clases.diagram.parsers.MessageFormatParser parser = new Clases.diagram.parsers.MessageFormatParser(
					features);
			claseNombre_5004Parser = parser;
		}
		return claseNombre_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser atributoNombre_5001Parser;

	/**
	 * @generated
	 */
	private IParser getAtributoNombre_5001Parser() {
		if (atributoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { Clases.ClasesPackage.eINSTANCE
					.getAtributo_Nombre() };
			Clases.diagram.parsers.MessageFormatParser parser = new Clases.diagram.parsers.MessageFormatParser(
					features);
			atributoNombre_5001Parser = parser;
		}
		return atributoNombre_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser metodoNombre_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMetodoNombre_5003Parser() {
		if (metodoNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { Clases.ClasesPackage.eINSTANCE
					.getMetodo_Nombre() };
			Clases.diagram.parsers.MessageFormatParser parser = new Clases.diagram.parsers.MessageFormatParser(
					features);
			metodoNombre_5003Parser = parser;
		}
		return metodoNombre_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser parametroNombre_5002Parser;

	/**
	 * @generated
	 */
	private IParser getParametroNombre_5002Parser() {
		if (parametroNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { Clases.ClasesPackage.eINSTANCE
					.getParametro_Nombre() };
			Clases.diagram.parsers.MessageFormatParser parser = new Clases.diagram.parsers.MessageFormatParser(
					features);
			parametroNombre_5002Parser = parser;
		}
		return parametroNombre_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser relacionNombre_6001Parser;

	/**
	 * @generated
	 */
	private IParser getRelacionNombre_6001Parser() {
		if (relacionNombre_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { Clases.ClasesPackage.eINSTANCE
					.getRelacion_Nombre() };
			Clases.diagram.parsers.MessageFormatParser parser = new Clases.diagram.parsers.MessageFormatParser(
					features);
			relacionNombre_6001Parser = parser;
		}
		return relacionNombre_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Clases.diagram.edit.parts.ClaseNombreEditPart.VISUAL_ID:
			return getClaseNombre_5004Parser();
		case Clases.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID:
			return getAtributoNombre_5001Parser();
		case Clases.diagram.edit.parts.MetodoNombreEditPart.VISUAL_ID:
			return getMetodoNombre_5003Parser();
		case Clases.diagram.edit.parts.ParametroNombreEditPart.VISUAL_ID:
			return getParametroNombre_5002Parser();
		case Clases.diagram.edit.parts.RelacionNombreEditPart.VISUAL_ID:
			return getRelacionNombre_6001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(Clases.diagram.part.ClasesVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(Clases.diagram.part.ClasesVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (Clases.diagram.providers.ClasesElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
