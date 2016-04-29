/**
 */
package farrusco.tests;

import farrusco.FarruscoFactory;
import farrusco.Prioridade;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prioridade</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrioridadeTest extends BehaviorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(PrioridadeTest.class);
  }

  /**
   * Constructs a new Prioridade test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrioridadeTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Prioridade test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Prioridade getFixture()
  {
    return (Prioridade)fixture;
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
    setFixture(FarruscoFactory.eINSTANCE.createPrioridade());
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

} //PrioridadeTest
