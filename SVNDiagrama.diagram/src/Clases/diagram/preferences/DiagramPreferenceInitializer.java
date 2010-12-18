/*
 * 
 */
package Clases.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		Clases.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		Clases.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		Clases.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		Clases.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		Clases.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return Clases.diagram.part.ClasesDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
