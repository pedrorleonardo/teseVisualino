/**
 */
package farrusco.util;

import farrusco.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see farrusco.FarruscoPackage
 * @generated
 */
public class FarruscoAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FarruscoPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FarruscoAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FarruscoPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FarruscoSwitch<Adapter> modelSwitch =
    new FarruscoSwitch<Adapter>()
    {
      @Override
      public Adapter caseRobot(Robot object)
      {
        return createRobotAdapter();
      }
      @Override
      public Adapter caseNode(Node object)
      {
        return createNodeAdapter();
      }
      @Override
      public Adapter caseFilho(Filho object)
      {
        return createFilhoAdapter();
      }
      @Override
      public Adapter caseIrmao(Irmao object)
      {
        return createIrmaoAdapter();
      }
      @Override
      public Adapter caseBehavior(Behavior object)
      {
        return createBehaviorAdapter();
      }
      @Override
      public Adapter casePrioridade(Prioridade object)
      {
        return createPrioridadeAdapter();
      }
      @Override
      public Adapter caseParalelo(Paralelo object)
      {
        return createParaleloAdapter();
      }
      @Override
      public Adapter caseSequencial(Sequencial object)
      {
        return createSequencialAdapter();
      }
      @Override
      public Adapter caseAlterarEstado(AlterarEstado object)
      {
        return createAlterarEstadoAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseDistancia(Distancia object)
      {
        return createDistanciaAdapter();
      }
      @Override
      public Adapter caseBumpers(Bumpers object)
      {
        return createBumpersAdapter();
      }
      @Override
      public Adapter caseEspera(Espera object)
      {
        return createEsperaAdapter();
      }
      @Override
      public Adapter caseActuate(Actuate object)
      {
        return createActuateAdapter();
      }
      @Override
      public Adapter caseMotor(Motor object)
      {
        return createMotorAdapter();
      }
      @Override
      public Adapter caseServo(Servo object)
      {
        return createServoAdapter();
      }
      @Override
      public Adapter caseLED(LED object)
      {
        return createLEDAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link farrusco.Robot <em>Robot</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Robot
   * @generated
   */
  public Adapter createRobotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Node <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Node
   * @generated
   */
  public Adapter createNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Filho <em>Filho</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Filho
   * @generated
   */
  public Adapter createFilhoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Irmao <em>Irmao</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Irmao
   * @generated
   */
  public Adapter createIrmaoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Behavior <em>Behavior</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Behavior
   * @generated
   */
  public Adapter createBehaviorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Prioridade <em>Prioridade</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Prioridade
   * @generated
   */
  public Adapter createPrioridadeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Paralelo <em>Paralelo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Paralelo
   * @generated
   */
  public Adapter createParaleloAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Sequencial <em>Sequencial</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Sequencial
   * @generated
   */
  public Adapter createSequencialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.AlterarEstado <em>Alterar Estado</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.AlterarEstado
   * @generated
   */
  public Adapter createAlterarEstadoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Distancia <em>Distancia</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Distancia
   * @generated
   */
  public Adapter createDistanciaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Bumpers <em>Bumpers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Bumpers
   * @generated
   */
  public Adapter createBumpersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Espera <em>Espera</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Espera
   * @generated
   */
  public Adapter createEsperaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Actuate <em>Actuate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Actuate
   * @generated
   */
  public Adapter createActuateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Motor <em>Motor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Motor
   * @generated
   */
  public Adapter createMotorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.Servo <em>Servo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.Servo
   * @generated
   */
  public Adapter createServoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link farrusco.LED <em>LED</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see farrusco.LED
   * @generated
   */
  public Adapter createLEDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FarruscoAdapterFactory
