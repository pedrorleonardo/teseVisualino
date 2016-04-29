/**
 */
package farrusco.tests;

import farrusco.FarruscoFactory;
import farrusco.Servo;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Servo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServoTest extends ActuateTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ServoTest.class);
  }

  /**
   * Constructs a new Servo test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Servo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Servo getFixture()
  {
    return (Servo)fixture;
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
    setFixture(FarruscoFactory.eINSTANCE.createServo());
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

} //ServoTest
