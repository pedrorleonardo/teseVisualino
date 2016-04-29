/**
 */
package farrusco.tests;

import farrusco.Bumpers;
import farrusco.FarruscoFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bumpers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BumpersTest extends ConditionTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(BumpersTest.class);
  }

  /**
   * Constructs a new Bumpers test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BumpersTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Bumpers test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Bumpers getFixture()
  {
    return (Bumpers)fixture;
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
    setFixture(FarruscoFactory.eINSTANCE.createBumpers());
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

} //BumpersTest
