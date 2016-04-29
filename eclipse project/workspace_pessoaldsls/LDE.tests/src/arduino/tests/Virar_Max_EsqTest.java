/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Virar_Max_Esq;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Virar Max Esq</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Virar_Max_EsqTest extends CabecaTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(Virar_Max_EsqTest.class);
  }

  /**
   * Constructs a new Virar Max Esq test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Virar_Max_EsqTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Virar Max Esq test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Virar_Max_Esq getFixture()
  {
    return (Virar_Max_Esq)fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createVirar_Max_Esq());
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

} //Virar_Max_EsqTest
