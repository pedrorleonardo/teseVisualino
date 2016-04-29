/*
 * 
 */
package arduino.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import arduino.diagram.part.ArduinoVisualIDRegistry;

/**
 * @generated
 */
public class ArduinoEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ArduinoVisualIDRegistry.getVisualID(view)) {

			case RoboEditPart.VISUAL_ID:
				return new RoboEditPart(view);

			case Ligar_Cores_PoliciaEditPart.VISUAL_ID:
				return new Ligar_Cores_PoliciaEditPart(view);

			case Ligar_Cores_PoliciaNomeEditPart.VISUAL_ID:
				return new Ligar_Cores_PoliciaNomeEditPart(view);

			case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID:
				return new Ligar_Cores_Arco_IrisEditPart(view);

			case Ligar_Cores_Arco_IrisNomeEditPart.VISUAL_ID:
				return new Ligar_Cores_Arco_IrisNomeEditPart(view);

			case Ligar_AzulEditPart.VISUAL_ID:
				return new Ligar_AzulEditPart(view);

			case Ligar_AzulNomeEditPart.VISUAL_ID:
				return new Ligar_AzulNomeEditPart(view);

			case Ligar_VerdeEditPart.VISUAL_ID:
				return new Ligar_VerdeEditPart(view);

			case Ligar_VerdeNomeEditPart.VISUAL_ID:
				return new Ligar_VerdeNomeEditPart(view);

			case Ligar_VermelhoEditPart.VISUAL_ID:
				return new Ligar_VermelhoEditPart(view);

			case Ligar_VermelhoNomeEditPart.VISUAL_ID:
				return new Ligar_VermelhoNomeEditPart(view);

			case Desligar_CorEditPart.VISUAL_ID:
				return new Desligar_CorEditPart(view);

			case Desligar_CorNomeEditPart.VISUAL_ID:
				return new Desligar_CorNomeEditPart(view);

			case Desligar_CoresEditPart.VISUAL_ID:
				return new Desligar_CoresEditPart(view);

			case Desligar_CoresNomeEditPart.VISUAL_ID:
				return new Desligar_CoresNomeEditPart(view);

			case Ligar_LED_VerdeEditPart.VISUAL_ID:
				return new Ligar_LED_VerdeEditPart(view);

			case Ligar_LED_VerdeNomeEditPart.VISUAL_ID:
				return new Ligar_LED_VerdeNomeEditPart(view);

			case Desligar_LED_VerdeEditPart.VISUAL_ID:
				return new Desligar_LED_VerdeEditPart(view);

			case Desligar_LED_VerdeNomeEditPart.VISUAL_ID:
				return new Desligar_LED_VerdeNomeEditPart(view);

			case Ligar_IntermitenciaEditPart.VISUAL_ID:
				return new Ligar_IntermitenciaEditPart(view);

			case Ligar_IntermitenciaNomeEditPart.VISUAL_ID:
				return new Ligar_IntermitenciaNomeEditPart(view);

			case Desligar_IntermitenciaEditPart.VISUAL_ID:
				return new Desligar_IntermitenciaEditPart(view);

			case Desligar_IntermitenciaNomeEditPart.VISUAL_ID:
				return new Desligar_IntermitenciaNomeEditPart(view);

			case Virar_EsquerdaEditPart.VISUAL_ID:
				return new Virar_EsquerdaEditPart(view);

			case Virar_EsquerdaNomeEditPart.VISUAL_ID:
				return new Virar_EsquerdaNomeEditPart(view);

			case Mover_FrenteEditPart.VISUAL_ID:
				return new Mover_FrenteEditPart(view);

			case Mover_FrenteNomeEditPart.VISUAL_ID:
				return new Mover_FrenteNomeEditPart(view);

			case Mover_TrasEditPart.VISUAL_ID:
				return new Mover_TrasEditPart(view);

			case Mover_TrasNomeEditPart.VISUAL_ID:
				return new Mover_TrasNomeEditPart(view);

			case Virar_DireitaEditPart.VISUAL_ID:
				return new Virar_DireitaEditPart(view);

			case Virar_DireitaNomeEditPart.VISUAL_ID:
				return new Virar_DireitaNomeEditPart(view);

			case Rodar_Esquerda_TempoEditPart.VISUAL_ID:
				return new Rodar_Esquerda_TempoEditPart(view);

			case Rodar_Esquerda_TempoTempoEditPart.VISUAL_ID:
				return new Rodar_Esquerda_TempoTempoEditPart(view);

