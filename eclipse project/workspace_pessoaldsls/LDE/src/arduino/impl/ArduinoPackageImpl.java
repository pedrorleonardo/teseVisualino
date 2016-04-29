/**
 */
package arduino.impl;

import arduino.Acao;
import arduino.Acoes_Condicionais;
import arduino.Acoes_Modificaveis;
import arduino.Acoes_Predefinidas;
import arduino.ArduinoFactory;
import arduino.ArduinoPackage;
import arduino.Bumper_Pressionado;
import arduino.Cabeca;
import arduino.Cabeca_Modificavel;
import arduino.Centrar;
import arduino.Condicao;
import arduino.Corpo;
import arduino.Corpo_Modificavel;
import arduino.Desligar_Cor;
import arduino.Desligar_Cores;
import arduino.Desligar_Intermitencia;
import arduino.Desligar_LED_Verde;
import arduino.Distancia_Infra_Vermelhos;
import arduino.Fim;
import arduino.If;
import arduino.Inicio;
import arduino.Ligar_Azul;
import arduino.Ligar_Cores_Arco_Iris;
import arduino.Ligar_Cores_Policia;
import arduino.Ligar_Intermitencia;
import arduino.Ligar_LED_Verde;
import arduino.Ligar_Verde;
import arduino.Ligar_Vermelho;
import arduino.Mover_Aleatoriamente;
import arduino.Mover_Frente;
import arduino.Mover_Frente_Tempo;
import arduino.Mover_Tras;
import arduino.Mover_Tras_Tempo;
import arduino.Parar;
import arduino.Parar_Tempo;
import arduino.Robo;
import arduino.Rodar_Direita_Tempo;
import arduino.Rodar_Esquerda_Tempo;
import arduino.Transicoes;
import arduino.Tricolor;
import arduino.Unica_Cor;
import arduino.Varias_Cores;
import arduino.Verde;
import arduino.Virar_45_Drt;
import arduino.Virar_45_Esq;
import arduino.Virar_Direita;
import arduino.Virar_Esquerda;
import arduino.Virar_Max_Drt;
import arduino.Virar_Max_Esq;
import arduino.Virar_para_X_Graus;
import arduino.While;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoPackageImpl extends EPackageImpl implements ArduinoPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roboEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transicoesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virar_EsquerdaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mover_FrenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mover_TrasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virar_DireitaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rodar_Esquerda_TempoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rodar_Direita_TempoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acoes_PredefinidasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acoes_ModificaveisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mover_Frente_TempoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mover_Tras_TempoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virar_para_X_GrausEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virar_Max_DrtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virar_Max_EsqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass centrarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virar_45_EsqEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass virar_45_DrtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mover_AleatoriamenteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ledEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verdeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tricolorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligar_LED_VerdeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass desligar_LED_VerdeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligar_IntermitenciaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass desligar_IntermitenciaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varias_CoresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unica_CorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligar_Cores_PoliciaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligar_Cores_Arco_IrisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligar_AzulEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligar_VerdeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ligar_VermelhoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass desligar_CorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass desligar_CoresEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acoes_CondicionaisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass condicaoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bumper_PressionadoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass distancia_Infra_VermelhosEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass corpoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass corpo_ModificavelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cabecaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cabeca_ModificavelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inicioEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fimEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pararEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parar_TempoEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see arduino.ArduinoPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ArduinoPackageImpl()
  {
    super(eNS_URI, ArduinoFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ArduinoPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ArduinoPackage init()
  {
    if (isInited) return (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

    // Obtain or create and register package
    ArduinoPackageImpl theArduinoPackage = (ArduinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArduinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArduinoPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theArduinoPackage.createPackageContents();

    // Initialize created meta-data
    theArduinoPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArduinoPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ArduinoPackage.eNS_URI, theArduinoPackage);
    return theArduinoPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRobo()
  {
    return roboEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobo_TemAcoes()
  {
    return (EReference)roboEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobo_TemTransicoes()
  {
    return (EReference)roboEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRobo_Nome()
  {
    return (EAttribute)roboEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRobo_TemCondicoes()
  {
    return (EReference)roboEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcao()
  {
    return acaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcao_Transicao_de_Entrada()
  {
    return (EReference)acaoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcao_Transicao_de_Saida()
  {
    return (EReference)acaoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransicoes()
  {
    return transicoesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransicoes_Acao_de_Entrada()
  {
    return (EReference)transicoesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransicoes_Acao_de_Saida()
  {
    return (EReference)transicoesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirar_Esquerda()
  {
    return virar_EsquerdaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirar_Esquerda_Nome()
  {
    return (EAttribute)virar_EsquerdaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMover_Frente()
  {
    return mover_FrenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMover_Frente_Nome()
  {
    return (EAttribute)mover_FrenteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMover_Tras()
  {
    return mover_TrasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMover_Tras_Nome()
  {
    return (EAttribute)mover_TrasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirar_Direita()
  {
    return virar_DireitaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirar_Direita_Nome()
  {
    return (EAttribute)virar_DireitaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRodar_Esquerda_Tempo()
  {
    return rodar_Esquerda_TempoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRodar_Direita_Tempo()
  {
    return rodar_Direita_TempoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcoes_Predefinidas()
  {
    return acoes_PredefinidasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcoes_Modificaveis()
  {
    return acoes_ModificaveisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMover_Frente_Tempo()
  {
    return mover_Frente_TempoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMover_Tras_Tempo()
  {
    return mover_Tras_TempoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirar_para_X_Graus()
  {
    return virar_para_X_GrausEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirar_Max_Drt()
  {
    return virar_Max_DrtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirar_Max_Drt_Nome()
  {
    return (EAttribute)virar_Max_DrtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirar_Max_Esq()
  {
    return virar_Max_EsqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirar_Max_Esq_Nome()
  {
    return (EAttribute)virar_Max_EsqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCentrar()
  {
    return centrarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCentrar_Nome()
  {
    return (EAttribute)centrarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirar_45_Esq()
  {
    return virar_45_EsqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirar_45_Esq_Nome()
  {
    return (EAttribute)virar_45_EsqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVirar_45_Drt()
  {
    return virar_45_DrtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVirar_45_Drt_Nome()
  {
    return (EAttribute)virar_45_DrtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMover_Aleatoriamente()
  {
    return mover_AleatoriamenteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMover_Aleatoriamente_Nome()
  {
    return (EAttribute)mover_AleatoriamenteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLED()
  {
    return ledEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerde()
  {
    return verdeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTricolor()
  {
    return tricolorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLigar_LED_Verde()
  {
    return ligar_LED_VerdeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLigar_LED_Verde_Nome()
  {
    return (EAttribute)ligar_LED_VerdeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesligar_LED_Verde()
  {
    return desligar_LED_VerdeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesligar_LED_Verde_Nome()
  {
    return (EAttribute)desligar_LED_VerdeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLigar_Intermitencia()
  {
    return ligar_IntermitenciaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLigar_Intermitencia_Nome()
  {
    return (EAttribute)ligar_IntermitenciaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesligar_Intermitencia()
  {
    return desligar_IntermitenciaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesligar_Intermitencia_Nome()
  {
    return (EAttribute)desligar_IntermitenciaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarias_Cores()
  {
    return varias_CoresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnica_Cor()
  {
    return unica_CorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLigar_Cores_Policia()
  {
    return ligar_Cores_PoliciaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLigar_Cores_Policia_Nome()
  {
    return (EAttribute)ligar_Cores_PoliciaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLigar_Cores_Arco_Iris()
  {
    return ligar_Cores_Arco_IrisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLigar_Cores_Arco_Iris_Nome()
  {
    return (EAttribute)ligar_Cores_Arco_IrisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLigar_Azul()
  {
    return ligar_AzulEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLigar_Azul_Nome()
  {
    return (EAttribute)ligar_AzulEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLigar_Verde()
  {
    return ligar_VerdeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLigar_Verde_Nome()
  {
    return (EAttribute)ligar_VerdeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLigar_Vermelho()
  {
    return ligar_VermelhoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLigar_Vermelho_Nome()
  {
    return (EAttribute)ligar_VermelhoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesligar_Cor()
  {
    return desligar_CorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesligar_Cor_Nome()
  {
    return (EAttribute)desligar_CorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDesligar_Cores()
  {
    return desligar_CoresEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDesligar_Cores_Nome()
  {
    return (EAttribute)desligar_CoresEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAcoes_Condicionais()
  {
    return acoes_CondicionaisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAcoes_Condicionais_Tem()
  {
    return (EReference)acoes_CondicionaisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhile()
  {
    return whileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhile_Nome()
  {
    return (EAttribute)whileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Corpo()
  {
    return (EReference)whileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIf()
  {
    return ifEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIf_Nome()
  {
    return (EAttribute)ifEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_Then()
  {
    return (EReference)ifEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCondicao()
  {
    return condicaoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBumper_Pressionado()
  {
    return bumper_PressionadoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBumper_Pressionado_Nome()
  {
    return (EAttribute)bumper_PressionadoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDistancia_Infra_Vermelhos()
  {
    return distancia_Infra_VermelhosEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDistancia_Infra_Vermelhos_Distancia()
  {
    return (EAttribute)distancia_Infra_VermelhosEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCorpo()
  {
    return corpoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCorpo_EvitarObstaculo()
  {
    return (EAttribute)corpoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCorpo_Modificavel()
  {
    return corpo_ModificavelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCorpo_Modificavel_Tempo()
  {
    return (EAttribute)corpo_ModificavelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCorpo_Modificavel_EvitarObstaculo()
  {
    return (EAttribute)corpo_ModificavelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCabeca()
  {
    return cabecaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCabeca_Modificavel()
  {
    return cabeca_ModificavelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCabeca_Modificavel_Graus()
  {
    return (EAttribute)cabeca_ModificavelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInicio()
  {
    return inicioEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInicio_Nome()
  {
    return (EAttribute)inicioEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInicio_EvitarObstaculo()
  {
    return (EAttribute)inicioEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFim()
  {
    return fimEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFim_Nome()
  {
    return (EAttribute)fimEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParar()
  {
    return pararEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParar_Nome()
  {
    return (EAttribute)pararEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParar_Tempo()
  {
    return parar_TempoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArduinoFactory getArduinoFactory()
  {
    return (ArduinoFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    roboEClass = createEClass(ROBO);
    createEReference(roboEClass, ROBO__TEM_ACOES);
    createEReference(roboEClass, ROBO__TEM_TRANSICOES);
    createEAttribute(roboEClass, ROBO__NOME);
    createEReference(roboEClass, ROBO__TEM_CONDICOES);

    acaoEClass = createEClass(ACAO);
    createEReference(acaoEClass, ACAO__TRANSICAO_DE_ENTRADA);
    createEReference(acaoEClass, ACAO__TRANSICAO_DE_SAIDA);

    transicoesEClass = createEClass(TRANSICOES);
    createEReference(transicoesEClass, TRANSICOES__ACAO_DE_ENTRADA);
    createEReference(transicoesEClass, TRANSICOES__ACAO_DE_SAIDA);

    virar_EsquerdaEClass = createEClass(VIRAR_ESQUERDA);
    createEAttribute(virar_EsquerdaEClass, VIRAR_ESQUERDA__NOME);

    mover_FrenteEClass = createEClass(MOVER_FRENTE);
    createEAttribute(mover_FrenteEClass, MOVER_FRENTE__NOME);

    mover_TrasEClass = createEClass(MOVER_TRAS);
    createEAttribute(mover_TrasEClass, MOVER_TRAS__NOME);

    virar_DireitaEClass = createEClass(VIRAR_DIREITA);
    createEAttribute(virar_DireitaEClass, VIRAR_DIREITA__NOME);

    rodar_Esquerda_TempoEClass = createEClass(RODAR_ESQUERDA_TEMPO);

    rodar_Direita_TempoEClass = createEClass(RODAR_DIREITA_TEMPO);

    acoes_PredefinidasEClass = createEClass(ACOES_PREDEFINIDAS);

    acoes_ModificaveisEClass = createEClass(ACOES_MODIFICAVEIS);

    mover_Frente_TempoEClass = createEClass(MOVER_FRENTE_TEMPO);

    mover_Tras_TempoEClass = createEClass(MOVER_TRAS_TEMPO);

    virar_para_X_GrausEClass = createEClass(VIRAR_PARA_XGRAUS);

    virar_Max_DrtEClass = createEClass(VIRAR_MAX_DRT);
    createEAttribute(virar_Max_DrtEClass, VIRAR_MAX_DRT__NOME);

    virar_Max_EsqEClass = createEClass(VIRAR_MAX_ESQ);
    createEAttribute(virar_Max_EsqEClass, VIRAR_MAX_ESQ__NOME);

    centrarEClass = createEClass(CENTRAR);
    createEAttribute(centrarEClass, CENTRAR__NOME);

    virar_45_EsqEClass = createEClass(VIRAR_45_ESQ);
    createEAttribute(virar_45_EsqEClass, VIRAR_45_ESQ__NOME);

    virar_45_DrtEClass = createEClass(VIRAR_45_DRT);
    createEAttribute(virar_45_DrtEClass, VIRAR_45_DRT__NOME);

    mover_AleatoriamenteEClass = createEClass(MOVER_ALEATORIAMENTE);
    createEAttribute(mover_AleatoriamenteEClass, MOVER_ALEATORIAMENTE__NOME);

    ledEClass = createEClass(LED);

    verdeEClass = createEClass(VERDE);

    tricolorEClass = createEClass(TRICOLOR);

    ligar_LED_VerdeEClass = createEClass(LIGAR_LED_VERDE);
    createEAttribute(ligar_LED_VerdeEClass, LIGAR_LED_VERDE__NOME);

    desligar_LED_VerdeEClass = createEClass(DESLIGAR_LED_VERDE);
    createEAttribute(desligar_LED_VerdeEClass, DESLIGAR_LED_VERDE__NOME);

    ligar_IntermitenciaEClass = createEClass(LIGAR_INTERMITENCIA);
    createEAttribute(ligar_IntermitenciaEClass, LIGAR_INTERMITENCIA__NOME);

    desligar_IntermitenciaEClass = createEClass(DESLIGAR_INTERMITENCIA);
    createEAttribute(desligar_IntermitenciaEClass, DESLIGAR_INTERMITENCIA__NOME);

    varias_CoresEClass = createEClass(VARIAS_CORES);

    unica_CorEClass = createEClass(UNICA_COR);

    ligar_Cores_PoliciaEClass = createEClass(LIGAR_CORES_POLICIA);
    createEAttribute(ligar_Cores_PoliciaEClass, LIGAR_CORES_POLICIA__NOME);

    ligar_Cores_Arco_IrisEClass = createEClass(LIGAR_CORES_ARCO_IRIS);
    createEAttribute(ligar_Cores_Arco_IrisEClass, LIGAR_CORES_ARCO_IRIS__NOME);

    ligar_AzulEClass = createEClass(LIGAR_AZUL);
    createEAttribute(ligar_AzulEClass, LIGAR_AZUL__NOME);

    ligar_VerdeEClass = createEClass(LIGAR_VERDE);
    createEAttribute(ligar_VerdeEClass, LIGAR_VERDE__NOME);

    ligar_VermelhoEClass = createEClass(LIGAR_VERMELHO);
    createEAttribute(ligar_VermelhoEClass, LIGAR_VERMELHO__NOME);

    desligar_CorEClass = createEClass(DESLIGAR_COR);
    createEAttribute(desligar_CorEClass, DESLIGAR_COR__NOME);

    desligar_CoresEClass = createEClass(DESLIGAR_CORES);
    createEAttribute(desligar_CoresEClass, DESLIGAR_CORES__NOME);

    acoes_CondicionaisEClass = createEClass(ACOES_CONDICIONAIS);
    createEReference(acoes_CondicionaisEClass, ACOES_CONDICIONAIS__TEM);

    whileEClass = createEClass(WHILE);
    createEAttribute(whileEClass, WHILE__NOME);
    createEReference(whileEClass, WHILE__CORPO);

    ifEClass = createEClass(IF);
    createEAttribute(ifEClass, IF__NOME);
    createEReference(ifEClass, IF__THEN);

    condicaoEClass = createEClass(CONDICAO);

    bumper_PressionadoEClass = createEClass(BUMPER_PRESSIONADO);
    createEAttribute(bumper_PressionadoEClass, BUMPER_PRESSIONADO__NOME);

    distancia_Infra_VermelhosEClass = createEClass(DISTANCIA_INFRA_VERMELHOS);
    createEAttribute(distancia_Infra_VermelhosEClass, DISTANCIA_INFRA_VERMELHOS__DISTANCIA);

    corpoEClass = createEClass(CORPO);
    createEAttribute(corpoEClass, CORPO__EVITAR_OBSTACULO);

    corpo_ModificavelEClass = createEClass(CORPO_MODIFICAVEL);
    createEAttribute(corpo_ModificavelEClass, CORPO_MODIFICAVEL__TEMPO);
    createEAttribute(corpo_ModificavelEClass, CORPO_MODIFICAVEL__EVITAR_OBSTACULO);

    cabecaEClass = createEClass(CABECA);

    cabeca_ModificavelEClass = createEClass(CABECA_MODIFICAVEL);
    createEAttribute(cabeca_ModificavelEClass, CABECA_MODIFICAVEL__GRAUS);

    inicioEClass = createEClass(INICIO);
    createEAttribute(inicioEClass, INICIO__NOME);
    createEAttribute(inicioEClass, INICIO__EVITAR_OBSTACULO);

    fimEClass = createEClass(FIM);
    createEAttribute(fimEClass, FIM__NOME);

    pararEClass = createEClass(PARAR);
    createEAttribute(pararEClass, PARAR__NOME);

    parar_TempoEClass = createEClass(PARAR_TEMPO);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    virar_EsquerdaEClass.getESuperTypes().add(this.getCorpo());
    mover_FrenteEClass.getESuperTypes().add(this.getCorpo());
    mover_TrasEClass.getESuperTypes().add(this.getCorpo());
    virar_DireitaEClass.getESuperTypes().add(this.getCorpo());
    rodar_Esquerda_TempoEClass.getESuperTypes().add(this.getCorpo_Modificavel());
    rodar_Direita_TempoEClass.getESuperTypes().add(this.getCorpo_Modificavel());
    acoes_PredefinidasEClass.getESuperTypes().add(this.getAcao());
    acoes_ModificaveisEClass.getESuperTypes().add(this.getAcao());
    mover_Frente_TempoEClass.getESuperTypes().add(this.getCorpo_Modificavel());
    mover_Tras_TempoEClass.getESuperTypes().add(this.getCorpo_Modificavel());
    virar_para_X_GrausEClass.getESuperTypes().add(this.getCabeca_Modificavel());
    virar_Max_DrtEClass.getESuperTypes().add(this.getCabeca());
    virar_Max_EsqEClass.getESuperTypes().add(this.getCabeca());
    centrarEClass.getESuperTypes().add(this.getCabeca());
    virar_45_EsqEClass.getESuperTypes().add(this.getCabeca());
    virar_45_DrtEClass.getESuperTypes().add(this.getCabeca());
    mover_AleatoriamenteEClass.getESuperTypes().add(this.getCorpo());
    ledEClass.getESuperTypes().add(this.getAcoes_Predefinidas());
    verdeEClass.getESuperTypes().add(this.getLED());
    tricolorEClass.getESuperTypes().add(this.getLED());
    ligar_LED_VerdeEClass.getESuperTypes().add(this.getVerde());
    desligar_LED_VerdeEClass.getESuperTypes().add(this.getVerde());
    ligar_IntermitenciaEClass.getESuperTypes().add(this.getVerde());
    desligar_IntermitenciaEClass.getESuperTypes().add(this.getVerde());
    varias_CoresEClass.getESuperTypes().add(this.getTricolor());
    unica_CorEClass.getESuperTypes().add(this.getTricolor());
    ligar_Cores_PoliciaEClass.getESuperTypes().add(this.getVarias_Cores());
    ligar_Cores_Arco_IrisEClass.getESuperTypes().add(this.getVarias_Cores());
    ligar_AzulEClass.getESuperTypes().add(this.getUnica_Cor());
    ligar_VerdeEClass.getESuperTypes().add(this.getUnica_Cor());
    ligar_VermelhoEClass.getESuperTypes().add(this.getUnica_Cor());
    desligar_CorEClass.getESuperTypes().add(this.getUnica_Cor());
    desligar_CoresEClass.getESuperTypes().add(this.getVarias_Cores());
    acoes_CondicionaisEClass.getESuperTypes().add(this.getAcao());
    whileEClass.getESuperTypes().add(this.getAcoes_Condicionais());
    ifEClass.getESuperTypes().add(this.getAcoes_Condicionais());
    bumper_PressionadoEClass.getESuperTypes().add(this.getCondicao());
    distancia_Infra_VermelhosEClass.getESuperTypes().add(this.getCondicao());
    corpoEClass.getESuperTypes().add(this.getAcoes_Predefinidas());
    corpo_ModificavelEClass.getESuperTypes().add(this.getAcoes_Modificaveis());
    cabecaEClass.getESuperTypes().add(this.getAcoes_Predefinidas());
    cabeca_ModificavelEClass.getESuperTypes().add(this.getAcoes_Modificaveis());
    inicioEClass.getESuperTypes().add(this.getAcao());
    fimEClass.getESuperTypes().add(this.getAcao());
    pararEClass.getESuperTypes().add(this.getCorpo());
    parar_TempoEClass.getESuperTypes().add(this.getCorpo_Modificavel());

    // Initialize classes and features; add operations and parameters
    initEClass(roboEClass, Robo.class, "Robo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRobo_TemAcoes(), this.getAcao(), null, "temAcoes", null, 0, -1, Robo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRobo_TemTransicoes(), this.getTransicoes(), null, "temTransicoes", null, 0, -1, Robo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRobo_Nome(), ecorePackage.getEString(), "Nome", null, 0, 1, Robo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRobo_TemCondicoes(), this.getCondicao(), null, "temCondicoes", null, 0, -1, Robo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acaoEClass, Acao.class, "Acao", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAcao_Transicao_de_Entrada(), this.getTransicoes(), this.getTransicoes_Acao_de_Saida(), "Transicao_de_Entrada", null, 0, 1, Acao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAcao_Transicao_de_Saida(), this.getTransicoes(), this.getTransicoes_Acao_de_Entrada(), "Transicao_de_Saida", null, 0, 1, Acao.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transicoesEClass, Transicoes.class, "Transicoes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransicoes_Acao_de_Entrada(), this.getAcao(), this.getAcao_Transicao_de_Saida(), "Acao_de_Entrada", null, 0, 1, Transicoes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransicoes_Acao_de_Saida(), this.getAcao(), this.getAcao_Transicao_de_Entrada(), "Acao_de_Saida", null, 0, 1, Transicoes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virar_EsquerdaEClass, Virar_Esquerda.class, "Virar_Esquerda", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirar_Esquerda_Nome(), ecorePackage.getEString(), "nome", "Virar Esquerda", 0, 1, Virar_Esquerda.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mover_FrenteEClass, Mover_Frente.class, "Mover_Frente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMover_Frente_Nome(), ecorePackage.getEString(), "nome", "Mover Frente", 0, 1, Mover_Frente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mover_TrasEClass, Mover_Tras.class, "Mover_Tras", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMover_Tras_Nome(), ecorePackage.getEString(), "nome", "Mover Tr\u00e1s", 0, 1, Mover_Tras.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virar_DireitaEClass, Virar_Direita.class, "Virar_Direita", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirar_Direita_Nome(), ecorePackage.getEString(), "nome", "Virar Direita", 0, 1, Virar_Direita.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rodar_Esquerda_TempoEClass, Rodar_Esquerda_Tempo.class, "Rodar_Esquerda_Tempo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rodar_Direita_TempoEClass, Rodar_Direita_Tempo.class, "Rodar_Direita_Tempo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(acoes_PredefinidasEClass, Acoes_Predefinidas.class, "Acoes_Predefinidas", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(acoes_ModificaveisEClass, Acoes_Modificaveis.class, "Acoes_Modificaveis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mover_Frente_TempoEClass, Mover_Frente_Tempo.class, "Mover_Frente_Tempo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mover_Tras_TempoEClass, Mover_Tras_Tempo.class, "Mover_Tras_Tempo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(virar_para_X_GrausEClass, Virar_para_X_Graus.class, "Virar_para_X_Graus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(virar_Max_DrtEClass, Virar_Max_Drt.class, "Virar_Max_Drt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirar_Max_Drt_Nome(), ecorePackage.getEString(), "nome", "Virar M\u00e1x. Direita", 0, 1, Virar_Max_Drt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virar_Max_EsqEClass, Virar_Max_Esq.class, "Virar_Max_Esq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirar_Max_Esq_Nome(), ecorePackage.getEString(), "nome", "Virar M\u00e1x. Esquerda", 0, 1, Virar_Max_Esq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(centrarEClass, Centrar.class, "Centrar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCentrar_Nome(), ecorePackage.getEString(), "nome", "Centrar", 0, 1, Centrar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virar_45_EsqEClass, Virar_45_Esq.class, "Virar_45_Esq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirar_45_Esq_Nome(), ecorePackage.getEString(), "nome", "Virar 45 Graus Esquerda", 0, 1, Virar_45_Esq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(virar_45_DrtEClass, Virar_45_Drt.class, "Virar_45_Drt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVirar_45_Drt_Nome(), ecorePackage.getEString(), "nome", "Virar 45 Graus Direita", 0, 1, Virar_45_Drt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mover_AleatoriamenteEClass, Mover_Aleatoriamente.class, "Mover_Aleatoriamente", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMover_Aleatoriamente_Nome(), ecorePackage.getEString(), "nome", "Mover Aleatoriamente", 0, 1, Mover_Aleatoriamente.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ledEClass, arduino.LED.class, "LED", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(verdeEClass, Verde.class, "Verde", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tricolorEClass, Tricolor.class, "Tricolor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ligar_LED_VerdeEClass, Ligar_LED_Verde.class, "Ligar_LED_Verde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLigar_LED_Verde_Nome(), ecorePackage.getEString(), "nome", "Ligar LED Verde", 0, 1, Ligar_LED_Verde.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(desligar_LED_VerdeEClass, Desligar_LED_Verde.class, "Desligar_LED_Verde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesligar_LED_Verde_Nome(), ecorePackage.getEString(), "nome", "Desligar LED Verde", 0, 1, Desligar_LED_Verde.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ligar_IntermitenciaEClass, Ligar_Intermitencia.class, "Ligar_Intermitencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLigar_Intermitencia_Nome(), ecorePackage.getEString(), "nome", "Ligar Intermit\u00eancia", 0, 1, Ligar_Intermitencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(desligar_IntermitenciaEClass, Desligar_Intermitencia.class, "Desligar_Intermitencia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesligar_Intermitencia_Nome(), ecorePackage.getEString(), "nome", "Desligar Intermit\u00eancia", 0, 1, Desligar_Intermitencia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varias_CoresEClass, Varias_Cores.class, "Varias_Cores", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unica_CorEClass, Unica_Cor.class, "Unica_Cor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ligar_Cores_PoliciaEClass, Ligar_Cores_Policia.class, "Ligar_Cores_Policia", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLigar_Cores_Policia_Nome(), ecorePackage.getEString(), "nome", "Ligar Cores Pol\u00edcia", 0, 1, Ligar_Cores_Policia.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ligar_Cores_Arco_IrisEClass, Ligar_Cores_Arco_Iris.class, "Ligar_Cores_Arco_Iris", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLigar_Cores_Arco_Iris_Nome(), ecorePackage.getEString(), "nome", "Ligar Cores Arco-\u00cdris", 0, 1, Ligar_Cores_Arco_Iris.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ligar_AzulEClass, Ligar_Azul.class, "Ligar_Azul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLigar_Azul_Nome(), ecorePackage.getEString(), "nome", "Ligar Azul", 0, 1, Ligar_Azul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ligar_VerdeEClass, Ligar_Verde.class, "Ligar_Verde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLigar_Verde_Nome(), ecorePackage.getEString(), "nome", "Ligar Verde", 0, 1, Ligar_Verde.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ligar_VermelhoEClass, Ligar_Vermelho.class, "Ligar_Vermelho", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLigar_Vermelho_Nome(), ecorePackage.getEString(), "nome", "Ligar Vermelho", 0, 1, Ligar_Vermelho.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(desligar_CorEClass, Desligar_Cor.class, "Desligar_Cor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesligar_Cor_Nome(), ecorePackage.getEString(), "nome", "Desligar Luz", 0, 1, Desligar_Cor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(desligar_CoresEClass, Desligar_Cores.class, "Desligar_Cores", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDesligar_Cores_Nome(), ecorePackage.getEString(), "nome", "Desligar Cores", 0, 1, Desligar_Cores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acoes_CondicionaisEClass, Acoes_Condicionais.class, "Acoes_Condicionais", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAcoes_Condicionais_Tem(), this.getCondicao(), null, "tem", null, 1, 1, Acoes_Condicionais.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWhile_Nome(), ecorePackage.getEString(), "nome", "While", 0, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhile_Corpo(), this.getAcao(), null, "corpo", null, 1, 1, While.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIf_Nome(), ecorePackage.getEString(), "nome", "If", 0, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_Then(), this.getAcao(), null, "then", null, 1, 1, If.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(condicaoEClass, Condicao.class, "Condicao", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bumper_PressionadoEClass, Bumper_Pressionado.class, "Bumper_Pressionado", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBumper_Pressionado_Nome(), ecorePackage.getEString(), "nome", "Bumper", 0, 1, Bumper_Pressionado.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(distancia_Infra_VermelhosEClass, Distancia_Infra_Vermelhos.class, "Distancia_Infra_Vermelhos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDistancia_Infra_Vermelhos_Distancia(), ecorePackage.getEInt(), "distancia", null, 0, 1, Distancia_Infra_Vermelhos.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(corpoEClass, Corpo.class, "Corpo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCorpo_EvitarObstaculo(), ecorePackage.getEBoolean(), "evitarObstaculo", null, 0, 1, Corpo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(corpo_ModificavelEClass, Corpo_Modificavel.class, "Corpo_Modificavel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCorpo_Modificavel_Tempo(), ecorePackage.getEInt(), "tempo", null, 0, 1, Corpo_Modificavel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCorpo_Modificavel_EvitarObstaculo(), ecorePackage.getEBoolean(), "evitarObstaculo", null, 0, 1, Corpo_Modificavel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cabecaEClass, Cabeca.class, "Cabeca", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cabeca_ModificavelEClass, Cabeca_Modificavel.class, "Cabeca_Modificavel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCabeca_Modificavel_Graus(), ecorePackage.getEInt(), "graus", null, 0, 1, Cabeca_Modificavel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inicioEClass, Inicio.class, "Inicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInicio_Nome(), ecorePackage.getEString(), "nome", "In\u00edcio", 0, 1, Inicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInicio_EvitarObstaculo(), ecorePackage.getEBoolean(), "evitarObstaculo", null, 0, 1, Inicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fimEClass, Fim.class, "Fim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFim_Nome(), ecorePackage.getEString(), "nome", "Fim", 0, 1, Fim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pararEClass, Parar.class, "Parar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParar_Nome(), ecorePackage.getEString(), "nome", "Parar", 0, 1, Parar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parar_TempoEClass, Parar_Tempo.class, "Parar_Tempo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.link
    createGmf_2Annotations();
    // gmf.node
    createGmf_3Annotations();
    // gmf.compartment
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																																					
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (roboEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																																				
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.link";				
    addAnnotation
      (transicoesEClass, 
       source, 
       new String[] 
       {
       "source", "Acao_de_Entrada",
       "target", "Acao_de_Saida",
       "target.decoration", "filledclosedarrow",
       "width", "2"
       });																																			
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.node";					
    addAnnotation
      (virar_EsquerdaEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (mover_FrenteEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (mover_TrasEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (virar_DireitaEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (rodar_Esquerda_TempoEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "tempo"
       });		
    addAnnotation
      (rodar_Direita_TempoEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "color", "64,207,255",
       "label", "tempo"
       });		
    addAnnotation
      (mover_Frente_TempoEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "tempo"
       });		
    addAnnotation
      (mover_Tras_TempoEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "tempo"
       });		
    addAnnotation
      (virar_para_X_GrausEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,130,253",
       "color", "255,130,253",
       "label", "graus"
       });		
    addAnnotation
      (virar_Max_DrtEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,130,253",
       "color", "255,130,253",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (virar_Max_EsqEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,130,253",
       "color", "255,130,253",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (centrarEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,130,253",
       "color", "255,130,253",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (virar_45_EsqEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,130,253",
       "color", "255,130,253",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (virar_45_DrtEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,130,253",
       "color", "255,130,253",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (mover_AleatoriamenteEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (ligar_LED_VerdeEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (desligar_LED_VerdeEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (ligar_IntermitenciaEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (desligar_IntermitenciaEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (ligar_Cores_PoliciaEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (ligar_Cores_Arco_IrisEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (ligar_AzulEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (ligar_VerdeEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (ligar_VermelhoEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (desligar_CorEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (desligar_CoresEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,255,64",
       "color", "255,255,64",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (whileEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "214,214,214",
       "color", "214,214,214",
       "label", "nome",
       "label.readOnly", "true"
       });			
    addAnnotation
      (ifEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "214,214,214",
       "color", "214,214,214",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (bumper_PressionadoEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "214,214,214",
       "color", "214,214,214",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (distancia_Infra_VermelhosEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "214,214,214",
       "color", "214,214,214",
       "label", "distancia"
       });		
    addAnnotation
      (inicioEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "0,255,0",
       "color", "0,255,0",
       "label", "nome",
       "label.readOnly", "true",
       "label.icon", "false"
       });		
    addAnnotation
      (fimEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "255,0,0",
       "color", "255,0,0",
       "label", "nome",
       "label.readOnly", "true",
       "label.icon", "false"
       });		
    addAnnotation
      (pararEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "nome",
       "label.readOnly", "true"
       });		
    addAnnotation
      (parar_TempoEClass, 
       source, 
       new String[] 
       {
       "figure", "ellipse",
       "border.color", "64,207,255",
       "color", "64,207,255",
       "label", "tempo"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.compartment";																																
    addAnnotation
      (getWhile_Corpo(), 
       source, 
       new String[] 
       {
       });							
  }

} //ArduinoPackageImpl
