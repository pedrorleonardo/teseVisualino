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
 * An implementation of the model object '<em><b>Acao</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arduino.impl.AcaoImpl#getTransicao_de_Entrada <em>Transicao de Entrada</em>}</li>
 *   <li>{@link arduino.impl.AcaoImpl#getTransicao_de_Saida <em>Transicao de Saida</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AcaoImpl extends EObjectImpl implements Acao
{
  /**
   * The cached value of the '{@link #getTransicao_de_Entrada() <em>Transicao de Entrada</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransicao_de_Entrada()
   * @generated
   * @ordered
   */
  protected Transicoes transicao_de_Entrada;

  /**
   * The cached value of the '{@link #getTransicao_de_Saida() <em>Transicao de Saida</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransicao_de_Saida()
   * @generated
   * @ordered
   */
  protected Transicoes transicao_de_Saida;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AcaoImpl()
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
    return ArduinoPackage.Literals.ACAO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transicoes getTransicao_de_Entrada()
  {
    if (transicao_de_Entrada != null && transicao_de_Entrada.eIsProxy())
    {
      InternalEObject oldTransicao_de_Entrada = (InternalEObject)transicao_de_Entrada;
      transicao_de_Entrada = (Transicoes)eResolveProxy(oldTransicao_de_Entrada);
      if (transicao_de_Entrada != oldTransicao_de_Entrada)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA, oldTransicao_de_Entrada, transicao_de_Entrada));
      }
    }
    return transicao_de_Entrada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transicoes basicGetTransicao_de_Entrada()
  {
    return transicao_de_Entrada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransicao_de_Entrada(Transicoes newTransicao_de_Entrada, NotificationChain msgs)
  {
    Transicoes oldTransicao_de_Entrada = transicao_de_Entrada;
    transicao_de_Entrada = newTransicao_de_Entrada;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA, oldTransicao_de_Entrada, newTransicao_de_Entrada);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransicao_de_Entrada(Transicoes newTransicao_de_Entrada)
  {
    if (newTransicao_de_Entrada != transicao_de_Entrada)
    {
      NotificationChain msgs = null;
      if (transicao_de_Entrada != null)
        msgs = ((InternalEObject)transicao_de_Entrada).eInverseRemove(this, ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA, Transicoes.class, msgs);
      if (newTransicao_de_Entrada != null)
        msgs = ((InternalEObject)newTransicao_de_Entrada).eInverseAdd(this, ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA, Transicoes.class, msgs);
      msgs = basicSetTransicao_de_Entrada(newTransicao_de_Entrada, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA, newTransicao_de_Entrada, newTransicao_de_Entrada));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transicoes getTransicao_de_Saida()
  {
    if (transicao_de_Saida != null && transicao_de_Saida.eIsProxy())
    {
      InternalEObject oldTransicao_de_Saida = (InternalEObject)transicao_de_Saida;
      transicao_de_Saida = (Transicoes)eResolveProxy(oldTransicao_de_Saida);
      if (transicao_de_Saida != oldTransicao_de_Saida)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA, oldTransicao_de_Saida, transicao_de_Saida));
      }
    }
    return transicao_de_Saida;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transicoes basicGetTransicao_de_Saida()
  {
    return transicao_de_Saida;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransicao_de_Saida(Transicoes newTransicao_de_Saida, NotificationChain msgs)
  {
    Transicoes oldTransicao_de_Saida = transicao_de_Saida;
    transicao_de_Saida = newTransicao_de_Saida;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA, oldTransicao_de_Saida, newTransicao_de_Saida);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransicao_de_Saida(Transicoes newTransicao_de_Saida)
  {
    if (newTransicao_de_Saida != transicao_de_Saida)
    {
      NotificationChain msgs = null;
      if (transicao_de_Saida != null)
        msgs = ((InternalEObject)transicao_de_Saida).eInverseRemove(this, ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA, Transicoes.class, msgs);
      if (newTransicao_de_Saida != null)
        msgs = ((InternalEObject)newTransicao_de_Saida).eInverseAdd(this, ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA, Transicoes.class, msgs);
      msgs = basicSetTransicao_de_Saida(newTransicao_de_Saida, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA, newTransicao_de_Saida, newTransicao_de_Saida));
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
      case ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA:
        if (transicao_de_Entrada != null)
          msgs = ((InternalEObject)transicao_de_Entrada).eInverseRemove(this, ArduinoPackage.TRANSICOES__ACAO_DE_SAIDA, Transicoes.class, msgs);
        return basicSetTransicao_de_Entrada((Transicoes)otherEnd, msgs);
      case ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA:
        if (transicao_de_Saida != null)
          msgs = ((InternalEObject)transicao_de_Saida).eInverseRemove(this, ArduinoPackage.TRANSICOES__ACAO_DE_ENTRADA, Transicoes.class, msgs);
        return basicSetTransicao_de_Saida((Transicoes)otherEnd, msgs);
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
      case ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA:
        return basicSetTransicao_de_Entrada(null, msgs);
      case ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA:
        return basicSetTransicao_de_Saida(null, msgs);
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
      case ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA:
        if (resolve) return getTransicao_de_Entrada();
        return basicGetTransicao_de_Entrada();
      case ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA:
        if (resolve) return getTransicao_de_Saida();
        return basicGetTransicao_de_Saida();
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
      case ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA:
        setTransicao_de_Entrada((Transicoes)newValue);
        return;
      case ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA:
        setTransicao_de_Saida((Transicoes)newValue);
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
      case ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA:
        setTransicao_de_Entrada((Transicoes)null);
        return;
      case ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA:
        setTransicao_de_Saida((Transicoes)null);
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
      case ArduinoPackage.ACAO__TRANSICAO_DE_ENTRADA:
        return transicao_de_Entrada != null;
      case ArduinoPackage.ACAO__TRANSICAO_DE_SAIDA:
        return transicao_de_Saida != null;
    }
    return super.eIsSet(featureID);
  }

} //AcaoImpl
