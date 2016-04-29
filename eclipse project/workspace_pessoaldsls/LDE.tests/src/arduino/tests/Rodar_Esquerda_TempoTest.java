/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Rodar_Esquerda_Tempo;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rodar Esquerda Tempo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Rodar_Esquerda_TempoTest extends Corpo_ModificavelTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Rodar_Esquerda_TempoTest.class);
  }

  /**
   * Constructs a new Rodar Esquerda Tempo test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rodar_Esquerda_TempoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Rodar Esquerda Tempo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Rodar_Esquerda_Tempo getFixture()
  {
    return (Rodar_Esquerda_Tempo)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createRodar_Esquerda_Tempo());
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

} //Rodar_Esquerda_TempoTest
