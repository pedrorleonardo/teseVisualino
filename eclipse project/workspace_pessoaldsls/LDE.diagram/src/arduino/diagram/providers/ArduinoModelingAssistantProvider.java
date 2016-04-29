/*
 * 
 */
package arduino.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

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
import arduino.diagram.edit.parts.Virar_45_DrtEditPart;
import arduino.diagram.edit.parts.Virar_45_EsqEditPart;
import arduino.diagram.edit.parts.Virar_DireitaEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaEditPart;
import arduino.diagram.edit.parts.Virar_Max_DrtEditPart;
import arduino.diagram.edit.parts.Virar_Max_EsqEditPart;
import arduino.diagram.edit.parts.Virar_para_X_GrausEditPart;
import arduino.diagram.edit.parts.WhileEditPart;
import arduino.diagram.part.ArduinoDiagramEditorPlugin;
import arduino.diagram.part.Messages;

/**
 * @generated
 */
public class ArduinoModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof RoboEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(34);
			types.add(ArduinoElementTypes.Ligar_Cores_Policia_2001);
			types.add(ArduinoElementTypes.Ligar_Cores_Arco_Iris_2002);
			types.add(ArduinoElementTypes.Ligar_Azul_2003);
			types.add(ArduinoElementTypes.Ligar_Verde_2004);
			types.add(ArduinoElementTypes.Ligar_Vermelho_2005);
			types.add(ArduinoElementTypes.Desligar_Cor_2006);
			types.add(ArduinoElementTypes.Desligar_Cores_2007);
			types.add(ArduinoElementTypes.Ligar_LED_Verde_2008);
			types.add(ArduinoElementTypes.Desligar_LED_Verde_2009);
			types.add(ArduinoElementTypes.Ligar_Intermitencia_2010);
			types.add(ArduinoElementTypes.Desligar_Intermitencia_2011);
			types.add(ArduinoElementTypes.Virar_Esquerda_2012);
			types.add(ArduinoElementTypes.Mover_Frente_2013);
			types.add(ArduinoElementTypes.Mover_Tras_2014);
			types.add(ArduinoElementTypes.Virar_Direita_2015);
			types.add(ArduinoElementTypes.Rodar_Esquerda_Tempo_2016);
			types.add(ArduinoElementTypes.Rodar_Direita_Tempo_2017);
			types.add(ArduinoElementTypes.Mover_Frente_Tempo_2018);
			types.add(ArduinoElementTypes.Mover_Tras_Tempo_2019);
			types.add(ArduinoElementTypes.Virar_para_X_Graus_2020);
			types.add(ArduinoElementTypes.Virar_Max_Drt_2021);
			types.add(ArduinoElementTypes.Virar_Max_Esq_2022);
			types.add(ArduinoElementTypes.Centrar_2023);
			types.add(ArduinoElementTypes.Virar_45_Esq_2024);
			types.add(ArduinoElementTypes.Virar_45_Drt_2025);
			types.add(ArduinoElementTypes.Mover_Aleatoriamente_2026);
			types.add(ArduinoElementTypes.Parar_2035);
			types.add(ArduinoElementTypes.Parar_Tempo_2036);
			types.add(ArduinoElementTypes.While_2027);
			types.add(ArduinoElementTypes.If_2028);
			types.add(ArduinoElementTypes.Inicio_2029);
			types.add(ArduinoElementTypes.Fim_2030);
			types.add(ArduinoElementTypes.Bumper_Pressionado_2033);
			types.add(ArduinoElementTypes.Distancia_Infra_Vermelhos_2034);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof Ligar_Cores_PoliciaEditPart) {
			return ((Ligar_Cores_PoliciaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Ligar_Cores_Arco_IrisEditPart) {
			return ((Ligar_Cores_Arco_IrisEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Ligar_AzulEditPart) {
			return ((Ligar_AzulEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Ligar_VerdeEditPart) {
			return ((Ligar_VerdeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Ligar_VermelhoEditPart) {
			return ((Ligar_VermelhoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Desligar_CorEditPart) {
			return ((Desligar_CorEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Desligar_CoresEditPart) {
			return ((Desligar_CoresEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Ligar_LED_VerdeEditPart) {
			return ((Ligar_LED_VerdeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Desligar_LED_VerdeEditPart) {
			return ((Desligar_LED_VerdeEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Ligar_IntermitenciaEditPart) {
			return ((Ligar_IntermitenciaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Desligar_IntermitenciaEditPart) {
			return ((Desligar_IntermitenciaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Virar_EsquerdaEditPart) {
			return ((Virar_EsquerdaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Mover_FrenteEditPart) {
			return ((Mover_FrenteEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Mover_TrasEditPart) {
			return ((Mover_TrasEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Virar_DireitaEditPart) {
			return ((Virar_DireitaEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Rodar_Esquerda_TempoEditPart) {
			return ((Rodar_Esquerda_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Rodar_Direita_TempoEditPart) {
			return ((Rodar_Direita_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Mover_Frente_TempoEditPart) {
			return ((Mover_Frente_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Mover_Tras_TempoEditPart) {
			return ((Mover_Tras_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Virar_para_X_GrausEditPart) {
			return ((Virar_para_X_GrausEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Virar_Max_DrtEditPart) {
			return ((Virar_Max_DrtEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Virar_Max_EsqEditPart) {
			return ((Virar_Max_EsqEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CentrarEditPart) {
			return ((CentrarEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Virar_45_EsqEditPart) {
			return ((Virar_45_EsqEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Virar_45_DrtEditPart) {
			return ((Virar_45_DrtEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Mover_AleatoriamenteEditPart) {
			return ((Mover_AleatoriamenteEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PararEditPart) {
			return ((PararEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Parar_TempoEditPart) {
			return ((Parar_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof IfEditPart) {
			return ((IfEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InicioEditPart) {
			return ((InicioEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FimEditPart) {
			return ((FimEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof Ligar_Cores_PoliciaEditPart) {
			return ((Ligar_Cores_PoliciaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Ligar_Cores_Arco_IrisEditPart) {
			return ((Ligar_Cores_Arco_IrisEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Ligar_AzulEditPart) {
			return ((Ligar_AzulEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Ligar_VerdeEditPart) {
			return ((Ligar_VerdeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Ligar_VermelhoEditPart) {
			return ((Ligar_VermelhoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Desligar_CorEditPart) {
			return ((Desligar_CorEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Desligar_CoresEditPart) {
			return ((Desligar_CoresEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Ligar_LED_VerdeEditPart) {
			return ((Ligar_LED_VerdeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Desligar_LED_VerdeEditPart) {
			return ((Desligar_LED_VerdeEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Ligar_IntermitenciaEditPart) {
			return ((Ligar_IntermitenciaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Desligar_IntermitenciaEditPart) {
			return ((Desligar_IntermitenciaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Virar_EsquerdaEditPart) {
			return ((Virar_EsquerdaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Mover_FrenteEditPart) {
			return ((Mover_FrenteEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Mover_TrasEditPart) {
			return ((Mover_TrasEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Virar_DireitaEditPart) {
			return ((Virar_DireitaEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Rodar_Esquerda_TempoEditPart) {
			return ((Rodar_Esquerda_TempoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Rodar_Direita_TempoEditPart) {
			return ((Rodar_Direita_TempoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Mover_Frente_TempoEditPart) {
			return ((Mover_Frente_TempoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Mover_Tras_TempoEditPart) {
			return ((Mover_Tras_TempoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Virar_para_X_GrausEditPart) {
			return ((Virar_para_X_GrausEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Virar_Max_DrtEditPart) {
			return ((Virar_Max_DrtEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Virar_Max_EsqEditPart) {
			return ((Virar_Max_EsqEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CentrarEditPart) {
			return ((CentrarEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Virar_45_EsqEditPart) {
			return ((Virar_45_EsqEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Virar_45_DrtEditPart) {
			return ((Virar_45_DrtEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Mover_AleatoriamenteEditPart) {
			return ((Mover_AleatoriamenteEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PararEditPart) {
			return ((PararEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Parar_TempoEditPart) {
			return ((Parar_TempoEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof IfEditPart) {
			return ((IfEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InicioEditPart) {
			return ((InicioEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FimEditPart) {
			return ((FimEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof Ligar_Cores_PoliciaEditPart) {
			return ((Ligar_Cores_PoliciaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Ligar_Cores_Arco_IrisEditPart) {
			return ((Ligar_Cores_Arco_IrisEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Ligar_AzulEditPart) {
			return ((Ligar_AzulEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Ligar_VerdeEditPart) {
			return ((Ligar_VerdeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Ligar_VermelhoEditPart) {
			return ((Ligar_VermelhoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Desligar_CorEditPart) {
			return ((Desligar_CorEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Desligar_CoresEditPart) {
			return ((Desligar_CoresEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Ligar_LED_VerdeEditPart) {
			return ((Ligar_LED_VerdeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Desligar_LED_VerdeEditPart) {
			return ((Desligar_LED_VerdeEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Ligar_IntermitenciaEditPart) {
			return ((Ligar_IntermitenciaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Desligar_IntermitenciaEditPart) {
			return ((Desligar_IntermitenciaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Virar_EsquerdaEditPart) {
			return ((Virar_EsquerdaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Mover_FrenteEditPart) {
			return ((Mover_FrenteEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Mover_TrasEditPart) {
			return ((Mover_TrasEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Virar_DireitaEditPart) {
			return ((Virar_DireitaEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Rodar_Esquerda_TempoEditPart) {
			return ((Rodar_Esquerda_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Rodar_Direita_TempoEditPart) {
			return ((Rodar_Direita_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Mover_Frente_TempoEditPart) {
			return ((Mover_Frente_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Mover_Tras_TempoEditPart) {
			return ((Mover_Tras_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Virar_para_X_GrausEditPart) {
			return ((Virar_para_X_GrausEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Virar_Max_DrtEditPart) {
			return ((Virar_Max_DrtEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Virar_Max_EsqEditPart) {
			return ((Virar_Max_EsqEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CentrarEditPart) {
			return ((CentrarEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Virar_45_EsqEditPart) {
			return ((Virar_45_EsqEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Virar_45_DrtEditPart) {
			return ((Virar_45_DrtEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Mover_AleatoriamenteEditPart) {
			return ((Mover_AleatoriamenteEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PararEditPart) {
			return ((PararEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Parar_TempoEditPart) {
			return ((Parar_TempoEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof IfEditPart) {
			return ((IfEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InicioEditPart) {
			return ((InicioEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FimEditPart) {
			return ((FimEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof Ligar_Cores_PoliciaEditPart) {
			return ((Ligar_Cores_PoliciaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Ligar_Cores_Arco_IrisEditPart) {
			return ((Ligar_Cores_Arco_IrisEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Ligar_AzulEditPart) {
			return ((Ligar_AzulEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Ligar_VerdeEditPart) {
			return ((Ligar_VerdeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Ligar_VermelhoEditPart) {
			return ((Ligar_VermelhoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Desligar_CorEditPart) {
			return ((Desligar_CorEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Desligar_CoresEditPart) {
			return ((Desligar_CoresEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Ligar_LED_VerdeEditPart) {
			return ((Ligar_LED_VerdeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Desligar_LED_VerdeEditPart) {
			return ((Desligar_LED_VerdeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Ligar_IntermitenciaEditPart) {
			return ((Ligar_IntermitenciaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Desligar_IntermitenciaEditPart) {
			return ((Desligar_IntermitenciaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Virar_EsquerdaEditPart) {
			return ((Virar_EsquerdaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Mover_FrenteEditPart) {
			return ((Mover_FrenteEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Mover_TrasEditPart) {
			return ((Mover_TrasEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Virar_DireitaEditPart) {
			return ((Virar_DireitaEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Rodar_Esquerda_TempoEditPart) {
			return ((Rodar_Esquerda_TempoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Rodar_Direita_TempoEditPart) {
			return ((Rodar_Direita_TempoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Mover_Frente_TempoEditPart) {
			return ((Mover_Frente_TempoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Mover_Tras_TempoEditPart) {
			return ((Mover_Tras_TempoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Virar_para_X_GrausEditPart) {
			return ((Virar_para_X_GrausEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Virar_Max_DrtEditPart) {
			return ((Virar_Max_DrtEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Virar_Max_EsqEditPart) {
			return ((Virar_Max_EsqEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CentrarEditPart) {
			return ((CentrarEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Virar_45_EsqEditPart) {
			return ((Virar_45_EsqEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Virar_45_DrtEditPart) {
			return ((Virar_45_DrtEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Mover_AleatoriamenteEditPart) {
			return ((Mover_AleatoriamenteEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PararEditPart) {
			return ((PararEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Parar_TempoEditPart) {
			return ((Parar_TempoEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof IfEditPart) {
			return ((IfEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InicioEditPart) {
			return ((InicioEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FimEditPart) {
			return ((FimEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof Ligar_Cores_PoliciaEditPart) {
			return ((Ligar_Cores_PoliciaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Ligar_Cores_Arco_IrisEditPart) {
			return ((Ligar_Cores_Arco_IrisEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Ligar_AzulEditPart) {
			return ((Ligar_AzulEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Ligar_VerdeEditPart) {
			return ((Ligar_VerdeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Ligar_VermelhoEditPart) {
			return ((Ligar_VermelhoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Desligar_CorEditPart) {
			return ((Desligar_CorEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Desligar_CoresEditPart) {
			return ((Desligar_CoresEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Ligar_LED_VerdeEditPart) {
			return ((Ligar_LED_VerdeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Desligar_LED_VerdeEditPart) {
			return ((Desligar_LED_VerdeEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Ligar_IntermitenciaEditPart) {
			return ((Ligar_IntermitenciaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Desligar_IntermitenciaEditPart) {
			return ((Desligar_IntermitenciaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Virar_EsquerdaEditPart) {
			return ((Virar_EsquerdaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Mover_FrenteEditPart) {
			return ((Mover_FrenteEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Mover_TrasEditPart) {
			return ((Mover_TrasEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Virar_DireitaEditPart) {
			return ((Virar_DireitaEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Rodar_Esquerda_TempoEditPart) {
			return ((Rodar_Esquerda_TempoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Rodar_Direita_TempoEditPart) {
			return ((Rodar_Direita_TempoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Mover_Frente_TempoEditPart) {
			return ((Mover_Frente_TempoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Mover_Tras_TempoEditPart) {
			return ((Mover_Tras_TempoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Virar_para_X_GrausEditPart) {
			return ((Virar_para_X_GrausEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Virar_Max_DrtEditPart) {
			return ((Virar_Max_DrtEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Virar_Max_EsqEditPart) {
			return ((Virar_Max_EsqEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CentrarEditPart) {
			return ((CentrarEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Virar_45_EsqEditPart) {
			return ((Virar_45_EsqEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Virar_45_DrtEditPart) {
			return ((Virar_45_DrtEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Mover_AleatoriamenteEditPart) {
			return ((Mover_AleatoriamenteEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PararEditPart) {
			return ((PararEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Parar_TempoEditPart) {
			return ((Parar_TempoEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WhileEditPart) {
			return ((WhileEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof IfEditPart) {
			return ((IfEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InicioEditPart) {
			return ((InicioEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FimEditPart) {
			return ((FimEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ArduinoDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.ArduinoModelingAssistantProviderMessage);
		dialog.setTitle(Messages.ArduinoModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
