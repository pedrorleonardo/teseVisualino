/**
 */
package farrusco.impl;

import farrusco.AlterarEstado;
import farrusco.EstadoDecorrer;
import farrusco.EstadoFalha;
import farrusco.EstadoSucesso;
import farrusco.FarruscoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alterar Estado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link farrusco.impl.AlterarEstadoImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link farrusco.impl.AlterarEstadoImpl#getAlterar_Sucesso <em>Alterar Sucesso</em>}</li>
 *   <li>{@link farrusco.impl.AlterarEstadoImpl#getAlterar_Falha <em>Alterar Falha</em>}</li>
 *   <li>{@link farrusco.impl.AlterarEstadoImpl#getAlterar_Decorrer <em>Alterar Decorrer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlterarEstadoImpl extends BehaviorImpl implements AlterarEstado
{
  /**
   * The default value of the '{@link #getNome() <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNome()
   * @generated
   * @ordered
   */
  protected static final String NOME_EDEFAULT = "Alterar Estado";

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
   * The default value of the '{@link #getAlterar_Sucesso() <em>Alterar Sucesso</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlterar_Sucesso()
   * @generated
   * @ordered
   */
  protected static final EstadoSucesso ALTERAR_SUCESSO_EDEFAULT = EstadoSucesso.SUCESSO;

  /**
   * The cached value of the '{@link #getAlterar_Sucesso() <em>Alterar Sucesso</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlterar_Sucesso()
   * @generated
   * @ordered
   */
  protected EstadoSucesso alterar_Sucesso = ALTERAR_SUCESSO_EDEFAULT;

  /**
   * The default value of the '{@link #getAlterar_Falha() <em>Alterar Falha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlterar_Falha()
   * @generated
   * @ordered
   */
  protected static final EstadoFalha ALTERAR_FALHA_EDEFAULT = EstadoFalha.FALHA;

  /**
   * The cached value of the '{@link #getAlterar_Falha() <em>Alterar Falha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlterar_Falha()
   * @generated
   * @ordered
   */
  protected EstadoFalha alterar_Falha = ALTERAR_FALHA_EDEFAULT;

  /**
   * The default value of the '{@link #getAlterar_Decorrer() <em>Alterar Decorrer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlterar_Decorrer()
   * @generated
   * @ordered
   */
  protected static final EstadoDecorrer ALTERAR_DECORRER_EDEFAULT = EstadoDecorrer.DECORRER;

  /**
   * The cached value of the '{@link #getAlterar_Decorrer() <em>Alterar Decorrer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlterar_Decorrer()
   * @generated
   * @ordered
   */
  protected EstadoDecorrer alterar_Decorrer = ALTERAR_DECORRER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlterarEstadoImpl()
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
    return FarruscoPackage.Literals.ALTERAR_ESTADO;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.ALTERAR_ESTADO__NOME, oldNome, nome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoSucesso getAlterar_Sucesso()
  {
    return alterar_Sucesso;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlterar_Sucesso(EstadoSucesso newAlterar_Sucesso)
  {
    EstadoSucesso oldAlterar_Sucesso = alterar_Sucesso;
    alterar_Sucesso = newAlterar_Sucesso == null ? ALTERAR_SUCESSO_EDEFAULT : newAlterar_Sucesso;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.ALTERAR_ESTADO__ALTERAR_SUCESSO, oldAlterar_Sucesso, alterar_Sucesso));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoFalha getAlterar_Falha()
  {
    return alterar_Falha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlterar_Falha(EstadoFalha newAlterar_Falha)
  {
    EstadoFalha oldAlterar_Falha = alterar_Falha;
    alterar_Falha = newAlterar_Falha == null ? ALTERAR_FALHA_EDEFAULT : newAlterar_Falha;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.ALTERAR_ESTADO__ALTERAR_FALHA, oldAlterar_Falha, alterar_Falha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EstadoDecorrer getAlterar_Decorrer()
  {
    return alterar_Decorrer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlterar_Decorrer(EstadoDecorrer newAlterar_Decorrer)
  {
    EstadoDecorrer oldAlterar_Decorrer = alterar_Decorrer;
    alterar_Decorrer = newAlterar_Decorrer == null ? ALTERAR_DECORRER_EDEFAULT : newAlterar_Decorrer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarruscoPackage.ALTERAR_ESTADO__ALTERAR_DECORRER, oldAlterar_Decorrer, alterar_Decorrer));
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
      case FarruscoPackage.ALTERAR_ESTADO__NOME:
        return getNome();
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_SUCESSO:
        return getAlterar_Sucesso();
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_FALHA:
        return getAlterar_Falha();
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_DECORRER:
        return getAlterar_Decorrer();
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
      case FarruscoPackage.ALTERAR_ESTADO__NOME:
        setNome((String)newValue);
        return;
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_SUCESSO:
        setAlterar_Sucesso((EstadoSucesso)newValue);
        return;
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_FALHA:
        setAlterar_Falha((EstadoFalha)newValue);
        return;
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_DECORRER:
        setAlterar_Decorrer((EstadoDecorrer)newValue);
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
      case FarruscoPackage.ALTERAR_ESTADO__NOME:
        setNome(NOME_EDEFAULT);
        return;
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_SUCESSO:
        setAlterar_Sucesso(ALTERAR_SUCESSO_EDEFAULT);
        return;
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_FALHA:
        setAlterar_Falha(ALTERAR_FALHA_EDEFAULT);
        return;
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_DECORRER:
        setAlterar_Decorrer(ALTERAR_DECORRER_EDEFAULT);
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
      case FarruscoPackage.ALTERAR_ESTADO__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_SUCESSO:
        return alterar_Sucesso != ALTERAR_SUCESSO_EDEFAULT;
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_FALHA:
        return alterar_Falha != ALTERAR_FALHA_EDEFAULT;
      case FarruscoPackage.ALTERAR_ESTADO__ALTERAR_DECORRER:
        return alterar_Decorrer != ALTERAR_DECORRER_EDEFAULT;
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
    result.append(", Alterar_Sucesso: ");
    result.append(alterar_Sucesso);
    result.append(", Alterar_Falha: ");
    result.append(alterar_Falha);
    result.append(", Alterar_Decorrer: ");
    result.append(alterar_Decorrer);
    result.append(')');
    return result.toString();
  }

} //AlterarEstadoImpl
