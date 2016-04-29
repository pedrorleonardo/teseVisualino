/*
 * 
 */
package farrusco.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import farrusco.FarruscoPackage;
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

/**
 * @generated
 */
public class FarruscoElementTypes {

	/**
	 * @generated
	 */
	private FarruscoElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Robot_1000 = getElementType("org.farrusco.diagram.Robot_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Distancia_2001 = getElementType("org.farrusco.diagram.Distancia_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Bumpers_2002 = getElementType("org.farrusco.diagram.Bumpers_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Espera_2003 = getElementType("org.farrusco.diagram.Espera_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Motor_2004 = getElementType("org.farrusco.diagram.Motor_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Servo_2005 = getElementType("org.farrusco.diagram.Servo_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType LED_2006 = getElementType("org.farrusco.diagram.LED_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Prioridade_2007 = getElementType("org.farrusco.diagram.Prioridade_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Paralelo_2008 = getElementType("org.farrusco.diagram.Paralelo_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Sequencial_2009 = getElementType("org.farrusco.diagram.Sequencial_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Filho_4001 = getElementType("org.farrusco.diagram.Filho_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Irmao_4002 = getElementType("org.farrusco.diagram.Irmao_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return FarruscoDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Robot_1000, FarruscoPackage.eINSTANCE.getRobot());

			elements.put(Distancia_2001,
					FarruscoPackage.eINSTANCE.getDistancia());

			elements.put(Bumpers_2002, FarruscoPackage.eINSTANCE.getBumpers());

			elements.put(Espera_2003, FarruscoPackage.eINSTANCE.getEspera());

			elements.put(Motor_2004, FarruscoPackage.eINSTANCE.getMotor());

			elements.put(Servo_2005, FarruscoPackage.eINSTANCE.getServo());

			elements.put(LED_2006, FarruscoPackage.eINSTANCE.getLED());

			elements.put(Prioridade_2007,
					FarruscoPackage.eINSTANCE.getPrioridade());

			elements.put(Paralelo_2008, FarruscoPackage.eINSTANCE.getParalelo());

			elements.put(Sequencial_2009,
					FarruscoPackage.eINSTANCE.getSequencial());

			elements.put(Filho_4001, FarruscoPackage.eINSTANCE.getFilho());

			elements.put(Irmao_4002, FarruscoPackage.eINSTANCE.getIrmao());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Robot_1000);
			KNOWN_ELEMENT_TYPES.add(Distancia_2001);
			KNOWN_ELEMENT_TYPES.add(Bumpers_2002);
			KNOWN_ELEMENT_TYPES.add(Espera_2003);
			KNOWN_ELEMENT_TYPES.add(Motor_2004);
			KNOWN_ELEMENT_TYPES.add(Servo_2005);
			KNOWN_ELEMENT_TYPES.add(LED_2006);
			KNOWN_ELEMENT_TYPES.add(Prioridade_2007);
			KNOWN_ELEMENT_TYPES.add(Paralelo_2008);
			KNOWN_ELEMENT_TYPES.add(Sequencial_2009);
			KNOWN_ELEMENT_TYPES.add(Filho_4001);
			KNOWN_ELEMENT_TYPES.add(Irmao_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RobotEditPart.VISUAL_ID:
			return Robot_1000;
		case DistanciaEditPart.VISUAL_ID:
			return Distancia_2001;
		case BumpersEditPart.VISUAL_ID:
			return Bumpers_2002;
		case EsperaEditPart.VISUAL_ID:
			return Espera_2003;
		case MotorEditPart.VISUAL_ID:
			return Motor_2004;
		case ServoEditPart.VISUAL_ID:
			return Servo_2005;
		case LEDEditPart.VISUAL_ID:
			return LED_2006;
		case PrioridadeEditPart.VISUAL_ID:
			return Prioridade_2007;
		case ParaleloEditPart.VISUAL_ID:
			return Paralelo_2008;
		case SequencialEditPart.VISUAL_ID:
			return Sequencial_2009;
		case FilhoEditPart.VISUAL_ID:
			return Filho_4001;
		case IrmaoEditPart.VISUAL_ID:
			return Irmao_4002;
		}
		return null;
	}

}
