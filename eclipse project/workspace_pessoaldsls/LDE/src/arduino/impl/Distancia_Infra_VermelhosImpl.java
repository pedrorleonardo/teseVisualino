/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.Distancia_Infra_Vermelhos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distancia Infra Vermelhos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduino.impl.Distancia_Infra_VermelhosImpl#getDistancia <em>Distancia</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Distancia_Infra_VermelhosImpl extends CondicaoImpl implements Distancia_Infra_Vermelhos
{
  /**
   * The default value of the '{@link #getDistancia() <em>Distancia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistancia()
   * @generated
   * @ordered
   */
  protected static final int DISTANCIA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDistancia() <em>Distancia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistancia()
   * @generated
   * @ordered
   */
  protected int distancia = DISTANCIA_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Distancia_Infra_VermelhosImpl()
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
    return ArduinoPackage.Literals.DISTANCIA_INFRA_VERMELHOS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDistancia()
  {
    return distancia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistancia(int newDistancia)
  {
    int oldDistancia = distancia;
    distancia = newDistancia;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.DISTANCIA_INFRA_VERMELHOS__DISTANCIA, oldDistancia, distancia));
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
      case ArduinoPackage.DISTANCIA_INFRA_VERMELHOS__DISTANCIA:
        return getDistancia();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArduinoPackage.DISTANCIA_INFRA_VERMELHOS__DISTANCIA:
        setDistancia((Integer)newValue);
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
      case ArduinoPackage.DISTANCIA_INFRA_VERMELHOS__DISTANCIA:
        setDistancia(DISTANCIA_EDEFAULT);
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
      case ArduinoPackage.DISTANCIA_INFRA_VERMELHOS__DISTANCIA:
        return distancia != DISTANCIA_EDEFAULT;
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
    result.append(" (distancia: ");
    result.append(distancia);
    result.append(')');
    return result.toString();
  }

} //Distancia_Infra_VermelhosImpl
