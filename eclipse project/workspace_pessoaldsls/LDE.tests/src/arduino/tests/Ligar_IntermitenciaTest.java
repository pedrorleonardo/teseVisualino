/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Ligar_Intermitencia;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ligar Intermitencia</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ligar_IntermitenciaTest extends VerdeTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Ligar_IntermitenciaTest.class);
  }

  /**
   * Constructs a new Ligar Intermitencia test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_IntermitenciaTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Ligar Intermitencia test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Ligar_Intermitencia getFixture()
  {
    return (Ligar_Intermitencia)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createLigar_Intermitencia());
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

} //Ligar_IntermitenciaTest
