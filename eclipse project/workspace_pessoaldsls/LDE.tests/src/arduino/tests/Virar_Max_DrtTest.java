/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Virar_Max_Drt;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virar Max Drt</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Virar_Max_DrtTest extends CabecaTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Virar_Max_DrtTest.class);
  }

  /**
   * Constructs a new Virar Max Drt test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_Max_DrtTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Virar Max Drt test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Virar_Max_Drt getFixture()
  {
    return (Virar_Max_Drt)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createVirar_Max_Drt());
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

} //Virar_Max_DrtTest
