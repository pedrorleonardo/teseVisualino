/**
 */
package arduino;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see arduino.ArduinoFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface ArduinoPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "arduino";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://arduino/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "arduino";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArduinoPackage eINSTANCE = arduino.impl.ArduinoPackageImpl.init();

  /**
   * The meta object id for the '{@link arduino.impl.RoboImpl <em>Robo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.RoboImpl
   * @see arduino.impl.ArduinoPackageImpl#getRobo()
   * @generated
   */
  int ROBO = 0;

  /**
   * The feature id for the '<em><b>Tem Acoes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBO__TEM_ACOES = 0;

  /**
   * The feature id for the '<em><b>Tem Transicoes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBO__TEM_TRANSICOES = 1;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBO__NOME = 2;

  /**
   * The feature id for the '<em><b>Tem Condicoes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBO__TEM_CONDICOES = 3;

  /**
   * The number of structural features of the '<em>Robo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link arduino.impl.AcaoImpl <em>Acao</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.AcaoImpl
   * @see arduino.impl.ArduinoPackageImpl#getAcao()
   * @generated
   */
  int ACAO = 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACAO__TRANSICAO_DE_ENTRADA = 0;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACAO__TRANSICAO_DE_SAIDA = 1;

  /**
   * The number of structural features of the '<em>Acao</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACAO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link arduino.impl.TransicoesImpl <em>Transicoes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.TransicoesImpl
   * @see arduino.impl.ArduinoPackageImpl#getTransicoes()
   * @generated
   */
  int TRANSICOES = 2;

  /**
   * The feature id for the '<em><b>Acao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSICOES__ACAO_DE_ENTRADA = 0;

  /**
   * The feature id for the '<em><b>Acao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSICOES__ACAO_DE_SAIDA = 1;

  /**
   * The number of structural features of the '<em>Transicoes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSICOES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link arduino.impl.Virar_EsquerdaImpl <em>Virar Esquerda</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Virar_EsquerdaImpl
   * @see arduino.impl.ArduinoPackageImpl#getVirar_Esquerda()
   * @generated
   */
  int VIRAR_ESQUERDA = 3;

  /**
   * The meta object id for the '{@link arduino.impl.Mover_FrenteImpl <em>Mover Frente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Mover_FrenteImpl
   * @see arduino.impl.ArduinoPackageImpl#getMover_Frente()
   * @generated
   */
  int MOVER_FRENTE = 4;

  /**
   * The meta object id for the '{@link arduino.impl.Mover_TrasImpl <em>Mover Tras</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Mover_TrasImpl
   * @see arduino.impl.ArduinoPackageImpl#getMover_Tras()
   * @generated
   */
  int MOVER_TRAS = 5;

  /**
   * The meta object id for the '{@link arduino.impl.Virar_DireitaImpl <em>Virar Direita</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Virar_DireitaImpl
   * @see arduino.impl.ArduinoPackageImpl#getVirar_Direita()
   * @generated
   */
  int VIRAR_DIREITA = 6;

  /**
   * The meta object id for the '{@link arduino.impl.Rodar_Esquerda_TempoImpl <em>Rodar Esquerda Tempo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Rodar_Esquerda_TempoImpl
   * @see arduino.impl.ArduinoPackageImpl#getRodar_Esquerda_Tempo()
   * @generated
   */
  int RODAR_ESQUERDA_TEMPO = 7;

  /**
   * The meta object id for the '{@link arduino.impl.Acoes_ModificaveisImpl <em>Acoes Modificaveis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Acoes_ModificaveisImpl
   * @see arduino.impl.ArduinoPackageImpl#getAcoes_Modificaveis()
   * @generated
   */
  int ACOES_MODIFICAVEIS = 10;

  /**
   * The meta object id for the '{@link arduino.impl.Rodar_Direita_TempoImpl <em>Rodar Direita Tempo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Rodar_Direita_TempoImpl
   * @see arduino.impl.ArduinoPackageImpl#getRodar_Direita_Tempo()
   * @generated
   */
  int RODAR_DIREITA_TEMPO = 8;

  /**
   * The meta object id for the '{@link arduino.impl.Acoes_PredefinidasImpl <em>Acoes Predefinidas</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Acoes_PredefinidasImpl
   * @see arduino.impl.ArduinoPackageImpl#getAcoes_Predefinidas()
   * @generated
   */
  int ACOES_PREDEFINIDAS = 9;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_PREDEFINIDAS__TRANSICAO_DE_ENTRADA = ACAO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_PREDEFINIDAS__TRANSICAO_DE_SAIDA = ACAO__TRANSICAO_DE_SAIDA;

  /**
   * The number of structural features of the '<em>Acoes Predefinidas</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_PREDEFINIDAS_FEATURE_COUNT = ACAO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link arduino.impl.Mover_Frente_TempoImpl <em>Mover Frente Tempo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Mover_Frente_TempoImpl
   * @see arduino.impl.ArduinoPackageImpl#getMover_Frente_Tempo()
   * @generated
   */
  int MOVER_FRENTE_TEMPO = 11;

  /**
   * The meta object id for the '{@link arduino.impl.Mover_Tras_TempoImpl <em>Mover Tras Tempo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Mover_Tras_TempoImpl
   * @see arduino.impl.ArduinoPackageImpl#getMover_Tras_Tempo()
   * @generated
   */
  int MOVER_TRAS_TEMPO = 12;

  /**
   * The meta object id for the '{@link arduino.impl.Virar_para_X_GrausImpl <em>Virar para XGraus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Virar_para_X_GrausImpl
   * @see arduino.impl.ArduinoPackageImpl#getVirar_para_X_Graus()
   * @generated
   */
  int VIRAR_PARA_XGRAUS = 13;

  /**
   * The meta object id for the '{@link arduino.impl.CabecaImpl <em>Cabeca</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.CabecaImpl
   * @see arduino.impl.ArduinoPackageImpl#getCabeca()
   * @generated
   */
  int CABECA = 44;

  /**
   * The meta object id for the '{@link arduino.impl.Virar_Max_DrtImpl <em>Virar Max Drt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Virar_Max_DrtImpl
   * @see arduino.impl.ArduinoPackageImpl#getVirar_Max_Drt()
   * @generated
   */
  int VIRAR_MAX_DRT = 14;

  /**
   * The meta object id for the '{@link arduino.impl.Virar_Max_EsqImpl <em>Virar Max Esq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Virar_Max_EsqImpl
   * @see arduino.impl.ArduinoPackageImpl#getVirar_Max_Esq()
   * @generated
   */
  int VIRAR_MAX_ESQ = 15;

  /**
   * The meta object id for the '{@link arduino.impl.CentrarImpl <em>Centrar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.CentrarImpl
   * @see arduino.impl.ArduinoPackageImpl#getCentrar()
   * @generated
   */
  int CENTRAR = 16;

  /**
   * The meta object id for the '{@link arduino.impl.Virar_45_EsqImpl <em>Virar 45 Esq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Virar_45_EsqImpl
   * @see arduino.impl.ArduinoPackageImpl#getVirar_45_Esq()
   * @generated
   */
  int VIRAR_45_ESQ = 17;

  /**
   * The meta object id for the '{@link arduino.impl.Virar_45_DrtImpl <em>Virar 45 Drt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Virar_45_DrtImpl
   * @see arduino.impl.ArduinoPackageImpl#getVirar_45_Drt()
   * @generated
   */
  int VIRAR_45_DRT = 18;

  /**
   * The meta object id for the '{@link arduino.impl.CorpoImpl <em>Corpo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.CorpoImpl
   * @see arduino.impl.ArduinoPackageImpl#getCorpo()
   * @generated
   */
  int CORPO = 42;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORPO__TRANSICAO_DE_ENTRADA = ACOES_PREDEFINIDAS__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORPO__TRANSICAO_DE_SAIDA = ACOES_PREDEFINIDAS__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORPO__EVITAR_OBSTACULO = ACOES_PREDEFINIDAS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Corpo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORPO_FEATURE_COUNT = ACOES_PREDEFINIDAS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_ESQUERDA__TRANSICAO_DE_ENTRADA = CORPO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_ESQUERDA__TRANSICAO_DE_SAIDA = CORPO__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_ESQUERDA__EVITAR_OBSTACULO = CORPO__EVITAR_OBSTACULO;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_ESQUERDA__NOME = CORPO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Virar Esquerda</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_ESQUERDA_FEATURE_COUNT = CORPO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE__TRANSICAO_DE_ENTRADA = CORPO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE__TRANSICAO_DE_SAIDA = CORPO__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE__EVITAR_OBSTACULO = CORPO__EVITAR_OBSTACULO;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE__NOME = CORPO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mover Frente</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE_FEATURE_COUNT = CORPO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS__TRANSICAO_DE_ENTRADA = CORPO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS__TRANSICAO_DE_SAIDA = CORPO__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS__EVITAR_OBSTACULO = CORPO__EVITAR_OBSTACULO;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS__NOME = CORPO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mover Tras</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS_FEATURE_COUNT = CORPO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_DIREITA__TRANSICAO_DE_ENTRADA = CORPO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_DIREITA__TRANSICAO_DE_SAIDA = CORPO__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_DIREITA__EVITAR_OBSTACULO = CORPO__EVITAR_OBSTACULO;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_DIREITA__NOME = CORPO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Virar Direita</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_DIREITA_FEATURE_COUNT = CORPO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_MODIFICAVEIS__TRANSICAO_DE_ENTRADA = ACAO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_MODIFICAVEIS__TRANSICAO_DE_SAIDA = ACAO__TRANSICAO_DE_SAIDA;

  /**
   * The number of structural features of the '<em>Acoes Modificaveis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_MODIFICAVEIS_FEATURE_COUNT = ACAO_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link arduino.impl.Mover_AleatoriamenteImpl <em>Mover Aleatoriamente</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Mover_AleatoriamenteImpl
   * @see arduino.impl.ArduinoPackageImpl#getMover_Aleatoriamente()
   * @generated
   */
  int MOVER_ALEATORIAMENTE = 19;

  /**
   * The meta object id for the '{@link arduino.impl.LEDImpl <em>LED</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.LEDImpl
   * @see arduino.impl.ArduinoPackageImpl#getLED()
   * @generated
   */
  int LED = 20;

  /**
   * The meta object id for the '{@link arduino.impl.VerdeImpl <em>Verde</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.VerdeImpl
   * @see arduino.impl.ArduinoPackageImpl#getVerde()
   * @generated
   */
  int VERDE = 21;

  /**
   * The meta object id for the '{@link arduino.impl.TricolorImpl <em>Tricolor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.TricolorImpl
   * @see arduino.impl.ArduinoPackageImpl#getTricolor()
   * @generated
   */
  int TRICOLOR = 22;

  /**
   * The meta object id for the '{@link arduino.impl.Ligar_LED_VerdeImpl <em>Ligar LED Verde</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Ligar_LED_VerdeImpl
   * @see arduino.impl.ArduinoPackageImpl#getLigar_LED_Verde()
   * @generated
   */
  int LIGAR_LED_VERDE = 23;

  /**
   * The meta object id for the '{@link arduino.impl.Desligar_LED_VerdeImpl <em>Desligar LED Verde</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Desligar_LED_VerdeImpl
   * @see arduino.impl.ArduinoPackageImpl#getDesligar_LED_Verde()
   * @generated
   */
  int DESLIGAR_LED_VERDE = 24;

  /**
   * The meta object id for the '{@link arduino.impl.Ligar_IntermitenciaImpl <em>Ligar Intermitencia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Ligar_IntermitenciaImpl
   * @see arduino.impl.ArduinoPackageImpl#getLigar_Intermitencia()
   * @generated
   */
  int LIGAR_INTERMITENCIA = 25;

  /**
   * The meta object id for the '{@link arduino.impl.Desligar_IntermitenciaImpl <em>Desligar Intermitencia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Desligar_IntermitenciaImpl
   * @see arduino.impl.ArduinoPackageImpl#getDesligar_Intermitencia()
   * @generated
   */
  int DESLIGAR_INTERMITENCIA = 26;

  /**
   * The meta object id for the '{@link arduino.impl.Varias_CoresImpl <em>Varias Cores</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Varias_CoresImpl
   * @see arduino.impl.ArduinoPackageImpl#getVarias_Cores()
   * @generated
   */
  int VARIAS_CORES = 27;

  /**
   * The meta object id for the '{@link arduino.impl.Unica_CorImpl <em>Unica Cor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Unica_CorImpl
   * @see arduino.impl.ArduinoPackageImpl#getUnica_Cor()
   * @generated
   */
  int UNICA_COR = 28;

  /**
   * The meta object id for the '{@link arduino.impl.Ligar_Cores_PoliciaImpl <em>Ligar Cores Policia</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Ligar_Cores_PoliciaImpl
   * @see arduino.impl.ArduinoPackageImpl#getLigar_Cores_Policia()
   * @generated
   */
  int LIGAR_CORES_POLICIA = 29;

  /**
   * The meta object id for the '{@link arduino.impl.Ligar_Cores_Arco_IrisImpl <em>Ligar Cores Arco Iris</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Ligar_Cores_Arco_IrisImpl
   * @see arduino.impl.ArduinoPackageImpl#getLigar_Cores_Arco_Iris()
   * @generated
   */
  int LIGAR_CORES_ARCO_IRIS = 30;

  /**
   * The meta object id for the '{@link arduino.impl.Ligar_AzulImpl <em>Ligar Azul</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Ligar_AzulImpl
   * @see arduino.impl.ArduinoPackageImpl#getLigar_Azul()
   * @generated
   */
  int LIGAR_AZUL = 31;

  /**
   * The meta object id for the '{@link arduino.impl.Ligar_VerdeImpl <em>Ligar Verde</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Ligar_VerdeImpl
   * @see arduino.impl.ArduinoPackageImpl#getLigar_Verde()
   * @generated
   */
  int LIGAR_VERDE = 32;

  /**
   * The meta object id for the '{@link arduino.impl.Ligar_VermelhoImpl <em>Ligar Vermelho</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Ligar_VermelhoImpl
   * @see arduino.impl.ArduinoPackageImpl#getLigar_Vermelho()
   * @generated
   */
  int LIGAR_VERMELHO = 33;

  /**
   * The meta object id for the '{@link arduino.impl.Desligar_CorImpl <em>Desligar Cor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Desligar_CorImpl
   * @see arduino.impl.ArduinoPackageImpl#getDesligar_Cor()
   * @generated
   */
  int DESLIGAR_COR = 34;

  /**
   * The meta object id for the '{@link arduino.impl.Desligar_CoresImpl <em>Desligar Cores</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Desligar_CoresImpl
   * @see arduino.impl.ArduinoPackageImpl#getDesligar_Cores()
   * @generated
   */
  int DESLIGAR_CORES = 35;

  /**
   * The meta object id for the '{@link arduino.impl.Acoes_CondicionaisImpl <em>Acoes Condicionais</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Acoes_CondicionaisImpl
   * @see arduino.impl.ArduinoPackageImpl#getAcoes_Condicionais()
   * @generated
   */
  int ACOES_CONDICIONAIS = 36;

  /**
   * The meta object id for the '{@link arduino.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.WhileImpl
   * @see arduino.impl.ArduinoPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 37;

  /**
   * The meta object id for the '{@link arduino.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.IfImpl
   * @see arduino.impl.ArduinoPackageImpl#getIf()
   * @generated
   */
  int IF = 38;

  /**
   * The meta object id for the '{@link arduino.impl.CondicaoImpl <em>Condicao</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.CondicaoImpl
   * @see arduino.impl.ArduinoPackageImpl#getCondicao()
   * @generated
   */
  int CONDICAO = 39;

  /**
   * The meta object id for the '{@link arduino.impl.Bumper_PressionadoImpl <em>Bumper Pressionado</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Bumper_PressionadoImpl
   * @see arduino.impl.ArduinoPackageImpl#getBumper_Pressionado()
   * @generated
   */
  int BUMPER_PRESSIONADO = 40;

  /**
   * The meta object id for the '{@link arduino.impl.Distancia_Infra_VermelhosImpl <em>Distancia Infra Vermelhos</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Distancia_Infra_VermelhosImpl
   * @see arduino.impl.ArduinoPackageImpl#getDistancia_Infra_Vermelhos()
   * @generated
   */
  int DISTANCIA_INFRA_VERMELHOS = 41;

  /**
   * The meta object id for the '{@link arduino.impl.Corpo_ModificavelImpl <em>Corpo Modificavel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Corpo_ModificavelImpl
   * @see arduino.impl.ArduinoPackageImpl#getCorpo_Modificavel()
   * @generated
   */
  int CORPO_MODIFICAVEL = 43;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORPO_MODIFICAVEL__TRANSICAO_DE_ENTRADA = ACOES_MODIFICAVEIS__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORPO_MODIFICAVEL__TRANSICAO_DE_SAIDA = ACOES_MODIFICAVEIS__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORPO_MODIFICAVEL__TEMPO = ACOES_MODIFICAVEIS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORPO_MODIFICAVEL__EVITAR_OBSTACULO = ACOES_MODIFICAVEIS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Corpo Modificavel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CORPO_MODIFICAVEL_FEATURE_COUNT = ACOES_MODIFICAVEIS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_ESQUERDA_TEMPO__TRANSICAO_DE_ENTRADA = CORPO_MODIFICAVEL__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_ESQUERDA_TEMPO__TRANSICAO_DE_SAIDA = CORPO_MODIFICAVEL__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_ESQUERDA_TEMPO__TEMPO = CORPO_MODIFICAVEL__TEMPO;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_ESQUERDA_TEMPO__EVITAR_OBSTACULO = CORPO_MODIFICAVEL__EVITAR_OBSTACULO;

  /**
   * The number of structural features of the '<em>Rodar Esquerda Tempo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_ESQUERDA_TEMPO_FEATURE_COUNT = CORPO_MODIFICAVEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_DIREITA_TEMPO__TRANSICAO_DE_ENTRADA = CORPO_MODIFICAVEL__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_DIREITA_TEMPO__TRANSICAO_DE_SAIDA = CORPO_MODIFICAVEL__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_DIREITA_TEMPO__TEMPO = CORPO_MODIFICAVEL__TEMPO;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_DIREITA_TEMPO__EVITAR_OBSTACULO = CORPO_MODIFICAVEL__EVITAR_OBSTACULO;

  /**
   * The number of structural features of the '<em>Rodar Direita Tempo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RODAR_DIREITA_TEMPO_FEATURE_COUNT = CORPO_MODIFICAVEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE_TEMPO__TRANSICAO_DE_ENTRADA = CORPO_MODIFICAVEL__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE_TEMPO__TRANSICAO_DE_SAIDA = CORPO_MODIFICAVEL__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE_TEMPO__TEMPO = CORPO_MODIFICAVEL__TEMPO;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE_TEMPO__EVITAR_OBSTACULO = CORPO_MODIFICAVEL__EVITAR_OBSTACULO;

  /**
   * The number of structural features of the '<em>Mover Frente Tempo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_FRENTE_TEMPO_FEATURE_COUNT = CORPO_MODIFICAVEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS_TEMPO__TRANSICAO_DE_ENTRADA = CORPO_MODIFICAVEL__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS_TEMPO__TRANSICAO_DE_SAIDA = CORPO_MODIFICAVEL__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS_TEMPO__TEMPO = CORPO_MODIFICAVEL__TEMPO;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS_TEMPO__EVITAR_OBSTACULO = CORPO_MODIFICAVEL__EVITAR_OBSTACULO;

  /**
   * The number of structural features of the '<em>Mover Tras Tempo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_TRAS_TEMPO_FEATURE_COUNT = CORPO_MODIFICAVEL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link arduino.impl.Cabeca_ModificavelImpl <em>Cabeca Modificavel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Cabeca_ModificavelImpl
   * @see arduino.impl.ArduinoPackageImpl#getCabeca_Modificavel()
   * @generated
   */
  int CABECA_MODIFICAVEL = 45;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABECA_MODIFICAVEL__TRANSICAO_DE_ENTRADA = ACOES_MODIFICAVEIS__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABECA_MODIFICAVEL__TRANSICAO_DE_SAIDA = ACOES_MODIFICAVEIS__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Graus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABECA_MODIFICAVEL__GRAUS = ACOES_MODIFICAVEIS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Cabeca Modificavel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABECA_MODIFICAVEL_FEATURE_COUNT = ACOES_MODIFICAVEIS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_PARA_XGRAUS__TRANSICAO_DE_ENTRADA = CABECA_MODIFICAVEL__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_PARA_XGRAUS__TRANSICAO_DE_SAIDA = CABECA_MODIFICAVEL__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Graus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_PARA_XGRAUS__GRAUS = CABECA_MODIFICAVEL__GRAUS;

  /**
   * The number of structural features of the '<em>Virar para XGraus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_PARA_XGRAUS_FEATURE_COUNT = CABECA_MODIFICAVEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABECA__TRANSICAO_DE_ENTRADA = ACOES_PREDEFINIDAS__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABECA__TRANSICAO_DE_SAIDA = ACOES_PREDEFINIDAS__TRANSICAO_DE_SAIDA;

  /**
   * The number of structural features of the '<em>Cabeca</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CABECA_FEATURE_COUNT = ACOES_PREDEFINIDAS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_MAX_DRT__TRANSICAO_DE_ENTRADA = CABECA__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_MAX_DRT__TRANSICAO_DE_SAIDA = CABECA__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_MAX_DRT__NOME = CABECA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Virar Max Drt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_MAX_DRT_FEATURE_COUNT = CABECA_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_MAX_ESQ__TRANSICAO_DE_ENTRADA = CABECA__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_MAX_ESQ__TRANSICAO_DE_SAIDA = CABECA__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_MAX_ESQ__NOME = CABECA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Virar Max Esq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_MAX_ESQ_FEATURE_COUNT = CABECA_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTRAR__TRANSICAO_DE_ENTRADA = CABECA__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTRAR__TRANSICAO_DE_SAIDA = CABECA__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTRAR__NOME = CABECA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Centrar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CENTRAR_FEATURE_COUNT = CABECA_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_45_ESQ__TRANSICAO_DE_ENTRADA = CABECA__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_45_ESQ__TRANSICAO_DE_SAIDA = CABECA__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_45_ESQ__NOME = CABECA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Virar 45 Esq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_45_ESQ_FEATURE_COUNT = CABECA_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_45_DRT__TRANSICAO_DE_ENTRADA = CABECA__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_45_DRT__TRANSICAO_DE_SAIDA = CABECA__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_45_DRT__NOME = CABECA_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Virar 45 Drt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIRAR_45_DRT_FEATURE_COUNT = CABECA_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_ALEATORIAMENTE__TRANSICAO_DE_ENTRADA = CORPO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_ALEATORIAMENTE__TRANSICAO_DE_SAIDA = CORPO__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_ALEATORIAMENTE__EVITAR_OBSTACULO = CORPO__EVITAR_OBSTACULO;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_ALEATORIAMENTE__NOME = CORPO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mover Aleatoriamente</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOVER_ALEATORIAMENTE_FEATURE_COUNT = CORPO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED__TRANSICAO_DE_ENTRADA = ACOES_PREDEFINIDAS__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED__TRANSICAO_DE_SAIDA = ACOES_PREDEFINIDAS__TRANSICAO_DE_SAIDA;

  /**
   * The number of structural features of the '<em>LED</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LED_FEATURE_COUNT = ACOES_PREDEFINIDAS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERDE__TRANSICAO_DE_ENTRADA = LED__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERDE__TRANSICAO_DE_SAIDA = LED__TRANSICAO_DE_SAIDA;

  /**
   * The number of structural features of the '<em>Verde</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERDE_FEATURE_COUNT = LED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRICOLOR__TRANSICAO_DE_ENTRADA = LED__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRICOLOR__TRANSICAO_DE_SAIDA = LED__TRANSICAO_DE_SAIDA;

  /**
   * The number of structural features of the '<em>Tricolor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRICOLOR_FEATURE_COUNT = LED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_LED_VERDE__TRANSICAO_DE_ENTRADA = VERDE__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_LED_VERDE__TRANSICAO_DE_SAIDA = VERDE__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_LED_VERDE__NOME = VERDE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ligar LED Verde</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_LED_VERDE_FEATURE_COUNT = VERDE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_LED_VERDE__TRANSICAO_DE_ENTRADA = VERDE__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_LED_VERDE__TRANSICAO_DE_SAIDA = VERDE__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_LED_VERDE__NOME = VERDE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Desligar LED Verde</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_LED_VERDE_FEATURE_COUNT = VERDE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_INTERMITENCIA__TRANSICAO_DE_ENTRADA = VERDE__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_INTERMITENCIA__TRANSICAO_DE_SAIDA = VERDE__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_INTERMITENCIA__NOME = VERDE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ligar Intermitencia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_INTERMITENCIA_FEATURE_COUNT = VERDE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_INTERMITENCIA__TRANSICAO_DE_ENTRADA = VERDE__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_INTERMITENCIA__TRANSICAO_DE_SAIDA = VERDE__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_INTERMITENCIA__NOME = VERDE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Desligar Intermitencia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_INTERMITENCIA_FEATURE_COUNT = VERDE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIAS_CORES__TRANSICAO_DE_ENTRADA = TRICOLOR__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIAS_CORES__TRANSICAO_DE_SAIDA = TRICOLOR__TRANSICAO_DE_SAIDA;

  /**
   * The number of structural features of the '<em>Varias Cores</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIAS_CORES_FEATURE_COUNT = TRICOLOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICA_COR__TRANSICAO_DE_ENTRADA = TRICOLOR__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICA_COR__TRANSICAO_DE_SAIDA = TRICOLOR__TRANSICAO_DE_SAIDA;

  /**
   * The number of structural features of the '<em>Unica Cor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNICA_COR_FEATURE_COUNT = TRICOLOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_CORES_POLICIA__TRANSICAO_DE_ENTRADA = VARIAS_CORES__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_CORES_POLICIA__TRANSICAO_DE_SAIDA = VARIAS_CORES__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_CORES_POLICIA__NOME = VARIAS_CORES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ligar Cores Policia</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_CORES_POLICIA_FEATURE_COUNT = VARIAS_CORES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_CORES_ARCO_IRIS__TRANSICAO_DE_ENTRADA = VARIAS_CORES__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_CORES_ARCO_IRIS__TRANSICAO_DE_SAIDA = VARIAS_CORES__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_CORES_ARCO_IRIS__NOME = VARIAS_CORES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ligar Cores Arco Iris</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_CORES_ARCO_IRIS_FEATURE_COUNT = VARIAS_CORES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_AZUL__TRANSICAO_DE_ENTRADA = UNICA_COR__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_AZUL__TRANSICAO_DE_SAIDA = UNICA_COR__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_AZUL__NOME = UNICA_COR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ligar Azul</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_AZUL_FEATURE_COUNT = UNICA_COR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_VERDE__TRANSICAO_DE_ENTRADA = UNICA_COR__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_VERDE__TRANSICAO_DE_SAIDA = UNICA_COR__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_VERDE__NOME = UNICA_COR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ligar Verde</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_VERDE_FEATURE_COUNT = UNICA_COR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_VERMELHO__TRANSICAO_DE_ENTRADA = UNICA_COR__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_VERMELHO__TRANSICAO_DE_SAIDA = UNICA_COR__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_VERMELHO__NOME = UNICA_COR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ligar Vermelho</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIGAR_VERMELHO_FEATURE_COUNT = UNICA_COR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_COR__TRANSICAO_DE_ENTRADA = UNICA_COR__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_COR__TRANSICAO_DE_SAIDA = UNICA_COR__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_COR__NOME = UNICA_COR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Desligar Cor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_COR_FEATURE_COUNT = UNICA_COR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_CORES__TRANSICAO_DE_ENTRADA = VARIAS_CORES__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_CORES__TRANSICAO_DE_SAIDA = VARIAS_CORES__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_CORES__NOME = VARIAS_CORES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Desligar Cores</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESLIGAR_CORES_FEATURE_COUNT = VARIAS_CORES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_CONDICIONAIS__TRANSICAO_DE_ENTRADA = ACAO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_CONDICIONAIS__TRANSICAO_DE_SAIDA = ACAO__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Tem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_CONDICIONAIS__TEM = ACAO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Acoes Condicionais</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACOES_CONDICIONAIS_FEATURE_COUNT = ACAO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__TRANSICAO_DE_ENTRADA = ACOES_CONDICIONAIS__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__TRANSICAO_DE_SAIDA = ACOES_CONDICIONAIS__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Tem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__TEM = ACOES_CONDICIONAIS__TEM;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__NOME = ACOES_CONDICIONAIS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Corpo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__CORPO = ACOES_CONDICIONAIS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = ACOES_CONDICIONAIS_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__TRANSICAO_DE_ENTRADA = ACOES_CONDICIONAIS__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__TRANSICAO_DE_SAIDA = ACOES_CONDICIONAIS__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Tem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__TEM = ACOES_CONDICIONAIS__TEM;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__NOME = ACOES_CONDICIONAIS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__THEN = ACOES_CONDICIONAIS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = ACOES_CONDICIONAIS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Condicao</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDICAO_FEATURE_COUNT = 0;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUMPER_PRESSIONADO__NOME = CONDICAO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bumper Pressionado</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUMPER_PRESSIONADO_FEATURE_COUNT = CONDICAO_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Distancia</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTANCIA_INFRA_VERMELHOS__DISTANCIA = CONDICAO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Distancia Infra Vermelhos</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISTANCIA_INFRA_VERMELHOS_FEATURE_COUNT = CONDICAO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link arduino.impl.InicioImpl <em>Inicio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.InicioImpl
   * @see arduino.impl.ArduinoPackageImpl#getInicio()
   * @generated
   */
  int INICIO = 46;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIO__TRANSICAO_DE_ENTRADA = ACAO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIO__TRANSICAO_DE_SAIDA = ACAO__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIO__NOME = ACAO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIO__EVITAR_OBSTACULO = ACAO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Inicio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INICIO_FEATURE_COUNT = ACAO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link arduino.impl.FimImpl <em>Fim</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.FimImpl
   * @see arduino.impl.ArduinoPackageImpl#getFim()
   * @generated
   */
  int FIM = 47;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIM__TRANSICAO_DE_ENTRADA = ACAO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIM__TRANSICAO_DE_SAIDA = ACAO__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIM__NOME = ACAO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fim</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIM_FEATURE_COUNT = ACAO_FEATURE_COUNT + 1;


  /**
   * The meta object id for the '{@link arduino.impl.PararImpl <em>Parar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.PararImpl
   * @see arduino.impl.ArduinoPackageImpl#getParar()
   * @generated
   */
  int PARAR = 48;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR__TRANSICAO_DE_ENTRADA = CORPO__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR__TRANSICAO_DE_SAIDA = CORPO__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR__EVITAR_OBSTACULO = CORPO__EVITAR_OBSTACULO;

  /**
   * The feature id for the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR__NOME = CORPO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR_FEATURE_COUNT = CORPO_FEATURE_COUNT + 1;


  /**
   * The meta object id for the '{@link arduino.impl.Parar_TempoImpl <em>Parar Tempo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see arduino.impl.Parar_TempoImpl
   * @see arduino.impl.ArduinoPackageImpl#getParar_Tempo()
   * @generated
   */
  int PARAR_TEMPO = 49;

  /**
   * The feature id for the '<em><b>Transicao de Entrada</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR_TEMPO__TRANSICAO_DE_ENTRADA = CORPO_MODIFICAVEL__TRANSICAO_DE_ENTRADA;

  /**
   * The feature id for the '<em><b>Transicao de Saida</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR_TEMPO__TRANSICAO_DE_SAIDA = CORPO_MODIFICAVEL__TRANSICAO_DE_SAIDA;

  /**
   * The feature id for the '<em><b>Tempo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR_TEMPO__TEMPO = CORPO_MODIFICAVEL__TEMPO;

  /**
   * The feature id for the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR_TEMPO__EVITAR_OBSTACULO = CORPO_MODIFICAVEL__EVITAR_OBSTACULO;

  /**
   * The number of structural features of the '<em>Parar Tempo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAR_TEMPO_FEATURE_COUNT = CORPO_MODIFICAVEL_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link arduino.Robo <em>Robo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Robo</em>'.
   * @see arduino.Robo
   * @generated
   */
  EClass getRobo();

  /**
   * Returns the meta object for the containment reference list '{@link arduino.Robo#getTemAcoes <em>Tem Acoes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tem Acoes</em>'.
   * @see arduino.Robo#getTemAcoes()
   * @see #getRobo()
   * @generated
   */
  EReference getRobo_TemAcoes();

  /**
   * Returns the meta object for the containment reference list '{@link arduino.Robo#getTemTransicoes <em>Tem Transicoes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tem Transicoes</em>'.
   * @see arduino.Robo#getTemTransicoes()
   * @see #getRobo()
   * @generated
   */
  EReference getRobo_TemTransicoes();

  /**
   * Returns the meta object for the attribute '{@link arduino.Robo#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Robo#getNome()
   * @see #getRobo()
   * @generated
   */
  EAttribute getRobo_Nome();

  /**
   * Returns the meta object for the containment reference list '{@link arduino.Robo#getTemCondicoes <em>Tem Condicoes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tem Condicoes</em>'.
   * @see arduino.Robo#getTemCondicoes()
   * @see #getRobo()
   * @generated
   */
  EReference getRobo_TemCondicoes();

  /**
   * Returns the meta object for class '{@link arduino.Acao <em>Acao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acao</em>'.
   * @see arduino.Acao
   * @generated
   */
  EClass getAcao();

  /**
   * Returns the meta object for the reference '{@link arduino.Acao#getTransicao_de_Entrada <em>Transicao de Entrada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Transicao de Entrada</em>'.
   * @see arduino.Acao#getTransicao_de_Entrada()
   * @see #getAcao()
   * @generated
   */
  EReference getAcao_Transicao_de_Entrada();

  /**
   * Returns the meta object for the reference '{@link arduino.Acao#getTransicao_de_Saida <em>Transicao de Saida</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Transicao de Saida</em>'.
   * @see arduino.Acao#getTransicao_de_Saida()
   * @see #getAcao()
   * @generated
   */
  EReference getAcao_Transicao_de_Saida();

  /**
   * Returns the meta object for class '{@link arduino.Transicoes <em>Transicoes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transicoes</em>'.
   * @see arduino.Transicoes
   * @generated
   */
  EClass getTransicoes();

  /**
   * Returns the meta object for the reference '{@link arduino.Transicoes#getAcao_de_Entrada <em>Acao de Entrada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Acao de Entrada</em>'.
   * @see arduino.Transicoes#getAcao_de_Entrada()
   * @see #getTransicoes()
   * @generated
   */
  EReference getTransicoes_Acao_de_Entrada();

  /**
   * Returns the meta object for the reference '{@link arduino.Transicoes#getAcao_de_Saida <em>Acao de Saida</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Acao de Saida</em>'.
   * @see arduino.Transicoes#getAcao_de_Saida()
   * @see #getTransicoes()
   * @generated
   */
  EReference getTransicoes_Acao_de_Saida();

  /**
   * Returns the meta object for class '{@link arduino.Virar_Esquerda <em>Virar Esquerda</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virar Esquerda</em>'.
   * @see arduino.Virar_Esquerda
   * @generated
   */
  EClass getVirar_Esquerda();

  /**
   * Returns the meta object for the attribute '{@link arduino.Virar_Esquerda#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Virar_Esquerda#getNome()
   * @see #getVirar_Esquerda()
   * @generated
   */
  EAttribute getVirar_Esquerda_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Mover_Frente <em>Mover Frente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mover Frente</em>'.
   * @see arduino.Mover_Frente
   * @generated
   */
  EClass getMover_Frente();

  /**
   * Returns the meta object for the attribute '{@link arduino.Mover_Frente#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Mover_Frente#getNome()
   * @see #getMover_Frente()
   * @generated
   */
  EAttribute getMover_Frente_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Mover_Tras <em>Mover Tras</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mover Tras</em>'.
   * @see arduino.Mover_Tras
   * @generated
   */
  EClass getMover_Tras();

  /**
   * Returns the meta object for the attribute '{@link arduino.Mover_Tras#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Mover_Tras#getNome()
   * @see #getMover_Tras()
   * @generated
   */
  EAttribute getMover_Tras_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Virar_Direita <em>Virar Direita</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virar Direita</em>'.
   * @see arduino.Virar_Direita
   * @generated
   */
  EClass getVirar_Direita();

  /**
   * Returns the meta object for the attribute '{@link arduino.Virar_Direita#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Virar_Direita#getNome()
   * @see #getVirar_Direita()
   * @generated
   */
  EAttribute getVirar_Direita_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Rodar_Esquerda_Tempo <em>Rodar Esquerda Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rodar Esquerda Tempo</em>'.
   * @see arduino.Rodar_Esquerda_Tempo
   * @generated
   */
  EClass getRodar_Esquerda_Tempo();

  /**
   * Returns the meta object for class '{@link arduino.Rodar_Direita_Tempo <em>Rodar Direita Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rodar Direita Tempo</em>'.
   * @see arduino.Rodar_Direita_Tempo
   * @generated
   */
  EClass getRodar_Direita_Tempo();

  /**
   * Returns the meta object for class '{@link arduino.Acoes_Predefinidas <em>Acoes Predefinidas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acoes Predefinidas</em>'.
   * @see arduino.Acoes_Predefinidas
   * @generated
   */
  EClass getAcoes_Predefinidas();

  /**
   * Returns the meta object for class '{@link arduino.Acoes_Modificaveis <em>Acoes Modificaveis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acoes Modificaveis</em>'.
   * @see arduino.Acoes_Modificaveis
   * @generated
   */
  EClass getAcoes_Modificaveis();

  /**
   * Returns the meta object for class '{@link arduino.Mover_Frente_Tempo <em>Mover Frente Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mover Frente Tempo</em>'.
   * @see arduino.Mover_Frente_Tempo
   * @generated
   */
  EClass getMover_Frente_Tempo();

  /**
   * Returns the meta object for class '{@link arduino.Mover_Tras_Tempo <em>Mover Tras Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mover Tras Tempo</em>'.
   * @see arduino.Mover_Tras_Tempo
   * @generated
   */
  EClass getMover_Tras_Tempo();

  /**
   * Returns the meta object for class '{@link arduino.Virar_para_X_Graus <em>Virar para XGraus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virar para XGraus</em>'.
   * @see arduino.Virar_para_X_Graus
   * @generated
   */
  EClass getVirar_para_X_Graus();

  /**
   * Returns the meta object for class '{@link arduino.Virar_Max_Drt <em>Virar Max Drt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virar Max Drt</em>'.
   * @see arduino.Virar_Max_Drt
   * @generated
   */
  EClass getVirar_Max_Drt();

  /**
   * Returns the meta object for the attribute '{@link arduino.Virar_Max_Drt#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Virar_Max_Drt#getNome()
   * @see #getVirar_Max_Drt()
   * @generated
   */
  EAttribute getVirar_Max_Drt_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Virar_Max_Esq <em>Virar Max Esq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virar Max Esq</em>'.
   * @see arduino.Virar_Max_Esq
   * @generated
   */
  EClass getVirar_Max_Esq();

  /**
   * Returns the meta object for the attribute '{@link arduino.Virar_Max_Esq#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Virar_Max_Esq#getNome()
   * @see #getVirar_Max_Esq()
   * @generated
   */
  EAttribute getVirar_Max_Esq_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Centrar <em>Centrar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Centrar</em>'.
   * @see arduino.Centrar
   * @generated
   */
  EClass getCentrar();

  /**
   * Returns the meta object for the attribute '{@link arduino.Centrar#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Centrar#getNome()
   * @see #getCentrar()
   * @generated
   */
  EAttribute getCentrar_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Virar_45_Esq <em>Virar 45 Esq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virar 45 Esq</em>'.
   * @see arduino.Virar_45_Esq
   * @generated
   */
  EClass getVirar_45_Esq();

  /**
   * Returns the meta object for the attribute '{@link arduino.Virar_45_Esq#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Virar_45_Esq#getNome()
   * @see #getVirar_45_Esq()
   * @generated
   */
  EAttribute getVirar_45_Esq_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Virar_45_Drt <em>Virar 45 Drt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Virar 45 Drt</em>'.
   * @see arduino.Virar_45_Drt
   * @generated
   */
  EClass getVirar_45_Drt();

  /**
   * Returns the meta object for the attribute '{@link arduino.Virar_45_Drt#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Virar_45_Drt#getNome()
   * @see #getVirar_45_Drt()
   * @generated
   */
  EAttribute getVirar_45_Drt_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Mover_Aleatoriamente <em>Mover Aleatoriamente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mover Aleatoriamente</em>'.
   * @see arduino.Mover_Aleatoriamente
   * @generated
   */
  EClass getMover_Aleatoriamente();

  /**
   * Returns the meta object for the attribute '{@link arduino.Mover_Aleatoriamente#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Mover_Aleatoriamente#getNome()
   * @see #getMover_Aleatoriamente()
   * @generated
   */
  EAttribute getMover_Aleatoriamente_Nome();

  /**
   * Returns the meta object for class '{@link arduino.LED <em>LED</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LED</em>'.
   * @see arduino.LED
   * @generated
   */
  EClass getLED();

  /**
   * Returns the meta object for class '{@link arduino.Verde <em>Verde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verde</em>'.
   * @see arduino.Verde
   * @generated
   */
  EClass getVerde();

  /**
   * Returns the meta object for class '{@link arduino.Tricolor <em>Tricolor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tricolor</em>'.
   * @see arduino.Tricolor
   * @generated
   */
  EClass getTricolor();

  /**
   * Returns the meta object for class '{@link arduino.Ligar_LED_Verde <em>Ligar LED Verde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ligar LED Verde</em>'.
   * @see arduino.Ligar_LED_Verde
   * @generated
   */
  EClass getLigar_LED_Verde();

  /**
   * Returns the meta object for the attribute '{@link arduino.Ligar_LED_Verde#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Ligar_LED_Verde#getNome()
   * @see #getLigar_LED_Verde()
   * @generated
   */
  EAttribute getLigar_LED_Verde_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Desligar_LED_Verde <em>Desligar LED Verde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Desligar LED Verde</em>'.
   * @see arduino.Desligar_LED_Verde
   * @generated
   */
  EClass getDesligar_LED_Verde();

  /**
   * Returns the meta object for the attribute '{@link arduino.Desligar_LED_Verde#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Desligar_LED_Verde#getNome()
   * @see #getDesligar_LED_Verde()
   * @generated
   */
  EAttribute getDesligar_LED_Verde_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Ligar_Intermitencia <em>Ligar Intermitencia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ligar Intermitencia</em>'.
   * @see arduino.Ligar_Intermitencia
   * @generated
   */
  EClass getLigar_Intermitencia();

  /**
   * Returns the meta object for the attribute '{@link arduino.Ligar_Intermitencia#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Ligar_Intermitencia#getNome()
   * @see #getLigar_Intermitencia()
   * @generated
   */
  EAttribute getLigar_Intermitencia_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Desligar_Intermitencia <em>Desligar Intermitencia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Desligar Intermitencia</em>'.
   * @see arduino.Desligar_Intermitencia
   * @generated
   */
  EClass getDesligar_Intermitencia();

  /**
   * Returns the meta object for the attribute '{@link arduino.Desligar_Intermitencia#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Desligar_Intermitencia#getNome()
   * @see #getDesligar_Intermitencia()
   * @generated
   */
  EAttribute getDesligar_Intermitencia_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Varias_Cores <em>Varias Cores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Varias Cores</em>'.
   * @see arduino.Varias_Cores
   * @generated
   */
  EClass getVarias_Cores();

  /**
   * Returns the meta object for class '{@link arduino.Unica_Cor <em>Unica Cor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unica Cor</em>'.
   * @see arduino.Unica_Cor
   * @generated
   */
  EClass getUnica_Cor();

  /**
   * Returns the meta object for class '{@link arduino.Ligar_Cores_Policia <em>Ligar Cores Policia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ligar Cores Policia</em>'.
   * @see arduino.Ligar_Cores_Policia
   * @generated
   */
  EClass getLigar_Cores_Policia();

  /**
   * Returns the meta object for the attribute '{@link arduino.Ligar_Cores_Policia#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Ligar_Cores_Policia#getNome()
   * @see #getLigar_Cores_Policia()
   * @generated
   */
  EAttribute getLigar_Cores_Policia_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Ligar_Cores_Arco_Iris <em>Ligar Cores Arco Iris</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ligar Cores Arco Iris</em>'.
   * @see arduino.Ligar_Cores_Arco_Iris
   * @generated
   */
  EClass getLigar_Cores_Arco_Iris();

  /**
   * Returns the meta object for the attribute '{@link arduino.Ligar_Cores_Arco_Iris#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Ligar_Cores_Arco_Iris#getNome()
   * @see #getLigar_Cores_Arco_Iris()
   * @generated
   */
  EAttribute getLigar_Cores_Arco_Iris_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Ligar_Azul <em>Ligar Azul</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ligar Azul</em>'.
   * @see arduino.Ligar_Azul
   * @generated
   */
  EClass getLigar_Azul();

  /**
   * Returns the meta object for the attribute '{@link arduino.Ligar_Azul#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Ligar_Azul#getNome()
   * @see #getLigar_Azul()
   * @generated
   */
  EAttribute getLigar_Azul_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Ligar_Verde <em>Ligar Verde</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ligar Verde</em>'.
   * @see arduino.Ligar_Verde
   * @generated
   */
  EClass getLigar_Verde();

  /**
   * Returns the meta object for the attribute '{@link arduino.Ligar_Verde#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Ligar_Verde#getNome()
   * @see #getLigar_Verde()
   * @generated
   */
  EAttribute getLigar_Verde_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Ligar_Vermelho <em>Ligar Vermelho</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ligar Vermelho</em>'.
   * @see arduino.Ligar_Vermelho
   * @generated
   */
  EClass getLigar_Vermelho();

  /**
   * Returns the meta object for the attribute '{@link arduino.Ligar_Vermelho#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Ligar_Vermelho#getNome()
   * @see #getLigar_Vermelho()
   * @generated
   */
  EAttribute getLigar_Vermelho_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Desligar_Cor <em>Desligar Cor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Desligar Cor</em>'.
   * @see arduino.Desligar_Cor
   * @generated
   */
  EClass getDesligar_Cor();

  /**
   * Returns the meta object for the attribute '{@link arduino.Desligar_Cor#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Desligar_Cor#getNome()
   * @see #getDesligar_Cor()
   * @generated
   */
  EAttribute getDesligar_Cor_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Desligar_Cores <em>Desligar Cores</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Desligar Cores</em>'.
   * @see arduino.Desligar_Cores
   * @generated
   */
  EClass getDesligar_Cores();

  /**
   * Returns the meta object for the attribute '{@link arduino.Desligar_Cores#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Desligar_Cores#getNome()
   * @see #getDesligar_Cores()
   * @generated
   */
  EAttribute getDesligar_Cores_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Acoes_Condicionais <em>Acoes Condicionais</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acoes Condicionais</em>'.
   * @see arduino.Acoes_Condicionais
   * @generated
   */
  EClass getAcoes_Condicionais();

  /**
   * Returns the meta object for the reference '{@link arduino.Acoes_Condicionais#getTem <em>Tem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tem</em>'.
   * @see arduino.Acoes_Condicionais#getTem()
   * @see #getAcoes_Condicionais()
   * @generated
   */
  EReference getAcoes_Condicionais_Tem();

  /**
   * Returns the meta object for class '{@link arduino.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see arduino.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the attribute '{@link arduino.While#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.While#getNome()
   * @see #getWhile()
   * @generated
   */
  EAttribute getWhile_Nome();

  /**
   * Returns the meta object for the reference '{@link arduino.While#getCorpo <em>Corpo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Corpo</em>'.
   * @see arduino.While#getCorpo()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Corpo();

  /**
   * Returns the meta object for class '{@link arduino.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see arduino.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the attribute '{@link arduino.If#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.If#getNome()
   * @see #getIf()
   * @generated
   */
  EAttribute getIf_Nome();

  /**
   * Returns the meta object for the reference '{@link arduino.If#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Then</em>'.
   * @see arduino.If#getThen()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Then();

  /**
   * Returns the meta object for class '{@link arduino.Condicao <em>Condicao</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condicao</em>'.
   * @see arduino.Condicao
   * @generated
   */
  EClass getCondicao();

  /**
   * Returns the meta object for class '{@link arduino.Bumper_Pressionado <em>Bumper Pressionado</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bumper Pressionado</em>'.
   * @see arduino.Bumper_Pressionado
   * @generated
   */
  EClass getBumper_Pressionado();

  /**
   * Returns the meta object for the attribute '{@link arduino.Bumper_Pressionado#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Bumper_Pressionado#getNome()
   * @see #getBumper_Pressionado()
   * @generated
   */
  EAttribute getBumper_Pressionado_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Distancia_Infra_Vermelhos <em>Distancia Infra Vermelhos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Distancia Infra Vermelhos</em>'.
   * @see arduino.Distancia_Infra_Vermelhos
   * @generated
   */
  EClass getDistancia_Infra_Vermelhos();

  /**
   * Returns the meta object for the attribute '{@link arduino.Distancia_Infra_Vermelhos#getDistancia <em>Distancia</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Distancia</em>'.
   * @see arduino.Distancia_Infra_Vermelhos#getDistancia()
   * @see #getDistancia_Infra_Vermelhos()
   * @generated
   */
  EAttribute getDistancia_Infra_Vermelhos_Distancia();

  /**
   * Returns the meta object for class '{@link arduino.Corpo <em>Corpo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Corpo</em>'.
   * @see arduino.Corpo
   * @generated
   */
  EClass getCorpo();

  /**
   * Returns the meta object for the attribute '{@link arduino.Corpo#isEvitarObstaculo <em>Evitar Obstaculo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evitar Obstaculo</em>'.
   * @see arduino.Corpo#isEvitarObstaculo()
   * @see #getCorpo()
   * @generated
   */
  EAttribute getCorpo_EvitarObstaculo();

  /**
   * Returns the meta object for class '{@link arduino.Corpo_Modificavel <em>Corpo Modificavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Corpo Modificavel</em>'.
   * @see arduino.Corpo_Modificavel
   * @generated
   */
  EClass getCorpo_Modificavel();

  /**
   * Returns the meta object for the attribute '{@link arduino.Corpo_Modificavel#getTempo <em>Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tempo</em>'.
   * @see arduino.Corpo_Modificavel#getTempo()
   * @see #getCorpo_Modificavel()
   * @generated
   */
  EAttribute getCorpo_Modificavel_Tempo();

  /**
   * Returns the meta object for the attribute '{@link arduino.Corpo_Modificavel#isEvitarObstaculo <em>Evitar Obstaculo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evitar Obstaculo</em>'.
   * @see arduino.Corpo_Modificavel#isEvitarObstaculo()
   * @see #getCorpo_Modificavel()
   * @generated
   */
  EAttribute getCorpo_Modificavel_EvitarObstaculo();

  /**
   * Returns the meta object for class '{@link arduino.Cabeca <em>Cabeca</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cabeca</em>'.
   * @see arduino.Cabeca
   * @generated
   */
  EClass getCabeca();

  /**
   * Returns the meta object for class '{@link arduino.Cabeca_Modificavel <em>Cabeca Modificavel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cabeca Modificavel</em>'.
   * @see arduino.Cabeca_Modificavel
   * @generated
   */
  EClass getCabeca_Modificavel();

  /**
   * Returns the meta object for the attribute '{@link arduino.Cabeca_Modificavel#getGraus <em>Graus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Graus</em>'.
   * @see arduino.Cabeca_Modificavel#getGraus()
   * @see #getCabeca_Modificavel()
   * @generated
   */
  EAttribute getCabeca_Modificavel_Graus();

  /**
   * Returns the meta object for class '{@link arduino.Inicio <em>Inicio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inicio</em>'.
   * @see arduino.Inicio
   * @generated
   */
  EClass getInicio();

  /**
   * Returns the meta object for the attribute '{@link arduino.Inicio#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Inicio#getNome()
   * @see #getInicio()
   * @generated
   */
  EAttribute getInicio_Nome();

  /**
   * Returns the meta object for the attribute '{@link arduino.Inicio#isEvitarObstaculo <em>Evitar Obstaculo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Evitar Obstaculo</em>'.
   * @see arduino.Inicio#isEvitarObstaculo()
   * @see #getInicio()
   * @generated
   */
  EAttribute getInicio_EvitarObstaculo();

  /**
   * Returns the meta object for class '{@link arduino.Fim <em>Fim</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fim</em>'.
   * @see arduino.Fim
   * @generated
   */
  EClass getFim();

  /**
   * Returns the meta object for the attribute '{@link arduino.Fim#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Fim#getNome()
   * @see #getFim()
   * @generated
   */
  EAttribute getFim_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Parar <em>Parar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parar</em>'.
   * @see arduino.Parar
   * @generated
   */
  EClass getParar();

  /**
   * Returns the meta object for the attribute '{@link arduino.Parar#getNome <em>Nome</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nome</em>'.
   * @see arduino.Parar#getNome()
   * @see #getParar()
   * @generated
   */
  EAttribute getParar_Nome();

  /**
   * Returns the meta object for class '{@link arduino.Parar_Tempo <em>Parar Tempo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parar Tempo</em>'.
   * @see arduino.Parar_Tempo
   * @generated
   */
  EClass getParar_Tempo();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ArduinoFactory getArduinoFactory();

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
     * The meta object literal for the '{@link arduino.impl.RoboImpl <em>Robo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.RoboImpl
     * @see arduino.impl.ArduinoPackageImpl#getRobo()
     * @generated
     */
    EClass ROBO = eINSTANCE.getRobo();

    /**
     * The meta object literal for the '<em><b>Tem Acoes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBO__TEM_ACOES = eINSTANCE.getRobo_TemAcoes();

    /**
     * The meta object literal for the '<em><b>Tem Transicoes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBO__TEM_TRANSICOES = eINSTANCE.getRobo_TemTransicoes();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROBO__NOME = eINSTANCE.getRobo_Nome();

    /**
     * The meta object literal for the '<em><b>Tem Condicoes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROBO__TEM_CONDICOES = eINSTANCE.getRobo_TemCondicoes();

    /**
     * The meta object literal for the '{@link arduino.impl.AcaoImpl <em>Acao</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.AcaoImpl
     * @see arduino.impl.ArduinoPackageImpl#getAcao()
     * @generated
     */
    EClass ACAO = eINSTANCE.getAcao();

    /**
     * The meta object literal for the '<em><b>Transicao de Entrada</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACAO__TRANSICAO_DE_ENTRADA = eINSTANCE.getAcao_Transicao_de_Entrada();

    /**
     * The meta object literal for the '<em><b>Transicao de Saida</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACAO__TRANSICAO_DE_SAIDA = eINSTANCE.getAcao_Transicao_de_Saida();

    /**
     * The meta object literal for the '{@link arduino.impl.TransicoesImpl <em>Transicoes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.TransicoesImpl
     * @see arduino.impl.ArduinoPackageImpl#getTransicoes()
     * @generated
     */
    EClass TRANSICOES = eINSTANCE.getTransicoes();

    /**
     * The meta object literal for the '<em><b>Acao de Entrada</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSICOES__ACAO_DE_ENTRADA = eINSTANCE.getTransicoes_Acao_de_Entrada();

    /**
     * The meta object literal for the '<em><b>Acao de Saida</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSICOES__ACAO_DE_SAIDA = eINSTANCE.getTransicoes_Acao_de_Saida();

    /**
     * The meta object literal for the '{@link arduino.impl.Virar_EsquerdaImpl <em>Virar Esquerda</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Virar_EsquerdaImpl
     * @see arduino.impl.ArduinoPackageImpl#getVirar_Esquerda()
     * @generated
     */
    EClass VIRAR_ESQUERDA = eINSTANCE.getVirar_Esquerda();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRAR_ESQUERDA__NOME = eINSTANCE.getVirar_Esquerda_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Mover_FrenteImpl <em>Mover Frente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Mover_FrenteImpl
     * @see arduino.impl.ArduinoPackageImpl#getMover_Frente()
     * @generated
     */
    EClass MOVER_FRENTE = eINSTANCE.getMover_Frente();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVER_FRENTE__NOME = eINSTANCE.getMover_Frente_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Mover_TrasImpl <em>Mover Tras</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Mover_TrasImpl
     * @see arduino.impl.ArduinoPackageImpl#getMover_Tras()
     * @generated
     */
    EClass MOVER_TRAS = eINSTANCE.getMover_Tras();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVER_TRAS__NOME = eINSTANCE.getMover_Tras_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Virar_DireitaImpl <em>Virar Direita</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Virar_DireitaImpl
     * @see arduino.impl.ArduinoPackageImpl#getVirar_Direita()
     * @generated
     */
    EClass VIRAR_DIREITA = eINSTANCE.getVirar_Direita();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRAR_DIREITA__NOME = eINSTANCE.getVirar_Direita_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Rodar_Esquerda_TempoImpl <em>Rodar Esquerda Tempo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Rodar_Esquerda_TempoImpl
     * @see arduino.impl.ArduinoPackageImpl#getRodar_Esquerda_Tempo()
     * @generated
     */
    EClass RODAR_ESQUERDA_TEMPO = eINSTANCE.getRodar_Esquerda_Tempo();

    /**
     * The meta object literal for the '{@link arduino.impl.Rodar_Direita_TempoImpl <em>Rodar Direita Tempo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Rodar_Direita_TempoImpl
     * @see arduino.impl.ArduinoPackageImpl#getRodar_Direita_Tempo()
     * @generated
     */
    EClass RODAR_DIREITA_TEMPO = eINSTANCE.getRodar_Direita_Tempo();

    /**
     * The meta object literal for the '{@link arduino.impl.Acoes_PredefinidasImpl <em>Acoes Predefinidas</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Acoes_PredefinidasImpl
     * @see arduino.impl.ArduinoPackageImpl#getAcoes_Predefinidas()
     * @generated
     */
    EClass ACOES_PREDEFINIDAS = eINSTANCE.getAcoes_Predefinidas();

    /**
     * The meta object literal for the '{@link arduino.impl.Acoes_ModificaveisImpl <em>Acoes Modificaveis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Acoes_ModificaveisImpl
     * @see arduino.impl.ArduinoPackageImpl#getAcoes_Modificaveis()
     * @generated
     */
    EClass ACOES_MODIFICAVEIS = eINSTANCE.getAcoes_Modificaveis();

    /**
     * The meta object literal for the '{@link arduino.impl.Mover_Frente_TempoImpl <em>Mover Frente Tempo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Mover_Frente_TempoImpl
     * @see arduino.impl.ArduinoPackageImpl#getMover_Frente_Tempo()
     * @generated
     */
    EClass MOVER_FRENTE_TEMPO = eINSTANCE.getMover_Frente_Tempo();

    /**
     * The meta object literal for the '{@link arduino.impl.Mover_Tras_TempoImpl <em>Mover Tras Tempo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Mover_Tras_TempoImpl
     * @see arduino.impl.ArduinoPackageImpl#getMover_Tras_Tempo()
     * @generated
     */
    EClass MOVER_TRAS_TEMPO = eINSTANCE.getMover_Tras_Tempo();

    /**
     * The meta object literal for the '{@link arduino.impl.Virar_para_X_GrausImpl <em>Virar para XGraus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Virar_para_X_GrausImpl
     * @see arduino.impl.ArduinoPackageImpl#getVirar_para_X_Graus()
     * @generated
     */
    EClass VIRAR_PARA_XGRAUS = eINSTANCE.getVirar_para_X_Graus();

    /**
     * The meta object literal for the '{@link arduino.impl.Virar_Max_DrtImpl <em>Virar Max Drt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Virar_Max_DrtImpl
     * @see arduino.impl.ArduinoPackageImpl#getVirar_Max_Drt()
     * @generated
     */
    EClass VIRAR_MAX_DRT = eINSTANCE.getVirar_Max_Drt();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRAR_MAX_DRT__NOME = eINSTANCE.getVirar_Max_Drt_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Virar_Max_EsqImpl <em>Virar Max Esq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Virar_Max_EsqImpl
     * @see arduino.impl.ArduinoPackageImpl#getVirar_Max_Esq()
     * @generated
     */
    EClass VIRAR_MAX_ESQ = eINSTANCE.getVirar_Max_Esq();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRAR_MAX_ESQ__NOME = eINSTANCE.getVirar_Max_Esq_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.CentrarImpl <em>Centrar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.CentrarImpl
     * @see arduino.impl.ArduinoPackageImpl#getCentrar()
     * @generated
     */
    EClass CENTRAR = eINSTANCE.getCentrar();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CENTRAR__NOME = eINSTANCE.getCentrar_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Virar_45_EsqImpl <em>Virar 45 Esq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Virar_45_EsqImpl
     * @see arduino.impl.ArduinoPackageImpl#getVirar_45_Esq()
     * @generated
     */
    EClass VIRAR_45_ESQ = eINSTANCE.getVirar_45_Esq();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRAR_45_ESQ__NOME = eINSTANCE.getVirar_45_Esq_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Virar_45_DrtImpl <em>Virar 45 Drt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Virar_45_DrtImpl
     * @see arduino.impl.ArduinoPackageImpl#getVirar_45_Drt()
     * @generated
     */
    EClass VIRAR_45_DRT = eINSTANCE.getVirar_45_Drt();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIRAR_45_DRT__NOME = eINSTANCE.getVirar_45_Drt_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Mover_AleatoriamenteImpl <em>Mover Aleatoriamente</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Mover_AleatoriamenteImpl
     * @see arduino.impl.ArduinoPackageImpl#getMover_Aleatoriamente()
     * @generated
     */
    EClass MOVER_ALEATORIAMENTE = eINSTANCE.getMover_Aleatoriamente();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MOVER_ALEATORIAMENTE__NOME = eINSTANCE.getMover_Aleatoriamente_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.LEDImpl <em>LED</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.LEDImpl
     * @see arduino.impl.ArduinoPackageImpl#getLED()
     * @generated
     */
    EClass LED = eINSTANCE.getLED();

    /**
     * The meta object literal for the '{@link arduino.impl.VerdeImpl <em>Verde</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.VerdeImpl
     * @see arduino.impl.ArduinoPackageImpl#getVerde()
     * @generated
     */
    EClass VERDE = eINSTANCE.getVerde();

    /**
     * The meta object literal for the '{@link arduino.impl.TricolorImpl <em>Tricolor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.TricolorImpl
     * @see arduino.impl.ArduinoPackageImpl#getTricolor()
     * @generated
     */
    EClass TRICOLOR = eINSTANCE.getTricolor();

    /**
     * The meta object literal for the '{@link arduino.impl.Ligar_LED_VerdeImpl <em>Ligar LED Verde</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Ligar_LED_VerdeImpl
     * @see arduino.impl.ArduinoPackageImpl#getLigar_LED_Verde()
     * @generated
     */
    EClass LIGAR_LED_VERDE = eINSTANCE.getLigar_LED_Verde();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIGAR_LED_VERDE__NOME = eINSTANCE.getLigar_LED_Verde_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Desligar_LED_VerdeImpl <em>Desligar LED Verde</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Desligar_LED_VerdeImpl
     * @see arduino.impl.ArduinoPackageImpl#getDesligar_LED_Verde()
     * @generated
     */
    EClass DESLIGAR_LED_VERDE = eINSTANCE.getDesligar_LED_Verde();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESLIGAR_LED_VERDE__NOME = eINSTANCE.getDesligar_LED_Verde_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Ligar_IntermitenciaImpl <em>Ligar Intermitencia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Ligar_IntermitenciaImpl
     * @see arduino.impl.ArduinoPackageImpl#getLigar_Intermitencia()
     * @generated
     */
    EClass LIGAR_INTERMITENCIA = eINSTANCE.getLigar_Intermitencia();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIGAR_INTERMITENCIA__NOME = eINSTANCE.getLigar_Intermitencia_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Desligar_IntermitenciaImpl <em>Desligar Intermitencia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Desligar_IntermitenciaImpl
     * @see arduino.impl.ArduinoPackageImpl#getDesligar_Intermitencia()
     * @generated
     */
    EClass DESLIGAR_INTERMITENCIA = eINSTANCE.getDesligar_Intermitencia();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESLIGAR_INTERMITENCIA__NOME = eINSTANCE.getDesligar_Intermitencia_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Varias_CoresImpl <em>Varias Cores</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Varias_CoresImpl
     * @see arduino.impl.ArduinoPackageImpl#getVarias_Cores()
     * @generated
     */
    EClass VARIAS_CORES = eINSTANCE.getVarias_Cores();

    /**
     * The meta object literal for the '{@link arduino.impl.Unica_CorImpl <em>Unica Cor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Unica_CorImpl
     * @see arduino.impl.ArduinoPackageImpl#getUnica_Cor()
     * @generated
     */
    EClass UNICA_COR = eINSTANCE.getUnica_Cor();

    /**
     * The meta object literal for the '{@link arduino.impl.Ligar_Cores_PoliciaImpl <em>Ligar Cores Policia</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Ligar_Cores_PoliciaImpl
     * @see arduino.impl.ArduinoPackageImpl#getLigar_Cores_Policia()
     * @generated
     */
    EClass LIGAR_CORES_POLICIA = eINSTANCE.getLigar_Cores_Policia();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIGAR_CORES_POLICIA__NOME = eINSTANCE.getLigar_Cores_Policia_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Ligar_Cores_Arco_IrisImpl <em>Ligar Cores Arco Iris</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Ligar_Cores_Arco_IrisImpl
     * @see arduino.impl.ArduinoPackageImpl#getLigar_Cores_Arco_Iris()
     * @generated
     */
    EClass LIGAR_CORES_ARCO_IRIS = eINSTANCE.getLigar_Cores_Arco_Iris();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIGAR_CORES_ARCO_IRIS__NOME = eINSTANCE.getLigar_Cores_Arco_Iris_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Ligar_AzulImpl <em>Ligar Azul</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Ligar_AzulImpl
     * @see arduino.impl.ArduinoPackageImpl#getLigar_Azul()
     * @generated
     */
    EClass LIGAR_AZUL = eINSTANCE.getLigar_Azul();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIGAR_AZUL__NOME = eINSTANCE.getLigar_Azul_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Ligar_VerdeImpl <em>Ligar Verde</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Ligar_VerdeImpl
     * @see arduino.impl.ArduinoPackageImpl#getLigar_Verde()
     * @generated
     */
    EClass LIGAR_VERDE = eINSTANCE.getLigar_Verde();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIGAR_VERDE__NOME = eINSTANCE.getLigar_Verde_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Ligar_VermelhoImpl <em>Ligar Vermelho</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Ligar_VermelhoImpl
     * @see arduino.impl.ArduinoPackageImpl#getLigar_Vermelho()
     * @generated
     */
    EClass LIGAR_VERMELHO = eINSTANCE.getLigar_Vermelho();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIGAR_VERMELHO__NOME = eINSTANCE.getLigar_Vermelho_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Desligar_CorImpl <em>Desligar Cor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Desligar_CorImpl
     * @see arduino.impl.ArduinoPackageImpl#getDesligar_Cor()
     * @generated
     */
    EClass DESLIGAR_COR = eINSTANCE.getDesligar_Cor();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESLIGAR_COR__NOME = eINSTANCE.getDesligar_Cor_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Desligar_CoresImpl <em>Desligar Cores</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Desligar_CoresImpl
     * @see arduino.impl.ArduinoPackageImpl#getDesligar_Cores()
     * @generated
     */
    EClass DESLIGAR_CORES = eINSTANCE.getDesligar_Cores();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESLIGAR_CORES__NOME = eINSTANCE.getDesligar_Cores_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Acoes_CondicionaisImpl <em>Acoes Condicionais</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Acoes_CondicionaisImpl
     * @see arduino.impl.ArduinoPackageImpl#getAcoes_Condicionais()
     * @generated
     */
    EClass ACOES_CONDICIONAIS = eINSTANCE.getAcoes_Condicionais();

    /**
     * The meta object literal for the '<em><b>Tem</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACOES_CONDICIONAIS__TEM = eINSTANCE.getAcoes_Condicionais_Tem();

    /**
     * The meta object literal for the '{@link arduino.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.WhileImpl
     * @see arduino.impl.ArduinoPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHILE__NOME = eINSTANCE.getWhile_Nome();

    /**
     * The meta object literal for the '<em><b>Corpo</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__CORPO = eINSTANCE.getWhile_Corpo();

    /**
     * The meta object literal for the '{@link arduino.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.IfImpl
     * @see arduino.impl.ArduinoPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF__NOME = eINSTANCE.getIf_Nome();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__THEN = eINSTANCE.getIf_Then();

    /**
     * The meta object literal for the '{@link arduino.impl.CondicaoImpl <em>Condicao</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.CondicaoImpl
     * @see arduino.impl.ArduinoPackageImpl#getCondicao()
     * @generated
     */
    EClass CONDICAO = eINSTANCE.getCondicao();

    /**
     * The meta object literal for the '{@link arduino.impl.Bumper_PressionadoImpl <em>Bumper Pressionado</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Bumper_PressionadoImpl
     * @see arduino.impl.ArduinoPackageImpl#getBumper_Pressionado()
     * @generated
     */
    EClass BUMPER_PRESSIONADO = eINSTANCE.getBumper_Pressionado();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUMPER_PRESSIONADO__NOME = eINSTANCE.getBumper_Pressionado_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Distancia_Infra_VermelhosImpl <em>Distancia Infra Vermelhos</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Distancia_Infra_VermelhosImpl
     * @see arduino.impl.ArduinoPackageImpl#getDistancia_Infra_Vermelhos()
     * @generated
     */
    EClass DISTANCIA_INFRA_VERMELHOS = eINSTANCE.getDistancia_Infra_Vermelhos();

    /**
     * The meta object literal for the '<em><b>Distancia</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISTANCIA_INFRA_VERMELHOS__DISTANCIA = eINSTANCE.getDistancia_Infra_Vermelhos_Distancia();

    /**
     * The meta object literal for the '{@link arduino.impl.CorpoImpl <em>Corpo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.CorpoImpl
     * @see arduino.impl.ArduinoPackageImpl#getCorpo()
     * @generated
     */
    EClass CORPO = eINSTANCE.getCorpo();

    /**
     * The meta object literal for the '<em><b>Evitar Obstaculo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORPO__EVITAR_OBSTACULO = eINSTANCE.getCorpo_EvitarObstaculo();

    /**
     * The meta object literal for the '{@link arduino.impl.Corpo_ModificavelImpl <em>Corpo Modificavel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Corpo_ModificavelImpl
     * @see arduino.impl.ArduinoPackageImpl#getCorpo_Modificavel()
     * @generated
     */
    EClass CORPO_MODIFICAVEL = eINSTANCE.getCorpo_Modificavel();

    /**
     * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORPO_MODIFICAVEL__TEMPO = eINSTANCE.getCorpo_Modificavel_Tempo();

    /**
     * The meta object literal for the '<em><b>Evitar Obstaculo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CORPO_MODIFICAVEL__EVITAR_OBSTACULO = eINSTANCE.getCorpo_Modificavel_EvitarObstaculo();

    /**
     * The meta object literal for the '{@link arduino.impl.CabecaImpl <em>Cabeca</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.CabecaImpl
     * @see arduino.impl.ArduinoPackageImpl#getCabeca()
     * @generated
     */
    EClass CABECA = eINSTANCE.getCabeca();

    /**
     * The meta object literal for the '{@link arduino.impl.Cabeca_ModificavelImpl <em>Cabeca Modificavel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Cabeca_ModificavelImpl
     * @see arduino.impl.ArduinoPackageImpl#getCabeca_Modificavel()
     * @generated
     */
    EClass CABECA_MODIFICAVEL = eINSTANCE.getCabeca_Modificavel();

    /**
     * The meta object literal for the '<em><b>Graus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CABECA_MODIFICAVEL__GRAUS = eINSTANCE.getCabeca_Modificavel_Graus();

    /**
     * The meta object literal for the '{@link arduino.impl.InicioImpl <em>Inicio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.InicioImpl
     * @see arduino.impl.ArduinoPackageImpl#getInicio()
     * @generated
     */
    EClass INICIO = eINSTANCE.getInicio();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INICIO__NOME = eINSTANCE.getInicio_Nome();

    /**
     * The meta object literal for the '<em><b>Evitar Obstaculo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INICIO__EVITAR_OBSTACULO = eINSTANCE.getInicio_EvitarObstaculo();

    /**
     * The meta object literal for the '{@link arduino.impl.FimImpl <em>Fim</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.FimImpl
     * @see arduino.impl.ArduinoPackageImpl#getFim()
     * @generated
     */
    EClass FIM = eINSTANCE.getFim();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIM__NOME = eINSTANCE.getFim_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.PararImpl <em>Parar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.PararImpl
     * @see arduino.impl.ArduinoPackageImpl#getParar()
     * @generated
     */
    EClass PARAR = eINSTANCE.getParar();

    /**
     * The meta object literal for the '<em><b>Nome</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAR__NOME = eINSTANCE.getParar_Nome();

    /**
     * The meta object literal for the '{@link arduino.impl.Parar_TempoImpl <em>Parar Tempo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see arduino.impl.Parar_TempoImpl
     * @see arduino.impl.ArduinoPackageImpl#getParar_Tempo()
     * @generated
     */
    EClass PARAR_TEMPO = eINSTANCE.getParar_Tempo();

  }

} //ArduinoPackage
