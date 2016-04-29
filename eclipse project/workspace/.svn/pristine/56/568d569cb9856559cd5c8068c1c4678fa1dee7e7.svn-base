/*
 * 
 */
package farrusco.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
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
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import farrusco.diagram.edit.policies.ServoItemSemanticEditPolicy;
import farrusco.diagram.providers.FarruscoElementTypes;

/**
 * @generated
 */
public class ServoEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

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
	public ServoEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ServoItemSemanticEditPolicy());
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
		return primaryShape = new figuresPlan.figures.ServoFigure();
	}

	/**
	 * @generated
	 */
	public figuresPlan.figures.ServoFigure getPrimaryShape() {
		return (figuresPlan.figures.ServoFigure) primaryShape;
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
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(FarruscoElementTypes.Irmao_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof DistanciaEditPart) {
			types.add(FarruscoElementTypes.Irmao_4002);
		}
		if (targetEditPart instanceof BumpersEditPart) {
			types.add(FarruscoElementTypes.Irmao_4002);
		}
		if (targetEditPart instanceof EsperaEditPart) {
			types.add(FarruscoElementTypes.Irmao_4002);
		}
		if (targetEditPart instanceof MotorEditPart) {
			types.add(FarruscoElementTypes.Irmao_4002);
		}
		if (targetEditPart instanceof farrusco.diagram.edit.parts.ServoEditPart) {
			types.add(FarruscoElementTypes.Irmao_4002);
		}
		if (targetEditPart instanceof LEDEditPart) {
			types.add(FarruscoElementTypes.Irmao_4002);
		}
		if (targetEditPart instanceof PrioridadeEditPart) {
			types.add(FarruscoElementTypes.Irmao_4002);
		}
		if (targetEditPart instanceof ParaleloEditPart) {
			types.add(FarruscoElementTypes.Irmao_4002);
		}
		if (targetEditPart instanceof SequencialEditPart) {
			types.add(FarruscoElementTypes.Irmao_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == FarruscoElementTypes.Irmao_4002) {
			types.add(FarruscoElementTypes.Distancia_2001);
			types.add(FarruscoElementTypes.Bumpers_2002);
			types.add(FarruscoElementTypes.Espera_2003);
			types.add(FarruscoElementTypes.Motor_2004);
			types.add(FarruscoElementTypes.Servo_2005);
			types.add(FarruscoElementTypes.LED_2006);
			types.add(FarruscoElementTypes.Prioridade_2007);
			types.add(FarruscoElementTypes.Paralelo_2008);
			types.add(FarruscoElementTypes.Sequencial_2009);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(FarruscoElementTypes.Filho_4001);
		types.add(FarruscoElementTypes.Irmao_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == FarruscoElementTypes.Filho_4001) {
			types.add(FarruscoElementTypes.Prioridade_2007);
			types.add(FarruscoElementTypes.Paralelo_2008);
			types.add(FarruscoElementTypes.Sequencial_2009);
		} else if (relationshipType == FarruscoElementTypes.Irmao_4002) {
			types.add(FarruscoElementTypes.Distancia_2001);
			types.add(FarruscoElementTypes.Bumpers_2002);
			types.add(FarruscoElementTypes.Espera_2003);
			types.add(FarruscoElementTypes.Motor_2004);
			types.add(FarruscoElementTypes.Servo_2005);
			types.add(FarruscoElementTypes.LED_2006);
			types.add(FarruscoElementTypes.Prioridade_2007);
			types.add(FarruscoElementTypes.Paralelo_2008);
			types.add(FarruscoElementTypes.Sequencial_2009);
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

}
