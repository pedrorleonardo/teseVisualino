/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Mover_Tras;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mover Tras</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mover_TrasTest extends CorpoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Mover_TrasTest.class);
  }

  /**
   * Constructs a new Mover Tras test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover_TrasTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Mover Tras test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Mover_Tras getFixture()
  {
    return (Mover_Tras)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createMover_Tras());
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

} //Mover_TrasTest
