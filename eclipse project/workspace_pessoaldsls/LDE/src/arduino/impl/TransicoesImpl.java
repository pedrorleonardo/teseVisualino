/**
 */
package arduino.impl;

import arduino.Acao;
import arduino.ArduinoPackage;
import arduino.Transicoes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transicoes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduino.impl.TransicoesImpl#getAcao_de_Entrada <em>Acao de Entrada</em>}</li>
 *   <li>{@link arduino.impl.TransicoesImpl#getAcao_de_Saida <em>Acao de Saida</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransicoesImpl extends EObjectImpl implements Transicoes
{
  /**
   * The cached value of the '{@link #getAcao_de_Entrada() <em>Acao de Entrada</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcao_de_Entrada()
   * @generated
   * @ordered
   */
  protected Acao acao_de_Entrada;

  /**
   * The cached value of the '{@link #getAcao_de_Saida() <em>Acao de Saida</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcao_de_Saida()
   * @generated
   * @ordered
   */
  protected Acao acao_de_Saida;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransicoesImpl()
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
    return ArduinoPackage.Literals.TRANSICOES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Acao getAcao_de_Entrada()
  {
    if (acao_de_Entrada != null && acao_de_Entrada.eIsProxy())
    {
      InternalEObject oldAcao_de_Entrada = (InternalEObject)acao_de_Entrada;
      acao_de_Entrada = (Acao)eResolveProxy(oldAcao_de_Entrada);
      if (acao_de_Entrada != oldAcao_de_Entrada)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA, oldAcao_de_Entrada, acao_de_Entrada));
      }
    }
    return acao_de_Entrada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Acao basicGetAcao_de_Entrada()
  {
    return acao_de_Entrada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcao_de_Entrada(Acao newAcao_de_Entrada, NotificationChain msgs)
  {
    Acao oldAcao_de_Entrada = acao_de_Entrada;
    acao_de_Entrada = newAcao_de_Entrada;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA, oldAcao_de_Entrada, newAcao_de_Entrada);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcao_de_Entrada(Acao newAcao_de_Entrada)
  {
    if (newAcao_de_Entrada != acao_de_Entrada)
    {
      NotificationChain msgs = null;
      if (acao_de_Entrada != null)
        msgs = ((InternalEObject)acao_de_Entrada).eInverseRemove(this, ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA, Acao.class, msgs);
      if (newAcao_de_Entrada != null)
        msgs = ((InternalEObject)newAcao_de_Entrada).eInverseAdd(this, ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA, Acao.class, msgs);
      msgs = basicSetAcao_de_Entrada(newAcao_de_Entrada, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA, newAcao_de_Entrada, newAcao_de_Entrada));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Acao getAcao_de_Saida()
  {
    if (acao_de_Saida != null && acao_de_Saida.eIsProxy())
    {
      InternalEObject oldAcao_de_Saida = (InternalEObject)acao_de_Saida;
      acao_de_Saida = (Acao)eResolveProxy(oldAcao_de_Saida);
      if (acao_de_Saida != oldAcao_de_Saida)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA, oldAcao_de_Saida, acao_de_Saida));
      }
    }
    return acao_de_Saida;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Acao basicGetAcao_de_Saida()
  {
    return acao_de_Saida;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcao_de_Saida(Acao newAcao_de_Saida, NotificationChain msgs)
  {
    Acao oldAcao_de_Saida = acao_de_Saida;
    acao_de_Saida = newAcao_de_Saida;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA, oldAcao_de_Saida, newAcao_de_Saida);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcao_de_Saida(Acao newAcao_de_Saida)
  {
    if (newAcao_de_Saida != acao_de_Saida)
    {
      NotificationChain msgs = null;
      if (acao_de_Saida != null)
        msgs = ((InternalEObject)acao_de_Saida).eInverseRemove(this, ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA, Acao.class, msgs);
      if (newAcao_de_Saida != null)
        msgs = ((InternalEObject)newAcao_de_Saida).eInverseAdd(this, ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA, Acao.class, msgs);
      msgs = basicSetAcao_de_Saida(newAcao_de_Saida, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA, newAcao_de_Saida, newAcao_de_Saida));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA:
        if (acao_de_Entrada != null)
          msgs = ((InternalEObject)acao_de_Entrada).eInverseRemove(this, ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA, Acao.class, msgs);
        return basicSetAcao_de_Entrada((Acao)otherEnd, msgs);
      case ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA:
        if (acao_de_Saida != null)
          msgs = ((InternalEObject)acao_de_Saida).eInverseRemove(this, ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA, Acao.class, msgs);
        return basicSetAcao_de_Saida((Acao)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA:
        return basicSetAcao_de_Entrada(null, msgs);
      case ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA:
        return basicSetAcao_de_Saida(null, msgs);
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
      case ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA:
        if (resolve) return getAcao_de_Entrada();
        return basicGetAcao_de_Entrada();
      case ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA:
        if (resolve) return getAcao_de_Saida();
        return basicGetAcao_de_Saida();
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
      case ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA:
        setAcao_de_Entrada((Acao)newValue);
        return;
      case ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA:
        setAcao_de_Saida((Acao)newValue);
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
      case ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA:
        setAcao_de_Entrada((Acao)null);
        return;
      case ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA:
        setAcao_de_Saida((Acao)null);
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
      case ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA:
        return acao_de_Entrada != null;
      case ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA:
        return acao_de_Saida != null;
    }
    return super.eIsSet(featureID);
  }

} //TransicoesImpl
