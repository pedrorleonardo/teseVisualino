/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Desligar_LED_Verde;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Desligar LED Verde</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Desligar_LED_VerdeTest extends VerdeTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Desligar_LED_VerdeTest.class);
  }

  /**
   * Constructs a new Desligar LED Verde test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Desligar_LED_VerdeTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Desligar LED Verde test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Desligar_LED_Verde getFixture()
  {
    return (Desligar_LED_Verde)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createDesligar_LED_Verde());
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

} //Desligar_LED_VerdeTest
