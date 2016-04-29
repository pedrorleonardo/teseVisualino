/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Ligar_Cores_Policia;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ligar Cores Policia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ligar_Cores_PoliciaTest extends Varias_CoresTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Ligar_Cores_PoliciaTest.class);
  }

  /**
   * Constructs a new Ligar Cores Policia test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_Cores_PoliciaTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Ligar Cores Policia test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Ligar_Cores_Policia getFixture()
  {
    return (Ligar_Cores_Policia)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createLigar_Cores_Policia());
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

} //Ligar_Cores_PoliciaTest
