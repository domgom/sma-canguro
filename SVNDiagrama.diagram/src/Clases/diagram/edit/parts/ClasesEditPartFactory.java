/*
 * 
 */
package Clases.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class ClasesEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Clases.diagram.part.ClasesVisualIDRegistry
					.getVisualID(view)) {

			case Clases.diagram.edit.parts.DiagramaEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.DiagramaEditPart(view);

			case Clases.diagram.edit.parts.ClaseEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.ClaseEditPart(view);

			case Clases.diagram.edit.parts.ClaseNombreEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.ClaseNombreEditPart(view);

			case Clases.diagram.edit.parts.AtributoEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.AtributoEditPart(view);

			case Clases.diagram.edit.parts.AtributoNombreEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.AtributoNombreEditPart(
						view);

			case Clases.diagram.edit.parts.MetodoEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.MetodoEditPart(view);

			case Clases.diagram.edit.parts.MetodoNombreEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.MetodoNombreEditPart(view);

			case Clases.diagram.edit.parts.ParametroEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.ParametroEditPart(view);

			case Clases.diagram.edit.parts.ParametroNombreEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.ParametroNombreEditPart(
						view);

			case Clases.diagram.edit.parts.ClaseClaseAtributosCompartmentEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.ClaseClaseAtributosCompartmentEditPart(
						view);

			case Clases.diagram.edit.parts.ClaseClaseMetodosCompartmentEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.ClaseClaseMetodosCompartmentEditPart(
						view);

			case Clases.diagram.edit.parts.MetodoMetodoParametrosEntradaCompartmentEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.MetodoMetodoParametrosEntradaCompartmentEditPart(
						view);

			case Clases.diagram.edit.parts.RelacionEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.RelacionEditPart(view);

			case Clases.diagram.edit.parts.RelacionNombreEditPart.VISUAL_ID:
				return new Clases.diagram.edit.parts.RelacionNombreEditPart(
						view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
