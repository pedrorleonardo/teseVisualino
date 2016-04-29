/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.Corpo_Modificavel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Corpo Modificavel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduino.impl.Corpo_ModificavelImpl#getTempo <em>Tempo</em>}</li>
 *   <li>{@link arduino.impl.Corpo_ModificavelImpl#isEvitarObstaculo <em>Evitar Obstaculo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class Corpo_ModificavelImpl extends Acoes_ModificaveisImpl implements Corpo_Modificavel
{
  /**
   * The default value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempo()
   * @generated
   * @ordered
   */
  protected static final int TEMPO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTempo() <em>Tempo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTempo()
   * @generated
   * @ordered
   */
  protected int tempo = TEMPO_EDEFAULT;

  /**
   * The default value of the '{@link #isEvitarObstaculo() <em>Evitar Obstaculo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEvitarObstaculo()
   * @generated
   * @ordered
   */
  protected static final boolean EVITAR_OBSTACULO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEvitarObstaculo() <em>Evitar Obstaculo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEvitarObstaculo()
   * @generated
   * @ordered
   */
  protected boolean evitarObstaculo = EVITAR_OBSTACULO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Corpo_ModificavelImpl()
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
    return ArduinoPackage.Literals.CORPO_MODIFICAVEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTempo()
  {
    return tempo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTempo(int newTempo)
  {
    int oldTempo = tempo;
    tempo = newTempo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.CORPO_MODIFICAVEL__TEMPO, oldTempo, tempo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEvitarObstaculo()
  {
    return evitarObstaculo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvitarObstaculo(boolean newEvitarObstaculo)
  {
    boolean oldEvitarObstaculo = evitarObstaculo;
    evitarObstaculo = newEvitarObstaculo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.CORPO_MODIFICAVEL__EVITAR_OBSTACULO, oldEvitarObstaculo, evitarObstaculo));
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
      case ArduinoPackage.CORPO_MODIFICAVEL__TEMPO:
        return getTempo();
      case ArduinoPackage.CORPO_MODIFICAVEL__EVITAR_OBSTACULO:
        return isEvitarObstaculo();
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
      case ArduinoPackage.CORPO_MODIFICAVEL__TEMPO:
        setTempo((Integer)newValue);
        return;
      case ArduinoPackage.CORPO_MODIFICAVEL__EVITAR_OBSTACULO:
        setEvitarObstaculo((Boolean)newValue);
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
      case ArduinoPackage.CORPO_MODIFICAVEL__TEMPO:
        setTempo(TEMPO_EDEFAULT);
        return;
      case ArduinoPackage.CORPO_MODIFICAVEL__EVITAR_OBSTACULO:
        setEvitarObstaculo(EVITAR_OBSTACULO_EDEFAULT);
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
      case ArduinoPackage.CORPO_MODIFICAVEL__TEMPO:
        return tempo != TEMPO_EDEFAULT;
      case ArduinoPackage.CORPO_MODIFICAVEL__EVITAR_OBSTACULO:
        return evitarObstaculo != EVITAR_OBSTACULO_EDEFAULT;
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
    result.append(" (tempo: ");
    result.append(tempo);
    result.append(", evitarObstaculo: ");
    result.append(evitarObstaculo);
    result.append(')');
    return result.toString();
  }

} //Corpo_ModificavelImpl
