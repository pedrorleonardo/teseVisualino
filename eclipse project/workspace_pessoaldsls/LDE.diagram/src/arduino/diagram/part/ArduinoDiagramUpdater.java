/*
 * 
 */
package arduino.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import arduino.Acao;
import arduino.ArduinoPackage;
import arduino.Bumper_Pressionado;
import arduino.Centrar;
import arduino.Condicao;
import arduino.Desligar_Cor;
import arduino.Desligar_Cores;
import arduino.Desligar_Intermitencia;
import arduino.Desligar_LED_Verde;
import arduino.Distancia_Infra_Vermelhos;
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
import arduino.Parar_Tempo;
import arduino.Robo;
import arduino.Rodar_Direita_Tempo;
import arduino.Rodar_Esquerda_Tempo;
import arduino.Transicoes;
import arduino.Virar_45_Drt;
import arduino.Virar_45_Esq;
import arduino.Virar_Direita;
import arduino.Virar_Esquerda;
import arduino.Virar_Max_Drt;
import arduino.Virar_Max_Esq;
import arduino.Virar_para_X_Graus;
import arduino.While;
import arduino.diagram.edit.parts.Bumper_PressionadoEditPart;
import arduino.diagram.edit.parts.CentrarEditPart;
import arduino.diagram.edit.parts.Desligar_CorEditPart;
import arduino.diagram.edit.parts.Desligar_CoresEditPart;
import arduino.diagram.edit.parts.Desligar_IntermitenciaEditPart;
import arduino.diagram.edit.parts.Desligar_LED_VerdeEditPart;
import arduino.diagram.edit.parts.Distancia_Infra_VermelhosEditPart;
import arduino.diagram.edit.parts.FimEditPart;
import arduino.diagram.edit.parts.IfEditPart;
import arduino.diagram.edit.parts.InicioEditPart;
import arduino.diagram.edit.parts.Ligar_AzulEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_Arco_IrisEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_PoliciaEditPart;
import arduino.diagram.edit.parts.Ligar_IntermitenciaEditPart;
import arduino.diagram.edit.parts.Ligar_LED_VerdeEditPart;
import arduino.diagram.edit.parts.Ligar_VerdeEditPart;
import arduino.diagram.edit.parts.Ligar_VermelhoEditPart;
import arduino.diagram.edit.parts.Mover_AleatoriamenteEditPart;
import arduino.diagram.edit.parts.Mover_FrenteEditPart;
import arduino.diagram.edit.parts.Mover_Frente_TempoEditPart;
import arduino.diagram.edit.parts.Mover_TrasEditPart;
import arduino.diagram.edit.parts.Mover_Tras_TempoEditPart;
import arduino.diagram.edit.parts.PararEditPart;
import arduino.diagram.edit.parts.Parar_TempoEditPart;
import arduino.diagram.edit.parts.RoboEditPart;
import arduino.diagram.edit.parts.Rodar_Direita_TempoEditPart;
import arduino.diagram.edit.parts.Rodar_Esquerda_TempoEditPart;
import arduino.diagram.edit.parts.TransicoesEditPart;
import arduino.diagram.edit.parts.Virar_45_DrtEditPart;
import arduino.diagram.edit.parts.Virar_45_EsqEditPart;
import arduino.diagram.edit.parts.Virar_DireitaEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaEditPart;
import arduino.diagram.edit.parts.Virar_Max_DrtEditPart;
import arduino.diagram.edit.parts.Virar_Max_EsqEditPart;
import arduino.diagram.edit.parts.Virar_para_X_GrausEditPart;
import arduino.diagram.edit.parts.WhileEditPart;
import arduino.diagram.providers.ArduinoElementTypes;

/**
 * @generated
 */
