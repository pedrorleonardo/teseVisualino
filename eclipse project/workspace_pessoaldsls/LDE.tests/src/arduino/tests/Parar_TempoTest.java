/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Parar_Tempo;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parar Tempo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Parar_TempoTest extends Corpo_ModificavelTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Parar_TempoTest.class);
  }

  /**
   * Constructs a new Parar Tempo test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parar_TempoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Parar Tempo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Parar_Tempo getFixture()
  {
    return (Parar_Tempo)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createParar_Tempo());
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

} //Parar_TempoTest
