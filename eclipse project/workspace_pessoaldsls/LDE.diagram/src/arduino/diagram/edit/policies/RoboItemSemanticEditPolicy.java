/*
 * 
 */
package arduino.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import arduino.diagram.edit.commands.Bumper_PressionadoCreateCommand;
import arduino.diagram.edit.commands.CentrarCreateCommand;
import arduino.diagram.edit.commands.Desligar_CorCreateCommand;
import arduino.diagram.edit.commands.Desligar_CoresCreateCommand;
import arduino.diagram.edit.commands.Desligar_IntermitenciaCreateCommand;
import arduino.diagram.edit.commands.Desligar_LED_VerdeCreateCommand;
import arduino.diagram.edit.commands.Distancia_Infra_VermelhosCreateCommand;
import arduino.diagram.edit.commands.FimCreateCommand;
import arduino.diagram.edit.commands.IfCreateCommand;
import arduino.diagram.edit.commands.InicioCreateCommand;
import arduino.diagram.edit.commands.Ligar_AzulCreateCommand;
import arduino.diagram.edit.commands.Ligar_Cores_Arco_IrisCreateCommand;
import arduino.diagram.edit.commands.Ligar_Cores_PoliciaCreateCommand;
import arduino.diagram.edit.commands.Ligar_IntermitenciaCreateCommand;
import arduino.diagram.edit.commands.Ligar_LED_VerdeCreateCommand;
import arduino.diagram.edit.commands.Ligar_VerdeCreateCommand;
import arduino.diagram.edit.commands.Ligar_VermelhoCreateCommand;
import arduino.diagram.edit.commands.Mover_AleatoriamenteCreateCommand;
import arduino.diagram.edit.commands.Mover_FrenteCreateCommand;
import arduino.diagram.edit.commands.Mover_Frente_TempoCreateCommand;
import arduino.diagram.edit.commands.Mover_TrasCreateCommand;
import arduino.diagram.edit.commands.Mover_Tras_TempoCreateCommand;
import arduino.diagram.edit.commands.PararCreateCommand;
import arduino.diagram.edit.commands.Parar_TempoCreateCommand;
import arduino.diagram.edit.commands.Rodar_Direita_TempoCreateCommand;
import arduino.diagram.edit.commands.Rodar_Esquerda_TempoCreateCommand;
import arduino.diagram.edit.commands.Virar_45_DrtCreateCommand;
import arduino.diagram.edit.commands.Virar_45_EsqCreateCommand;
import arduino.diagram.edit.commands.Virar_DireitaCreateCommand;
import arduino.diagram.edit.commands.Virar_EsquerdaCreateCommand;
import arduino.diagram.edit.commands.Virar_Max_DrtCreateCommand;
import arduino.diagram.edit.commands.Virar_Max_EsqCreateCommand;
import arduino.diagram.edit.commands.Virar_para_X_GrausCreateCommand;
import arduino.diagram.edit.commands.WhileCreateCommand;
import arduino.diagram.providers.ArduinoElementTypes;

/**
 * @generated
 */