public class ArduinoDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoNodeDescriptor> getSemanticChildren(View view) {
		switch (ArduinoVisualIDRegistry.getVisualID(view)) {
		case RoboEditPart.VISUAL_ID:
			return getRobo_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoNodeDescriptor> getRobo_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Robo modelElement = (Robo) view.getElement();
		LinkedList<ArduinoNodeDescriptor> result = new LinkedList<ArduinoNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTemAcoes().iterator(); it
				.hasNext();) {
			Acao childElement = (Acao) it.next();
			int visualID = ArduinoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Ligar_Cores_PoliciaEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Ligar_Cores_Arco_IrisEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Ligar_AzulEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Ligar_VerdeEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Ligar_VermelhoEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Desligar_CorEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Desligar_CoresEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Ligar_LED_VerdeEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Desligar_LED_VerdeEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Ligar_IntermitenciaEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Desligar_IntermitenciaEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Virar_EsquerdaEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Mover_FrenteEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Mover_TrasEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Virar_DireitaEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rodar_Esquerda_TempoEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Rodar_Direita_TempoEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Mover_Frente_TempoEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Mover_Tras_TempoEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Virar_para_X_GrausEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Virar_Max_DrtEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Virar_Max_EsqEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CentrarEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Virar_45_EsqEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Virar_45_DrtEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Mover_AleatoriamenteEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PararEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Parar_TempoEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IfEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InicioEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FimEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTemCondicoes().iterator(); it
				.hasNext();) {
			Condicao childElement = (Condicao) it.next();
			int visualID = ArduinoVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Bumper_PressionadoEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Distancia_Infra_VermelhosEditPart.VISUAL_ID) {
				result.add(new ArduinoNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getContainedLinks(View view) {
		switch (ArduinoVisualIDRegistry.getVisualID(view)) {
		case RoboEditPart.VISUAL_ID:
			return getRobo_1000ContainedLinks(view);
		case Ligar_Cores_PoliciaEditPart.VISUAL_ID:
			return getLigar_Cores_Policia_2001ContainedLinks(view);
		case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID:
			return getLigar_Cores_Arco_Iris_2002ContainedLinks(view);
		case Ligar_AzulEditPart.VISUAL_ID:
			return getLigar_Azul_2003ContainedLinks(view);
		case Ligar_VerdeEditPart.VISUAL_ID:
			return getLigar_Verde_2004ContainedLinks(view);
		case Ligar_VermelhoEditPart.VISUAL_ID:
			return getLigar_Vermelho_2005ContainedLinks(view);
		case Desligar_CorEditPart.VISUAL_ID:
			return getDesligar_Cor_2006ContainedLinks(view);
		case Desligar_CoresEditPart.VISUAL_ID:
			return getDesligar_Cores_2007ContainedLinks(view);
		case Ligar_LED_VerdeEditPart.VISUAL_ID:
			return getLigar_LED_Verde_2008ContainedLinks(view);
		case Desligar_LED_VerdeEditPart.VISUAL_ID:
			return getDesligar_LED_Verde_2009ContainedLinks(view);
		case Ligar_IntermitenciaEditPart.VISUAL_ID:
			return getLigar_Intermitencia_2010ContainedLinks(view);
		case Desligar_IntermitenciaEditPart.VISUAL_ID:
			return getDesligar_Intermitencia_2011ContainedLinks(view);
		case Virar_EsquerdaEditPart.VISUAL_ID:
			return getVirar_Esquerda_2012ContainedLinks(view);
		case Mover_FrenteEditPart.VISUAL_ID:
			return getMover_Frente_2013ContainedLinks(view);
		case Mover_TrasEditPart.VISUAL_ID:
			return getMover_Tras_2014ContainedLinks(view);
		case Virar_DireitaEditPart.VISUAL_ID:
			return getVirar_Direita_2015ContainedLinks(view);
		case Rodar_Esquerda_TempoEditPart.VISUAL_ID:
			return getRodar_Esquerda_Tempo_2016ContainedLinks(view);
		case Rodar_Direita_TempoEditPart.VISUAL_ID:
			return getRodar_Direita_Tempo_2017ContainedLinks(view);
		case Mover_Frente_TempoEditPart.VISUAL_ID:
			return getMover_Frente_Tempo_2018ContainedLinks(view);
		case Mover_Tras_TempoEditPart.VISUAL_ID:
			return getMover_Tras_Tempo_2019ContainedLinks(view);
		case Virar_para_X_GrausEditPart.VISUAL_ID:
			return getVirar_para_X_Graus_2020ContainedLinks(view);
		case Virar_Max_DrtEditPart.VISUAL_ID:
			return getVirar_Max_Drt_2021ContainedLinks(view);
		case Virar_Max_EsqEditPart.VISUAL_ID:
			return getVirar_Max_Esq_2022ContainedLinks(view);
		case CentrarEditPart.VISUAL_ID:
			return getCentrar_2023ContainedLinks(view);
		case Virar_45_EsqEditPart.VISUAL_ID:
			return getVirar_45_Esq_2024ContainedLinks(view);
		case Virar_45_DrtEditPart.VISUAL_ID:
			return getVirar_45_Drt_2025ContainedLinks(view);
		case Mover_AleatoriamenteEditPart.VISUAL_ID:
			return getMover_Aleatoriamente_2026ContainedLinks(view);
		case PararEditPart.VISUAL_ID:
			return getParar_2035ContainedLinks(view);
		case Parar_TempoEditPart.VISUAL_ID:
			return getParar_Tempo_2036ContainedLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2027ContainedLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_2028ContainedLinks(view);
		case InicioEditPart.VISUAL_ID:
			return getInicio_2029ContainedLinks(view);
		case FimEditPart.VISUAL_ID:
			return getFim_2030ContainedLinks(view);
		case Bumper_PressionadoEditPart.VISUAL_ID:
			return getBumper_Pressionado_2033ContainedLinks(view);
		case Distancia_Infra_VermelhosEditPart.VISUAL_ID:
			return getDistancia_Infra_Vermelhos_2034ContainedLinks(view);
		case TransicoesEditPart.VISUAL_ID:
			return getTransicoes_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getIncomingLinks(View view) {
		switch (ArduinoVisualIDRegistry.getVisualID(view)) {
		case Ligar_Cores_PoliciaEditPart.VISUAL_ID:
			return getLigar_Cores_Policia_2001IncomingLinks(view);
		case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID:
			return getLigar_Cores_Arco_Iris_2002IncomingLinks(view);
		case Ligar_AzulEditPart.VISUAL_ID:
			return getLigar_Azul_2003IncomingLinks(view);
		case Ligar_VerdeEditPart.VISUAL_ID:
			return getLigar_Verde_2004IncomingLinks(view);
		case Ligar_VermelhoEditPart.VISUAL_ID:
			return getLigar_Vermelho_2005IncomingLinks(view);
		case Desligar_CorEditPart.VISUAL_ID:
			return getDesligar_Cor_2006IncomingLinks(view);
		case Desligar_CoresEditPart.VISUAL_ID:
			return getDesligar_Cores_2007IncomingLinks(view);
		case Ligar_LED_VerdeEditPart.VISUAL_ID:
			return getLigar_LED_Verde_2008IncomingLinks(view);
		case Desligar_LED_VerdeEditPart.VISUAL_ID:
			return getDesligar_LED_Verde_2009IncomingLinks(view);
		case Ligar_IntermitenciaEditPart.VISUAL_ID:
			return getLigar_Intermitencia_2010IncomingLinks(view);
		case Desligar_IntermitenciaEditPart.VISUAL_ID:
			return getDesligar_Intermitencia_2011IncomingLinks(view);
		case Virar_EsquerdaEditPart.VISUAL_ID:
			return getVirar_Esquerda_2012IncomingLinks(view);
		case Mover_FrenteEditPart.VISUAL_ID:
			return getMover_Frente_2013IncomingLinks(view);
		case Mover_TrasEditPart.VISUAL_ID:
			return getMover_Tras_2014IncomingLinks(view);
		case Virar_DireitaEditPart.VISUAL_ID:
			return getVirar_Direita_2015IncomingLinks(view);
		case Rodar_Esquerda_TempoEditPart.VISUAL_ID:
			return getRodar_Esquerda_Tempo_2016IncomingLinks(view);
		case Rodar_Direita_TempoEditPart.VISUAL_ID:
			return getRodar_Direita_Tempo_2017IncomingLinks(view);
		case Mover_Frente_TempoEditPart.VISUAL_ID:
			return getMover_Frente_Tempo_2018IncomingLinks(view);
		case Mover_Tras_TempoEditPart.VISUAL_ID:
			return getMover_Tras_Tempo_2019IncomingLinks(view);
		case Virar_para_X_GrausEditPart.VISUAL_ID:
			return getVirar_para_X_Graus_2020IncomingLinks(view);
		case Virar_Max_DrtEditPart.VISUAL_ID:
			return getVirar_Max_Drt_2021IncomingLinks(view);
		case Virar_Max_EsqEditPart.VISUAL_ID:
			return getVirar_Max_Esq_2022IncomingLinks(view);
		case CentrarEditPart.VISUAL_ID:
			return getCentrar_2023IncomingLinks(view);
		case Virar_45_EsqEditPart.VISUAL_ID:
			return getVirar_45_Esq_2024IncomingLinks(view);
		case Virar_45_DrtEditPart.VISUAL_ID:
			return getVirar_45_Drt_2025IncomingLinks(view);
		case Mover_AleatoriamenteEditPart.VISUAL_ID:
			return getMover_Aleatoriamente_2026IncomingLinks(view);
		case PararEditPart.VISUAL_ID:
			return getParar_2035IncomingLinks(view);
		case Parar_TempoEditPart.VISUAL_ID:
			return getParar_Tempo_2036IncomingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2027IncomingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_2028IncomingLinks(view);
		case InicioEditPart.VISUAL_ID:
			return getInicio_2029IncomingLinks(view);
		case FimEditPart.VISUAL_ID:
			return getFim_2030IncomingLinks(view);
		case Bumper_PressionadoEditPart.VISUAL_ID:
			return getBumper_Pressionado_2033IncomingLinks(view);
		case Distancia_Infra_VermelhosEditPart.VISUAL_ID:
			return getDistancia_Infra_Vermelhos_2034IncomingLinks(view);
		case TransicoesEditPart.VISUAL_ID:
			return getTransicoes_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getOutgoingLinks(View view) {
		switch (ArduinoVisualIDRegistry.getVisualID(view)) {
		case Ligar_Cores_PoliciaEditPart.VISUAL_ID:
			return getLigar_Cores_Policia_2001OutgoingLinks(view);
		case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID:
			return getLigar_Cores_Arco_Iris_2002OutgoingLinks(view);
		case Ligar_AzulEditPart.VISUAL_ID:
			return getLigar_Azul_2003OutgoingLinks(view);
		case Ligar_VerdeEditPart.VISUAL_ID:
			return getLigar_Verde_2004OutgoingLinks(view);
		case Ligar_VermelhoEditPart.VISUAL_ID:
			return getLigar_Vermelho_2005OutgoingLinks(view);
		case Desligar_CorEditPart.VISUAL_ID:
			return getDesligar_Cor_2006OutgoingLinks(view);
		case Desligar_CoresEditPart.VISUAL_ID:
			return getDesligar_Cores_2007OutgoingLinks(view);
		case Ligar_LED_VerdeEditPart.VISUAL_ID:
			return getLigar_LED_Verde_2008OutgoingLinks(view);
		case Desligar_LED_VerdeEditPart.VISUAL_ID:
			return getDesligar_LED_Verde_2009OutgoingLinks(view);
		case Ligar_IntermitenciaEditPart.VISUAL_ID:
			return getLigar_Intermitencia_2010OutgoingLinks(view);
		case Desligar_IntermitenciaEditPart.VISUAL_ID:
			return getDesligar_Intermitencia_2011OutgoingLinks(view);
		case Virar_EsquerdaEditPart.VISUAL_ID:
			return getVirar_Esquerda_2012OutgoingLinks(view);
		case Mover_FrenteEditPart.VISUAL_ID:
			return getMover_Frente_2013OutgoingLinks(view);
		case Mover_TrasEditPart.VISUAL_ID:
			return getMover_Tras_2014OutgoingLinks(view);
		case Virar_DireitaEditPart.VISUAL_ID:
			return getVirar_Direita_2015OutgoingLinks(view);
		case Rodar_Esquerda_TempoEditPart.VISUAL_ID:
			return getRodar_Esquerda_Tempo_2016OutgoingLinks(view);
		case Rodar_Direita_TempoEditPart.VISUAL_ID:
			return getRodar_Direita_Tempo_2017OutgoingLinks(view);
		case Mover_Frente_TempoEditPart.VISUAL_ID:
			return getMover_Frente_Tempo_2018OutgoingLinks(view);
		case Mover_Tras_TempoEditPart.VISUAL_ID:
			return getMover_Tras_Tempo_2019OutgoingLinks(view);
		case Virar_para_X_GrausEditPart.VISUAL_ID:
			return getVirar_para_X_Graus_2020OutgoingLinks(view);
		case Virar_Max_DrtEditPart.VISUAL_ID:
			return getVirar_Max_Drt_2021OutgoingLinks(view);
		case Virar_Max_EsqEditPart.VISUAL_ID:
			return getVirar_Max_Esq_2022OutgoingLinks(view);
		case CentrarEditPart.VISUAL_ID:
			return getCentrar_2023OutgoingLinks(view);
		case Virar_45_EsqEditPart.VISUAL_ID:
			return getVirar_45_Esq_2024OutgoingLinks(view);
		case Virar_45_DrtEditPart.VISUAL_ID:
			return getVirar_45_Drt_2025OutgoingLinks(view);
		case Mover_AleatoriamenteEditPart.VISUAL_ID:
			return getMover_Aleatoriamente_2026OutgoingLinks(view);
		case PararEditPart.VISUAL_ID:
			return getParar_2035OutgoingLinks(view);
		case Parar_TempoEditPart.VISUAL_ID:
			return getParar_Tempo_2036OutgoingLinks(view);
		case WhileEditPart.VISUAL_ID:
			return getWhile_2027OutgoingLinks(view);
		case IfEditPart.VISUAL_ID:
			return getIf_2028OutgoingLinks(view);
		case InicioEditPart.VISUAL_ID:
			return getInicio_2029OutgoingLinks(view);
		case FimEditPart.VISUAL_ID:
			return getFim_2030OutgoingLinks(view);
		case Bumper_PressionadoEditPart.VISUAL_ID:
			return getBumper_Pressionado_2033OutgoingLinks(view);
		case Distancia_Infra_VermelhosEditPart.VISUAL_ID:
			return getDistancia_Infra_Vermelhos_2034OutgoingLinks(view);
		case TransicoesEditPart.VISUAL_ID:
			return getTransicoes_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getRobo_1000ContainedLinks(
			View view) {
		Robo modelElement = (Robo) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Cores_Policia_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Cores_Arco_Iris_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Azul_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Verde_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Vermelho_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_Cor_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_Cores_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_LED_Verde_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_LED_Verde_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Intermitencia_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_Intermitencia_2011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Esquerda_2012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Frente_2013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Tras_2014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Direita_2015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getRodar_Esquerda_Tempo_2016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getRodar_Direita_Tempo_2017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Frente_Tempo_2018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Tras_Tempo_2019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_para_X_Graus_2020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Max_Drt_2021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Max_Esq_2022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getCentrar_2023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_45_Esq_2024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_45_Drt_2025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Aleatoriamente_2026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getParar_2035ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getParar_Tempo_2036ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getWhile_2027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getIf_2028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getInicio_2029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getFim_2030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getBumper_Pressionado_2033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDistancia_Infra_Vermelhos_2034ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getTransicoes_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Cores_Policia_2001IncomingLinks(
			View view) {
		Ligar_Cores_Policia modelElement = (Ligar_Cores_Policia) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Cores_Arco_Iris_2002IncomingLinks(
			View view) {
		Ligar_Cores_Arco_Iris modelElement = (Ligar_Cores_Arco_Iris) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Azul_2003IncomingLinks(
			View view) {
		Ligar_Azul modelElement = (Ligar_Azul) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Verde_2004IncomingLinks(
			View view) {
		Ligar_Verde modelElement = (Ligar_Verde) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Vermelho_2005IncomingLinks(
			View view) {
		Ligar_Vermelho modelElement = (Ligar_Vermelho) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_Cor_2006IncomingLinks(
			View view) {
		Desligar_Cor modelElement = (Desligar_Cor) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_Cores_2007IncomingLinks(
			View view) {
		Desligar_Cores modelElement = (Desligar_Cores) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_LED_Verde_2008IncomingLinks(
			View view) {
		Ligar_LED_Verde modelElement = (Ligar_LED_Verde) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_LED_Verde_2009IncomingLinks(
			View view) {
		Desligar_LED_Verde modelElement = (Desligar_LED_Verde) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Intermitencia_2010IncomingLinks(
			View view) {
		Ligar_Intermitencia modelElement = (Ligar_Intermitencia) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_Intermitencia_2011IncomingLinks(
			View view) {
		Desligar_Intermitencia modelElement = (Desligar_Intermitencia) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Esquerda_2012IncomingLinks(
			View view) {
		Virar_Esquerda modelElement = (Virar_Esquerda) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Frente_2013IncomingLinks(
			View view) {
		Mover_Frente modelElement = (Mover_Frente) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Tras_2014IncomingLinks(
			View view) {
		Mover_Tras modelElement = (Mover_Tras) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Direita_2015IncomingLinks(
			View view) {
		Virar_Direita modelElement = (Virar_Direita) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getRodar_Esquerda_Tempo_2016IncomingLinks(
			View view) {
		Rodar_Esquerda_Tempo modelElement = (Rodar_Esquerda_Tempo) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getRodar_Direita_Tempo_2017IncomingLinks(
			View view) {
		Rodar_Direita_Tempo modelElement = (Rodar_Direita_Tempo) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Frente_Tempo_2018IncomingLinks(
			View view) {
		Mover_Frente_Tempo modelElement = (Mover_Frente_Tempo) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Tras_Tempo_2019IncomingLinks(
			View view) {
		Mover_Tras_Tempo modelElement = (Mover_Tras_Tempo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_para_X_Graus_2020IncomingLinks(
			View view) {
		Virar_para_X_Graus modelElement = (Virar_para_X_Graus) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Max_Drt_2021IncomingLinks(
			View view) {
		Virar_Max_Drt modelElement = (Virar_Max_Drt) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Max_Esq_2022IncomingLinks(
			View view) {
		Virar_Max_Esq modelElement = (Virar_Max_Esq) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getCentrar_2023IncomingLinks(
			View view) {
		Centrar modelElement = (Centrar) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_45_Esq_2024IncomingLinks(
			View view) {
		Virar_45_Esq modelElement = (Virar_45_Esq) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_45_Drt_2025IncomingLinks(
			View view) {
		Virar_45_Drt modelElement = (Virar_45_Drt) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Aleatoriamente_2026IncomingLinks(
			View view) {
		Mover_Aleatoriamente modelElement = (Mover_Aleatoriamente) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getParar_2035IncomingLinks(
			View view) {
		Parar modelElement = (Parar) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getParar_Tempo_2036IncomingLinks(
			View view) {
		Parar_Tempo modelElement = (Parar_Tempo) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getWhile_2027IncomingLinks(
			View view) {
		While modelElement = (While) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getIf_2028IncomingLinks(View view) {
		If modelElement = (If) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getInicio_2029IncomingLinks(
			View view) {
		Inicio modelElement = (Inicio) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getFim_2030IncomingLinks(View view) {
		Fim modelElement = (Fim) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transicoes_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getBumper_Pressionado_2033IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDistancia_Infra_Vermelhos_2034IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getTransicoes_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Cores_Policia_2001OutgoingLinks(
			View view) {
		Ligar_Cores_Policia modelElement = (Ligar_Cores_Policia) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Cores_Arco_Iris_2002OutgoingLinks(
			View view) {
		Ligar_Cores_Arco_Iris modelElement = (Ligar_Cores_Arco_Iris) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Azul_2003OutgoingLinks(
			View view) {
		Ligar_Azul modelElement = (Ligar_Azul) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Verde_2004OutgoingLinks(
			View view) {
		Ligar_Verde modelElement = (Ligar_Verde) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Vermelho_2005OutgoingLinks(
			View view) {
		Ligar_Vermelho modelElement = (Ligar_Vermelho) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_Cor_2006OutgoingLinks(
			View view) {
		Desligar_Cor modelElement = (Desligar_Cor) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_Cores_2007OutgoingLinks(
			View view) {
		Desligar_Cores modelElement = (Desligar_Cores) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_LED_Verde_2008OutgoingLinks(
			View view) {
		Ligar_LED_Verde modelElement = (Ligar_LED_Verde) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_LED_Verde_2009OutgoingLinks(
			View view) {
		Desligar_LED_Verde modelElement = (Desligar_LED_Verde) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getLigar_Intermitencia_2010OutgoingLinks(
			View view) {
		Ligar_Intermitencia modelElement = (Ligar_Intermitencia) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDesligar_Intermitencia_2011OutgoingLinks(
			View view) {
		Desligar_Intermitencia modelElement = (Desligar_Intermitencia) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Esquerda_2012OutgoingLinks(
			View view) {
		Virar_Esquerda modelElement = (Virar_Esquerda) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Frente_2013OutgoingLinks(
			View view) {
		Mover_Frente modelElement = (Mover_Frente) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Tras_2014OutgoingLinks(
			View view) {
		Mover_Tras modelElement = (Mover_Tras) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Direita_2015OutgoingLinks(
			View view) {
		Virar_Direita modelElement = (Virar_Direita) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getRodar_Esquerda_Tempo_2016OutgoingLinks(
			View view) {
		Rodar_Esquerda_Tempo modelElement = (Rodar_Esquerda_Tempo) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getRodar_Direita_Tempo_2017OutgoingLinks(
			View view) {
		Rodar_Direita_Tempo modelElement = (Rodar_Direita_Tempo) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Frente_Tempo_2018OutgoingLinks(
			View view) {
		Mover_Frente_Tempo modelElement = (Mover_Frente_Tempo) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Tras_Tempo_2019OutgoingLinks(
			View view) {
		Mover_Tras_Tempo modelElement = (Mover_Tras_Tempo) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_para_X_Graus_2020OutgoingLinks(
			View view) {
		Virar_para_X_Graus modelElement = (Virar_para_X_Graus) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Max_Drt_2021OutgoingLinks(
			View view) {
		Virar_Max_Drt modelElement = (Virar_Max_Drt) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_Max_Esq_2022OutgoingLinks(
			View view) {
		Virar_Max_Esq modelElement = (Virar_Max_Esq) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getCentrar_2023OutgoingLinks(
			View view) {
		Centrar modelElement = (Centrar) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_45_Esq_2024OutgoingLinks(
			View view) {
		Virar_45_Esq modelElement = (Virar_45_Esq) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getVirar_45_Drt_2025OutgoingLinks(
			View view) {
		Virar_45_Drt modelElement = (Virar_45_Drt) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getMover_Aleatoriamente_2026OutgoingLinks(
			View view) {
		Mover_Aleatoriamente modelElement = (Mover_Aleatoriamente) view
				.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getParar_2035OutgoingLinks(
			View view) {
		Parar modelElement = (Parar) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getParar_Tempo_2036OutgoingLinks(
			View view) {
		Parar_Tempo modelElement = (Parar_Tempo) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getWhile_2027OutgoingLinks(
			View view) {
		While modelElement = (While) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getIf_2028OutgoingLinks(View view) {
		If modelElement = (If) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getInicio_2029OutgoingLinks(
			View view) {
		Inicio modelElement = (Inicio) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getFim_2030OutgoingLinks(View view) {
		Fim modelElement = (Fim) view.getElement();
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transicoes_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getBumper_Pressionado_2033OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getDistancia_Infra_Vermelhos_2034OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArduinoLinkDescriptor> getTransicoes_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ArduinoLinkDescriptor> getContainedTypeModelFacetLinks_Transicoes_4001(
			Robo container) {
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		for (Iterator<?> links = container.getTemTransicoes().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transicoes) {
				continue;
			}
			Transicoes link = (Transicoes) linkObject;
			if (TransicoesEditPart.VISUAL_ID != ArduinoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Acao dst = link.getAcao_de_Saida();
			Acao src = link.getAcao_de_Entrada();
			result.add(new ArduinoLinkDescriptor(src, dst, link,
					ArduinoElementTypes.Transicoes_4001,
					TransicoesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArduinoLinkDescriptor> getIncomingTypeModelFacetLinks_Transicoes_4001(
			Acao target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ArduinoPackage.eINSTANCE
					.getTransicoes_Acao_de_Saida()
					|| false == setting.getEObject() instanceof Transicoes) {
				continue;
			}
			Transicoes link = (Transicoes) setting.getEObject();
			if (TransicoesEditPart.VISUAL_ID != ArduinoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Acao src = link.getAcao_de_Entrada();
			result.add(new ArduinoLinkDescriptor(src, target, link,
					ArduinoElementTypes.Transicoes_4001,
					TransicoesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArduinoLinkDescriptor> getOutgoingTypeModelFacetLinks_Transicoes_4001(
			Acao source) {
		Robo container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Robo) {
				container = (Robo) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ArduinoLinkDescriptor> result = new LinkedList<ArduinoLinkDescriptor>();
		for (Iterator<?> links = container.getTemTransicoes().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transicoes) {
				continue;
			}
			Transicoes link = (Transicoes) linkObject;
			if (TransicoesEditPart.VISUAL_ID != ArduinoVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Acao dst = link.getAcao_de_Saida();
			Acao src = link.getAcao_de_Entrada();
			if (src != source) {
				continue;
			}
			result.add(new ArduinoLinkDescriptor(src, dst, link,
					ArduinoElementTypes.Transicoes_4001,
					TransicoesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ArduinoNodeDescriptor> getSemanticChildren(View view) {
			return ArduinoDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ArduinoLinkDescriptor> getContainedLinks(View view) {
			return ArduinoDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ArduinoLinkDescriptor> getIncomingLinks(View view) {
			return ArduinoDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ArduinoLinkDescriptor> getOutgoingLinks(View view) {
			return ArduinoDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
