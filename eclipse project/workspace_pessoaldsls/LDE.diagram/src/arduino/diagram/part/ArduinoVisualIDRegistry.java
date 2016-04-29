/*
 * 
 */
package arduino.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import arduino.ArduinoPackage;
import arduino.Robo;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ArduinoVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "LDE.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (RoboEditPart.MODEL_ID.equals(view.getType())) {
				return RoboEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return arduino.diagram.part.ArduinoVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ArduinoDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ArduinoPackage.eINSTANCE.getRobo().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Robo) domainElement)) {
			return RoboEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = arduino.diagram.part.ArduinoVisualIDRegistry
				.getModelID(containerView);
		if (!RoboEditPart.MODEL_ID.equals(containerModelID)
				&& !"arduino".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (RoboEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = arduino.diagram.part.ArduinoVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RoboEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RoboEditPart.VISUAL_ID:
			if (ArduinoPackage.eINSTANCE.getLigar_Cores_Policia()
					.isSuperTypeOf(domainElement.eClass())) {
				return Ligar_Cores_PoliciaEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getLigar_Cores_Arco_Iris()
					.isSuperTypeOf(domainElement.eClass())) {
				return Ligar_Cores_Arco_IrisEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getLigar_Azul().isSuperTypeOf(
					domainElement.eClass())) {
				return Ligar_AzulEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getLigar_Verde().isSuperTypeOf(
					domainElement.eClass())) {
				return Ligar_VerdeEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getLigar_Vermelho().isSuperTypeOf(
					domainElement.eClass())) {
				return Ligar_VermelhoEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getDesligar_Cor().isSuperTypeOf(
					domainElement.eClass())) {
				return Desligar_CorEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getDesligar_Cores().isSuperTypeOf(
					domainElement.eClass())) {
				return Desligar_CoresEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getLigar_LED_Verde().isSuperTypeOf(
					domainElement.eClass())) {
				return Ligar_LED_VerdeEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getDesligar_LED_Verde().isSuperTypeOf(
					domainElement.eClass())) {
				return Desligar_LED_VerdeEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getLigar_Intermitencia()
					.isSuperTypeOf(domainElement.eClass())) {
				return Ligar_IntermitenciaEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getDesligar_Intermitencia()
					.isSuperTypeOf(domainElement.eClass())) {
				return Desligar_IntermitenciaEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getVirar_Esquerda().isSuperTypeOf(
					domainElement.eClass())) {
				return Virar_EsquerdaEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getMover_Frente().isSuperTypeOf(
					domainElement.eClass())) {
				return Mover_FrenteEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getMover_Tras().isSuperTypeOf(
					domainElement.eClass())) {
				return Mover_TrasEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getVirar_Direita().isSuperTypeOf(
					domainElement.eClass())) {
				return Virar_DireitaEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getRodar_Esquerda_Tempo()
					.isSuperTypeOf(domainElement.eClass())) {
				return Rodar_Esquerda_TempoEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getRodar_Direita_Tempo()
					.isSuperTypeOf(domainElement.eClass())) {
				return Rodar_Direita_TempoEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getMover_Frente_Tempo().isSuperTypeOf(
					domainElement.eClass())) {
				return Mover_Frente_TempoEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getMover_Tras_Tempo().isSuperTypeOf(
					domainElement.eClass())) {
				return Mover_Tras_TempoEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getVirar_para_X_Graus().isSuperTypeOf(
					domainElement.eClass())) {
				return Virar_para_X_GrausEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getVirar_Max_Drt().isSuperTypeOf(
					domainElement.eClass())) {
				return Virar_Max_DrtEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getVirar_Max_Esq().isSuperTypeOf(
					domainElement.eClass())) {
				return Virar_Max_EsqEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getCentrar().isSuperTypeOf(
					domainElement.eClass())) {
				return CentrarEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getVirar_45_Esq().isSuperTypeOf(
					domainElement.eClass())) {
				return Virar_45_EsqEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getVirar_45_Drt().isSuperTypeOf(
					domainElement.eClass())) {
				return Virar_45_DrtEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getMover_Aleatoriamente()
					.isSuperTypeOf(domainElement.eClass())) {
				return Mover_AleatoriamenteEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getParar().isSuperTypeOf(
					domainElement.eClass())) {
				return PararEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getParar_Tempo().isSuperTypeOf(
					domainElement.eClass())) {
				return Parar_TempoEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getWhile().isSuperTypeOf(
					domainElement.eClass())) {
				return WhileEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getIf().isSuperTypeOf(
					domainElement.eClass())) {
				return IfEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getInicio().isSuperTypeOf(
					domainElement.eClass())) {
				return InicioEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getFim().isSuperTypeOf(
					domainElement.eClass())) {
				return FimEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getBumper_Pressionado().isSuperTypeOf(
					domainElement.eClass())) {
				return Bumper_PressionadoEditPart.VISUAL_ID;
			}
			if (ArduinoPackage.eINSTANCE.getDistancia_Infra_Vermelhos()
					.isSuperTypeOf(domainElement.eClass())) {
				return Distancia_Infra_VermelhosEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = arduino.diagram.part.ArduinoVisualIDRegistry
				.getModelID(containerView);
		if (!RoboEditPart.MODEL_ID.equals(containerModelID)
				&& !"arduino".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (RoboEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = arduino.diagram.part.ArduinoVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RoboEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RoboEditPart.VISUAL_ID:
			if (Ligar_Cores_PoliciaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ligar_Cores_Arco_IrisEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ligar_AzulEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ligar_VerdeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ligar_VermelhoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Desligar_CorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Desligar_CoresEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ligar_LED_VerdeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Desligar_LED_VerdeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Ligar_IntermitenciaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Desligar_IntermitenciaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Virar_EsquerdaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Mover_FrenteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Mover_TrasEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Virar_DireitaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rodar_Esquerda_TempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Rodar_Direita_TempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Mover_Frente_TempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Mover_Tras_TempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Virar_para_X_GrausEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Virar_Max_DrtEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Virar_Max_EsqEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentrarEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Virar_45_EsqEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Virar_45_DrtEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Mover_AleatoriamenteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PararEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Parar_TempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InicioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FimEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Bumper_PressionadoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Distancia_Infra_VermelhosEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ligar_Cores_PoliciaEditPart.VISUAL_ID:
			if (Ligar_Cores_PoliciaNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID:
			if (Ligar_Cores_Arco_IrisNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ligar_AzulEditPart.VISUAL_ID:
			if (Ligar_AzulNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ligar_VerdeEditPart.VISUAL_ID:
			if (Ligar_VerdeNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ligar_VermelhoEditPart.VISUAL_ID:
			if (Ligar_VermelhoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Desligar_CorEditPart.VISUAL_ID:
			if (Desligar_CorNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Desligar_CoresEditPart.VISUAL_ID:
			if (Desligar_CoresNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ligar_LED_VerdeEditPart.VISUAL_ID:
			if (Ligar_LED_VerdeNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Desligar_LED_VerdeEditPart.VISUAL_ID:
			if (Desligar_LED_VerdeNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Ligar_IntermitenciaEditPart.VISUAL_ID:
			if (Ligar_IntermitenciaNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Desligar_IntermitenciaEditPart.VISUAL_ID:
			if (Desligar_IntermitenciaNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Virar_EsquerdaEditPart.VISUAL_ID:
			if (Virar_EsquerdaNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Mover_FrenteEditPart.VISUAL_ID:
			if (Mover_FrenteNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Mover_TrasEditPart.VISUAL_ID:
			if (Mover_TrasNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Virar_DireitaEditPart.VISUAL_ID:
			if (Virar_DireitaNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rodar_Esquerda_TempoEditPart.VISUAL_ID:
			if (Rodar_Esquerda_TempoTempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Rodar_Direita_TempoEditPart.VISUAL_ID:
			if (Rodar_Direita_TempoTempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Mover_Frente_TempoEditPart.VISUAL_ID:
			if (Mover_Frente_TempoTempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Mover_Tras_TempoEditPart.VISUAL_ID:
			if (Mover_Tras_TempoTempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Virar_para_X_GrausEditPart.VISUAL_ID:
			if (Virar_para_X_GrausGrausEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Virar_Max_DrtEditPart.VISUAL_ID:
			if (Virar_Max_DrtNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Virar_Max_EsqEditPart.VISUAL_ID:
			if (Virar_Max_EsqNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CentrarEditPart.VISUAL_ID:
			if (CentrarNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Virar_45_EsqEditPart.VISUAL_ID:
			if (Virar_45_EsqNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Virar_45_DrtEditPart.VISUAL_ID:
			if (Virar_45_DrtNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Mover_AleatoriamenteEditPart.VISUAL_ID:
			if (Mover_AleatoriamenteNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PararEditPart.VISUAL_ID:
			if (PararNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Parar_TempoEditPart.VISUAL_ID:
			if (Parar_TempoTempoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileEditPart.VISUAL_ID:
			if (WhileNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfEditPart.VISUAL_ID:
			if (IfNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InicioEditPart.VISUAL_ID:
			if (InicioNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FimEditPart.VISUAL_ID:
			if (FimNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Bumper_PressionadoEditPart.VISUAL_ID:
			if (Bumper_PressionadoNomeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Distancia_Infra_VermelhosEditPart.VISUAL_ID:
			if (Distancia_Infra_VermelhosDistanciaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ArduinoPackage.eINSTANCE.getTransicoes().isSuperTypeOf(
				domainElement.eClass())) {
			return TransicoesEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Robo element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case RoboEditPart.VISUAL_ID:
			return false;
		case Ligar_Cores_PoliciaEditPart.VISUAL_ID:
		case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID:
		case Ligar_AzulEditPart.VISUAL_ID:
		case Ligar_VerdeEditPart.VISUAL_ID:
		case Ligar_VermelhoEditPart.VISUAL_ID:
		case Desligar_CorEditPart.VISUAL_ID:
		case Desligar_CoresEditPart.VISUAL_ID:
		case Ligar_LED_VerdeEditPart.VISUAL_ID:
		case Desligar_LED_VerdeEditPart.VISUAL_ID:
		case Ligar_IntermitenciaEditPart.VISUAL_ID:
		case Desligar_IntermitenciaEditPart.VISUAL_ID:
		case Virar_EsquerdaEditPart.VISUAL_ID:
		case Mover_FrenteEditPart.VISUAL_ID:
		case Mover_TrasEditPart.VISUAL_ID:
		case Virar_DireitaEditPart.VISUAL_ID:
		case Rodar_Esquerda_TempoEditPart.VISUAL_ID:
		case Rodar_Direita_TempoEditPart.VISUAL_ID:
		case Mover_Frente_TempoEditPart.VISUAL_ID:
		case Mover_Tras_TempoEditPart.VISUAL_ID:
		case Virar_para_X_GrausEditPart.VISUAL_ID:
		case Virar_Max_DrtEditPart.VISUAL_ID:
		case Virar_Max_EsqEditPart.VISUAL_ID:
		case CentrarEditPart.VISUAL_ID:
		case Virar_45_EsqEditPart.VISUAL_ID:
		case Virar_45_DrtEditPart.VISUAL_ID:
		case Mover_AleatoriamenteEditPart.VISUAL_ID:
		case WhileEditPart.VISUAL_ID:
		case IfEditPart.VISUAL_ID:
		case InicioEditPart.VISUAL_ID:
		case FimEditPart.VISUAL_ID:
		case Bumper_PressionadoEditPart.VISUAL_ID:
		case Distancia_Infra_VermelhosEditPart.VISUAL_ID:
		case PararEditPart.VISUAL_ID:
		case Parar_TempoEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return arduino.diagram.part.ArduinoVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return arduino.diagram.part.ArduinoVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return arduino.diagram.part.ArduinoVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return arduino.diagram.part.ArduinoVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return arduino.diagram.part.ArduinoVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return arduino.diagram.part.ArduinoVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
