/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Desligar_Intermitencia;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Desligar Intermitencia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Desligar_IntermitenciaTest extends VerdeTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Desligar_IntermitenciaTest.class);
  }

  /**
   * Constructs a new Desligar Intermitencia test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Desligar_IntermitenciaTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Desligar Intermitencia test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Desligar_Intermitencia getFixture()
  {
    return (Desligar_Intermitencia)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createDesligar_Intermitencia());
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

} //Desligar_IntermitenciaTest
