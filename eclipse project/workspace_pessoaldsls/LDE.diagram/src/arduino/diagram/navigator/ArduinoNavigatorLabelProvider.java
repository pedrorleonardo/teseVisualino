/*
 * 
 */
package arduino.diagram.navigator;

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

import arduino.Bumper_Pressionado;
import arduino.Centrar;
import arduino.Desligar_Cor;
import arduino.Desligar_Cores;
import arduino.Desligar_Intermitencia;
import arduino.Desligar_LED_Verde;
import arduino.Fim;
import arduino.If;
import arduino.Inicio;
import arduino.Ligar_Azul;
import arduino.Ligar_Cores_Arco_Iris;
import arduino.Ligar_Cores_Policia;
import arduino.Ligar_Intermitencia;
import arduino.Ligar_LED_Verde;
import arduino.Ligar_Verde;
import arduino.Ligar_Vermelho;
import arduino.Mover_Aleatoriamente;
import arduino.Mover_Frente;
import arduino.Mover_Frente_Tempo;
import arduino.Mover_Tras;
import arduino.Mover_Tras_Tempo;
import arduino.Parar;
import arduino.Robo;
import arduino.Rodar_Direita_Tempo;
import arduino.Rodar_Esquerda_Tempo;
import arduino.Virar_45_Drt;
import arduino.Virar_45_Esq;
import arduino.Virar_Direita;
import arduino.Virar_Max_Drt;
import arduino.Virar_Max_Esq;
import arduino.Virar_para_X_Graus;
import arduino.While;
import arduino.diagram.edit.parts.Bumper_PressionadoEditPart;
import arduino.diagram.edit.parts.Bumper_PressionadoNomeEditPart;
import arduino.diagram.edit.parts.CentrarEditPart;
import arduino.diagram.edit.parts.CentrarNomeEditPart;
import arduino.diagram.edit.parts.Desligar_CorEditPart;
import arduino.diagram.edit.parts.Desligar_CorNomeEditPart;
import arduino.diagram.edit.parts.Desligar_CoresEditPart;
import arduino.diagram.edit.parts.Desligar_CoresNomeEditPart;
import arduino.diagram.edit.parts.Desligar_IntermitenciaEditPart;
import arduino.diagram.edit.parts.Desligar_IntermitenciaNomeEditPart;
import arduino.diagram.edit.parts.Desligar_LED_VerdeEditPart;
import arduino.diagram.edit.parts.Desligar_LED_VerdeNomeEditPart;
import arduino.diagram.edit.parts.Distancia_Infra_VermelhosDistanciaEditPart;
import arduino.diagram.edit.parts.Distancia_Infra_VermelhosEditPart;
import arduino.diagram.edit.parts.FimEditPart;
import arduino.diagram.edit.parts.FimNomeEditPart;
import arduino.diagram.edit.parts.IfEditPart;
import arduino.diagram.edit.parts.IfNomeEditPart;
import arduino.diagram.edit.parts.InicioEditPart;
import arduino.diagram.edit.parts.InicioNomeEditPart;
import arduino.diagram.edit.parts.Ligar_AzulEditPart;
import arduino.diagram.edit.parts.Ligar_AzulNomeEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_Arco_IrisEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_Arco_IrisNomeEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_PoliciaEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_PoliciaNomeEditPart;
import arduino.diagram.edit.parts.Ligar_IntermitenciaEditPart;
import arduino.diagram.edit.parts.Ligar_IntermitenciaNomeEditPart;
import arduino.diagram.edit.parts.Ligar_LED_VerdeEditPart;
import arduino.diagram.edit.parts.Ligar_LED_VerdeNomeEditPart;
import arduino.diagram.edit.parts.Ligar_VerdeEditPart;
import arduino.diagram.edit.parts.Ligar_VerdeNomeEditPart;
import arduino.diagram.edit.parts.Ligar_VermelhoEditPart;
import arduino.diagram.edit.parts.Ligar_VermelhoNomeEditPart;
import arduino.diagram.edit.parts.Mover_AleatoriamenteEditPart;
import arduino.diagram.edit.parts.Mover_AleatoriamenteNomeEditPart;
import arduino.diagram.edit.parts.Mover_FrenteEditPart;
import arduino.diagram.edit.parts.Mover_FrenteNomeEditPart;
import arduino.diagram.edit.parts.Mover_Frente_TempoEditPart;
import arduino.diagram.edit.parts.Mover_Frente_TempoTempoEditPart;
import arduino.diagram.edit.parts.Mover_TrasEditPart;
import arduino.diagram.edit.parts.Mover_TrasNomeEditPart;
import arduino.diagram.edit.parts.Mover_Tras_TempoEditPart;
import arduino.diagram.edit.parts.Mover_Tras_TempoTempoEditPart;
import arduino.diagram.edit.parts.PararEditPart;
import arduino.diagram.edit.parts.PararNomeEditPart;
import arduino.diagram.edit.parts.Parar_TempoEditPart;
import arduino.diagram.edit.parts.Parar_TempoTempoEditPart;
import arduino.diagram.edit.parts.RoboEditPart;
import arduino.diagram.edit.parts.Rodar_Direita_TempoEditPart;
import arduino.diagram.edit.parts.Rodar_Direita_TempoTempoEditPart;
import arduino.diagram.edit.parts.Rodar_Esquerda_TempoEditPart;
import arduino.diagram.edit.parts.Rodar_Esquerda_TempoTempoEditPart;
import arduino.diagram.edit.parts.TransicoesEditPart;
import arduino.diagram.edit.parts.Virar_45_DrtEditPart;
import arduino.diagram.edit.parts.Virar_45_DrtNomeEditPart;
import arduino.diagram.edit.parts.Virar_45_EsqEditPart;
import arduino.diagram.edit.parts.Virar_45_EsqNomeEditPart;
import arduino.diagram.edit.parts.Virar_DireitaEditPart;
import arduino.diagram.edit.parts.Virar_DireitaNomeEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaCenaEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaEvitarObstaculoEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaNomeEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaNomeNomeEditPart;
import arduino.diagram.edit.parts.Virar_Max_DrtEditPart;
import arduino.diagram.edit.parts.Virar_Max_DrtNomeEditPart;
import arduino.diagram.edit.parts.Virar_Max_EsqEditPart;
import arduino.diagram.edit.parts.Virar_Max_EsqNomeEditPart;
import arduino.diagram.edit.parts.Virar_para_X_GrausEditPart;
import arduino.diagram.edit.parts.Virar_para_X_GrausGrausEditPart;
import arduino.diagram.edit.parts.WhileEditPart;
import arduino.diagram.edit.parts.WhileNomeEditPart;
import arduino.diagram.part.ArduinoDiagramEditorPlugin;
import arduino.diagram.part.ArduinoVisualIDRegistry;
import arduino.diagram.providers.ArduinoElementTypes;
import arduino.diagram.providers.ArduinoParserProvider;