public class RoboItemSemanticEditPolicy extends
		ArduinoBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoboItemSemanticEditPolicy() {
		super(ArduinoElementTypes.Robo_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArduinoElementTypes.Ligar_Cores_Policia_2001 == req
				.getElementType()) {
			return getGEFWrapper(new Ligar_Cores_PoliciaCreateCommand(req));
		}
		if (ArduinoElementTypes.Ligar_Cores_Arco_Iris_2002 == req
				.getElementType()) {
			return getGEFWrapper(new Ligar_Cores_Arco_IrisCreateCommand(req));
		}
		if (ArduinoElementTypes.Ligar_Azul_2003 == req.getElementType()) {
			return getGEFWrapper(new Ligar_AzulCreateCommand(req));
		}
		if (ArduinoElementTypes.Ligar_Verde_2004 == req.getElementType()) {
			return getGEFWrapper(new Ligar_VerdeCreateCommand(req));
		}
		if (ArduinoElementTypes.Ligar_Vermelho_2005 == req.getElementType()) {
			return getGEFWrapper(new Ligar_VermelhoCreateCommand(req));
		}
		if (ArduinoElementTypes.Desligar_Cor_2006 == req.getElementType()) {
			return getGEFWrapper(new Desligar_CorCreateCommand(req));
		}
		if (ArduinoElementTypes.Desligar_Cores_2007 == req.getElementType()) {
			return getGEFWrapper(new Desligar_CoresCreateCommand(req));
		}
		if (ArduinoElementTypes.Ligar_LED_Verde_2008 == req.getElementType()) {
			return getGEFWrapper(new Ligar_LED_VerdeCreateCommand(req));
		}
		if (ArduinoElementTypes.Desligar_LED_Verde_2009 == req.getElementType()) {
			return getGEFWrapper(new Desligar_LED_VerdeCreateCommand(req));
		}
		if (ArduinoElementTypes.Ligar_Intermitencia_2010 == req
				.getElementType()) {
			return getGEFWrapper(new Ligar_IntermitenciaCreateCommand(req));
		}
		if (ArduinoElementTypes.Desligar_Intermitencia_2011 == req
				.getElementType()) {
			return getGEFWrapper(new Desligar_IntermitenciaCreateCommand(req));
		}
		if (ArduinoElementTypes.Virar_Esquerda_2012 == req.getElementType()) {
			return getGEFWrapper(new Virar_EsquerdaCreateCommand(req));
		}
		if (ArduinoElementTypes.Mover_Frente_2013 == req.getElementType()) {
			return getGEFWrapper(new Mover_FrenteCreateCommand(req));
		}
		if (ArduinoElementTypes.Mover_Tras_2014 == req.getElementType()) {
			return getGEFWrapper(new Mover_TrasCreateCommand(req));
		}
		if (ArduinoElementTypes.Virar_Direita_2015 == req.getElementType()) {
			return getGEFWrapper(new Virar_DireitaCreateCommand(req));
		}
		if (ArduinoElementTypes.Rodar_Esquerda_Tempo_2016 == req
				.getElementType()) {
			return getGEFWrapper(new Rodar_Esquerda_TempoCreateCommand(req));
		}
		if (ArduinoElementTypes.Rodar_Direita_Tempo_2017 == req
				.getElementType()) {
			return getGEFWrapper(new Rodar_Direita_TempoCreateCommand(req));
		}
		if (ArduinoElementTypes.Mover_Frente_Tempo_2018 == req.getElementType()) {
			return getGEFWrapper(new Mover_Frente_TempoCreateCommand(req));
		}
		if (ArduinoElementTypes.Mover_Tras_Tempo_2019 == req.getElementType()) {
			return getGEFWrapper(new Mover_Tras_TempoCreateCommand(req));
		}
		if (ArduinoElementTypes.Virar_para_X_Graus_2020 == req.getElementType()) {
			return getGEFWrapper(new Virar_para_X_GrausCreateCommand(req));
		}
		if (ArduinoElementTypes.Virar_Max_Drt_2021 == req.getElementType()) {
			return getGEFWrapper(new Virar_Max_DrtCreateCommand(req));
		}
		if (ArduinoElementTypes.Virar_Max_Esq_2022 == req.getElementType()) {
			return getGEFWrapper(new Virar_Max_EsqCreateCommand(req));
		}
		if (ArduinoElementTypes.Centrar_2023 == req.getElementType()) {
			return getGEFWrapper(new CentrarCreateCommand(req));
		}
		if (ArduinoElementTypes.Virar_45_Esq_2024 == req.getElementType()) {
			return getGEFWrapper(new Virar_45_EsqCreateCommand(req));
		}
		if (ArduinoElementTypes.Virar_45_Drt_2025 == req.getElementType()) {
			return getGEFWrapper(new Virar_45_DrtCreateCommand(req));
		}
		if (ArduinoElementTypes.Mover_Aleatoriamente_2026 == req
				.getElementType()) {
			return getGEFWrapper(new Mover_AleatoriamenteCreateCommand(req));
		}
		if (ArduinoElementTypes.Parar_2035 == req.getElementType()) {
			return getGEFWrapper(new PararCreateCommand(req));
		}
		if (ArduinoElementTypes.Parar_Tempo_2036 == req.getElementType()) {
			return getGEFWrapper(new Parar_TempoCreateCommand(req));
		}
		if (ArduinoElementTypes.While_2027 == req.getElementType()) {
			return getGEFWrapper(new WhileCreateCommand(req));
		}
		if (ArduinoElementTypes.If_2028 == req.getElementType()) {
			return getGEFWrapper(new IfCreateCommand(req));
		}
		if (ArduinoElementTypes.Inicio_2029 == req.getElementType()) {
			return getGEFWrapper(new InicioCreateCommand(req));
		}
		if (ArduinoElementTypes.Fim_2030 == req.getElementType()) {
			return getGEFWrapper(new FimCreateCommand(req));
		}
		if (ArduinoElementTypes.Bumper_Pressionado_2033 == req.getElementType()) {
			return getGEFWrapper(new Bumper_PressionadoCreateCommand(req));
		}
		if (ArduinoElementTypes.Distancia_Infra_Vermelhos_2034 == req
				.getElementType()) {
			return getGEFWrapper(new Distancia_Infra_VermelhosCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
