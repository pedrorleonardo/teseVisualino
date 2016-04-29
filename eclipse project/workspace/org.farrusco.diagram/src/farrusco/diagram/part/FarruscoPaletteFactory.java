/*
 * 
 */
package farrusco.diagram.part;

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
import org.farrusco.generate.action.GenerateTool;

import farrusco.diagram.providers.FarruscoElementTypes;

/**
 * @generated
 */
public class FarruscoPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createAcções1Group());
		paletteRoot.add(createLigações2Group());
		paletteRoot.add(createCriarPrograma3Group());
		paletteRoot.add(createControlo4Group());
	}

	/**
	 * Creates "Acções" palette tool group
	 * @generated
	 */
	private PaletteContainer createAcções1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Acções1Group_title);
		paletteContainer.setId("createAcções1Group"); //$NON-NLS-1$
		paletteContainer.add(createColisao1CreationTool());
		paletteContainer.add(createDistancia2CreationTool());
		paletteContainer.add(createLuz3CreationTool());
		paletteContainer.add(createMotores4CreationTool());
		paletteContainer.add(createPescoço5CreationTool());
		paletteContainer.add(createRelógio6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Ligações" palette tool group
	 * @generated
	 */
	private PaletteContainer createLigações2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Ligações2Group_title);
		paletteContainer.setId("createLigações2Group"); //$NON-NLS-1$
		paletteContainer.add(createFilho1CreationTool());
		paletteContainer.add(createIrmao2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Criar Programa" palette tool group
	 * @generated
	 */
	private PaletteContainer createCriarPrograma3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.CriarPrograma3Group_title);
		paletteContainer.setId("createCriarPrograma3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.CriarPrograma3Group_desc);
		paletteContainer.add(createPrograma1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Controlo" palette tool group
	 * @generated
	 */
	private PaletteContainer createControlo4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Controlo4Group_title);
		paletteContainer.setId("createControlo4Group"); //$NON-NLS-1$
		paletteContainer.add(createParalelo1CreationTool());
		paletteContainer.add(createSequencia2CreationTool());
		paletteContainer.add(createDecisor3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createColisao1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Colisao1CreationTool_title,
				Messages.Colisao1CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Bumpers_2002));
		entry.setId("createColisao1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Bumpers_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDistancia2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Distancia2CreationTool_title,
				Messages.Distancia2CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Distancia_2001));
		entry.setId("createDistancia2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Distancia_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLuz3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Luz3CreationTool_title,
				Messages.Luz3CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.LED_2006));
		entry.setId("createLuz3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.LED_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMotores4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Motores4CreationTool_title,
				Messages.Motores4CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Motor_2004));
		entry.setId("createMotores4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Motor_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPescoço5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Pescoço5CreationTool_title,
				Messages.Pescoço5CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Servo_2005));
		entry.setId("createPescoço5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Servo_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelógio6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Relógio6CreationTool_title,
				Messages.Relógio6CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Espera_2003));
		entry.setId("createRelógio6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Espera_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFilho1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Filho1CreationTool_title,
				Messages.Filho1CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Filho_4001));
		entry.setId("createFilho1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Filho_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIrmao2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Irmao2CreationTool_title,
				Messages.Irmao2CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Irmao_4002));
		entry.setId("createIrmao2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Irmao_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrograma1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Programa1CreationTool_title,
				Messages.Programa1CreationTool_desc, null, null) {
		};
		entry.setId("createPrograma1CreationTool"); //$NON-NLS-1$
		entry.setToolClass(GenerateTool.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParalelo1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Paralelo1CreationTool_title,
				Messages.Paralelo1CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Paralelo_2008));
		entry.setId("createParalelo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Paralelo_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequencia2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Sequencia2CreationTool_title,
				Messages.Sequencia2CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Sequencial_2009));
		entry.setId("createSequencia2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Sequencial_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecisor3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Decisor3CreationTool_title,
				Messages.Decisor3CreationTool_desc,
				Collections.singletonList(FarruscoElementTypes.Prioridade_2007));
		entry.setId("createDecisor3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(FarruscoElementTypes
				.getImageDescriptor(FarruscoElementTypes.Prioridade_2007));
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
