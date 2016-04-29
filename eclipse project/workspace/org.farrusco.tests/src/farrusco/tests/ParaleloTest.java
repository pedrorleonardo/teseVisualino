/**
 */
package farrusco.tests;

import farrusco.FarruscoFactory;
import farrusco.Paralelo;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Paralelo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParaleloTest extends BehaviorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ParaleloTest.class);
  }

  /**
   * Constructs a new Paralelo test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParaleloTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Paralelo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Paralelo getFixture()
  {
    return (Paralelo)fixture;
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
    setFixture(FarruscoFactory.eINSTANCE.createParalelo());
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

} //ParaleloTest
