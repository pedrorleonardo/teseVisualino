/**
 */
package arduino.util;

import arduino.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arduino.ArduinoPackage
 * @generated
 */
public class ArduinoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArduinoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArduinoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ArduinoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArduinoSwitch<Adapter> modelSwitch =
    new ArduinoSwitch<Adapter>()
    {
      @Override
      public Adapter caseRobo(Robo object)
      {
        return createRoboAdapter();
      }
      @Override
      public Adapter caseAcao(Acao object)
      {
        return createAcaoAdapter();
      }
      @Override
      public Adapter caseTransicoes(Transicoes object)
      {
        return createTransicoesAdapter();
      }
      @Override
      public Adapter caseVirar_Esquerda(Virar_Esquerda object)
      {
        return createVirar_EsquerdaAdapter();
      }
      @Override
      public Adapter caseMover_Frente(Mover_Frente object)
      {
        return createMover_FrenteAdapter();
      }
      @Override
      public Adapter caseMover_Tras(Mover_Tras object)
      {
        return createMover_TrasAdapter();
      }
      @Override
      public Adapter caseVirar_Direita(Virar_Direita object)
      {
        return createVirar_DireitaAdapter();
      }
      @Override
      public Adapter caseRodar_Esquerda_Tempo(Rodar_Esquerda_Tempo object)
      {
        return createRodar_Esquerda_TempoAdapter();
      }
      @Override
      public Adapter caseRodar_Direita_Tempo(Rodar_Direita_Tempo object)
      {
        return createRodar_Direita_TempoAdapter();
      }
      @Override
      public Adapter caseAcoes_Predefinidas(Acoes_Predefinidas object)
      {
        return createAcoes_PredefinidasAdapter();
      }
      @Override
      public Adapter caseAcoes_Modificaveis(Acoes_Modificaveis object)
      {
        return createAcoes_ModificaveisAdapter();
      }
      @Override
      public Adapter caseMover_Frente_Tempo(Mover_Frente_Tempo object)
      {
        return createMover_Frente_TempoAdapter();
      }
      @Override
      public Adapter caseMover_Tras_Tempo(Mover_Tras_Tempo object)
      {
        return createMover_Tras_TempoAdapter();
      }
      @Override
      public Adapter caseVirar_para_X_Graus(Virar_para_X_Graus object)
      {
        return createVirar_para_X_GrausAdapter();
      }
      @Override
      public Adapter caseVirar_Max_Drt(Virar_Max_Drt object)
      {
        return createVirar_Max_DrtAdapter();
      }
      @Override
      public Adapter caseVirar_Max_Esq(Virar_Max_Esq object)
      {
        return createVirar_Max_EsqAdapter();
      }
      @Override
      public Adapter caseCentrar(Centrar object)
      {
        return createCentrarAdapter();
      }
      @Override
      public Adapter caseVirar_45_Esq(Virar_45_Esq object)
      {
        return createVirar_45_EsqAdapter();
      }
      @Override
      public Adapter caseVirar_45_Drt(Virar_45_Drt object)
      {
        return createVirar_45_DrtAdapter();
      }
      @Override
      public Adapter caseMover_Aleatoriamente(Mover_Aleatoriamente object)
      {
        return createMover_AleatoriamenteAdapter();
      }
      @Override
      public Adapter caseLED(LED object)
      {
        return createLEDAdapter();
      }
      @Override
      public Adapter caseVerde(Verde object)
      {
        return createVerdeAdapter();
      }
      @Override
      public Adapter caseTricolor(Tricolor object)
      {
        return createTricolorAdapter();
      }
      @Override
      public Adapter caseLigar_LED_Verde(Ligar_LED_Verde object)
      {
        return createLigar_LED_VerdeAdapter();
      }
      @Override
      public Adapter caseDesligar_LED_Verde(Desligar_LED_Verde object)
      {
        return createDesligar_LED_VerdeAdapter();
      }
      @Override
      public Adapter caseLigar_Intermitencia(Ligar_Intermitencia object)
      {
        return createLigar_IntermitenciaAdapter();
      }
      @Override
      public Adapter caseDesligar_Intermitencia(Desligar_Intermitencia object)
      {
        return createDesligar_IntermitenciaAdapter();
      }
      @Override
      public Adapter caseVarias_Cores(Varias_Cores object)
      {
        return createVarias_CoresAdapter();
      }
      @Override
      public Adapter caseUnica_Cor(Unica_Cor object)
      {
        return createUnica_CorAdapter();
      }
      @Override
      public Adapter caseLigar_Cores_Policia(Ligar_Cores_Policia object)
      {
        return createLigar_Cores_PoliciaAdapter();
      }
      @Override
      public Adapter caseLigar_Cores_Arco_Iris(Ligar_Cores_Arco_Iris object)
      {
        return createLigar_Cores_Arco_IrisAdapter();
      }
      @Override
      public Adapter caseLigar_Azul(Ligar_Azul object)
      {
        return createLigar_AzulAdapter();
      }
      @Override
      public Adapter caseLigar_Verde(Ligar_Verde object)
      {
        return createLigar_VerdeAdapter();
      }
      @Override
      public Adapter caseLigar_Vermelho(Ligar_Vermelho object)
      {
        return createLigar_VermelhoAdapter();
      }
      @Override
      public Adapter caseDesligar_Cor(Desligar_Cor object)
      {
        return createDesligar_CorAdapter();
      }
      @Override
      public Adapter caseDesligar_Cores(Desligar_Cores object)
      {
        return createDesligar_CoresAdapter();
      }
      @Override
      public Adapter caseAcoes_Condicionais(Acoes_Condicionais object)
      {
        return createAcoes_CondicionaisAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseIf(If object)
      {
        return createIfAdapter();
      }
      @Override
      public Adapter caseCondicao(Condicao object)
      {
        return createCondicaoAdapter();
      }
      @Override
      public Adapter caseBumper_Pressionado(Bumper_Pressionado object)
      {
        return createBumper_PressionadoAdapter();
      }
      @Override
      public Adapter caseDistancia_Infra_Vermelhos(Distancia_Infra_Vermelhos object)
      {
        return createDistancia_Infra_VermelhosAdapter();
      }
      @Override
      public Adapter caseCorpo(Corpo object)
      {
        return createCorpoAdapter();
      }
      @Override
      public Adapter caseCorpo_Modificavel(Corpo_Modificavel object)
      {
        return createCorpo_ModificavelAdapter();
      }
      @Override
      public Adapter caseCabeca(Cabeca object)
      {
        return createCabecaAdapter();
      }
      @Override
      public Adapter caseCabeca_Modificavel(Cabeca_Modificavel object)
      {
        return createCabeca_ModificavelAdapter();
      }
      @Override
      public Adapter caseInicio(Inicio object)
      {
        return createInicioAdapter();
      }
      @Override
      public Adapter caseFim(Fim object)
      {
        return createFimAdapter();
      }
      @Override
      public Adapter caseParar(Parar object)
      {
        return createPararAdapter();
      }
      @Override
      public Adapter caseParar_Tempo(Parar_Tempo object)
      {
        return createParar_TempoAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link arduino.Robo <em>Robo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Robo
   * @generated
   */
  public Adapter createRoboAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Acao <em>Acao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Acao
   * @generated
   */
  public Adapter createAcaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Transicoes <em>Transicoes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Transicoes
   * @generated
   */
  public Adapter createTransicoesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Virar_Esquerda <em>Virar Esquerda</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Virar_Esquerda
   * @generated
   */
  public Adapter createVirar_EsquerdaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Mover_Frente <em>Mover Frente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Mover_Frente
   * @generated
   */
  public Adapter createMover_FrenteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Mover_Tras <em>Mover Tras</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Mover_Tras
   * @generated
   */
  public Adapter createMover_TrasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Virar_Direita <em>Virar Direita</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Virar_Direita
   * @generated
   */
  public Adapter createVirar_DireitaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Rodar_Esquerda_Tempo <em>Rodar Esquerda Tempo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Rodar_Esquerda_Tempo
   * @generated
   */
  public Adapter createRodar_Esquerda_TempoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Rodar_Direita_Tempo <em>Rodar Direita Tempo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Rodar_Direita_Tempo
   * @generated
   */
  public Adapter createRodar_Direita_TempoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Acoes_Predefinidas <em>Acoes Predefinidas</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Acoes_Predefinidas
   * @generated
   */
  public Adapter createAcoes_PredefinidasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Acoes_Modificaveis <em>Acoes Modificaveis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Acoes_Modificaveis
   * @generated
   */
  public Adapter createAcoes_ModificaveisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Mover_Frente_Tempo <em>Mover Frente Tempo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Mover_Frente_Tempo
   * @generated
   */
  public Adapter createMover_Frente_TempoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Mover_Tras_Tempo <em>Mover Tras Tempo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Mover_Tras_Tempo
   * @generated
   */
  public Adapter createMover_Tras_TempoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Virar_para_X_Graus <em>Virar para XGraus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Virar_para_X_Graus
   * @generated
   */
  public Adapter createVirar_para_X_GrausAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Virar_Max_Drt <em>Virar Max Drt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Virar_Max_Drt
   * @generated
   */
  public Adapter createVirar_Max_DrtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Virar_Max_Esq <em>Virar Max Esq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Virar_Max_Esq
   * @generated
   */
  public Adapter createVirar_Max_EsqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Centrar <em>Centrar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Centrar
   * @generated
   */
  public Adapter createCentrarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Virar_45_Esq <em>Virar 45 Esq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Virar_45_Esq
   * @generated
   */
  public Adapter createVirar_45_EsqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Virar_45_Drt <em>Virar 45 Drt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Virar_45_Drt
   * @generated
   */
  public Adapter createVirar_45_DrtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Mover_Aleatoriamente <em>Mover Aleatoriamente</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Mover_Aleatoriamente
   * @generated
   */
  public Adapter createMover_AleatoriamenteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.LED <em>LED</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.LED
   * @generated
   */
  public Adapter createLEDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Verde <em>Verde</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Verde
   * @generated
   */
  public Adapter createVerdeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Tricolor <em>Tricolor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Tricolor
   * @generated
   */
  public Adapter createTricolorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Ligar_LED_Verde <em>Ligar LED Verde</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Ligar_LED_Verde
   * @generated
   */
  public Adapter createLigar_LED_VerdeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Desligar_LED_Verde <em>Desligar LED Verde</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Desligar_LED_Verde
   * @generated
   */
  public Adapter createDesligar_LED_VerdeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Ligar_Intermitencia <em>Ligar Intermitencia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Ligar_Intermitencia
   * @generated
   */
  public Adapter createLigar_IntermitenciaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Desligar_Intermitencia <em>Desligar Intermitencia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Desligar_Intermitencia
   * @generated
   */
  public Adapter createDesligar_IntermitenciaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Varias_Cores <em>Varias Cores</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Varias_Cores
   * @generated
   */
  public Adapter createVarias_CoresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Unica_Cor <em>Unica Cor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Unica_Cor
   * @generated
   */
  public Adapter createUnica_CorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Ligar_Cores_Policia <em>Ligar Cores Policia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Ligar_Cores_Policia
   * @generated
   */
  public Adapter createLigar_Cores_PoliciaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Ligar_Cores_Arco_Iris <em>Ligar Cores Arco Iris</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Ligar_Cores_Arco_Iris
   * @generated
   */
  public Adapter createLigar_Cores_Arco_IrisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Ligar_Azul <em>Ligar Azul</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Ligar_Azul
   * @generated
   */
  public Adapter createLigar_AzulAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Ligar_Verde <em>Ligar Verde</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Ligar_Verde
   * @generated
   */
  public Adapter createLigar_VerdeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Ligar_Vermelho <em>Ligar Vermelho</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Ligar_Vermelho
   * @generated
   */
  public Adapter createLigar_VermelhoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Desligar_Cor <em>Desligar Cor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Desligar_Cor
   * @generated
   */
  public Adapter createDesligar_CorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Desligar_Cores <em>Desligar Cores</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Desligar_Cores
   * @generated
   */
  public Adapter createDesligar_CoresAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Acoes_Condicionais <em>Acoes Condicionais</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Acoes_Condicionais
   * @generated
   */
  public Adapter createAcoes_CondicionaisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.If
   * @generated
   */
  public Adapter createIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Condicao <em>Condicao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Condicao
   * @generated
   */
  public Adapter createCondicaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Bumper_Pressionado <em>Bumper Pressionado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Bumper_Pressionado
   * @generated
   */
  public Adapter createBumper_PressionadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Distancia_Infra_Vermelhos <em>Distancia Infra Vermelhos</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Distancia_Infra_Vermelhos
   * @generated
   */
  public Adapter createDistancia_Infra_VermelhosAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Corpo <em>Corpo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Corpo
   * @generated
   */
  public Adapter createCorpoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Corpo_Modificavel <em>Corpo Modificavel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Corpo_Modificavel
   * @generated
   */
  public Adapter createCorpo_ModificavelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Cabeca <em>Cabeca</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Cabeca
   * @generated
   */
  public Adapter createCabecaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Cabeca_Modificavel <em>Cabeca Modificavel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Cabeca_Modificavel
   * @generated
   */
  public Adapter createCabeca_ModificavelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Inicio <em>Inicio</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Inicio
   * @generated
   */
  public Adapter createInicioAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Fim <em>Fim</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Fim
   * @generated
   */
  public Adapter createFimAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Parar <em>Parar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Parar
   * @generated
   */
  public Adapter createPararAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link arduino.Parar_Tempo <em>Parar Tempo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see arduino.Parar_Tempo
   * @generated
   */
  public Adapter createParar_TempoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ArduinoAdapterFactory
