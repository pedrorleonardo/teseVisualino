/*
 * 
 */
package arduino.diagram.providers;

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

import arduino.ArduinoPackage;
import arduino.diagram.edit.parts.Bumper_PressionadoNomeEditPart;
import arduino.diagram.edit.parts.CentrarNomeEditPart;
import arduino.diagram.edit.parts.Desligar_CorNomeEditPart;
import arduino.diagram.edit.parts.Desligar_CoresNomeEditPart;
import arduino.diagram.edit.parts.Desligar_IntermitenciaNomeEditPart;
import arduino.diagram.edit.parts.Desligar_LED_VerdeNomeEditPart;
import arduino.diagram.edit.parts.Distancia_Infra_VermelhosDistanciaEditPart;
import arduino.diagram.edit.parts.FimNomeEditPart;
import arduino.diagram.edit.parts.IfNomeEditPart;
import arduino.diagram.edit.parts.InicioNomeEditPart;
import arduino.diagram.edit.parts.Ligar_AzulNomeEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_Arco_IrisNomeEditPart;
import arduino.diagram.edit.parts.Ligar_Cores_PoliciaNomeEditPart;
import arduino.diagram.edit.parts.Ligar_IntermitenciaNomeEditPart;
import arduino.diagram.edit.parts.Ligar_LED_VerdeNomeEditPart;
import arduino.diagram.edit.parts.Ligar_VerdeNomeEditPart;
import arduino.diagram.edit.parts.Ligar_VermelhoNomeEditPart;
import arduino.diagram.edit.parts.Mover_AleatoriamenteNomeEditPart;
import arduino.diagram.edit.parts.Mover_FrenteNomeEditPart;
import arduino.diagram.edit.parts.Mover_Frente_TempoTempoEditPart;
import arduino.diagram.edit.parts.Mover_TrasNomeEditPart;
import arduino.diagram.edit.parts.Mover_Tras_TempoTempoEditPart;
import arduino.diagram.edit.parts.PararNomeEditPart;
import arduino.diagram.edit.parts.Parar_TempoTempoEditPart;
import arduino.diagram.edit.parts.Rodar_Direita_TempoTempoEditPart;
import arduino.diagram.edit.parts.Rodar_Esquerda_TempoTempoEditPart;
import arduino.diagram.edit.parts.Virar_45_DrtNomeEditPart;
import arduino.diagram.edit.parts.Virar_45_EsqNomeEditPart;
import arduino.diagram.edit.parts.Virar_DireitaNomeEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaCenaEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaEvitarObstaculoEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaNomeEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaNomeNomeEditPart;
import arduino.diagram.edit.parts.Virar_Max_DrtNomeEditPart;
import arduino.diagram.edit.parts.Virar_Max_EsqNomeEditPart;
import arduino.diagram.edit.parts.Virar_para_X_GrausGrausEditPart;
import arduino.diagram.edit.parts.WhileNomeEditPart;
import arduino.diagram.parsers.MessageFormatParser;
import arduino.diagram.part.ArduinoVisualIDRegistry;

/**
 * @generated
 */
