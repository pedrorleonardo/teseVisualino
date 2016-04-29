/*
 * 
 */
package farrusco.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
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

import farrusco.Bumpers;
import farrusco.Distancia;
import farrusco.Espera;
import farrusco.Motor;
import farrusco.Paralelo;
import farrusco.Prioridade;
import farrusco.Robot;
import farrusco.Sequencial;
import farrusco.Servo;
import farrusco.diagram.edit.parts.BumpersEditPart;
import farrusco.diagram.edit.parts.DistanciaEditPart;
import farrusco.diagram.edit.parts.EsperaEditPart;
import farrusco.diagram.edit.parts.FilhoEditPart;
import farrusco.diagram.edit.parts.IrmaoEditPart;
import farrusco.diagram.edit.parts.LEDEditPart;
import farrusco.diagram.edit.parts.MotorEditPart;
import farrusco.diagram.edit.parts.ParaleloEditPart;
import farrusco.diagram.edit.parts.PrioridadeEditPart;
import farrusco.diagram.edit.parts.RobotEditPart;
import farrusco.diagram.edit.parts.SequencialEditPart;
import farrusco.diagram.edit.parts.ServoEditPart;
import farrusco.diagram.part.FarruscoDiagramEditorPlugin;
import farrusco.diagram.part.FarruscoVisualIDRegistry;
import farrusco.diagram.providers.FarruscoElementTypes;

/**
 * @generated
 */
public class FarruscoNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		FarruscoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		FarruscoDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof FarruscoNavigatorItem
				&& !isOwnView(((FarruscoNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof FarruscoNavigatorGroup) {
			FarruscoNavigatorGroup group = (FarruscoNavigatorGroup) element;
			return FarruscoDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof FarruscoNavigatorItem) {
			FarruscoNavigatorItem navigatorItem = (FarruscoNavigatorItem) element;
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
		switch (FarruscoVisualIDRegistry.getVisualID(view)) {
		case BumpersEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://farrusco/1.0?Bumpers", FarruscoElementTypes.Bumpers_2002); //$NON-NLS-1$
		case MotorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://farrusco/1.0?Motor", FarruscoElementTypes.Motor_2004); //$NON-NLS-1$
		case ParaleloEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://farrusco/1.0?Paralelo", FarruscoElementTypes.Paralelo_2008); //$NON-NLS-1$
		case LEDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://farrusco/1.0?LED", FarruscoElementTypes.LED_2006); //$NON-NLS-1$
		case SequencialEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://farrusco/1.0?Sequencial", FarruscoElementTypes.Sequencial_2009); //$NON-NLS-1$
		case RobotEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://farrusco/1.0?Robot", FarruscoElementTypes.Robot_1000); //$NON-NLS-1$
		case PrioridadeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://farrusco/1.0?Prioridade", FarruscoElementTypes.Prioridade_2007); //$NON-NLS-1$
		case FilhoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://farrusco/1.0?Filho", FarruscoElementTypes.Filho_4001); //$NON-NLS-1$
		case ServoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://farrusco/1.0?Servo", FarruscoElementTypes.Servo_2005); //$NON-NLS-1$
		case IrmaoEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://farrusco/1.0?Irmao", FarruscoElementTypes.Irmao_4002); //$NON-NLS-1$
		case EsperaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://farrusco/1.0?Espera", FarruscoElementTypes.Espera_2003); //$NON-NLS-1$
		case DistanciaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://farrusco/1.0?Distancia", FarruscoElementTypes.Distancia_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = FarruscoDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& FarruscoElementTypes.isKnownElementType(elementType)) {
			image = FarruscoElementTypes.getImage(elementType);
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
		if (element instanceof FarruscoNavigatorGroup) {
			FarruscoNavigatorGroup group = (FarruscoNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof FarruscoNavigatorItem) {
			FarruscoNavigatorItem navigatorItem = (FarruscoNavigatorItem) element;
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
		switch (FarruscoVisualIDRegistry.getVisualID(view)) {
		case BumpersEditPart.VISUAL_ID:
			return getBumpers_2002Text(view);
		case MotorEditPart.VISUAL_ID:
			return getMotor_2004Text(view);
		case ParaleloEditPart.VISUAL_ID:
			return getParalelo_2008Text(view);
		case LEDEditPart.VISUAL_ID:
			return getLED_2006Text(view);
		case SequencialEditPart.VISUAL_ID:
			return getSequencial_2009Text(view);
		case RobotEditPart.VISUAL_ID:
			return getRobot_1000Text(view);
		case PrioridadeEditPart.VISUAL_ID:
			return getPrioridade_2007Text(view);
		case FilhoEditPart.VISUAL_ID:
			return getFilho_4001Text(view);
		case ServoEditPart.VISUAL_ID:
			return getServo_2005Text(view);
		case IrmaoEditPart.VISUAL_ID:
			return getIrmao_4002Text(view);
		case EsperaEditPart.VISUAL_ID:
			return getEspera_2003Text(view);
		case DistanciaEditPart.VISUAL_ID:
			return getDistancia_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getBumpers_2002Text(View view) {
		Bumpers domainModelElement = (Bumpers) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMotor_2004Text(View view) {
		Motor domainModelElement = (Motor) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParalelo_2008Text(View view) {
		Paralelo domainModelElement = (Paralelo) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getLED_2006Text(View view) {
		farrusco.LED domainModelElement = (farrusco.LED) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequencial_2009Text(View view) {
		Sequencial domainModelElement = (Sequencial) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRobot_1000Text(View view) {
		Robot domainModelElement = (Robot) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrioridade_2007Text(View view) {
		Prioridade domainModelElement = (Prioridade) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFilho_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getServo_2005Text(View view) {
		Servo domainModelElement = (Servo) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIrmao_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEspera_2003Text(View view) {
		Espera domainModelElement = (Espera) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDistancia_2001Text(View view) {
		Distancia domainModelElement = (Distancia) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNome();
		} else {
			FarruscoDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
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
		return RobotEditPart.MODEL_ID.equals(FarruscoVisualIDRegistry
				.getModelID(view));
	}

}
