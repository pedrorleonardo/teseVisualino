/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Virar_45_Drt;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virar 45 Drt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Virar_45_DrtTest extends CabecaTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Virar_45_DrtTest.class);
  }

  /**
   * Constructs a new Virar 45 Drt test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_45_DrtTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Virar 45 Drt test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Virar_45_Drt getFixture()
  {
    return (Virar_45_Drt)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createVirar_45_Drt());
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

} //Virar_45_DrtTest
