/**
 */
package farrusco.tests;

import farrusco.AlterarEstado;
import farrusco.FarruscoFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Alterar Estado</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlterarEstadoTest extends BehaviorTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(AlterarEstadoTest.class);
  }

  /**
   * Constructs a new Alterar Estado test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlterarEstadoTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Alterar Estado test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected AlterarEstado getFixture()
  {
    return (AlterarEstado)fixture;
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
    setFixture(FarruscoFactory.eINSTANCE.createAlterarEstado());
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

} //AlterarEstadoTest
