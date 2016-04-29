/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Ligar_Vermelho;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ligar Vermelho</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ligar_VermelhoTest extends Unica_CorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Ligar_VermelhoTest.class);
  }

  /**
   * Constructs a new Ligar Vermelho test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_VermelhoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Ligar Vermelho test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Ligar_Vermelho getFixture()
  {
    return (Ligar_Vermelho)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createLigar_Vermelho());
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

} //Ligar_VermelhoTest
