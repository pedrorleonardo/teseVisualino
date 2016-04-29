/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Ligar_Azul;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ligar Azul</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ligar_AzulTest extends Unica_CorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Ligar_AzulTest.class);
  }

  /**
   * Constructs a new Ligar Azul test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ligar_AzulTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Ligar Azul test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Ligar_Azul getFixture()
  {
    return (Ligar_Azul)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createLigar_Azul());
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

} //Ligar_AzulTest
