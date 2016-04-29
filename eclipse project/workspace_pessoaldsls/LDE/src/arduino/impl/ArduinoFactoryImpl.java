/**
 */
package arduino.impl;

import arduino.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoFactoryImpl extends EFactoryImpl implements ArduinoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ArduinoFactory init()
  {
    try
    {
      ArduinoFactory theArduinoFactory = (ArduinoFactory)EPackage.Registry.INSTANCE.getEFactory("http://arduino/1.0"); 
      if (theArduinoFactory != null)
      {
        return theArduinoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArduinoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArduinoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ArduinoPackage.ROBO: return createRobo();
      case ArduinoPackage.TRANSICOES: return createTransicoes();
      case ArduinoPackage.VIRAR_ESQUERDA: return createVirar_Esquerda();
      case ArduinoPackage.MOVER_FRENTE: return createMover_Frente();
      case ArduinoPackage.MOVER_TRAS: return createMover_Tras();
      case ArduinoPackage.VIRAR_DIREITA: return createVirar_Direita();
      case ArduinoPackage.RODAR_ESQUERDA_TEMPO: return createRodar_Esquerda_Tempo();
      case ArduinoPackage.RODAR_DIREITA_TEMPO: return createRodar_Direita_Tempo();
      case ArduinoPackage.MOVER_FRENTE_TEMPO: return createMover_Frente_Tempo();
      case ArduinoPackage.MOVER_TRAS_TEMPO: return createMover_Tras_Tempo();
      case ArduinoPackage.VIRAR_PARA_XGRAUS: return createVirar_para_X_Graus();
      case ArduinoPackage.VIRAR_MAX_DRT: return createVirar_Max_Drt();
      case ArduinoPackage.VIRAR_MAX_ESQ: return createVirar_Max_Esq();
      case ArduinoPackage.CENTRAR: return createCentrar();
      case ArduinoPackage.VIRAR_45_ESQ: return createVirar_45_Esq();
      case ArduinoPackage.VIRAR_45_DRT: return createVirar_45_Drt();
      case ArduinoPackage.MOVER_ALEATORIAMENTE: return createMover_Aleatoriamente();
      case ArduinoPackage.LIGAR_LED_VERDE: return createLigar_LED_Verde();
      case ArduinoPackage.DESLIGAR_LED_VERDE: return createDesligar_LED_Verde();
      case ArduinoPackage.LIGAR_INTERMITENCIA: return createLigar_Intermitencia();
      case ArduinoPackage.DESLIGAR_INTERMITENCIA: return createDesligar_Intermitencia();
      case ArduinoPackage.LIGAR_CORES_POLICIA: return createLigar_Cores_Policia();
      case ArduinoPackage.LIGAR_CORES_ARCO_IRIS: return createLigar_Cores_Arco_Iris();
      case ArduinoPackage.LIGAR_AZUL: return createLigar_Azul();
      case ArduinoPackage.LIGAR_VERDE: return createLigar_Verde();
      case ArduinoPackage.LIGAR_VERMELHO: return createLigar_Vermelho();
      case ArduinoPackage.DESLIGAR_COR: return createDesligar_Cor();
      case ArduinoPackage.DESLIGAR_CORES: return createDesligar_Cores();
      case ArduinoPackage.WHILE: return createWhile();
      case ArduinoPackage.IF: return createIf();
      case ArduinoPackage.BUMPER_PRESSIONADO: return createBumper_Pressionado();
      case ArduinoPackage.DISTANCIA_INFRA_VERMELHOS: return createDistancia_Infra_Vermelhos();
      case ArduinoPackage.INICIO: return createInicio();
      case ArduinoPackage.FIM: return createFim();
      case ArduinoPackage.PARAR: return createParar();
      case ArduinoPackage.PARAR_TEMPO: return createParar_Tempo();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Robo createRobo()
  {
    RoboImpl robo = new RoboImpl();
    return robo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transicoes createTransicoes()
  {
    TransicoesImpl transicoes = new TransicoesImpl();
    return transicoes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_Esquerda createVirar_Esquerda()
  {
    Virar_EsquerdaImpl virar_Esquerda = new Virar_EsquerdaImpl();
    return virar_Esquerda;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover_Frente createMover_Frente()
  {
    Mover_FrenteImpl mover_Frente = new Mover_FrenteImpl();
    return mover_Frente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover_Tras createMover_Tras()
  {
    Mover_TrasImpl mover_Tras = new Mover_TrasImpl();
    return mover_Tras;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_Direita createVirar_Direita()
  {
    Virar_DireitaImpl virar_Direita = new Virar_DireitaImpl();
    return virar_Direita;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rodar_Esquerda_Tempo createRodar_Esquerda_Tempo()
  {
    Rodar_Esquerda_TempoImpl rodar_Esquerda_Tempo = new Rodar_Esquerda_TempoImpl();
    return rodar_Esquerda_Tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rodar_Direita_Tempo createRodar_Direita_Tempo()
  {
    Rodar_Direita_TempoImpl rodar_Direita_Tempo = new Rodar_Direita_TempoImpl();
    return rodar_Direita_Tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover_Frente_Tempo createMover_Frente_Tempo()
  {
    Mover_Frente_TempoImpl mover_Frente_Tempo = new Mover_Frente_TempoImpl();
    return mover_Frente_Tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover_Tras_Tempo createMover_Tras_Tempo()
  {
    Mover_Tras_TempoImpl mover_Tras_Tempo = new Mover_Tras_TempoImpl();
    return mover_Tras_Tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_para_X_Graus createVirar_para_X_Graus()
  {
    Virar_para_X_GrausImpl virar_para_X_Graus = new Virar_para_X_GrausImpl();
    return virar_para_X_Graus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_Max_Drt createVirar_Max_Drt()
  {
    Virar_Max_DrtImpl virar_Max_Drt = new Virar_Max_DrtImpl();
    return virar_Max_Drt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_Max_Esq createVirar_Max_Esq()
  {
    Virar_Max_EsqImpl virar_Max_Esq = new Virar_Max_EsqImpl();
    return virar_Max_Esq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Centrar createCentrar()
  {
    CentrarImpl centrar = new CentrarImpl();
    return centrar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_45_Esq createVirar_45_Esq()
  {
    Virar_45_EsqImpl virar_45_Esq = new Virar_45_EsqImpl();
    return virar_45_Esq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_45_Drt createVirar_45_Drt()
  {
    Virar_45_DrtImpl virar_45_Drt = new Virar_45_DrtImpl();
    return virar_45_Drt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover_Aleatoriamente createMover_Aleatoriamente()
  {
    Mover_AleatoriamenteImpl mover_Aleatoriamente = new Mover_AleatoriamenteImpl();
    return mover_Aleatoriamente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_LED_Verde createLigar_LED_Verde()
  {
    Ligar_LED_VerdeImpl ligar_LED_Verde = new Ligar_LED_VerdeImpl();
    return ligar_LED_Verde;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Desligar_LED_Verde createDesligar_LED_Verde()
  {
    Desligar_LED_VerdeImpl desligar_LED_Verde = new Desligar_LED_VerdeImpl();
    return desligar_LED_Verde;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_Intermitencia createLigar_Intermitencia()
  {
    Ligar_IntermitenciaImpl ligar_Intermitencia = new Ligar_IntermitenciaImpl();
    return ligar_Intermitencia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Desligar_Intermitencia createDesligar_Intermitencia()
  {
    Desligar_IntermitenciaImpl desligar_Intermitencia = new Desligar_IntermitenciaImpl();
    return desligar_Intermitencia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_Cores_Policia createLigar_Cores_Policia()
  {
    Ligar_Cores_PoliciaImpl ligar_Cores_Policia = new Ligar_Cores_PoliciaImpl();
    return ligar_Cores_Policia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_Cores_Arco_Iris createLigar_Cores_Arco_Iris()
  {
    Ligar_Cores_Arco_IrisImpl ligar_Cores_Arco_Iris = new Ligar_Cores_Arco_IrisImpl();
    return ligar_Cores_Arco_Iris;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_Azul createLigar_Azul()
  {
    Ligar_AzulImpl ligar_Azul = new Ligar_AzulImpl();
    return ligar_Azul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_Verde createLigar_Verde()
  {
    Ligar_VerdeImpl ligar_Verde = new Ligar_VerdeImpl();
    return ligar_Verde;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_Vermelho createLigar_Vermelho()
  {
    Ligar_VermelhoImpl ligar_Vermelho = new Ligar_VermelhoImpl();
    return ligar_Vermelho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Desligar_Cor createDesligar_Cor()
  {
    Desligar_CorImpl desligar_Cor = new Desligar_CorImpl();
    return desligar_Cor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Desligar_Cores createDesligar_Cores()
  {
    Desligar_CoresImpl desligar_Cores = new Desligar_CoresImpl();
    return desligar_Cores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bumper_Pressionado createBumper_Pressionado()
  {
    Bumper_PressionadoImpl bumper_Pressionado = new Bumper_PressionadoImpl();
    return bumper_Pressionado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distancia_Infra_Vermelhos createDistancia_Infra_Vermelhos()
  {
    Distancia_Infra_VermelhosImpl distancia_Infra_Vermelhos = new Distancia_Infra_VermelhosImpl();
    return distancia_Infra_Vermelhos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Inicio createInicio()
  {
    InicioImpl inicio = new InicioImpl();
    return inicio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fim createFim()
  {
    FimImpl fim = new FimImpl();
    return fim;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parar createParar()
  {
    PararImpl parar = new PararImpl();
    return parar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parar_Tempo createParar_Tempo()
  {
    Parar_TempoImpl parar_Tempo = new Parar_TempoImpl();
    return parar_Tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArduinoPackage getArduinoPackage()
  {
    return (ArduinoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ArduinoPackage getPackage()
  {
    return ArduinoPackage.eINSTANCE;
  }

} //ArduinoFactoryImpl
