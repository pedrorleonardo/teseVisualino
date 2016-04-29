/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.Inicio;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduino.impl.InicioImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link arduino.impl.InicioImpl#isEvitarObstaculo <em>Evitar Obstaculo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InicioImpl extends AcaoImpl implements Inicio
{
  /**
   * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected static final String NOME_EDEFAULT = "In\u00edcio";
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
  protected InicioImpl()
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
    return ArduinoPackage.Literals.INICIO;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.INICIO__NOME, oldNome, nome));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.INICIO__EVITAR_OBSTACULO, oldEvitarObstaculo, evitarObstaculo));
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
      case ArduinoPackage.INICIO__NOME:
        return getNome();
      case ArduinoPackage.INICIO__EVITAR_OBSTACULO:
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
      case ArduinoPackage.INICIO__NOME:
        setNome((String)newValue);
        return;
      case ArduinoPackage.INICIO__EVITAR_OBSTACULO:
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
      case ArduinoPackage.INICIO__NOME:
        setNome(NOME_EDEFAULT);
        return;
      case ArduinoPackage.INICIO__EVITAR_OBSTACULO:
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
      case ArduinoPackage.INICIO__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
      case ArduinoPackage.INICIO__EVITAR_OBSTACULO:
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
    result.append(" (nome: ");
    result.append(nome);
    result.append(", evitarObstaculo: ");
    result.append(evitarObstaculo);
    result.append(')');
    return result.toString();
  }

} //InicioImpl
