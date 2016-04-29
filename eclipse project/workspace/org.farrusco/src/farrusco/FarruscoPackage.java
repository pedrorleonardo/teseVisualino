/**
 */
package farrusco;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see farrusco.FarruscoFactory
 * @model kind="package"
 *        annotation="gmf farr='usco'"
 * @generated
 */
public interface FarruscoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "farrusco";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://farrusco/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "farrusco";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FarruscoPackage eINSTANCE = farrusco.impl.FarruscoPackageImpl.init();

  /**
   * The meta object id for the '{@link farrusco.impl.RobotImpl <em>Robot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.RobotImpl
   * @see farrusco.impl.FarruscoPackageImpl#getRobot()
   * @generated
   */
  int ROBOT = 0;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__NODES = 0;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__CHILD = 1;

  /**
   * The feature id for the '<em><b>Next</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__NEXT = 2;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT__NOME = 3;

  /**
   * The number of structural features of the '<em>Robot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link farrusco.impl.NodeImpl <em>Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.NodeImpl
   * @see farrusco.impl.FarruscoPackageImpl#getNode()
   * @generated
   */
  int NODE = 1;

  /**
   * The number of structural features of the '<em>Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link farrusco.impl.FilhoImpl <em>Filho</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.FilhoImpl
   * @see farrusco.impl.FarruscoPackageImpl#getFilho()
   * @generated
   */
  int FILHO = 2;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILHO__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILHO__TARGET = 1;

  /**
   * The number of structural features of the '<em>Filho</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILHO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link farrusco.impl.IrmaoImpl <em>Irmao</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.IrmaoImpl
   * @see farrusco.impl.FarruscoPackageImpl#getIrmao()
   * @generated
   */
  int IRMAO = 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRMAO__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRMAO__TARGET = 1;

  /**
   * The number of structural features of the '<em>Irmao</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRMAO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link farrusco.impl.BehaviorImpl <em>Behavior</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.BehaviorImpl
   * @see farrusco.impl.FarruscoPackageImpl#getBehavior()
   * @generated
   */
  int BEHAVIOR = 4;

  /**
   * The number of structural features of the '<em>Behavior</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link farrusco.impl.PrioridadeImpl <em>Prioridade</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.PrioridadeImpl
   * @see farrusco.impl.FarruscoPackageImpl#getPrioridade()
   * @generated
   */
  int PRIORIDADE = 5;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORIDADE__NOME = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Prioridade</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIORIDADE_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link farrusco.impl.ParaleloImpl <em>Paralelo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.ParaleloImpl
   * @see farrusco.impl.FarruscoPackageImpl#getParalelo()
   * @generated
   */
  int PARALELO = 6;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALELO__NOME = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Paralelo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARALELO_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link farrusco.impl.SequencialImpl <em>Sequencial</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.SequencialImpl
   * @see farrusco.impl.FarruscoPackageImpl#getSequencial()
   * @generated
   */
  int SEQUENCIAL = 7;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCIAL__NOME = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sequencial</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCIAL_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link farrusco.impl.AlterarEstadoImpl <em>Alterar Estado</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.AlterarEstadoImpl
   * @see farrusco.impl.FarruscoPackageImpl#getAlterarEstado()
   * @generated
   */
  int ALTERAR_ESTADO = 8;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERAR_ESTADO__NOME = BEHAVIOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alterar Sucesso</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERAR_ESTADO__ALTERAR_SUCESSO = BEHAVIOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Alterar Falha</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERAR_ESTADO__ALTERAR_FALHA = BEHAVIOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Alterar Decorrer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERAR_ESTADO__ALTERAR_DECORRER = BEHAVIOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Alterar Estado</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERAR_ESTADO_FEATURE_COUNT = BEHAVIOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link farrusco.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.ActionImpl
   * @see farrusco.impl.FarruscoPackageImpl#getAction()
   * @generated
   */
  int ACTION = 9;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link farrusco.impl.ConditionImpl <em>Condition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.ConditionImpl
   * @see farrusco.impl.FarruscoPackageImpl#getCondition()
   * @generated
   */
  int CONDITION = 10;

  /**
   * The number of structural features of the '<em>Condition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link farrusco.impl.DistanciaImpl <em>Distancia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.DistanciaImpl
   * @see farrusco.impl.FarruscoPackageImpl#getDistancia()
   * @generated
   */
  int DISTANCIA = 11;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTANCIA__NOME = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Distancia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTANCIA__DISTANCIA = CONDITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Menor Maior</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTANCIA__MENOR_MAIOR = CONDITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Distancia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTANCIA_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link farrusco.impl.BumpersImpl <em>Bumpers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.BumpersImpl
   * @see farrusco.impl.FarruscoPackageImpl#getBumpers()
   * @generated
   */
  int BUMPERS = 12;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUMPERS__NOME = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bumper Esquerdo ou Direito</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUMPERS__BUMPER_ESQUERDO_OU_DIREITO = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bumpers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUMPERS_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link farrusco.impl.EsperaImpl <em>Espera</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.EsperaImpl
   * @see farrusco.impl.FarruscoPackageImpl#getEspera()
   * @generated
   */
  int ESPERA = 13;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPERA__NOME = CONDITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPERA__TEMPO = CONDITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Espera</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESPERA_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link farrusco.impl.ActuateImpl <em>Actuate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.ActuateImpl
   * @see farrusco.impl.FarruscoPackageImpl#getActuate()
   * @generated
   */
  int ACTUATE = 14;

  /**
   * The number of structural features of the '<em>Actuate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link farrusco.impl.MotorImpl <em>Motor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.MotorImpl
   * @see farrusco.impl.FarruscoPackageImpl#getMotor()
   * @generated
   */
  int MOTOR = 15;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR__NOME = ACTUATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Motor Esquerdo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR__MOTOR_ESQUERDO = ACTUATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Motor Direito</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR__MOTOR_DIREITO = ACTUATE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Motor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOTOR_FEATURE_COUNT = ACTUATE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link farrusco.impl.ServoImpl <em>Servo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.ServoImpl
   * @see farrusco.impl.FarruscoPackageImpl#getServo()
   * @generated
   */
  int SERVO = 16;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO__NOME = ACTUATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Posicao Minima</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO__POSICAO_MINIMA = ACTUATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Posicao Maxima</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO__POSICAO_MAXIMA = ACTUATE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Passo aPasso</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO__PASSO_APASSO = ACTUATE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Servo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVO_FEATURE_COUNT = ACTUATE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link farrusco.impl.LEDImpl <em>LED</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.impl.LEDImpl
   * @see farrusco.impl.FarruscoPackageImpl#getLED()
   * @generated
   */
  int LED = 17;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED__NOME = ACTUATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ligado ou Desligado</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED__LIGADO_OU_DESLIGADO = ACTUATE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>LED</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_FEATURE_COUNT = ACTUATE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link farrusco.EstadoDaLuz <em>Estado Da Luz</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.EstadoDaLuz
   * @see farrusco.impl.FarruscoPackageImpl#getEstadoDaLuz()
   * @generated
   */
  int ESTADO_DA_LUZ = 18;

  /**
   * The meta object id for the '{@link farrusco.EstadoSucesso <em>Estado Sucesso</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.EstadoSucesso
   * @see farrusco.impl.FarruscoPackageImpl#getEstadoSucesso()
   * @generated
   */
  int ESTADO_SUCESSO = 19;

  /**
   * The meta object id for the '{@link farrusco.EstadoFalha <em>Estado Falha</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.EstadoFalha
   * @see farrusco.impl.FarruscoPackageImpl#getEstadoFalha()
   * @generated
   */
  int ESTADO_FALHA = 20;

  /**
   * The meta object id for the '{@link farrusco.EstadoDecorrer <em>Estado Decorrer</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.EstadoDecorrer
   * @see farrusco.impl.FarruscoPackageImpl#getEstadoDecorrer()
   * @generated
   */
  int ESTADO_DECORRER = 21;

  /**
   * The meta object id for the '{@link farrusco.EscolhaBumper <em>Escolha Bumper</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.EscolhaBumper
   * @see farrusco.impl.FarruscoPackageImpl#getEscolhaBumper()
   * @generated
   */
  int ESCOLHA_BUMPER = 22;

  /**
   * The meta object id for the '{@link farrusco.TipoDistancia <em>Tipo Distancia</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see farrusco.TipoDistancia
   * @see farrusco.impl.FarruscoPackageImpl#getTipoDistancia()
   * @generated
   */
  int TIPO_DISTANCIA = 23;


  /**
   * Returns the meta object for class '{@link farrusco.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Robot</em>'.
   * @see farrusco.Robot
   * @generated
   */
  EClass getRobot();

  /**
   * Returns the meta object for the containment reference list '{@link farrusco.Robot#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nodes</em>'.
   * @see farrusco.Robot#getNodes()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Nodes();

  /**
   * Returns the meta object for the containment reference list '{@link farrusco.Robot#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Child</em>'.
   * @see farrusco.Robot#getChild()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Child();

  /**
   * Returns the meta object for the containment reference list '{@link farrusco.Robot#getNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Next</em>'.
   * @see farrusco.Robot#getNext()
   * @see #getRobot()
   * @generated
   */
  EReference getRobot_Next();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Robot#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.Robot#getNome()
   * @see #getRobot()
   * @generated
   */
  EAttribute getRobot_Nome();

  /**
   * Returns the meta object for class '{@link farrusco.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node</em>'.
   * @see farrusco.Node
   * @generated
   */
  EClass getNode();

  /**
   * Returns the meta object for class '{@link farrusco.Filho <em>Filho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filho</em>'.
   * @see farrusco.Filho
   * @generated
   */
  EClass getFilho();

  /**
   * Returns the meta object for the reference list '{@link farrusco.Filho#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source</em>'.
   * @see farrusco.Filho#getSource()
   * @see #getFilho()
   * @generated
   */
  EReference getFilho_Source();

  /**
   * Returns the meta object for the reference list '{@link farrusco.Filho#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target</em>'.
   * @see farrusco.Filho#getTarget()
   * @see #getFilho()
   * @generated
   */
  EReference getFilho_Target();

  /**
   * Returns the meta object for class '{@link farrusco.Irmao <em>Irmao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Irmao</em>'.
   * @see farrusco.Irmao
   * @generated
   */
  EClass getIrmao();

  /**
   * Returns the meta object for the reference list '{@link farrusco.Irmao#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source</em>'.
   * @see farrusco.Irmao#getSource()
   * @see #getIrmao()
   * @generated
   */
  EReference getIrmao_Source();

  /**
   * Returns the meta object for the reference list '{@link farrusco.Irmao#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target</em>'.
   * @see farrusco.Irmao#getTarget()
   * @see #getIrmao()
   * @generated
   */
  EReference getIrmao_Target();

  /**
   * Returns the meta object for class '{@link farrusco.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavior</em>'.
   * @see farrusco.Behavior
   * @generated
   */
  EClass getBehavior();

  /**
   * Returns the meta object for class '{@link farrusco.Prioridade <em>Prioridade</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prioridade</em>'.
   * @see farrusco.Prioridade
   * @generated
   */
  EClass getPrioridade();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Prioridade#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.Prioridade#getNome()
   * @see #getPrioridade()
   * @generated
   */
  EAttribute getPrioridade_Nome();

  /**
   * Returns the meta object for class '{@link farrusco.Paralelo <em>Paralelo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Paralelo</em>'.
   * @see farrusco.Paralelo
   * @generated
   */
  EClass getParalelo();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Paralelo#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.Paralelo#getNome()
   * @see #getParalelo()
   * @generated
   */
  EAttribute getParalelo_Nome();

  /**
   * Returns the meta object for class '{@link farrusco.Sequencial <em>Sequencial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequencial</em>'.
   * @see farrusco.Sequencial
   * @generated
   */
  EClass getSequencial();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Sequencial#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.Sequencial#getNome()
   * @see #getSequencial()
   * @generated
   */
  EAttribute getSequencial_Nome();

  /**
   * Returns the meta object for class '{@link farrusco.AlterarEstado <em>Alterar Estado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alterar Estado</em>'.
   * @see farrusco.AlterarEstado
   * @generated
   */
  EClass getAlterarEstado();

  /**
   * Returns the meta object for the attribute '{@link farrusco.AlterarEstado#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.AlterarEstado#getNome()
   * @see #getAlterarEstado()
   * @generated
   */
  EAttribute getAlterarEstado_Nome();

  /**
   * Returns the meta object for the attribute '{@link farrusco.AlterarEstado#getAlterar_Sucesso <em>Alterar Sucesso</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alterar Sucesso</em>'.
   * @see farrusco.AlterarEstado#getAlterar_Sucesso()
   * @see #getAlterarEstado()
   * @generated
   */
  EAttribute getAlterarEstado_Alterar_Sucesso();

  /**
   * Returns the meta object for the attribute '{@link farrusco.AlterarEstado#getAlterar_Falha <em>Alterar Falha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alterar Falha</em>'.
   * @see farrusco.AlterarEstado#getAlterar_Falha()
   * @see #getAlterarEstado()
   * @generated
   */
  EAttribute getAlterarEstado_Alterar_Falha();

  /**
   * Returns the meta object for the attribute '{@link farrusco.AlterarEstado#getAlterar_Decorrer <em>Alterar Decorrer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alterar Decorrer</em>'.
   * @see farrusco.AlterarEstado#getAlterar_Decorrer()
   * @see #getAlterarEstado()
   * @generated
   */
  EAttribute getAlterarEstado_Alterar_Decorrer();

  /**
   * Returns the meta object for class '{@link farrusco.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see farrusco.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link farrusco.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition</em>'.
   * @see farrusco.Condition
   * @generated
   */
  EClass getCondition();

  /**
   * Returns the meta object for class '{@link farrusco.Distancia <em>Distancia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distancia</em>'.
   * @see farrusco.Distancia
   * @generated
   */
  EClass getDistancia();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Distancia#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.Distancia#getNome()
   * @see #getDistancia()
   * @generated
   */
  EAttribute getDistancia_Nome();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Distancia#getDistancia <em>Distancia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distancia</em>'.
   * @see farrusco.Distancia#getDistancia()
   * @see #getDistancia()
   * @generated
   */
  EAttribute getDistancia_Distancia();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Distancia#getMenor_Maior <em>Menor Maior</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Menor Maior</em>'.
   * @see farrusco.Distancia#getMenor_Maior()
   * @see #getDistancia()
   * @generated
   */
  EAttribute getDistancia_Menor_Maior();

  /**
   * Returns the meta object for class '{@link farrusco.Bumpers <em>Bumpers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bumpers</em>'.
   * @see farrusco.Bumpers
   * @generated
   */
  EClass getBumpers();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Bumpers#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.Bumpers#getNome()
   * @see #getBumpers()
   * @generated
   */
  EAttribute getBumpers_Nome();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Bumpers#getBumper_Esquerdo_ou_Direito <em>Bumper Esquerdo ou Direito</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bumper Esquerdo ou Direito</em>'.
   * @see farrusco.Bumpers#getBumper_Esquerdo_ou_Direito()
   * @see #getBumpers()
   * @generated
   */
  EAttribute getBumpers_Bumper_Esquerdo_ou_Direito();

  /**
   * Returns the meta object for class '{@link farrusco.Espera <em>Espera</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Espera</em>'.
   * @see farrusco.Espera
   * @generated
   */
  EClass getEspera();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Espera#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.Espera#getNome()
   * @see #getEspera()
   * @generated
   */
  EAttribute getEspera_Nome();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Espera#getTempo <em>Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tempo</em>'.
   * @see farrusco.Espera#getTempo()
   * @see #getEspera()
   * @generated
   */
  EAttribute getEspera_Tempo();

  /**
   * Returns the meta object for class '{@link farrusco.Actuate <em>Actuate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actuate</em>'.
   * @see farrusco.Actuate
   * @generated
   */
  EClass getActuate();

  /**
   * Returns the meta object for class '{@link farrusco.Motor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Motor</em>'.
   * @see farrusco.Motor
   * @generated
   */
  EClass getMotor();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Motor#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.Motor#getNome()
   * @see #getMotor()
   * @generated
   */
  EAttribute getMotor_Nome();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Motor#getMotor_Esquerdo <em>Motor Esquerdo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Motor Esquerdo</em>'.
   * @see farrusco.Motor#getMotor_Esquerdo()
   * @see #getMotor()
   * @generated
   */
  EAttribute getMotor_Motor_Esquerdo();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Motor#getMotor_Direito <em>Motor Direito</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Motor Direito</em>'.
   * @see farrusco.Motor#getMotor_Direito()
   * @see #getMotor()
   * @generated
   */
  EAttribute getMotor_Motor_Direito();

  /**
   * Returns the meta object for class '{@link farrusco.Servo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Servo</em>'.
   * @see farrusco.Servo
   * @generated
   */
  EClass getServo();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Servo#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.Servo#getNome()
   * @see #getServo()
   * @generated
   */
  EAttribute getServo_Nome();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Servo#getPosicao_Minima <em>Posicao Minima</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Posicao Minima</em>'.
   * @see farrusco.Servo#getPosicao_Minima()
   * @see #getServo()
   * @generated
   */
  EAttribute getServo_Posicao_Minima();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Servo#getPosicao_Maxima <em>Posicao Maxima</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Posicao Maxima</em>'.
   * @see farrusco.Servo#getPosicao_Maxima()
   * @see #getServo()
   * @generated
   */
  EAttribute getServo_Posicao_Maxima();

  /**
   * Returns the meta object for the attribute '{@link farrusco.Servo#getPasso_a_Passo <em>Passo aPasso</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Passo aPasso</em>'.
   * @see farrusco.Servo#getPasso_a_Passo()
   * @see #getServo()
   * @generated
   */
  EAttribute getServo_Passo_a_Passo();

  /**
   * Returns the meta object for class '{@link farrusco.LED <em>LED</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LED</em>'.
   * @see farrusco.LED
   * @generated
   */
  EClass getLED();

  /**
   * Returns the meta object for the attribute '{@link farrusco.LED#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see farrusco.LED#getNome()
   * @see #getLED()
   * @generated
   */
  EAttribute getLED_Nome();

  /**
   * Returns the meta object for the attribute '{@link farrusco.LED#getLigado_ou_Desligado <em>Ligado ou Desligado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ligado ou Desligado</em>'.
   * @see farrusco.LED#getLigado_ou_Desligado()
   * @see #getLED()
   * @generated
   */
  EAttribute getLED_Ligado_ou_Desligado();

  /**
   * Returns the meta object for enum '{@link farrusco.EstadoDaLuz <em>Estado Da Luz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Estado Da Luz</em>'.
   * @see farrusco.EstadoDaLuz
   * @generated
   */
  EEnum getEstadoDaLuz();

  /**
   * Returns the meta object for enum '{@link farrusco.EstadoSucesso <em>Estado Sucesso</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Estado Sucesso</em>'.
   * @see farrusco.EstadoSucesso
   * @generated
   */
  EEnum getEstadoSucesso();

  /**
   * Returns the meta object for enum '{@link farrusco.EstadoFalha <em>Estado Falha</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Estado Falha</em>'.
   * @see farrusco.EstadoFalha
   * @generated
   */
  EEnum getEstadoFalha();

  /**
   * Returns the meta object for enum '{@link farrusco.EstadoDecorrer <em>Estado Decorrer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Estado Decorrer</em>'.
   * @see farrusco.EstadoDecorrer
   * @generated
   */
  EEnum getEstadoDecorrer();

  /**
   * Returns the meta object for enum '{@link farrusco.EscolhaBumper <em>Escolha Bumper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Escolha Bumper</em>'.
   * @see farrusco.EscolhaBumper
   * @generated
   */
  EEnum getEscolhaBumper();

  /**
   * Returns the meta object for enum '{@link farrusco.TipoDistancia <em>Tipo Distancia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Tipo Distancia</em>'.
   * @see farrusco.TipoDistancia
   * @generated
   */
  EEnum getTipoDistancia();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FarruscoFactory getFarruscoFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link farrusco.impl.RobotImpl <em>Robot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.RobotImpl
     * @see farrusco.impl.FarruscoPackageImpl#getRobot()
     * @generated
     */
    EClass ROBOT = eINSTANCE.getRobot();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__NODES = eINSTANCE.getRobot_Nodes();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__CHILD = eINSTANCE.getRobot_Child();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBOT__NEXT = eINSTANCE.getRobot_Next();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROBOT__NOME = eINSTANCE.getRobot_Nome();

    /**
     * The meta object literal for the '{@link farrusco.impl.NodeImpl <em>Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.NodeImpl
     * @see farrusco.impl.FarruscoPackageImpl#getNode()
     * @generated
     */
    EClass NODE = eINSTANCE.getNode();

    /**
     * The meta object literal for the '{@link farrusco.impl.FilhoImpl <em>Filho</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.FilhoImpl
     * @see farrusco.impl.FarruscoPackageImpl#getFilho()
     * @generated
     */
    EClass FILHO = eINSTANCE.getFilho();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILHO__SOURCE = eINSTANCE.getFilho_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILHO__TARGET = eINSTANCE.getFilho_Target();

    /**
     * The meta object literal for the '{@link farrusco.impl.IrmaoImpl <em>Irmao</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.IrmaoImpl
     * @see farrusco.impl.FarruscoPackageImpl#getIrmao()
     * @generated
     */
    EClass IRMAO = eINSTANCE.getIrmao();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IRMAO__SOURCE = eINSTANCE.getIrmao_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IRMAO__TARGET = eINSTANCE.getIrmao_Target();

    /**
     * The meta object literal for the '{@link farrusco.impl.BehaviorImpl <em>Behavior</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.BehaviorImpl
     * @see farrusco.impl.FarruscoPackageImpl#getBehavior()
     * @generated
     */
    EClass BEHAVIOR = eINSTANCE.getBehavior();

    /**
     * The meta object literal for the '{@link farrusco.impl.PrioridadeImpl <em>Prioridade</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.PrioridadeImpl
     * @see farrusco.impl.FarruscoPackageImpl#getPrioridade()
     * @generated
     */
    EClass PRIORIDADE = eINSTANCE.getPrioridade();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIORIDADE__NOME = eINSTANCE.getPrioridade_Nome();

    /**
     * The meta object literal for the '{@link farrusco.impl.ParaleloImpl <em>Paralelo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.ParaleloImpl
     * @see farrusco.impl.FarruscoPackageImpl#getParalelo()
     * @generated
     */
    EClass PARALELO = eINSTANCE.getParalelo();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARALELO__NOME = eINSTANCE.getParalelo_Nome();

    /**
     * The meta object literal for the '{@link farrusco.impl.SequencialImpl <em>Sequencial</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.SequencialImpl
     * @see farrusco.impl.FarruscoPackageImpl#getSequencial()
     * @generated
     */
    EClass SEQUENCIAL = eINSTANCE.getSequencial();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCIAL__NOME = eINSTANCE.getSequencial_Nome();

    /**
     * The meta object literal for the '{@link farrusco.impl.AlterarEstadoImpl <em>Alterar Estado</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.AlterarEstadoImpl
     * @see farrusco.impl.FarruscoPackageImpl#getAlterarEstado()
     * @generated
     */
    EClass ALTERAR_ESTADO = eINSTANCE.getAlterarEstado();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERAR_ESTADO__NOME = eINSTANCE.getAlterarEstado_Nome();

    /**
     * The meta object literal for the '<em><b>Alterar Sucesso</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERAR_ESTADO__ALTERAR_SUCESSO = eINSTANCE.getAlterarEstado_Alterar_Sucesso();

    /**
     * The meta object literal for the '<em><b>Alterar Falha</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERAR_ESTADO__ALTERAR_FALHA = eINSTANCE.getAlterarEstado_Alterar_Falha();

    /**
     * The meta object literal for the '<em><b>Alterar Decorrer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERAR_ESTADO__ALTERAR_DECORRER = eINSTANCE.getAlterarEstado_Alterar_Decorrer();

    /**
     * The meta object literal for the '{@link farrusco.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.ActionImpl
     * @see farrusco.impl.FarruscoPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link farrusco.impl.ConditionImpl <em>Condition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.ConditionImpl
     * @see farrusco.impl.FarruscoPackageImpl#getCondition()
     * @generated
     */
    EClass CONDITION = eINSTANCE.getCondition();

    /**
     * The meta object literal for the '{@link farrusco.impl.DistanciaImpl <em>Distancia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.DistanciaImpl
     * @see farrusco.impl.FarruscoPackageImpl#getDistancia()
     * @generated
     */
    EClass DISTANCIA = eINSTANCE.getDistancia();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTANCIA__NOME = eINSTANCE.getDistancia_Nome();

    /**
     * The meta object literal for the '<em><b>Distancia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTANCIA__DISTANCIA = eINSTANCE.getDistancia_Distancia();

    /**
     * The meta object literal for the '<em><b>Menor Maior</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTANCIA__MENOR_MAIOR = eINSTANCE.getDistancia_Menor_Maior();

    /**
     * The meta object literal for the '{@link farrusco.impl.BumpersImpl <em>Bumpers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.BumpersImpl
     * @see farrusco.impl.FarruscoPackageImpl#getBumpers()
     * @generated
     */
    EClass BUMPERS = eINSTANCE.getBumpers();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUMPERS__NOME = eINSTANCE.getBumpers_Nome();

    /**
     * The meta object literal for the '<em><b>Bumper Esquerdo ou Direito</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUMPERS__BUMPER_ESQUERDO_OU_DIREITO = eINSTANCE.getBumpers_Bumper_Esquerdo_ou_Direito();

    /**
     * The meta object literal for the '{@link farrusco.impl.EsperaImpl <em>Espera</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.EsperaImpl
     * @see farrusco.impl.FarruscoPackageImpl#getEspera()
     * @generated
     */
    EClass ESPERA = eINSTANCE.getEspera();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESPERA__NOME = eINSTANCE.getEspera_Nome();

    /**
     * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESPERA__TEMPO = eINSTANCE.getEspera_Tempo();

    /**
     * The meta object literal for the '{@link farrusco.impl.ActuateImpl <em>Actuate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.ActuateImpl
     * @see farrusco.impl.FarruscoPackageImpl#getActuate()
     * @generated
     */
    EClass ACTUATE = eINSTANCE.getActuate();

    /**
     * The meta object literal for the '{@link farrusco.impl.MotorImpl <em>Motor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.MotorImpl
     * @see farrusco.impl.FarruscoPackageImpl#getMotor()
     * @generated
     */
    EClass MOTOR = eINSTANCE.getMotor();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOTOR__NOME = eINSTANCE.getMotor_Nome();

    /**
     * The meta object literal for the '<em><b>Motor Esquerdo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOTOR__MOTOR_ESQUERDO = eINSTANCE.getMotor_Motor_Esquerdo();

    /**
     * The meta object literal for the '<em><b>Motor Direito</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOTOR__MOTOR_DIREITO = eINSTANCE.getMotor_Motor_Direito();

    /**
     * The meta object literal for the '{@link farrusco.impl.ServoImpl <em>Servo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.ServoImpl
     * @see farrusco.impl.FarruscoPackageImpl#getServo()
     * @generated
     */
    EClass SERVO = eINSTANCE.getServo();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVO__NOME = eINSTANCE.getServo_Nome();

    /**
     * The meta object literal for the '<em><b>Posicao Minima</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVO__POSICAO_MINIMA = eINSTANCE.getServo_Posicao_Minima();

    /**
     * The meta object literal for the '<em><b>Posicao Maxima</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVO__POSICAO_MAXIMA = eINSTANCE.getServo_Posicao_Maxima();

    /**
     * The meta object literal for the '<em><b>Passo aPasso</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVO__PASSO_APASSO = eINSTANCE.getServo_Passo_a_Passo();

    /**
     * The meta object literal for the '{@link farrusco.impl.LEDImpl <em>LED</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.impl.LEDImpl
     * @see farrusco.impl.FarruscoPackageImpl#getLED()
     * @generated
     */
    EClass LED = eINSTANCE.getLED();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED__NOME = eINSTANCE.getLED_Nome();

    /**
     * The meta object literal for the '<em><b>Ligado ou Desligado</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LED__LIGADO_OU_DESLIGADO = eINSTANCE.getLED_Ligado_ou_Desligado();

    /**
     * The meta object literal for the '{@link farrusco.EstadoDaLuz <em>Estado Da Luz</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.EstadoDaLuz
     * @see farrusco.impl.FarruscoPackageImpl#getEstadoDaLuz()
     * @generated
     */
    EEnum ESTADO_DA_LUZ = eINSTANCE.getEstadoDaLuz();

    /**
     * The meta object literal for the '{@link farrusco.EstadoSucesso <em>Estado Sucesso</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.EstadoSucesso
     * @see farrusco.impl.FarruscoPackageImpl#getEstadoSucesso()
     * @generated
     */
    EEnum ESTADO_SUCESSO = eINSTANCE.getEstadoSucesso();

    /**
     * The meta object literal for the '{@link farrusco.EstadoFalha <em>Estado Falha</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.EstadoFalha
     * @see farrusco.impl.FarruscoPackageImpl#getEstadoFalha()
     * @generated
     */
    EEnum ESTADO_FALHA = eINSTANCE.getEstadoFalha();

    /**
     * The meta object literal for the '{@link farrusco.EstadoDecorrer <em>Estado Decorrer</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.EstadoDecorrer
     * @see farrusco.impl.FarruscoPackageImpl#getEstadoDecorrer()
     * @generated
     */
    EEnum ESTADO_DECORRER = eINSTANCE.getEstadoDecorrer();

    /**
     * The meta object literal for the '{@link farrusco.EscolhaBumper <em>Escolha Bumper</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.EscolhaBumper
     * @see farrusco.impl.FarruscoPackageImpl#getEscolhaBumper()
     * @generated
     */
    EEnum ESCOLHA_BUMPER = eINSTANCE.getEscolhaBumper();

    /**
     * The meta object literal for the '{@link farrusco.TipoDistancia <em>Tipo Distancia</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see farrusco.TipoDistancia
     * @see farrusco.impl.FarruscoPackageImpl#getTipoDistancia()
     * @generated
     */
    EEnum TIPO_DISTANCIA = eINSTANCE.getTipoDistancia();

  }

} //FarruscoPackage
