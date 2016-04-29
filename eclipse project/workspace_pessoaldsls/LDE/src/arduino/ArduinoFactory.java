/**
 */
package arduino;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduino.ArduinoPackage
 * @generated
 */
public interface ArduinoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ArduinoFactory eINSTANCE = arduino.impl.ArduinoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Robo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Robo</em>'.
   * @generated
   */
  Robo createRobo();

  /**
   * Returns a new object of class '<em>Transicoes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transicoes</em>'.
   * @generated
   */
  Transicoes createTransicoes();

  /**
   * Returns a new object of class '<em>Virar Esquerda</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virar Esquerda</em>'.
   * @generated
   */
  Virar_Esquerda createVirar_Esquerda();

  /**
   * Returns a new object of class '<em>Mover Frente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mover Frente</em>'.
   * @generated
   */
  Mover_Frente createMover_Frente();

  /**
   * Returns a new object of class '<em>Mover Tras</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mover Tras</em>'.
   * @generated
   */
  Mover_Tras createMover_Tras();

  /**
   * Returns a new object of class '<em>Virar Direita</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virar Direita</em>'.
   * @generated
   */
  Virar_Direita createVirar_Direita();

  /**
   * Returns a new object of class '<em>Rodar Esquerda Tempo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rodar Esquerda Tempo</em>'.
   * @generated
   */
  Rodar_Esquerda_Tempo createRodar_Esquerda_Tempo();

  /**
   * Returns a new object of class '<em>Rodar Direita Tempo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rodar Direita Tempo</em>'.
   * @generated
   */
  Rodar_Direita_Tempo createRodar_Direita_Tempo();

  /**
   * Returns a new object of class '<em>Mover Frente Tempo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mover Frente Tempo</em>'.
   * @generated
   */
  Mover_Frente_Tempo createMover_Frente_Tempo();

  /**
   * Returns a new object of class '<em>Mover Tras Tempo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mover Tras Tempo</em>'.
   * @generated
   */
  Mover_Tras_Tempo createMover_Tras_Tempo();

  /**
   * Returns a new object of class '<em>Virar para XGraus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virar para XGraus</em>'.
   * @generated
   */
  Virar_para_X_Graus createVirar_para_X_Graus();

  /**
   * Returns a new object of class '<em>Virar Max Drt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virar Max Drt</em>'.
   * @generated
   */
  Virar_Max_Drt createVirar_Max_Drt();

  /**
   * Returns a new object of class '<em>Virar Max Esq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virar Max Esq</em>'.
   * @generated
   */
  Virar_Max_Esq createVirar_Max_Esq();

  /**
   * Returns a new object of class '<em>Centrar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Centrar</em>'.
   * @generated
   */
  Centrar createCentrar();

  /**
   * Returns a new object of class '<em>Virar 45 Esq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virar 45 Esq</em>'.
   * @generated
   */
  Virar_45_Esq createVirar_45_Esq();

  /**
   * Returns a new object of class '<em>Virar 45 Drt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Virar 45 Drt</em>'.
   * @generated
   */
  Virar_45_Drt createVirar_45_Drt();

  /**
   * Returns a new object of class '<em>Mover Aleatoriamente</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mover Aleatoriamente</em>'.
   * @generated
   */
  Mover_Aleatoriamente createMover_Aleatoriamente();

  /**
   * Returns a new object of class '<em>Ligar LED Verde</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ligar LED Verde</em>'.
   * @generated
   */
  Ligar_LED_Verde createLigar_LED_Verde();

  /**
   * Returns a new object of class '<em>Desligar LED Verde</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Desligar LED Verde</em>'.
   * @generated
   */
  Desligar_LED_Verde createDesligar_LED_Verde();

  /**
   * Returns a new object of class '<em>Ligar Intermitencia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ligar Intermitencia</em>'.
   * @generated
   */
  Ligar_Intermitencia createLigar_Intermitencia();

  /**
   * Returns a new object of class '<em>Desligar Intermitencia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Desligar Intermitencia</em>'.
   * @generated
   */
  Desligar_Intermitencia createDesligar_Intermitencia();

  /**
   * Returns a new object of class '<em>Ligar Cores Policia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ligar Cores Policia</em>'.
   * @generated
   */
  Ligar_Cores_Policia createLigar_Cores_Policia();

  /**
   * Returns a new object of class '<em>Ligar Cores Arco Iris</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ligar Cores Arco Iris</em>'.
   * @generated
   */
  Ligar_Cores_Arco_Iris createLigar_Cores_Arco_Iris();

  /**
   * Returns a new object of class '<em>Ligar Azul</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ligar Azul</em>'.
   * @generated
   */
  Ligar_Azul createLigar_Azul();

  /**
   * Returns a new object of class '<em>Ligar Verde</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ligar Verde</em>'.
   * @generated
   */
  Ligar_Verde createLigar_Verde();

  /**
   * Returns a new object of class '<em>Ligar Vermelho</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ligar Vermelho</em>'.
   * @generated
   */
  Ligar_Vermelho createLigar_Vermelho();

  /**
   * Returns a new object of class '<em>Desligar Cor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Desligar Cor</em>'.
   * @generated
   */
  Desligar_Cor createDesligar_Cor();

  /**
   * Returns a new object of class '<em>Desligar Cores</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Desligar Cores</em>'.
   * @generated
   */
  Desligar_Cores createDesligar_Cores();

  /**
   * Returns a new object of class '<em>While</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While</em>'.
   * @generated
   */
  While createWhile();

  /**
   * Returns a new object of class '<em>If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If</em>'.
   * @generated
   */
  If createIf();

  /**
   * Returns a new object of class '<em>Bumper Pressionado</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bumper Pressionado</em>'.
   * @generated
   */
  Bumper_Pressionado createBumper_Pressionado();

  /**
   * Returns a new object of class '<em>Distancia Infra Vermelhos</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distancia Infra Vermelhos</em>'.
   * @generated
   */
  Distancia_Infra_Vermelhos createDistancia_Infra_Vermelhos();

  /**
   * Returns a new object of class '<em>Inicio</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Inicio</em>'.
   * @generated
   */
  Inicio createInicio();

  /**
   * Returns a new object of class '<em>Fim</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fim</em>'.
   * @generated
   */
  Fim createFim();

  /**
   * Returns a new object of class '<em>Parar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parar</em>'.
   * @generated
   */
  Parar createParar();

  /**
   * Returns a new object of class '<em>Parar Tempo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parar Tempo</em>'.
   * @generated
   */
  Parar_Tempo createParar_Tempo();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ArduinoPackage getArduinoPackage();

} //ArduinoFactory
