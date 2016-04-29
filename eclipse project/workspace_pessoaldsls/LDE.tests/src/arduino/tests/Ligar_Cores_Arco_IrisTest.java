/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Ligar_Cores_Arco_Iris;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ligar Cores Arco Iris</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ligar_Cores_Arco_IrisTest extends Varias_CoresTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Ligar_Cores_Arco_IrisTest.class);
  }

  /**
   * Constructs a new Ligar Cores Arco Iris test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_Cores_Arco_IrisTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Ligar Cores Arco Iris test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Ligar_Cores_Arco_Iris getFixture()
  {
    return (Ligar_Cores_Arco_Iris)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createLigar_Cores_Arco_Iris());
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

} //Ligar_Cores_Arco_IrisTest
