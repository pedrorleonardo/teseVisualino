/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.Cabeca_Modificavel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cabeca Modificavel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduino.impl.Cabeca_ModificavelImpl#getGraus <em>Graus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class Cabeca_ModificavelImpl extends Acoes_ModificaveisImpl implements Cabeca_Modificavel
{
  /**
   * The default value of the '{@link #getGraus() <em>Graus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraus()
   * @generated
   * @ordered
   */
  protected static final int GRAUS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getGraus() <em>Graus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraus()
   * @generated
   * @ordered
   */
  protected int graus = GRAUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Cabeca_ModificavelImpl()
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
    return ArduinoPackage.Literals.CABECA_MODIFICAVEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getGraus()
  {
    return graus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGraus(int newGraus)
  {
    int oldGraus = graus;
    graus = newGraus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.CABECA_MODIFICAVEL__GRAUS, oldGraus, graus));
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
      case ArduinoPackage.CABECA_MODIFICAVEL__GRAUS:
        return getGraus();
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
      case ArduinoPackage.CABECA_MODIFICAVEL__GRAUS:
        setGraus((Integer)newValue);
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
      case ArduinoPackage.CABECA_MODIFICAVEL__GRAUS:
        setGraus(GRAUS_EDEFAULT);
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
      case ArduinoPackage.CABECA_MODIFICAVEL__GRAUS:
        return graus != GRAUS_EDEFAULT;
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
    result.append(" (graus: ");
    result.append(graus);
    result.append(')');
    return result.toString();
  }

} //Cabeca_ModificavelImpl
