/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Virar_Esquerda;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virar Esquerda</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Virar_EsquerdaTest extends CorpoTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Virar_EsquerdaTest.class);
  }

  /**
   * Constructs a new Virar Esquerda test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_EsquerdaTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Virar Esquerda test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Virar_Esquerda getFixture()
  {
    return (Virar_Esquerda)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createVirar_Esquerda());
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

} //Virar_EsquerdaTest
