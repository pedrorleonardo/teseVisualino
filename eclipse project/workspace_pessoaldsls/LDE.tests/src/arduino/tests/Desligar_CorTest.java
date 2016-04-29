/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Desligar_Cor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Desligar Cor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Desligar_CorTest extends Unica_CorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Desligar_CorTest.class);
  }

  /**
   * Constructs a new Desligar Cor test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Desligar_CorTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Desligar Cor test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Desligar_Cor getFixture()
  {
    return (Desligar_Cor)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createDesligar_Cor());
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

} //Desligar_CorTest
