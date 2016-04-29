/**
 */
package arduino.tests;

import arduino.ArduinoFactory;
import arduino.Transicoes;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transicoes</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransicoesTest extends TestCase
{

  /**
   * The fixture for this Transicoes test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Transicoes fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TransicoesTest.class);
  }

  /**
   * Constructs a new Transicoes test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransicoesTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Transicoes test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Transicoes fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Transicoes test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Transicoes getFixture()
  {
    return fixture;
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
    setFixture(ArduinoFactory.eINSTANCE.createTransicoes());
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

} //TransicoesTest
