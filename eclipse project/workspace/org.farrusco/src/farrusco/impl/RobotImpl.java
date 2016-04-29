/**
 */
package farrusco.impl;

import farrusco.FarruscoPackage;
import farrusco.Filho;
import farrusco.Irmao;
import farrusco.Node;
import farrusco.Robot;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link farrusco.impl.RobotImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link farrusco.impl.RobotImpl#getChild <em>Child</em>}</li>
 *   <li>{@link farrusco.impl.RobotImpl#getNext <em>Next</em>}</li>
 *   <li>{@link farrusco.impl.RobotImpl#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RobotImpl extends EObjectImpl implements Robot
{
  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<Node> nodes;

  /**
   * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChild()
   * @generated
   * @ordered
   */
  protected EList<Filho> child;

  /**
   * The cached value of the '{@link #getNext() <em>Next</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNext()
   * @generated
   * @ordered
   */
  protected EList<Irmao> next;

  /**
   * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected static final String NOME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected String nome = NOME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RobotImpl()
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
    return FarruscoPackage.Literals.ROBOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<Node>(Node.class, this, FarruscoPackage.ROBOT__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Filho> getChild()
  {
    if (child == null)
    {
      child = new EObjectContainmentEList<Filho>(Filho.class, this, FarruscoPackage.ROBOT__CHILD);
    }
    return child;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Irmao> getNext()
  {
    if (next == null)
    {
      next = new EObjectContainmentEList<Irmao>(Irmao.class, this, FarruscoPackage.ROBOT__NEXT);
    }
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNome()
  {
    return nome;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNome(String newNome)
  {
    String oldNome = nome;
    nome = newNome;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.ROBOT__NOME, oldNome, nome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FarruscoPackage.ROBOT__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case FarruscoPackage.ROBOT__CHILD:
        return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
      case FarruscoPackage.ROBOT__NEXT:
        return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FarruscoPackage.ROBOT__NODES:
        return getNodes();
      case FarruscoPackage.ROBOT__CHILD:
        return getChild();
      case FarruscoPackage.ROBOT__NEXT:
        return getNext();
      case FarruscoPackage.ROBOT__NOME:
        return getNome();
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
      case FarruscoPackage.ROBOT__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends Node>)newValue);
        return;
      case FarruscoPackage.ROBOT__CHILD:
        getChild().clear();
        getChild().addAll((Collection<? extends Filho>)newValue);
        return;
      case FarruscoPackage.ROBOT__NEXT:
        getNext().clear();
        getNext().addAll((Collection<? extends Irmao>)newValue);
        return;
      case FarruscoPackage.ROBOT__NOME:
        setNome((String)newValue);
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
      case FarruscoPackage.ROBOT__NODES:
        getNodes().clear();
        return;
      case FarruscoPackage.ROBOT__CHILD:
        getChild().clear();
        return;
      case FarruscoPackage.ROBOT__NEXT:
        getNext().clear();
        return;
      case FarruscoPackage.ROBOT__NOME:
        setNome(NOME_EDEFAULT);
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
      case FarruscoPackage.ROBOT__NODES:
        return nodes != null && !nodes.isEmpty();
      case FarruscoPackage.ROBOT__CHILD:
        return child != null && !child.isEmpty();
      case FarruscoPackage.ROBOT__NEXT:
        return next != null && !next.isEmpty();
      case FarruscoPackage.ROBOT__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (Nome: ");
    result.append(nome);
    result.append(')');
    return result.toString();
  }

} //RobotImpl
