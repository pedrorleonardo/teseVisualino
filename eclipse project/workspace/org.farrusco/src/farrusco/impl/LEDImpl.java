/**
 */
package farrusco.impl;

import farrusco.EstadoDaLuz;
import farrusco.FarruscoPackage;
import farrusco.LED;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link farrusco.impl.LEDImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link farrusco.impl.LEDImpl#getLigado_ou_Desligado <em>Ligado ou Desligado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LEDImpl extends ActuateImpl implements LED
{
  /**
   * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected static final String NOME_EDEFAULT = "Luz";

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
   * The default value of the '{@link #getLigado_ou_Desligado() <em>Ligado ou Desligado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLigado_ou_Desligado()
   * @generated
   * @ordered
   */
  protected static final EstadoDaLuz LIGADO_OU_DESLIGADO_EDEFAULT = EstadoDaLuz.LIGADO;

  /**
   * The cached value of the '{@link #getLigado_ou_Desligado() <em>Ligado ou Desligado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLigado_ou_Desligado()
   * @generated
   * @ordered
   */
  protected EstadoDaLuz ligado_ou_Desligado = LIGADO_OU_DESLIGADO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LEDImpl()
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
    return FarruscoPackage.Literals.LED;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.LED__NOME, oldNome, nome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDaLuz getLigado_ou_Desligado()
  {
    return ligado_ou_Desligado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLigado_ou_Desligado(EstadoDaLuz newLigado_ou_Desligado)
  {
    EstadoDaLuz oldLigado_ou_Desligado = ligado_ou_Desligado;
    ligado_ou_Desligado = newLigado_ou_Desligado == null ? LIGADO_OU_DESLIGADO_EDEFAULT : newLigado_ou_Desligado;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.LED__LIGADO_OU_DESLIGADO, oldLigado_ou_Desligado, ligado_ou_Desligado));
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
      case FarruscoPackage.LED__NOME:
        return getNome();
      case FarruscoPackage.LED__LIGADO_OU_DESLIGADO:
        return getLigado_ou_Desligado();
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
      case FarruscoPackage.LED__NOME:
        setNome((String)newValue);
        return;
      case FarruscoPackage.LED__LIGADO_OU_DESLIGADO:
        setLigado_ou_Desligado((EstadoDaLuz)newValue);
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
      case FarruscoPackage.LED__NOME:
        setNome(NOME_EDEFAULT);
        return;
      case FarruscoPackage.LED__LIGADO_OU_DESLIGADO:
        setLigado_ou_Desligado(LIGADO_OU_DESLIGADO_EDEFAULT);
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
      case FarruscoPackage.LED__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
      case FarruscoPackage.LED__LIGADO_OU_DESLIGADO:
        return ligado_ou_Desligado != LIGADO_OU_DESLIGADO_EDEFAULT;
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
    result.append(", Ligado_ou_Desligado: ");
    result.append(ligado_ou_Desligado);
    result.append(')');
    return result.toString();
  }

} //LEDImpl
