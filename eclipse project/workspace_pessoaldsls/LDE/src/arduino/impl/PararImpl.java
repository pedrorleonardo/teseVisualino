/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.Parar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduino.impl.PararImpl#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PararImpl extends CorpoImpl implements Parar
{
  /**
   * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected static final String NOME_EDEFAULT = "Parar";
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
  protected PararImpl()
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
    return ArduinoPackage.Literals.PARAR;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.PARAR__NOME, oldNome, nome));
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
      case ArduinoPackage.PARAR__NOME:
        return getNome();
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
      case ArduinoPackage.PARAR__NOME:
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
      case ArduinoPackage.PARAR__NOME:
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
      case ArduinoPackage.PARAR__NOME:
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
    result.append(" (nome: ");
    result.append(nome);
    result.append(')');
    return result.toString();
  }

} //PararImpl