			case Rodar_Direita_TempoEditPart.VISUAL_ID:
				return new Rodar_Direita_TempoEditPart(view);

			case Rodar_Direita_TempoTempoEditPart.VISUAL_ID:
				return new Rodar_Direita_TempoTempoEditPart(view);

			case Mover_Frente_TempoEditPart.VISUAL_ID:
				return new Mover_Frente_TempoEditPart(view);

			case Mover_Frente_TempoTempoEditPart.VISUAL_ID:
				return new Mover_Frente_TempoTempoEditPart(view);

			case Mover_Tras_TempoEditPart.VISUAL_ID:
				return new Mover_Tras_TempoEditPart(view);

			case Mover_Tras_TempoTempoEditPart.VISUAL_ID:
				return new Mover_Tras_TempoTempoEditPart(view);

			case Virar_para_X_GrausEditPart.VISUAL_ID:
				return new Virar_para_X_GrausEditPart(view);

			case Virar_para_X_GrausGrausEditPart.VISUAL_ID:
				return new Virar_para_X_GrausGrausEditPart(view);

			case Virar_Max_DrtEditPart.VISUAL_ID:
				return new Virar_Max_DrtEditPart(view);

			case Virar_Max_DrtNomeEditPart.VISUAL_ID:
				return new Virar_Max_DrtNomeEditPart(view);

			case Virar_Max_EsqEditPart.VISUAL_ID:
				return new Virar_Max_EsqEditPart(view);

			case Virar_Max_EsqNomeEditPart.VISUAL_ID:
				return new Virar_Max_EsqNomeEditPart(view);

			case CentrarEditPart.VISUAL_ID:
				return new CentrarEditPart(view);

			case CentrarNomeEditPart.VISUAL_ID:
				return new CentrarNomeEditPart(view);

			case Virar_45_EsqEditPart.VISUAL_ID:
				return new Virar_45_EsqEditPart(view);

			case Virar_45_EsqNomeEditPart.VISUAL_ID:
				return new Virar_45_EsqNomeEditPart(view);

			case Virar_45_DrtEditPart.VISUAL_ID:
				return new Virar_45_DrtEditPart(view);

			case Virar_45_DrtNomeEditPart.VISUAL_ID:
				return new Virar_45_DrtNomeEditPart(view);

			case Mover_AleatoriamenteEditPart.VISUAL_ID:
				return new Mover_AleatoriamenteEditPart(view);

			case Mover_AleatoriamenteNomeEditPart.VISUAL_ID:
				return new Mover_AleatoriamenteNomeEditPart(view);

			case PararEditPart.VISUAL_ID:
				return new PararEditPart(view);

			case PararNomeEditPart.VISUAL_ID:
				return new PararNomeEditPart(view);

			case Parar_TempoEditPart.VISUAL_ID:
				return new Parar_TempoEditPart(view);

			case Parar_TempoTempoEditPart.VISUAL_ID:
				return new Parar_TempoTempoEditPart(view);

			case WhileEditPart.VISUAL_ID:
				return new WhileEditPart(view);

			case WhileNomeEditPart.VISUAL_ID:
				return new WhileNomeEditPart(view);

			case IfEditPart.VISUAL_ID:
				return new IfEditPart(view);

			case IfNomeEditPart.VISUAL_ID:
				return new IfNomeEditPart(view);

			case InicioEditPart.VISUAL_ID:
				return new InicioEditPart(view);

			case InicioNomeEditPart.VISUAL_ID:
				return new InicioNomeEditPart(view);

			case FimEditPart.VISUAL_ID:
				return new FimEditPart(view);

			case FimNomeEditPart.VISUAL_ID:
				return new FimNomeEditPart(view);

			case Bumper_PressionadoEditPart.VISUAL_ID:
				return new Bumper_PressionadoEditPart(view);

			case Bumper_PressionadoNomeEditPart.VISUAL_ID:
				return new Bumper_PressionadoNomeEditPart(view);

			case Distancia_Infra_VermelhosEditPart.VISUAL_ID:
				return new Distancia_Infra_VermelhosEditPart(view);

			case Distancia_Infra_VermelhosDistanciaEditPart.VISUAL_ID:
				return new Distancia_Infra_VermelhosDistanciaEditPart(view);

			case TransicoesEditPart.VISUAL_ID:
				return new TransicoesEditPart(view);

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
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
