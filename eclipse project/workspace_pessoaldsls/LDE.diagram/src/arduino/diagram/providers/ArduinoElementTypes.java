/*
 * 
 */
package arduino.diagram.providers;

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

import arduino.ArduinoPackage;
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
import arduino.diagram.edit.parts.TransicoesEditPart;
import arduino.diagram.edit.parts.Virar_45_DrtEditPart;
import arduino.diagram.edit.parts.Virar_45_EsqEditPart;
import arduino.diagram.edit.parts.Virar_DireitaEditPart;
import arduino.diagram.edit.parts.Virar_EsquerdaEditPart;
import arduino.diagram.edit.parts.Virar_Max_DrtEditPart;
import arduino.diagram.edit.parts.Virar_Max_EsqEditPart;
import arduino.diagram.edit.parts.Virar_para_X_GrausEditPart;
import arduino.diagram.edit.parts.WhileEditPart;
import arduino.diagram.part.ArduinoDiagramEditorPlugin;

/**
 * @generated
 */
public class ArduinoElementTypes {

	/**
	 * @generated
	 */
	private ArduinoElementTypes() {
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
	public static final IElementType Robo_1000 = getElementType("LDE.diagram.Robo_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ligar_Cores_Policia_2001 = getElementType("LDE.diagram.Ligar_Cores_Policia_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ligar_Cores_Arco_Iris_2002 = getElementType("LDE.diagram.Ligar_Cores_Arco_Iris_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ligar_Azul_2003 = getElementType("LDE.diagram.Ligar_Azul_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ligar_Verde_2004 = getElementType("LDE.diagram.Ligar_Verde_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ligar_Vermelho_2005 = getElementType("LDE.diagram.Ligar_Vermelho_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Desligar_Cor_2006 = getElementType("LDE.diagram.Desligar_Cor_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Desligar_Cores_2007 = getElementType("LDE.diagram.Desligar_Cores_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ligar_LED_Verde_2008 = getElementType("LDE.diagram.Ligar_LED_Verde_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Desligar_LED_Verde_2009 = getElementType("LDE.diagram.Desligar_LED_Verde_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ligar_Intermitencia_2010 = getElementType("LDE.diagram.Ligar_Intermitencia_2010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Desligar_Intermitencia_2011 = getElementType("LDE.diagram.Desligar_Intermitencia_2011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Virar_Esquerda_2012 = getElementType("LDE.diagram.Virar_Esquerda_2012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mover_Frente_2013 = getElementType("LDE.diagram.Mover_Frente_2013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mover_Tras_2014 = getElementType("LDE.diagram.Mover_Tras_2014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Virar_Direita_2015 = getElementType("LDE.diagram.Virar_Direita_2015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rodar_Esquerda_Tempo_2016 = getElementType("LDE.diagram.Rodar_Esquerda_Tempo_2016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rodar_Direita_Tempo_2017 = getElementType("LDE.diagram.Rodar_Direita_Tempo_2017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mover_Frente_Tempo_2018 = getElementType("LDE.diagram.Mover_Frente_Tempo_2018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mover_Tras_Tempo_2019 = getElementType("LDE.diagram.Mover_Tras_Tempo_2019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Virar_para_X_Graus_2020 = getElementType("LDE.diagram.Virar_para_X_Graus_2020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Virar_Max_Drt_2021 = getElementType("LDE.diagram.Virar_Max_Drt_2021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Virar_Max_Esq_2022 = getElementType("LDE.diagram.Virar_Max_Esq_2022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Centrar_2023 = getElementType("LDE.diagram.Centrar_2023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Virar_45_Esq_2024 = getElementType("LDE.diagram.Virar_45_Esq_2024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Virar_45_Drt_2025 = getElementType("LDE.diagram.Virar_45_Drt_2025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Mover_Aleatoriamente_2026 = getElementType("LDE.diagram.Mover_Aleatoriamente_2026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Parar_2035 = getElementType("LDE.diagram.Parar_2035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Parar_Tempo_2036 = getElementType("LDE.diagram.Parar_Tempo_2036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType While_2027 = getElementType("LDE.diagram.While_2027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType If_2028 = getElementType("LDE.diagram.If_2028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Inicio_2029 = getElementType("LDE.diagram.Inicio_2029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Fim_2030 = getElementType("LDE.diagram.Fim_2030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Bumper_Pressionado_2033 = getElementType("LDE.diagram.Bumper_Pressionado_2033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Distancia_Infra_Vermelhos_2034 = getElementType("LDE.diagram.Distancia_Infra_Vermelhos_2034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Transicoes_4001 = getElementType("LDE.diagram.Transicoes_4001"); //$NON-NLS-1$

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
				return ArduinoDiagramEditorPlugin.getInstance()
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

			elements.put(Robo_1000, ArduinoPackage.eINSTANCE.getRobo());

			elements.put(Ligar_Cores_Policia_2001,
					ArduinoPackage.eINSTANCE.getLigar_Cores_Policia());

			elements.put(Ligar_Cores_Arco_Iris_2002,
					ArduinoPackage.eINSTANCE.getLigar_Cores_Arco_Iris());

			elements.put(Ligar_Azul_2003,
					ArduinoPackage.eINSTANCE.getLigar_Azul());

			elements.put(Ligar_Verde_2004,
					ArduinoPackage.eINSTANCE.getLigar_Verde());

			elements.put(Ligar_Vermelho_2005,
					ArduinoPackage.eINSTANCE.getLigar_Vermelho());

			elements.put(Desligar_Cor_2006,
					ArduinoPackage.eINSTANCE.getDesligar_Cor());

			elements.put(Desligar_Cores_2007,
					ArduinoPackage.eINSTANCE.getDesligar_Cores());

			elements.put(Ligar_LED_Verde_2008,
					ArduinoPackage.eINSTANCE.getLigar_LED_Verde());

			elements.put(Desligar_LED_Verde_2009,
					ArduinoPackage.eINSTANCE.getDesligar_LED_Verde());

			elements.put(Ligar_Intermitencia_2010,
					ArduinoPackage.eINSTANCE.getLigar_Intermitencia());

			elements.put(Desligar_Intermitencia_2011,
					ArduinoPackage.eINSTANCE.getDesligar_Intermitencia());

			elements.put(Virar_Esquerda_2012,
					ArduinoPackage.eINSTANCE.getVirar_Esquerda());

			elements.put(Mover_Frente_2013,
					ArduinoPackage.eINSTANCE.getMover_Frente());

			elements.put(Mover_Tras_2014,
					ArduinoPackage.eINSTANCE.getMover_Tras());

			elements.put(Virar_Direita_2015,
					ArduinoPackage.eINSTANCE.getVirar_Direita());

			elements.put(Rodar_Esquerda_Tempo_2016,
					ArduinoPackage.eINSTANCE.getRodar_Esquerda_Tempo());

			elements.put(Rodar_Direita_Tempo_2017,
					ArduinoPackage.eINSTANCE.getRodar_Direita_Tempo());

			elements.put(Mover_Frente_Tempo_2018,
					ArduinoPackage.eINSTANCE.getMover_Frente_Tempo());

			elements.put(Mover_Tras_Tempo_2019,
					ArduinoPackage.eINSTANCE.getMover_Tras_Tempo());

			elements.put(Virar_para_X_Graus_2020,
					ArduinoPackage.eINSTANCE.getVirar_para_X_Graus());

			elements.put(Virar_Max_Drt_2021,
					ArduinoPackage.eINSTANCE.getVirar_Max_Drt());

			elements.put(Virar_Max_Esq_2022,
					ArduinoPackage.eINSTANCE.getVirar_Max_Esq());

			elements.put(Centrar_2023, ArduinoPackage.eINSTANCE.getCentrar());

			elements.put(Virar_45_Esq_2024,
					ArduinoPackage.eINSTANCE.getVirar_45_Esq());

			elements.put(Virar_45_Drt_2025,
					ArduinoPackage.eINSTANCE.getVirar_45_Drt());

			elements.put(Mover_Aleatoriamente_2026,
					ArduinoPackage.eINSTANCE.getMover_Aleatoriamente());

			elements.put(Parar_2035, ArduinoPackage.eINSTANCE.getParar());

			elements.put(Parar_Tempo_2036,
					ArduinoPackage.eINSTANCE.getParar_Tempo());

			elements.put(While_2027, ArduinoPackage.eINSTANCE.getWhile());

			elements.put(If_2028, ArduinoPackage.eINSTANCE.getIf());

			elements.put(Inicio_2029, ArduinoPackage.eINSTANCE.getInicio());

			elements.put(Fim_2030, ArduinoPackage.eINSTANCE.getFim());

			elements.put(Bumper_Pressionado_2033,
					ArduinoPackage.eINSTANCE.getBumper_Pressionado());

			elements.put(Distancia_Infra_Vermelhos_2034,
					ArduinoPackage.eINSTANCE.getDistancia_Infra_Vermelhos());

			elements.put(Transicoes_4001,
					ArduinoPackage.eINSTANCE.getTransicoes());
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
			KNOWN_ELEMENT_TYPES.add(Robo_1000);
			KNOWN_ELEMENT_TYPES.add(Ligar_Cores_Policia_2001);
			KNOWN_ELEMENT_TYPES.add(Ligar_Cores_Arco_Iris_2002);
			KNOWN_ELEMENT_TYPES.add(Ligar_Azul_2003);
			KNOWN_ELEMENT_TYPES.add(Ligar_Verde_2004);
			KNOWN_ELEMENT_TYPES.add(Ligar_Vermelho_2005);
			KNOWN_ELEMENT_TYPES.add(Desligar_Cor_2006);
			KNOWN_ELEMENT_TYPES.add(Desligar_Cores_2007);
			KNOWN_ELEMENT_TYPES.add(Ligar_LED_Verde_2008);
			KNOWN_ELEMENT_TYPES.add(Desligar_LED_Verde_2009);
			KNOWN_ELEMENT_TYPES.add(Ligar_Intermitencia_2010);
			KNOWN_ELEMENT_TYPES.add(Desligar_Intermitencia_2011);
			KNOWN_ELEMENT_TYPES.add(Virar_Esquerda_2012);
			KNOWN_ELEMENT_TYPES.add(Mover_Frente_2013);
			KNOWN_ELEMENT_TYPES.add(Mover_Tras_2014);
			KNOWN_ELEMENT_TYPES.add(Virar_Direita_2015);
			KNOWN_ELEMENT_TYPES.add(Rodar_Esquerda_Tempo_2016);
			KNOWN_ELEMENT_TYPES.add(Rodar_Direita_Tempo_2017);
			KNOWN_ELEMENT_TYPES.add(Mover_Frente_Tempo_2018);
			KNOWN_ELEMENT_TYPES.add(Mover_Tras_Tempo_2019);
			KNOWN_ELEMENT_TYPES.add(Virar_para_X_Graus_2020);
			KNOWN_ELEMENT_TYPES.add(Virar_Max_Drt_2021);
			KNOWN_ELEMENT_TYPES.add(Virar_Max_Esq_2022);
			KNOWN_ELEMENT_TYPES.add(Centrar_2023);
			KNOWN_ELEMENT_TYPES.add(Virar_45_Esq_2024);
			KNOWN_ELEMENT_TYPES.add(Virar_45_Drt_2025);
			KNOWN_ELEMENT_TYPES.add(Mover_Aleatoriamente_2026);
			KNOWN_ELEMENT_TYPES.add(Parar_2035);
			KNOWN_ELEMENT_TYPES.add(Parar_Tempo_2036);
			KNOWN_ELEMENT_TYPES.add(While_2027);
			KNOWN_ELEMENT_TYPES.add(If_2028);
			KNOWN_ELEMENT_TYPES.add(Inicio_2029);
			KNOWN_ELEMENT_TYPES.add(Fim_2030);
			KNOWN_ELEMENT_TYPES.add(Bumper_Pressionado_2033);
			KNOWN_ELEMENT_TYPES.add(Distancia_Infra_Vermelhos_2034);
			KNOWN_ELEMENT_TYPES.add(Transicoes_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RoboEditPart.VISUAL_ID:
			return Robo_1000;
		case Ligar_Cores_PoliciaEditPart.VISUAL_ID:
			return Ligar_Cores_Policia_2001;
		case Ligar_Cores_Arco_IrisEditPart.VISUAL_ID:
			return Ligar_Cores_Arco_Iris_2002;
		case Ligar_AzulEditPart.VISUAL_ID:
			return Ligar_Azul_2003;
		case Ligar_VerdeEditPart.VISUAL_ID:
			return Ligar_Verde_2004;
		case Ligar_VermelhoEditPart.VISUAL_ID:
			return Ligar_Vermelho_2005;
		case Desligar_CorEditPart.VISUAL_ID:
			return Desligar_Cor_2006;
		case Desligar_CoresEditPart.VISUAL_ID:
			return Desligar_Cores_2007;
		case Ligar_LED_VerdeEditPart.VISUAL_ID:
			return Ligar_LED_Verde_2008;
		case Desligar_LED_VerdeEditPart.VISUAL_ID:
			return Desligar_LED_Verde_2009;
		case Ligar_IntermitenciaEditPart.VISUAL_ID:
			return Ligar_Intermitencia_2010;
		case Desligar_IntermitenciaEditPart.VISUAL_ID:
			return Desligar_Intermitencia_2011;
		case Virar_EsquerdaEditPart.VISUAL_ID:
			return Virar_Esquerda_2012;
		case Mover_FrenteEditPart.VISUAL_ID:
			return Mover_Frente_2013;
		case Mover_TrasEditPart.VISUAL_ID:
			return Mover_Tras_2014;
		case Virar_DireitaEditPart.VISUAL_ID:
			return Virar_Direita_2015;
		case Rodar_Esquerda_TempoEditPart.VISUAL_ID:
			return Rodar_Esquerda_Tempo_2016;
		case Rodar_Direita_TempoEditPart.VISUAL_ID:
			return Rodar_Direita_Tempo_2017;
		case Mover_Frente_TempoEditPart.VISUAL_ID:
			return Mover_Frente_Tempo_2018;
		case Mover_Tras_TempoEditPart.VISUAL_ID:
			return Mover_Tras_Tempo_2019;
		case Virar_para_X_GrausEditPart.VISUAL_ID:
			return Virar_para_X_Graus_2020;
		case Virar_Max_DrtEditPart.VISUAL_ID:
			return Virar_Max_Drt_2021;
		case Virar_Max_EsqEditPart.VISUAL_ID:
			return Virar_Max_Esq_2022;
		case CentrarEditPart.VISUAL_ID:
			return Centrar_2023;
		case Virar_45_EsqEditPart.VISUAL_ID:
			return Virar_45_Esq_2024;
		case Virar_45_DrtEditPart.VISUAL_ID:
			return Virar_45_Drt_2025;
		case Mover_AleatoriamenteEditPart.VISUAL_ID:
			return Mover_Aleatoriamente_2026;
		case PararEditPart.VISUAL_ID:
			return Parar_2035;
		case Parar_TempoEditPart.VISUAL_ID:
			return Parar_Tempo_2036;
		case WhileEditPart.VISUAL_ID:
			return While_2027;
		case IfEditPart.VISUAL_ID:
			return If_2028;
		case InicioEditPart.VISUAL_ID:
			return Inicio_2029;
		case FimEditPart.VISUAL_ID:
			return Fim_2030;
		case Bumper_PressionadoEditPart.VISUAL_ID:
			return Bumper_Pressionado_2033;
		case Distancia_Infra_VermelhosEditPart.VISUAL_ID:
			return Distancia_Infra_Vermelhos_2034;
		case TransicoesEditPart.VISUAL_ID:
			return Transicoes_4001;
		}
		return null;
	}

}
