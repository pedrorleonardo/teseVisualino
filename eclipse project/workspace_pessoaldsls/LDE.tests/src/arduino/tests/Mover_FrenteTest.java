/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Mover_Frente;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mover Frente</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mover_FrenteTest extends CorpoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Mover_FrenteTest.class);
  }

  /**
   * Constructs a new Mover Frente test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover_FrenteTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Mover Frente test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Mover_Frente getFixture()
  {
    return (Mover_Frente)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createMover_Frente());
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

} //Mover_FrenteTest
