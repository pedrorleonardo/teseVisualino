/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Desligar_Cores;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Desligar Cores</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Desligar_CoresTest extends Varias_CoresTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Desligar_CoresTest.class);
  }

  /**
   * Constructs a new Desligar Cores test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Desligar_CoresTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Desligar Cores test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Desligar_Cores getFixture()
  {
    return (Desligar_Cores)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createDesligar_Cores());
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

} //Desligar_CoresTest
