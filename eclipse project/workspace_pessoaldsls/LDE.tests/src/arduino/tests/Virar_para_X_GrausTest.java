/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Virar_para_X_Graus;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virar para XGraus</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Virar_para_X_GrausTest extends Cabeca_ModificavelTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Virar_para_X_GrausTest.class);
  }

  /**
   * Constructs a new Virar para XGraus test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_para_X_GrausTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Virar para XGraus test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Virar_para_X_Graus getFixture()
  {
    return (Virar_para_X_Graus)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createVirar_para_X_Graus());
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

} //Virar_para_X_GrausTest
