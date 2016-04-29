/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Distancia_Infra_Vermelhos;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Distancia Infra Vermelhos</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Distancia_Infra_VermelhosTest extends CondicaoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Distancia_Infra_VermelhosTest.class);
  }

  /**
   * Constructs a new Distancia Infra Vermelhos test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Distancia_Infra_VermelhosTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Distancia Infra Vermelhos test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Distancia_Infra_Vermelhos getFixture()
  {
    return (Distancia_Infra_Vermelhos)fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(ArduinoFactory.eINSTANCE.createDistancia_Infra_Vermelhos());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //Distancia_Infra_VermelhosTest
