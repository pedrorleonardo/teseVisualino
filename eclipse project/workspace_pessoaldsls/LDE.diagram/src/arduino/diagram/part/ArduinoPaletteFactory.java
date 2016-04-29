/*
 * 
 */
package arduino.diagram.part;

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

import arduino.diagram.providers.ArduinoElementTypes;

/**
 * @generated
 */
public class ArduinoPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createEstados1Group());
		paletteRoot.add(createConexões2Group());
		paletteRoot.add(createCabeça3Group());
		paletteRoot.add(createCorpo4Group());
		paletteRoot.add(createLed5Group());
	}

	/**
	 * Creates "Estados" palette tool group
	 * @generated
	 */
	private PaletteContainer createEstados1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Estados1Group_title);
		paletteContainer.setId("createEstados1Group"); //$NON-NLS-1$
		paletteContainer.add(createInício1CreationTool());
		paletteContainer.add(createFim2CreationTool());
		paletteContainer.add(createIf3CreationTool());
		paletteContainer.add(createWhile4CreationTool());
		paletteContainer.add(createBumperPressionado5CreationTool());
		paletteContainer.add(createDistânciaInfraVermelhos6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Conexões" palette tool group
	 * @generated
	 */
	private PaletteContainer createConexões2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Conexões2Group_title);
		paletteContainer.setId("createConexões2Group"); //$NON-NLS-1$
		paletteContainer.add(createTransição1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Cabeça" palette tool group
	 * @generated
	 */
	private PaletteContainer createCabeça3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Cabeça3Group_title);
		paletteContainer.setId("createCabeça3Group"); //$NON-NLS-1$
		paletteContainer.add(createVirarmáximoàesquerda1CreationTool());
		paletteContainer.add(createVirar45grausàesquerda2CreationTool());
		paletteContainer.add(createVirarmáximoàdireita3CreationTool());
		paletteContainer.add(createVirar45grausàdireita4CreationTool());
		paletteContainer.add(createVirarparaxgraus5CreationTool());
		paletteContainer.add(createCentrar6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Corpo" palette tool group
	 * @generated
	 */
	private PaletteContainer createCorpo4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Corpo4Group_title);
		paletteContainer.setId("createCorpo4Group"); //$NON-NLS-1$
		paletteContainer.add(createMoveremfrente1CreationTool());
		paletteContainer.add(createMoveremfrentetempo2CreationTool());
		paletteContainer.add(createMoverparatrás3CreationTool());
		paletteContainer.add(createMoverparatrástempo4CreationTool());
		paletteContainer.add(createMoveraleatoriamente5CreationTool());
		paletteContainer.add(createViraràesquerda6CreationTool());
		paletteContainer.add(createRodarparaaesquerdatempo7CreationTool());
		paletteContainer.add(createViraràdireita8CreationTool());
		paletteContainer.add(createRodaràdireitatempo9CreationTool());
		paletteContainer.add(createParar10CreationTool());
		paletteContainer.add(createParartempo11CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Led" palette tool group
	 * @generated
	 */
	private PaletteContainer createLed5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Led5Group_title);
		paletteContainer.setId("createLed5Group"); //$NON-NLS-1$
		paletteContainer.add(createLigarLEDverde1CreationTool());
		paletteContainer.add(createDesligarLEDverde2CreationTool());
		paletteContainer.add(createLigarintermitência3CreationTool());
		paletteContainer.add(createDesligarintermitência4CreationTool());
		paletteContainer.add(createLigarluzverde5CreationTool());
		paletteContainer.add(createLigarluzvermelha6CreationTool());
		paletteContainer.add(createLigarluzazul7CreationTool());
		paletteContainer.add(createDesligarluz8CreationTool());
		paletteContainer.add(createLigarcoresarcoíris9CreationTool());
		paletteContainer.add(createLigarcorespolícia10CreationTool());
		paletteContainer.add(createDesligarcores11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInício1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Início1CreationTool_title,
				Messages.Início1CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.Inicio_2029));
		entry.setId("createInício1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Inicio_2029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFim2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Fim2CreationTool_title,
				Messages.Fim2CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.Fim_2030));
		entry.setId("createFim2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Fim_2030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIf3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.If3CreationTool_title,
				Messages.If3CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.If_2028));
		entry.setId("createIf3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.If_2028));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWhile4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.While4CreationTool_title,
				Messages.While4CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.While_2027));
		entry.setId("createWhile4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.While_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBumperPressionado5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BumperPressionado5CreationTool_title,
				Messages.BumperPressionado5CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Bumper_Pressionado_2033));
		entry.setId("createBumperPressionado5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Bumper_Pressionado_2033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDistânciaInfraVermelhos6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DistânciaInfraVermelhos6CreationTool_title,
				Messages.DistânciaInfraVermelhos6CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Distancia_Infra_Vermelhos_2034));
		entry.setId("createDistânciaInfraVermelhos6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Distancia_Infra_Vermelhos_2034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransição1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Transição1CreationTool_title,
				Messages.Transição1CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.Transicoes_4001));
		entry.setId("createTransição1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Transicoes_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirarmáximoàesquerda1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Virarmáximoàesquerda1CreationTool_title,
				Messages.Virarmáximoàesquerda1CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Virar_Max_Esq_2022));
		entry.setId("createVirarmáximoàesquerda1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Virar_Max_Esq_2022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirar45grausàesquerda2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Virar45grausàesquerda2CreationTool_title,
				Messages.Virar45grausàesquerda2CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Virar_45_Esq_2024));
		entry.setId("createVirar45grausàesquerda2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Virar_45_Esq_2024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirarmáximoàdireita3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Virarmáximoàdireita3CreationTool_title,
				Messages.Virarmáximoàdireita3CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Virar_Max_Drt_2021));
		entry.setId("createVirarmáximoàdireita3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Virar_Max_Drt_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirar45grausàdireita4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Virar45grausàdireita4CreationTool_title,
				Messages.Virar45grausàdireita4CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Virar_45_Drt_2025));
		entry.setId("createVirar45grausàdireita4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Virar_45_Drt_2025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVirarparaxgraus5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Virarparaxgraus5CreationTool_title,
				Messages.Virarparaxgraus5CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Virar_para_X_Graus_2020));
		entry.setId("createVirarparaxgraus5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Virar_para_X_Graus_2020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCentrar6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Centrar6CreationTool_title,
				Messages.Centrar6CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.Centrar_2023));
		entry.setId("createCentrar6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Centrar_2023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMoveremfrente1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Moveremfrente1CreationTool_title,
				Messages.Moveremfrente1CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Mover_Frente_2013));
		entry.setId("createMoveremfrente1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Mover_Frente_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMoveremfrentetempo2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Moveremfrentetempo2CreationTool_title,
				Messages.Moveremfrentetempo2CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Mover_Frente_Tempo_2018));
		entry.setId("createMoveremfrentetempo2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Mover_Frente_Tempo_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMoverparatrás3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Moverparatrás3CreationTool_title,
				Messages.Moverparatrás3CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.Mover_Tras_2014));
		entry.setId("createMoverparatrás3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Mover_Tras_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMoverparatrástempo4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Moverparatrástempo4CreationTool_title,
				Messages.Moverparatrástempo4CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Mover_Tras_Tempo_2019));
		entry.setId("createMoverparatrástempo4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Mover_Tras_Tempo_2019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMoveraleatoriamente5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Moveraleatoriamente5CreationTool_title,
				Messages.Moveraleatoriamente5CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Mover_Aleatoriamente_2026));
		entry.setId("createMoveraleatoriamente5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Mover_Aleatoriamente_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViraràesquerda6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Viraràesquerda6CreationTool_title,
				Messages.Viraràesquerda6CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Virar_Esquerda_2012));
		entry.setId("createViraràesquerda6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Virar_Esquerda_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRodarparaaesquerdatempo7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Rodarparaaesquerdatempo7CreationTool_title,
				Messages.Rodarparaaesquerdatempo7CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Rodar_Esquerda_Tempo_2016));
		entry.setId("createRodarparaaesquerdatempo7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Rodar_Esquerda_Tempo_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createViraràdireita8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Viraràdireita8CreationTool_title,
				Messages.Viraràdireita8CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Virar_Direita_2015));
		entry.setId("createViraràdireita8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Virar_Direita_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRodaràdireitatempo9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Rodaràdireitatempo9CreationTool_title,
				Messages.Rodaràdireitatempo9CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Rodar_Direita_Tempo_2017));
		entry.setId("createRodaràdireitatempo9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Rodar_Direita_Tempo_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParar10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Parar10CreationTool_title,
				Messages.Parar10CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.Parar_2035));
		entry.setId("createParar10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Parar_2035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParartempo11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Parartempo11CreationTool_title,
				Messages.Parartempo11CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.Parar_Tempo_2036));
		entry.setId("createParartempo11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Parar_Tempo_2036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLigarLEDverde1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LigarLEDverde1CreationTool_title,
				Messages.LigarLEDverde1CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Ligar_LED_Verde_2008));
		entry.setId("createLigarLEDverde1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Ligar_LED_Verde_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDesligarLEDverde2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DesligarLEDverde2CreationTool_title,
				Messages.DesligarLEDverde2CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Desligar_LED_Verde_2009));
		entry.setId("createDesligarLEDverde2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Desligar_LED_Verde_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLigarintermitência3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ligarintermitência3CreationTool_title,
				Messages.Ligarintermitência3CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Ligar_Intermitencia_2010));
		entry.setId("createLigarintermitência3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Ligar_Intermitencia_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDesligarintermitência4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Desligarintermitência4CreationTool_title,
				Messages.Desligarintermitência4CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Desligar_Intermitencia_2011));
		entry.setId("createDesligarintermitência4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Desligar_Intermitencia_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLigarluzverde5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ligarluzverde5CreationTool_title,
				Messages.Ligarluzverde5CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.Ligar_Verde_2004));
		entry.setId("createLigarluzverde5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Ligar_Verde_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLigarluzvermelha6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ligarluzvermelha6CreationTool_title,
				Messages.Ligarluzvermelha6CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Ligar_Vermelho_2005));
		entry.setId("createLigarluzvermelha6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Ligar_Vermelho_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLigarluzazul7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ligarluzazul7CreationTool_title,
				Messages.Ligarluzazul7CreationTool_desc,
				Collections.singletonList(ArduinoElementTypes.Ligar_Azul_2003));
		entry.setId("createLigarluzazul7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Ligar_Azul_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDesligarluz8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Desligarluz8CreationTool_title,
				Messages.Desligarluz8CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Desligar_Cor_2006));
		entry.setId("createDesligarluz8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Desligar_Cor_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLigarcoresarcoíris9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ligarcoresarcoíris9CreationTool_title,
				Messages.Ligarcoresarcoíris9CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Ligar_Cores_Arco_Iris_2002));
		entry.setId("createLigarcoresarcoíris9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Ligar_Cores_Arco_Iris_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLigarcorespolícia10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Ligarcorespolícia10CreationTool_title,
				Messages.Ligarcorespolícia10CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Ligar_Cores_Policia_2001));
		entry.setId("createLigarcorespolícia10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Ligar_Cores_Policia_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDesligarcores11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Desligarcores11CreationTool_title,
				Messages.Desligarcores11CreationTool_desc,
				Collections
						.singletonList(ArduinoElementTypes.Desligar_Cores_2007));
		entry.setId("createDesligarcores11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArduinoElementTypes
				.getImageDescriptor(ArduinoElementTypes.Desligar_Cores_2007));
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
