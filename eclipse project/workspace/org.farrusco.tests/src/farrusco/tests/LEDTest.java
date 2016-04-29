/**
 */
package farrusco.tests;

import farrusco.FarruscoFactory;
import farrusco.LED;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>LED</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LEDTest extends ActuateTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(LEDTest.class);
  }

  /**
   * Constructs a new LED test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LEDTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this LED test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected LED getFixture()
  {
    return (LED)fixture;
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
    setFixture(FarruscoFactory.eINSTANCE.createLED());
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

} //LEDTest
