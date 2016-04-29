/**
 */
package farrusco;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see farrusco.FarruscoPackage
 * @generated
 */
public interface FarruscoFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FarruscoFactory eINSTANCE = farrusco.impl.FarruscoFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Robot</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Robot</em>'.
   * @generated
   */
  Robot createRobot();

  /**
   * Returns a new object of class '<em>Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node</em>'.
   * @generated
   */
  Node createNode();

  /**
   * Returns a new object of class '<em>Filho</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filho</em>'.
   * @generated
   */
  Filho createFilho();

  /**
   * Returns a new object of class '<em>Irmao</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Irmao</em>'.
   * @generated
   */
  Irmao createIrmao();

  /**
   * Returns a new object of class '<em>Behavior</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Behavior</em>'.
   * @generated
   */
  Behavior createBehavior();

  /**
   * Returns a new object of class '<em>Prioridade</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prioridade</em>'.
   * @generated
   */
  Prioridade createPrioridade();

  /**
   * Returns a new object of class '<em>Paralelo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Paralelo</em>'.
   * @generated
   */
  Paralelo createParalelo();

  /**
   * Returns a new object of class '<em>Sequencial</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sequencial</em>'.
   * @generated
   */
  Sequencial createSequencial();

  /**
   * Returns a new object of class '<em>Alterar Estado</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alterar Estado</em>'.
   * @generated
   */
  AlterarEstado createAlterarEstado();

  /**
   * Returns a new object of class '<em>Distancia</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Distancia</em>'.
   * @generated
   */
  Distancia createDistancia();

  /**
   * Returns a new object of class '<em>Bumpers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bumpers</em>'.
   * @generated
   */
  Bumpers createBumpers();

  /**
   * Returns a new object of class '<em>Espera</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Espera</em>'.
   * @generated
   */
  Espera createEspera();

  /**
   * Returns a new object of class '<em>Motor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Motor</em>'.
   * @generated
   */
  Motor createMotor();

  /**
   * Returns a new object of class '<em>Servo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Servo</em>'.
   * @generated
   */
  Servo createServo();

  /**
   * Returns a new object of class '<em>LED</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LED</em>'.
   * @generated
   */
  LED createLED();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FarruscoPackage getFarruscoPackage();

} //FarruscoFactory
