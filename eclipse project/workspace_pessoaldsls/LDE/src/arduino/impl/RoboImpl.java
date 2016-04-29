/**
 */
package arduino.impl;

import arduino.Acao;
import arduino.ArduinoPackage;
import arduino.Condicao;
import arduino.Robo;
import arduino.Transicoes;

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
 * An implementation of the model object '<em><b>Robo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduino.impl.RoboImpl#getTemAcoes <em>Tem Acoes</em>}</li>
 *   <li>{@link arduino.impl.RoboImpl#getTemTransicoes <em>Tem Transicoes</em>}</li>
 *   <li>{@link arduino.impl.RoboImpl#getNome <em>Nome</em>}</li>
 *   <li>{@link arduino.impl.RoboImpl#getTemCondicoes <em>Tem Condicoes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoboImpl extends EObjectImpl implements Robo
{
  /**
   * The cached value of the '{@link #getTemAcoes() <em>Tem Acoes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemAcoes()
   * @generated
   * @ordered
   */
  protected EList<Acao> temAcoes;

  /**
   * The cached value of the '{@link #getTemTransicoes() <em>Tem Transicoes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemTransicoes()
   * @generated
   * @ordered
   */
  protected EList<Transicoes> temTransicoes;

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
   * The cached value of the '{@link #getTemCondicoes() <em>Tem Condicoes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemCondicoes()
   * @generated
   * @ordered
   */
  protected EList<Condicao> temCondicoes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RoboImpl()
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
    return ArduinoPackage.Literals.ROBO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Acao> getTemAcoes()
  {
    if (temAcoes == null)
    {
      temAcoes = new EObjectContainmentEList<Acao>(Acao.class, this, ArduinoPackage.ROBO__TEM_ACOES);
    }
    return temAcoes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transicoes> getTemTransicoes()
  {
    if (temTransicoes == null)
    {
      temTransicoes = new EObjectContainmentEList<Transicoes>(Transicoes.class, this, ArduinoPackage.ROBO__TEM_TRANSICOES);
    }
    return temTransicoes;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ROBO__NOME, oldNome, nome));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condicao> getTemCondicoes()
  {
    if (temCondicoes == null)
    {
      temCondicoes = new EObjectContainmentEList<Condicao>(Condicao.class, this, ArduinoPackage.ROBO__TEM_CONDICOES);
    }
    return temCondicoes;
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
      case ArduinoPackage.ROBO__TEM_ACOES:
        return ((InternalEList<?>)getTemAcoes()).basicRemove(otherEnd, msgs);
      case ArduinoPackage.ROBO__TEM_TRANSICOES:
        return ((InternalEList<?>)getTemTransicoes()).basicRemove(otherEnd, msgs);
      case ArduinoPackage.ROBO__TEM_CONDICOES:
        return ((InternalEList<?>)getTemCondicoes()).basicRemove(otherEnd, msgs);
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
      case ArduinoPackage.ROBO__TEM_ACOES:
        return getTemAcoes();
      case ArduinoPackage.ROBO__TEM_TRANSICOES:
        return getTemTransicoes();
      case ArduinoPackage.ROBO__NOME:
        return getNome();
      case ArduinoPackage.ROBO__TEM_CONDICOES:
        return getTemCondicoes();
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
      case ArduinoPackage.ROBO__TEM_ACOES:
        getTemAcoes().clear();
        getTemAcoes().addAll((Collection<? extends Acao>)newValue);
        return;
      case ArduinoPackage.ROBO__TEM_TRANSICOES:
        getTemTransicoes().clear();
        getTemTransicoes().addAll((Collection<? extends Transicoes>)newValue);
        return;
      case ArduinoPackage.ROBO__NOME:
        setNome((String)newValue);
        return;
      case ArduinoPackage.ROBO__TEM_CONDICOES:
        getTemCondicoes().clear();
        getTemCondicoes().addAll((Collection<? extends Condicao>)newValue);
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
      case ArduinoPackage.ROBO__TEM_ACOES:
        getTemAcoes().clear();
        return;
      case ArduinoPackage.ROBO__TEM_TRANSICOES:
        getTemTransicoes().clear();
        return;
      case ArduinoPackage.ROBO__NOME:
        setNome(NOME_EDEFAULT);
        return;
      case ArduinoPackage.ROBO__TEM_CONDICOES:
        getTemCondicoes().clear();
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
      case ArduinoPackage.ROBO__TEM_ACOES:
        return temAcoes != null && !temAcoes.isEmpty();
      case ArduinoPackage.ROBO__TEM_TRANSICOES:
        return temTransicoes != null && !temTransicoes.isEmpty();
      case ArduinoPackage.ROBO__NOME:
        return NOME_EDEFAULT == null ? nome != null : !NOME_EDEFAULT.equals(nome);
      case ArduinoPackage.ROBO__TEM_CONDICOES:
        return temCondicoes != null && !temCondicoes.isEmpty();
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

} //RoboImpl
