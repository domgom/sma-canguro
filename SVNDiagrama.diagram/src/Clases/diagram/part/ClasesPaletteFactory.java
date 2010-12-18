/*
 * 
 */
package Clases.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class ClasesPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Clases.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAtributo1CreationTool());
		paletteContainer.add(createClase2CreationTool());
		paletteContainer.add(createMetodo3CreationTool());
		paletteContainer.add(createParametro4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Clases.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createRelacion1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtributo1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Clases.diagram.part.Messages.Atributo1CreationTool_title,
				Clases.diagram.part.Messages.Atributo1CreationTool_desc,
				Collections
						.singletonList(Clases.diagram.providers.ClasesElementTypes.Atributo_3001));
		entry.setId("createAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Clases.diagram.providers.ClasesElementTypes
				.getImageDescriptor(Clases.diagram.providers.ClasesElementTypes.Atributo_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClase2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Clases.diagram.part.Messages.Clase2CreationTool_title,
				Clases.diagram.part.Messages.Clase2CreationTool_desc,
				Collections
						.singletonList(Clases.diagram.providers.ClasesElementTypes.Clase_2001));
		entry.setId("createClase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Clases.diagram.providers.ClasesElementTypes
				.getImageDescriptor(Clases.diagram.providers.ClasesElementTypes.Clase_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetodo3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Clases.diagram.part.Messages.Metodo3CreationTool_title,
				Clases.diagram.part.Messages.Metodo3CreationTool_desc,
				Collections
						.singletonList(Clases.diagram.providers.ClasesElementTypes.Metodo_3002));
		entry.setId("createMetodo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Clases.diagram.providers.ClasesElementTypes
				.getImageDescriptor(Clases.diagram.providers.ClasesElementTypes.Metodo_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParametro4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Clases.diagram.part.Messages.Parametro4CreationTool_title,
				Clases.diagram.part.Messages.Parametro4CreationTool_desc,
				Collections
						.singletonList(Clases.diagram.providers.ClasesElementTypes.Parametro_3003));
		entry.setId("createParametro4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Clases.diagram.providers.ClasesElementTypes
				.getImageDescriptor(Clases.diagram.providers.ClasesElementTypes.Parametro_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelacion1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Clases.diagram.part.Messages.Relacion1CreationTool_title,
				Clases.diagram.part.Messages.Relacion1CreationTool_desc,
				Collections
						.singletonList(Clases.diagram.providers.ClasesElementTypes.Relacion_4001));
		entry.setId("createRelacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Clases.diagram.providers.ClasesElementTypes
				.getImageDescriptor(Clases.diagram.providers.ClasesElementTypes.Relacion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
