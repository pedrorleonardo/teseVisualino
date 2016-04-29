/**
 */
package farrusco.impl;

import farrusco.Behavior;
import farrusco.FarruscoPackage;
import farrusco.Filho;
import farrusco.Node;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filho</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link farrusco.impl.FilhoImpl#getSource <em>Source</em>}</li>
 *   <li>{@link farrusco.impl.FilhoImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilhoImpl extends EObjectImpl implements Filho
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EList<Behavior> source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected EList<Node> target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilhoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FarruscoPackage.Literals.FILHO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Behavior> getSource()
  {
    if (source == null)
    {
      source = new EObjectResolvingEList<Behavior>(Behavior.class, this, FarruscoPackage.FILHO__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getTarget()
  {
    if (target == null)
    {
      target = new EObjectResolvingEList<Node>(Node.class, this, FarruscoPackage.FILHO__TARGET);
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FarruscoPackage.FILHO__SOURCE:
        return getSource();
      case FarruscoPackage.FILHO__TARGET:
        return getTarget();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FarruscoPackage.FILHO__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends Behavior>)newValue);
        return;
      case FarruscoPackage.FILHO__TARGET:
        getTarget().clear();
        getTarget().addAll((Collection<? extends Node>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FarruscoPackage.FILHO__SOURCE:
        getSource().clear();
        return;
      case FarruscoPackage.FILHO__TARGET:
        getTarget().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FarruscoPackage.FILHO__SOURCE:
        return source != null && !source.isEmpty();
      case FarruscoPackage.FILHO__TARGET:
        return target != null && !target.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FilhoImpl
