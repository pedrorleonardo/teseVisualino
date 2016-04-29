/**
 */
package arduino.impl;

import arduino.Acoes_Condicionais;
import arduino.ArduinoPackage;
import arduino.Condicao;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acoes Condicionais</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduino.impl.Acoes_CondicionaisImpl#getTem <em>Tem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class Acoes_CondicionaisImpl extends AcaoImpl implements Acoes_Condicionais
{
  /**
   * The cached value of the '{@link #getTem() <em>Tem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTem()
   * @generated
   * @ordered
   */
  protected Condicao tem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Acoes_CondicionaisImpl()
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
    return ArduinoPackage.Literals.ACOES_CONDICIONAIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condicao getTem()
  {
    if (tem != null && tem.eIsProxy())
    {
      InternalEObject oldTem = (InternalEObject)tem;
      tem = (Condicao)eResolveProxy(oldTem);
      if (tem != oldTem)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.ACOES_CONDICIONAIS__TEM, oldTem, tem));
      }
    }
    return tem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Condicao basicGetTem()
  {
    return tem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTem(Condicao newTem)
  {
    Condicao oldTem = tem;
    tem = newTem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ACOES_CONDICIONAIS__TEM, oldTem, tem));
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
      case ArduinoPackage.ACOES_CONDICIONAIS__TEM:
        if (resolve) return getTem();
        return basicGetTem();
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
      case ArduinoPackage.ACOES_CONDICIONAIS__TEM:
        setTem((Condicao)newValue);
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
      case ArduinoPackage.ACOES_CONDICIONAIS__TEM:
        setTem((Condicao)null);
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
      case ArduinoPackage.ACOES_CONDICIONAIS__TEM:
        return tem != null;
    }
    return super.eIsSet(featureID);
  }

} //Acoes_CondicionaisImpl
