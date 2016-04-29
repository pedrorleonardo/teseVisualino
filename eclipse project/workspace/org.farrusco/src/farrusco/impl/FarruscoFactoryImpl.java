/**
 */
package farrusco.impl;

import farrusco.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class FarruscoFactoryImpl extends EFactoryImpl implements FarruscoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FarruscoFactory init()
  {
    try
    {
      FarruscoFactory theFarruscoFactory = (FarruscoFactory)EPackage.Registry.INSTANCE.getEFactory("http://farrusco/1.0"); 
      if (theFarruscoFactory != null)
      {
        return theFarruscoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FarruscoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FarruscoFactoryImpl()
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
      case FarruscoPackage.ROBOT: return createRobot();
      case FarruscoPackage.NODE: return createNode();
      case FarruscoPackage.FILHO: return createFilho();
      case FarruscoPackage.IRMAO: return createIrmao();
      case FarruscoPackage.BEHAVIOR: return createBehavior();
      case FarruscoPackage.PRIORIDADE: return createPrioridade();
      case FarruscoPackage.PARALELO: return createParalelo();
      case FarruscoPackage.SEQUENCIAL: return createSequencial();
      case FarruscoPackage.ALTERAR_ESTADO: return createAlterarEstado();
      case FarruscoPackage.DISTANCIA: return createDistancia();
      case FarruscoPackage.BUMPERS: return createBumpers();
      case FarruscoPackage.ESPERA: return createEspera();
      case FarruscoPackage.MOTOR: return createMotor();
      case FarruscoPackage.SERVO: return createServo();
      case FarruscoPackage.LED: return createLED();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FarruscoPackage.ESTADO_DA_LUZ:
        return createEstadoDaLuzFromString(eDataType, initialValue);
      case FarruscoPackage.ESTADO_SUCESSO:
        return createEstadoSucessoFromString(eDataType, initialValue);
      case FarruscoPackage.ESTADO_FALHA:
        return createEstadoFalhaFromString(eDataType, initialValue);
      case FarruscoPackage.ESTADO_DECORRER:
        return createEstadoDecorrerFromString(eDataType, initialValue);
      case FarruscoPackage.ESCOLHA_BUMPER:
        return createEscolhaBumperFromString(eDataType, initialValue);
      case FarruscoPackage.TIPO_DISTANCIA:
        return createTipoDistanciaFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FarruscoPackage.ESTADO_DA_LUZ:
        return convertEstadoDaLuzToString(eDataType, instanceValue);
      case FarruscoPackage.ESTADO_SUCESSO:
        return convertEstadoSucessoToString(eDataType, instanceValue);
      case FarruscoPackage.ESTADO_FALHA:
        return convertEstadoFalhaToString(eDataType, instanceValue);
      case FarruscoPackage.ESTADO_DECORRER:
        return convertEstadoDecorrerToString(eDataType, instanceValue);
      case FarruscoPackage.ESCOLHA_BUMPER:
        return convertEscolhaBumperToString(eDataType, instanceValue);
      case FarruscoPackage.TIPO_DISTANCIA:
        return convertTipoDistanciaToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Robot createRobot()
  {
    RobotImpl robot = new RobotImpl();
    return robot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node createNode()
  {
    NodeImpl node = new NodeImpl();
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Filho createFilho()
  {
    FilhoImpl filho = new FilhoImpl();
    return filho;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Irmao createIrmao()
  {
    IrmaoImpl irmao = new IrmaoImpl();
    return irmao;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Behavior createBehavior()
  {
    BehaviorImpl behavior = new BehaviorImpl();
    return behavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prioridade createPrioridade()
  {
    PrioridadeImpl prioridade = new PrioridadeImpl();
    return prioridade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Paralelo createParalelo()
  {
    ParaleloImpl paralelo = new ParaleloImpl();
    return paralelo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequencial createSequencial()
  {
    SequencialImpl sequencial = new SequencialImpl();
    return sequencial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterarEstado createAlterarEstado()
  {
    AlterarEstadoImpl alterarEstado = new AlterarEstadoImpl();
    return alterarEstado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distancia createDistancia()
  {
    DistanciaImpl distancia = new DistanciaImpl();
    return distancia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bumpers createBumpers()
  {
    BumpersImpl bumpers = new BumpersImpl();
    return bumpers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Espera createEspera()
  {
    EsperaImpl espera = new EsperaImpl();
    return espera;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Motor createMotor()
  {
    MotorImpl motor = new MotorImpl();
    return motor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Servo createServo()
  {
    ServoImpl servo = new ServoImpl();
    return servo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LED createLED()
  {
    LEDImpl led = new LEDImpl();
    return led;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDaLuz createEstadoDaLuzFromString(EDataType eDataType, String initialValue)
  {
    EstadoDaLuz result = EstadoDaLuz.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEstadoDaLuzToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoSucesso createEstadoSucessoFromString(EDataType eDataType, String initialValue)
  {
    EstadoSucesso result = EstadoSucesso.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEstadoSucessoToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoFalha createEstadoFalhaFromString(EDataType eDataType, String initialValue)
  {
    EstadoFalha result = EstadoFalha.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEstadoFalhaToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDecorrer createEstadoDecorrerFromString(EDataType eDataType, String initialValue)
  {
    EstadoDecorrer result = EstadoDecorrer.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEstadoDecorrerToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EscolhaBumper createEscolhaBumperFromString(EDataType eDataType, String initialValue)
  {
    EscolhaBumper result = EscolhaBumper.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEscolhaBumperToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TipoDistancia createTipoDistanciaFromString(EDataType eDataType, String initialValue)
  {
    TipoDistancia result = TipoDistancia.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTipoDistanciaToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FarruscoPackage getFarruscoPackage()
  {
    return (FarruscoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FarruscoPackage getPackage()
  {
    return FarruscoPackage.eINSTANCE;
  }

} //FarruscoFactoryImpl
