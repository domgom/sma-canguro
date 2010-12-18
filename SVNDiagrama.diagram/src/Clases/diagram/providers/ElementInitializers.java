/*
 * 
 */
package Clases.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = Clases.diagram.part.ClasesDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			Clases.diagram.part.ClasesDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
