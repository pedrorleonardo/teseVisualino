/*
 * 
 */
package arduino.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import arduino.diagram.edit.policies.Virar_Max_EsqItemSemanticEditPolicy;
import arduino.diagram.part.ArduinoVisualIDRegistry;
import arduino.diagram.providers.ArduinoElementTypes;

/**
 * @generated
 */
public class Virar_Max_EsqEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2022;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public Virar_Max_EsqEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Virar_Max_EsqItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new Virar_Max_EsqFigure();
	}

	/**
	 * @generated
	 */
	public Virar_Max_EsqFigure getPrimaryShape() {
		return (Virar_Max_EsqFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Virar_Max_EsqNomeEditPart) {
			((Virar_Max_EsqNomeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureVirar_Max_EsqLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof Virar_Max_EsqNomeEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ArduinoVisualIDRegistry
				.getType(Virar_Max_EsqNomeEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ArduinoElementTypes.Transicoes_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof Ligar_Cores_PoliciaEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Ligar_Cores_Arco_IrisEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Ligar_AzulEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Ligar_VerdeEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Ligar_VermelhoEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Desligar_CorEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Desligar_CoresEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Ligar_LED_VerdeEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Desligar_LED_VerdeEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Ligar_IntermitenciaEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Desligar_IntermitenciaEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Virar_EsquerdaEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Mover_FrenteEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Mover_TrasEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Virar_DireitaEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Rodar_Esquerda_TempoEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Rodar_Direita_TempoEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Mover_Frente_TempoEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Mover_Tras_TempoEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Virar_para_X_GrausEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Virar_Max_DrtEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof arduino.diagram.edit.parts.Virar_Max_EsqEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof CentrarEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Virar_45_EsqEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Virar_45_DrtEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Mover_AleatoriamenteEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof PararEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof Parar_TempoEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof WhileEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof IfEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof InicioEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		if (targetEditPart instanceof FimEditPart) {
			types.add(ArduinoElementTypes.Transicoes_4001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ArduinoElementTypes.Transicoes_4001) {
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
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(ArduinoElementTypes.Transicoes_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ArduinoElementTypes.Transicoes_4001) {
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
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations()
						.equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class Virar_Max_EsqFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureVirar_Max_EsqLabelFigure;

		/**
		 * @generated
		 */
		public Virar_Max_EsqFigure() {
			this.setForegroundColor(THIS_FORE);
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureVirar_Max_EsqLabelFigure = new WrappingLabel();

			fFigureVirar_Max_EsqLabelFigure.setText("Virar_Max_Esq");

			this.add(fFigureVirar_Max_EsqLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureVirar_Max_EsqLabelFigure() {
			return fFigureVirar_Max_EsqLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 255, 130, 253);

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 255, 130, 253);

}