public class ArduinoParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser ligar_Cores_PoliciaNome_5006Parser;

	/**
	 * @generated
	 */
	private IParser getLigar_Cores_PoliciaNome_5006Parser() {
		if (ligar_Cores_PoliciaNome_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getLigar_Cores_Policia_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ligar_Cores_PoliciaNome_5006Parser = parser;
		}
		return ligar_Cores_PoliciaNome_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser ligar_Cores_Arco_IrisNome_5007Parser;

	/**
	 * @generated
	 */
	private IParser getLigar_Cores_Arco_IrisNome_5007Parser() {
		if (ligar_Cores_Arco_IrisNome_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getLigar_Cores_Arco_Iris_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ligar_Cores_Arco_IrisNome_5007Parser = parser;
		}
		return ligar_Cores_Arco_IrisNome_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser ligar_AzulNome_5008Parser;

	/**
	 * @generated
	 */
	private IParser getLigar_AzulNome_5008Parser() {
		if (ligar_AzulNome_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getLigar_Azul_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ligar_AzulNome_5008Parser = parser;
		}
		return ligar_AzulNome_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser ligar_VerdeNome_5009Parser;

	/**
	 * @generated
	 */
	private IParser getLigar_VerdeNome_5009Parser() {
		if (ligar_VerdeNome_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getLigar_Verde_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ligar_VerdeNome_5009Parser = parser;
		}
		return ligar_VerdeNome_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser ligar_VermelhoNome_5010Parser;

	/**
	 * @generated
	 */
	private IParser getLigar_VermelhoNome_5010Parser() {
		if (ligar_VermelhoNome_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getLigar_Vermelho_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ligar_VermelhoNome_5010Parser = parser;
		}
		return ligar_VermelhoNome_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser desligar_CorNome_5011Parser;

	/**
	 * @generated
	 */
	private IParser getDesligar_CorNome_5011Parser() {
		if (desligar_CorNome_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getDesligar_Cor_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			desligar_CorNome_5011Parser = parser;
		}
		return desligar_CorNome_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser desligar_CoresNome_5012Parser;

	/**
	 * @generated
	 */
	private IParser getDesligar_CoresNome_5012Parser() {
		if (desligar_CoresNome_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getDesligar_Cores_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			desligar_CoresNome_5012Parser = parser;
		}
		return desligar_CoresNome_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser ligar_LED_VerdeNome_5013Parser;

	/**
	 * @generated
	 */
	private IParser getLigar_LED_VerdeNome_5013Parser() {
		if (ligar_LED_VerdeNome_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getLigar_LED_Verde_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ligar_LED_VerdeNome_5013Parser = parser;
		}
		return ligar_LED_VerdeNome_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser desligar_LED_VerdeNome_5014Parser;

	/**
	 * @generated
	 */
	private IParser getDesligar_LED_VerdeNome_5014Parser() {
		if (desligar_LED_VerdeNome_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getDesligar_LED_Verde_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			desligar_LED_VerdeNome_5014Parser = parser;
		}
		return desligar_LED_VerdeNome_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser ligar_IntermitenciaNome_5015Parser;

	/**
	 * @generated
	 */
	private IParser getLigar_IntermitenciaNome_5015Parser() {
		if (ligar_IntermitenciaNome_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getLigar_Intermitencia_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ligar_IntermitenciaNome_5015Parser = parser;
		}
		return ligar_IntermitenciaNome_5015Parser;
	}

	/**
	 * @generated
	 */
	private IParser desligar_IntermitenciaNome_5016Parser;

	/**
	 * @generated
	 */
	private IParser getDesligar_IntermitenciaNome_5016Parser() {
		if (desligar_IntermitenciaNome_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getDesligar_Intermitencia_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			desligar_IntermitenciaNome_5016Parser = parser;
		}
		return desligar_IntermitenciaNome_5016Parser;
	}

	/**
	 * @generated
	 */
	private IParser virar_EsquerdaNome_5001Parser;

	/**
	 * @generated
	 */
	private IParser getVirar_EsquerdaNome_5001Parser() {
		if (virar_EsquerdaNome_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getVirar_Esquerda_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			virar_EsquerdaNome_5001Parser = parser;
		}
		return virar_EsquerdaNome_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser mover_FrenteNome_5002Parser;

	/**
	 * @generated
	 */
	private IParser getMover_FrenteNome_5002Parser() {
		if (mover_FrenteNome_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getMover_Frente_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mover_FrenteNome_5002Parser = parser;
		}
		return mover_FrenteNome_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser mover_TrasNome_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMover_TrasNome_5003Parser() {
		if (mover_TrasNome_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getMover_Tras_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mover_TrasNome_5003Parser = parser;
		}
		return mover_TrasNome_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser virar_DireitaNome_5004Parser;

	/**
	 * @generated
	 */
	private IParser getVirar_DireitaNome_5004Parser() {
		if (virar_DireitaNome_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getVirar_Direita_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			virar_DireitaNome_5004Parser = parser;
		}
		return virar_DireitaNome_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser rodar_Esquerda_TempoTempo_5005Parser;

	/**
	 * @generated
	 */
	private IParser getRodar_Esquerda_TempoTempo_5005Parser() {
		if (rodar_Esquerda_TempoTempo_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getCorpo_Modificavel_Tempo() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rodar_Esquerda_TempoTempo_5005Parser = parser;
		}
		return rodar_Esquerda_TempoTempo_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser rodar_Direita_TempoTempo_5017Parser;

	/**
	 * @generated
	 */
	private IParser getRodar_Direita_TempoTempo_5017Parser() {
		if (rodar_Direita_TempoTempo_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getCorpo_Modificavel_Tempo() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rodar_Direita_TempoTempo_5017Parser = parser;
		}
		return rodar_Direita_TempoTempo_5017Parser;
	}

	/**
	 * @generated
	 */
	private IParser mover_Frente_TempoTempo_5018Parser;

	/**
	 * @generated
	 */
	private IParser getMover_Frente_TempoTempo_5018Parser() {
		if (mover_Frente_TempoTempo_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getCorpo_Modificavel_Tempo() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mover_Frente_TempoTempo_5018Parser = parser;
		}
		return mover_Frente_TempoTempo_5018Parser;
	}

	/**
	 * @generated
	 */
	private IParser mover_Tras_TempoTempo_5019Parser;

	/**
	 * @generated
	 */
	private IParser getMover_Tras_TempoTempo_5019Parser() {
		if (mover_Tras_TempoTempo_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getCorpo_Modificavel_Tempo() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mover_Tras_TempoTempo_5019Parser = parser;
		}
		return mover_Tras_TempoTempo_5019Parser;
	}

	/**
	 * @generated
	 */
	private IParser virar_para_X_GrausGraus_5020Parser;

	/**
	 * @generated
	 */
	private IParser getVirar_para_X_GrausGraus_5020Parser() {
		if (virar_para_X_GrausGraus_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getCabeca_Modificavel_Graus() };
			MessageFormatParser parser = new MessageFormatParser(features);
			virar_para_X_GrausGraus_5020Parser = parser;
		}
		return virar_para_X_GrausGraus_5020Parser;
	}

	/**
	 * @generated
	 */
	private IParser virar_Max_DrtNome_5021Parser;

	/**
	 * @generated
	 */
	private IParser getVirar_Max_DrtNome_5021Parser() {
		if (virar_Max_DrtNome_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getVirar_Max_Drt_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			virar_Max_DrtNome_5021Parser = parser;
		}
		return virar_Max_DrtNome_5021Parser;
	}

	/**
	 * @generated
	 */
	private IParser virar_Max_EsqNome_5022Parser;

	/**
	 * @generated
	 */
	private IParser getVirar_Max_EsqNome_5022Parser() {
		if (virar_Max_EsqNome_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getVirar_Max_Esq_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			virar_Max_EsqNome_5022Parser = parser;
		}
		return virar_Max_EsqNome_5022Parser;
	}

	/**
	 * @generated
	 */
	private IParser centrarNome_5023Parser;

	/**
	 * @generated
	 */
	private IParser getCentrarNome_5023Parser() {
		if (centrarNome_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getCentrar_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			centrarNome_5023Parser = parser;
		}
		return centrarNome_5023Parser;
	}

	/**
	 * @generated
	 */
	private IParser virar_45_EsqNome_5024Parser;

	/**
	 * @generated
	 */
	private IParser getVirar_45_EsqNome_5024Parser() {
		if (virar_45_EsqNome_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getVirar_45_Esq_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			virar_45_EsqNome_5024Parser = parser;
		}
		return virar_45_EsqNome_5024Parser;
	}

	/**
	 * @generated
	 */
	private IParser virar_45_DrtNome_5025Parser;

	/**
	 * @generated
	 */
	private IParser getVirar_45_DrtNome_5025Parser() {
		if (virar_45_DrtNome_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getVirar_45_Drt_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			virar_45_DrtNome_5025Parser = parser;
		}
		return virar_45_DrtNome_5025Parser;
	}

	/**
	 * @generated
	 */
	private IParser mover_AleatoriamenteNome_5026Parser;

	/**
	 * @generated
	 */
	private IParser getMover_AleatoriamenteNome_5026Parser() {
		if (mover_AleatoriamenteNome_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getMover_Aleatoriamente_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			mover_AleatoriamenteNome_5026Parser = parser;
		}
		return mover_AleatoriamenteNome_5026Parser;
	}

	/**
	 * @generated
	 */
	private IParser pararNome_5034Parser;

	/**
	 * @generated
	 */
	private IParser getPararNome_5034Parser() {
		if (pararNome_5034Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getParar_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pararNome_5034Parser = parser;
		}
		return pararNome_5034Parser;
	}

	/**
	 * @generated
	 */
	private IParser parar_TempoTempo_5035Parser;

	/**
	 * @generated
	 */
	private IParser getParar_TempoTempo_5035Parser() {
		if (parar_TempoTempo_5035Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getCorpo_Modificavel_Tempo() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parar_TempoTempo_5035Parser = parser;
		}
		return parar_TempoTempo_5035Parser;
	}

	/**
	 * @generated
	 */
	private IParser whileNome_5036Parser;

	/**
	 * @generated
	 */
	private IParser getWhileNome_5036Parser() {
		if (whileNome_5036Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getWhile_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			whileNome_5036Parser = parser;
		}
		return whileNome_5036Parser;
	}

	/**
	 * @generated
	 */
	private IParser ifNome_5030Parser;

	/**
	 * @generated
	 */
	private IParser getIfNome_5030Parser() {
		if (ifNome_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getIf_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			ifNome_5030Parser = parser;
		}
		return ifNome_5030Parser;
	}

	/**
	 * @generated
	 */
	private IParser inicioNome_5027Parser;

	/**
	 * @generated
	 */
	private IParser getInicioNome_5027Parser() {
		if (inicioNome_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getInicio_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inicioNome_5027Parser = parser;
		}
		return inicioNome_5027Parser;
	}

	/**
	 * @generated
	 */
	private IParser fimNome_5028Parser;

	/**
	 * @generated
	 */
	private IParser getFimNome_5028Parser() {
		if (fimNome_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getFim_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			fimNome_5028Parser = parser;
		}
		return fimNome_5028Parser;
	}

	/**
	 * @generated
	 */
	private IParser bumper_PressionadoNome_5033Parser;

	/**
	 * @generated
	 */
	private IParser getBumper_PressionadoNome_5033Parser() {
		if (bumper_PressionadoNome_5033Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getBumper_Pressionado_Nome() };
			MessageFormatParser parser = new MessageFormatParser(features);
			bumper_PressionadoNome_5033Parser = parser;
		}
		return bumper_PressionadoNome_5033Parser;
	}

	/**
	 * @generated
	 */
	private IParser distancia_Infra_VermelhosDistancia_5032Parser;

	/**
	 * @generated
	 */
	private IParser getDistancia_Infra_VermelhosDistancia_5032Parser() {
		if (distancia_Infra_VermelhosDistancia_5032Parser == null) {
			EAttribute[] features = new EAttribute[] { ArduinoPackage.eINSTANCE
					.getDistancia_Infra_Vermelhos_Distancia() };
			MessageFormatParser parser = new MessageFormatParser(features);
			distancia_Infra_VermelhosDistancia_5032Parser = parser;
		}
		return distancia_Infra_VermelhosDistancia_5032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case Ligar_Cores_PoliciaNomeEditPart.VISUAL_ID:
			return getLigar_Cores_PoliciaNome_5006Parser();
		case Ligar_Cores_Arco_IrisNomeEditPart.VISUAL_ID:
			return getLigar_Cores_Arco_IrisNome_5007Parser();
		case Ligar_AzulNomeEditPart.VISUAL_ID:
			return getLigar_AzulNome_5008Parser();
		case Ligar_VerdeNomeEditPart.VISUAL_ID:
			return getLigar_VerdeNome_5009Parser();
		case Ligar_VermelhoNomeEditPart.VISUAL_ID:
			return getLigar_VermelhoNome_5010Parser();
		case Desligar_CorNomeEditPart.VISUAL_ID:
			return getDesligar_CorNome_5011Parser();
		case Desligar_CoresNomeEditPart.VISUAL_ID:
			return getDesligar_CoresNome_5012Parser();
		case Ligar_LED_VerdeNomeEditPart.VISUAL_ID:
			return getLigar_LED_VerdeNome_5013Parser();
		case Desligar_LED_VerdeNomeEditPart.VISUAL_ID:
			return getDesligar_LED_VerdeNome_5014Parser();
		case Ligar_IntermitenciaNomeEditPart.VISUAL_ID:
			return getLigar_IntermitenciaNome_5015Parser();
		case Desligar_IntermitenciaNomeEditPart.VISUAL_ID:
			return getDesligar_IntermitenciaNome_5016Parser();
		case Virar_EsquerdaNomeEditPart.VISUAL_ID:
			return getVirar_EsquerdaNome_5001Parser();
		case Mover_FrenteNomeEditPart.VISUAL_ID:
			return getMover_FrenteNome_5002Parser();
		case Mover_TrasNomeEditPart.VISUAL_ID:
			return getMover_TrasNome_5003Parser();
		case Virar_DireitaNomeEditPart.VISUAL_ID:
			return getVirar_DireitaNome_5004Parser();
		case Rodar_Esquerda_TempoTempoEditPart.VISUAL_ID:
			return getRodar_Esquerda_TempoTempo_5005Parser();
		case Rodar_Direita_TempoTempoEditPart.VISUAL_ID:
			return getRodar_Direita_TempoTempo_5017Parser();
		case Mover_Frente_TempoTempoEditPart.VISUAL_ID:
			return getMover_Frente_TempoTempo_5018Parser();
		case Mover_Tras_TempoTempoEditPart.VISUAL_ID:
			return getMover_Tras_TempoTempo_5019Parser();
		case Virar_para_X_GrausGrausEditPart.VISUAL_ID:
			return getVirar_para_X_GrausGraus_5020Parser();
		case Virar_Max_DrtNomeEditPart.VISUAL_ID:
			return getVirar_Max_DrtNome_5021Parser();
		case Virar_Max_EsqNomeEditPart.VISUAL_ID:
			return getVirar_Max_EsqNome_5022Parser();
		case CentrarNomeEditPart.VISUAL_ID:
			return getCentrarNome_5023Parser();
		case Virar_45_EsqNomeEditPart.VISUAL_ID:
			return getVirar_45_EsqNome_5024Parser();
		case Virar_45_DrtNomeEditPart.VISUAL_ID:
			return getVirar_45_DrtNome_5025Parser();
		case Mover_AleatoriamenteNomeEditPart.VISUAL_ID:
			return getMover_AleatoriamenteNome_5026Parser();
		case PararNomeEditPart.VISUAL_ID:
			return getPararNome_5034Parser();
		case Parar_TempoTempoEditPart.VISUAL_ID:
			return getParar_TempoTempo_5035Parser();
		case WhileNomeEditPart.VISUAL_ID:
			return getWhileNome_5036Parser();
		case IfNomeEditPart.VISUAL_ID:
			return getIfNome_5030Parser();
		case InicioNomeEditPart.VISUAL_ID:
			return getInicioNome_5027Parser();
		case FimNomeEditPart.VISUAL_ID:
			return getFimNome_5028Parser();
		case Bumper_PressionadoNomeEditPart.VISUAL_ID:
			return getBumper_PressionadoNome_5033Parser();
		case Distancia_Infra_VermelhosDistanciaEditPart.VISUAL_ID:
			return getDistancia_Infra_VermelhosDistancia_5032Parser();
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
			return getParser(ArduinoVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ArduinoVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ArduinoElementTypes.getElement(hint) == null) {
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
