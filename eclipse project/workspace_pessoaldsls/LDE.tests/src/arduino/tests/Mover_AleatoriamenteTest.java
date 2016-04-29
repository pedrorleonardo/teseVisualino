/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Mover_Aleatoriamente;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mover Aleatoriamente</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mover_AleatoriamenteTest extends CorpoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Mover_AleatoriamenteTest.class);
  }

  /**
   * Constructs a new Mover Aleatoriamente test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover_AleatoriamenteTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Mover Aleatoriamente test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Mover_Aleatoriamente getFixture()
  {
    return (Mover_Aleatoriamente)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createMover_Aleatoriamente());
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

} //Mover_AleatoriamenteTest
