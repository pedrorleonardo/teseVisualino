/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Rodar_Direita_Tempo;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rodar Direita Tempo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rodar_Direita_TempoTest extends Corpo_ModificavelTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Rodar_Direita_TempoTest.class);
  }

  /**
   * Constructs a new Rodar Direita Tempo test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rodar_Direita_TempoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Rodar Direita Tempo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Rodar_Direita_Tempo getFixture()
  {
    return (Rodar_Direita_Tempo)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createRodar_Direita_Tempo());
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

} //Rodar_Direita_TempoTest