/**
 * @generated
 */
public class ArduinoNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ArduinoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ArduinoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ArduinoNavigatorItem
				&& !isOwnView(((ArduinoNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ArduinoNavigatorGroup) {
			ArduinoNavigatorGroup group = (ArduinoNavigatorGroup) element;
			return ArduinoDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ArduinoNavigatorItem) {
			ArduinoNavigatorItem navigatorItem = (ArduinoNavigatorItem) element;
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
		switch (ArduinoVisualIDRegistry.getVisualID(view)) {
		case WhileEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?While", ArduinoElementTypes.While_2027); //$NON-NLS-1$
		case RoboEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://arduino/1.0?Robo", ArduinoElementTypes.Robo_1000); //$NON-NLS-1$
		case Mover_Frente_TempoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Mover_Frente_Tempo", ArduinoElementTypes.Mover_Frente_Tempo_2018); //$NON-NLS-1$
		case Ligar_AzulEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Ligar_Azul", ArduinoElementTypes.Ligar_Azul_2003); //$NON-NLS-1$
		case Desligar_LED_VerdeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Desligar_LED_Verde", ArduinoElementTypes.Desligar_LED_Verde_2009); //$NON-NLS-1$
		case TransicoesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://arduino/1.0?Transicoes", ArduinoElementTypes.Transicoes_4001); //$NON-NLS-1$
		case Mover_Tras_TempoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Mover_Tras_Tempo", ArduinoElementTypes.Mover_Tras_Tempo_2019); //$NON-NLS-1$
		case Mover_TrasEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Mover_Tras", ArduinoElementTypes.Mover_Tras_2014); //$NON-NLS-1$
		case Ligar_VerdeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Ligar_Verde", ArduinoElementTypes.Ligar_Verde_2004); //$NON-NLS-1$
		case IfEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?If", ArduinoElementTypes.If_2028); //$NON-NLS-1$
		case FimEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Fim", ArduinoElementTypes.Fim_2030); //$NON-NLS-1$
		case Virar_Max_DrtEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Virar_Max_Drt", ArduinoElementTypes.Virar_Max_Drt_2021); //$NON-NLS-1$
		case Ligar_LED_VerdeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Ligar_LED_Verde", ArduinoElementTypes.Ligar_LED_Verde_2008); //$NON-NLS-1$
		case CentrarEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Centrar", ArduinoElementTypes.Centrar_2023); //$NON-NLS-1$
		case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Ligar_Cores_Arco_Iris", ArduinoElementTypes.Ligar_Cores_Arco_Iris_2002); //$NON-NLS-1$
		case Rodar_Direita_TempoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Rodar_Direita_Tempo", ArduinoElementTypes.Rodar_Direita_Tempo_2017); //$NON-NLS-1$
		case Desligar_CorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Desligar_Cor", ArduinoElementTypes.Desligar_Cor_2006); //$NON-NLS-1$
		case Ligar_IntermitenciaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Ligar_Intermitencia", ArduinoElementTypes.Ligar_Intermitencia_2010); //$NON-NLS-1$
		case Virar_EsquerdaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Virar_Esquerda", ArduinoElementTypes.Virar_Esquerda_2012); //$NON-NLS-1$
		case Mover_AleatoriamenteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Mover_Aleatoriamente", ArduinoElementTypes.Mover_Aleatoriamente_2026); //$NON-NLS-1$
		case InicioEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Inicio", ArduinoElementTypes.Inicio_2029); //$NON-NLS-1$
		case Desligar_CoresEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Desligar_Cores", ArduinoElementTypes.Desligar_Cores_2007); //$NON-NLS-1$
		case Ligar_Cores_PoliciaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Ligar_Cores_Policia", ArduinoElementTypes.Ligar_Cores_Policia_2001); //$NON-NLS-1$
		case Virar_45_EsqEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Virar_45_Esq", ArduinoElementTypes.Virar_45_Esq_2024); //$NON-NLS-1$
		case Bumper_PressionadoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Bumper_Pressionado", ArduinoElementTypes.Bumper_Pressionado_2033); //$NON-NLS-1$
		case Virar_45_DrtEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Virar_45_Drt", ArduinoElementTypes.Virar_45_Drt_2025); //$NON-NLS-1$
		case Ligar_VermelhoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Ligar_Vermelho", ArduinoElementTypes.Ligar_Vermelho_2005); //$NON-NLS-1$
		case PararEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Parar", ArduinoElementTypes.Parar_2035); //$NON-NLS-1$
		case Desligar_IntermitenciaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Desligar_Intermitencia", ArduinoElementTypes.Desligar_Intermitencia_2011); //$NON-NLS-1$
		case Rodar_Esquerda_TempoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Rodar_Esquerda_Tempo", ArduinoElementTypes.Rodar_Esquerda_Tempo_2016); //$NON-NLS-1$
		case Distancia_Infra_VermelhosEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Distancia_Infra_Vermelhos", ArduinoElementTypes.Distancia_Infra_Vermelhos_2034); //$NON-NLS-1$
		case Virar_Max_EsqEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Virar_Max_Esq", ArduinoElementTypes.Virar_Max_Esq_2022); //$NON-NLS-1$
		case Virar_DireitaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Virar_Direita", ArduinoElementTypes.Virar_Direita_2015); //$NON-NLS-1$
		case Mover_FrenteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Mover_Frente", ArduinoElementTypes.Mover_Frente_2013); //$NON-NLS-1$
		case Parar_TempoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Parar_Tempo", ArduinoElementTypes.Parar_Tempo_2036); //$NON-NLS-1$
		case Virar_para_X_GrausEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://arduino/1.0?Virar_para_X_Graus", ArduinoElementTypes.Virar_para_X_Graus_2020); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ArduinoDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ArduinoElementTypes.isKnownElementType(elementType)) {
			image = ArduinoElementTypes.getImage(elementType);
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
		if (element instanceof ArduinoNavigatorGroup) {
			ArduinoNavigatorGroup group = (ArduinoNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ArduinoNavigatorItem) {
			ArduinoNavigatorItem navigatorItem = (ArduinoNavigatorItem) element;
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
		switch (ArduinoVisualIDRegistry.getVisualID(view)) {
		case WhileEditPart.VISUAL_ID:
			return getWhile_2027Text(view);
		case RoboEditPart.VISUAL_ID:
			return getRobo_1000Text(view);
		case Mover_Frente_TempoEditPart.VISUAL_ID:
			return getMover_Frente_Tempo_2018Text(view);
		case Ligar_AzulEditPart.VISUAL_ID:
			return getLigar_Azul_2003Text(view);
		case Desligar_LED_VerdeEditPart.VISUAL_ID:
			return getDesligar_LED_Verde_2009Text(view);
		case TransicoesEditPart.VISUAL_ID:
			return getTransicoes_4001Text(view);
		case Mover_Tras_TempoEditPart.VISUAL_ID:
			return getMover_Tras_Tempo_2019Text(view);
		case Mover_TrasEditPart.VISUAL_ID:
			return getMover_Tras_2014Text(view);
		case Ligar_VerdeEditPart.VISUAL_ID:
			return getLigar_Verde_2004Text(view);
		case IfEditPart.VISUAL_ID:
			return getIf_2028Text(view);
		case FimEditPart.VISUAL_ID:
			return getFim_2030Text(view);
		case Virar_Max_DrtEditPart.VISUAL_ID:
			return getVirar_Max_Drt_2021Text(view);
		case Ligar_LED_VerdeEditPart.VISUAL_ID:
			return getLigar_LED_Verde_2008Text(view);
		case CentrarEditPart.VISUAL_ID:
			return getCentrar_2023Text(view);
		case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID:
			return getLigar_Cores_Arco_Iris_2002Text(view);
		case Rodar_Direita_TempoEditPart.VISUAL_ID:
			return getRodar_Direita_Tempo_2017Text(view);
		case Desligar_CorEditPart.VISUAL_ID:
			return getDesligar_Cor_2006Text(view);
		case Ligar_IntermitenciaEditPart.VISUAL_ID:
			return getLigar_Intermitencia_2010Text(view);
		case Virar_EsquerdaEditPart.VISUAL_ID:
			return getVirar_Esquerda_2012Text(view);
		case Mover_AleatoriamenteEditPart.VISUAL_ID:
			return getMover_Aleatoriamente_2026Text(view);
		case InicioEditPart.VISUAL_ID:
			return getInicio_2029Text(view);
		case Desligar_CoresEditPart.VISUAL_ID:
			return getDesligar_Cores_2007Text(view);
		case Ligar_Cores_PoliciaEditPart.VISUAL_ID:
			return getLigar_Cores_Policia_2001Text(view);
		case Virar_45_EsqEditPart.VISUAL_ID:
			return getVirar_45_Esq_2024Text(view);
		case Bumper_PressionadoEditPart.VISUAL_ID:
			return getBumper_Pressionado_2033Text(view);
		case Virar_45_DrtEditPart.VISUAL_ID:
			return getVirar_45_Drt_2025Text(view);
		case Ligar_VermelhoEditPart.VISUAL_ID:
			return getLigar_Vermelho_2005Text(view);
		case PararEditPart.VISUAL_ID:
			return getParar_2035Text(view);
		case Desligar_IntermitenciaEditPart.VISUAL_ID:
			return getDesligar_Intermitencia_2011Text(view);
		case Rodar_Esquerda_TempoEditPart.VISUAL_ID:
			return getRodar_Esquerda_Tempo_2016Text(view);
		case Distancia_Infra_VermelhosEditPart.VISUAL_ID:
			return getDistancia_Infra_Vermelhos_2034Text(view);
		case Virar_Max_EsqEditPart.VISUAL_ID:
			return getVirar_Max_Esq_2022Text(view);
		case Virar_DireitaEditPart.VISUAL_ID:
			return getVirar_Direita_2015Text(view);
		case Mover_FrenteEditPart.VISUAL_ID:
			return getMover_Frente_2013Text(view);
		case Parar_TempoEditPart.VISUAL_ID:
			return getParar_Tempo_2036Text(view);
		case Virar_para_X_GrausEditPart.VISUAL_ID:
			return getVirar_para_X_Graus_2020Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getIf_2028Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.If_2028,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry.getType(IfNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLigar_Azul_2003Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Ligar_Azul_2003,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Ligar_AzulNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLigar_Cores_Arco_Iris_2002Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Ligar_Cores_Arco_Iris_2002, view
						.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Ligar_Cores_Arco_IrisNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirar_45_Esq_2024Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Virar_45_Esq_2024,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Virar_45_EsqNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirar_para_X_Graus_2020Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Virar_para_X_Graus_2020,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Virar_para_X_GrausGrausEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesligar_Cor_2006Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Desligar_Cor_2006,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Desligar_CorNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParar_Tempo_2036Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Parar_Tempo_2036,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Parar_TempoTempoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirar_45_Drt_2025Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Virar_45_Drt_2025,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Virar_45_DrtNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInicio_2029Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Inicio_2029,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry.getType(InicioNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesligar_Intermitencia_2011Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Desligar_Intermitencia_2011, view
						.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Desligar_IntermitenciaNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDistancia_Infra_Vermelhos_2034Text(View view) {
		IParser parser = ArduinoParserProvider
				.getParser(
						ArduinoElementTypes.Distancia_Infra_Vermelhos_2034,
						view.getElement() != null ? view.getElement() : view,
						ArduinoVisualIDRegistry
								.getType(Distancia_Infra_VermelhosDistanciaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransicoes_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMover_Tras_Tempo_2019Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Mover_Tras_Tempo_2019,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Mover_Tras_TempoTempoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMover_Frente_Tempo_2018Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Mover_Frente_Tempo_2018,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Mover_Frente_TempoTempoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesligar_LED_Verde_2009Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Desligar_LED_Verde_2009,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Desligar_LED_VerdeNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getWhile_2027Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.While_2027,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry.getType(WhileNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDesligar_Cores_2007Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Desligar_Cores_2007,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Desligar_CoresNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRodar_Esquerda_Tempo_2016Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Rodar_Esquerda_Tempo_2016, view
						.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Rodar_Esquerda_TempoTempoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLigar_LED_Verde_2008Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Ligar_LED_Verde_2008,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Ligar_LED_VerdeNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirar_Direita_2015Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Virar_Direita_2015,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Virar_DireitaNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirar_Max_Drt_2021Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Virar_Max_Drt_2021,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Virar_Max_DrtNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLigar_Cores_Policia_2001Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Ligar_Cores_Policia_2001,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Ligar_Cores_PoliciaNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParar_2035Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Parar_2035,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry.getType(PararNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRodar_Direita_Tempo_2017Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Rodar_Direita_Tempo_2017,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Rodar_Direita_TempoTempoEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLigar_Verde_2004Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Ligar_Verde_2004,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Ligar_VerdeNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMover_Tras_2014Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Mover_Tras_2014,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Mover_TrasNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBumper_Pressionado_2033Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Bumper_Pressionado_2033,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Bumper_PressionadoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCentrar_2023Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Centrar_2023,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry.getType(CentrarNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMover_Aleatoriamente_2026Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Mover_Aleatoriamente_2026, view
						.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Mover_AleatoriamenteNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFim_2030Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Fim_2030,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry.getType(FimNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirar_Max_Esq_2022Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Virar_Max_Esq_2022,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Virar_Max_EsqNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRobo_1000Text(View view) {
		Robo domainModelElement = (Robo) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVirar_Esquerda_2012Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Virar_Esquerda_2012,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Virar_EsquerdaNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLigar_Vermelho_2005Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Ligar_Vermelho_2005,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Ligar_VermelhoNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLigar_Intermitencia_2010Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Ligar_Intermitencia_2010,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Ligar_IntermitenciaNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMover_Frente_2013Text(View view) {
		IParser parser = ArduinoParserProvider.getParser(
				ArduinoElementTypes.Mover_Frente_2013,
				view.getElement() != null ? view.getElement() : view,
				ArduinoVisualIDRegistry
						.getType(Mover_FrenteNomeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ArduinoDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
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
		return RoboEditPart.MODEL_ID.equals(ArduinoVisualIDRegistry
				.getModelID(view));
	}

}
