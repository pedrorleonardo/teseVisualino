/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Bumper_Pressionado;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bumper Pressionado</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bumper_PressionadoTest extends CondicaoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Bumper_PressionadoTest.class);
  }

  /**
   * Constructs a new Bumper Pressionado test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bumper_PressionadoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Bumper Pressionado test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Bumper_Pressionado getFixture()
  {
    return (Bumper_Pressionado)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createBumper_Pressionado());
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

} //Bumper_PressionadoTest
