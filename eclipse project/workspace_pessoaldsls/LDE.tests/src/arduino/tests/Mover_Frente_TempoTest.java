/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Mover_Frente_Tempo;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mover Frente Tempo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mover_Frente_TempoTest extends Corpo_ModificavelTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Mover_Frente_TempoTest.class);
  }

  /**
   * Constructs a new Mover Frente Tempo test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mover_Frente_TempoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Mover Frente Tempo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Mover_Frente_Tempo getFixture()
  {
    return (Mover_Frente_Tempo)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createMover_Frente_Tempo());
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

} //Mover_Frente_TempoTest