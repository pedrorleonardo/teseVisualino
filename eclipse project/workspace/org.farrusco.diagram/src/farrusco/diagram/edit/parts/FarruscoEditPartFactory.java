/*
 * 
 */
package farrusco.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import farrusco.diagram.part.FarruscoVisualIDRegistry;

/**
 * @generated
 */
public class FarruscoEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (FarruscoVisualIDRegistry.getVisualID(view)) {

			case RobotEditPart.VISUAL_ID:
				return new RobotEditPart(view);

			case DistanciaEditPart.VISUAL_ID:
				return new DistanciaEditPart(view);

			case BumpersEditPart.VISUAL_ID:
				return new BumpersEditPart(view);

			case EsperaEditPart.VISUAL_ID:
				return new EsperaEditPart(view);

			case MotorEditPart.VISUAL_ID:
				return new MotorEditPart(view);

			case ServoEditPart.VISUAL_ID:
				return new ServoEditPart(view);

			case LEDEditPart.VISUAL_ID:
				return new LEDEditPart(view);

			case PrioridadeEditPart.VISUAL_ID:
				return new PrioridadeEditPart(view);

			case ParaleloEditPart.VISUAL_ID:
				return new ParaleloEditPart(view);

			case SequencialEditPart.VISUAL_ID:
				return new SequencialEditPart(view);

			case FilhoEditPart.VISUAL_ID:
				return new FilhoEditPart(view);

			case IrmaoEditPart.VISUAL_ID:
				return new IrmaoEditPart(view);

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
