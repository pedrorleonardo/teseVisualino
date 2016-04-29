/**
 */
package arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transicoes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Transicoes#getAcao_de_Entrada <em>Acao de Entrada</em>}</li>
 *   <li>{@link arduino.Transicoes#getAcao_de_Saida <em>Acao de Saida</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getTransicoes()
 * @model annotation="gmf.link source='Acao_de_Entrada' target='Acao_de_Saida' target.decoration='filledclosedarrow' width='2'"
 * @generated
 */
public interface Transicoes extends EObject
{
  /**
   * Returns the value of the '<em><b>Acao de Entrada</b></em>' reference.
   * It is bidirectional and its opposite is '{@link arduino.Acao#getTransicao_de_Saida <em>Transicao de Saida</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acao de Entrada</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acao de Entrada</em>' reference.
   * @see #setAcao_de_Entrada(Acao)
   * @see arduino.ArduinoPackage#getTransicoes_Acao_de_Entrada()
   * @see arduino.Acao#getTransicao_de_Saida
   * @model opposite="Transicao_de_Saida"
   * @generated
   */
  Acao getAcao_de_Entrada();

  /**
   * Sets the value of the '{@link arduino.Transicoes#getAcao_de_Entrada <em>Acao de Entrada</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acao de Entrada</em>' reference.
   * @see #getAcao_de_Entrada()
   * @generated
   */
  void setAcao_de_Entrada(Acao value);

  /**
   * Returns the value of the '<em><b>Acao de Saida</b></em>' reference.
   * It is bidirectional and its opposite is '{@link arduino.Acao#getTransicao_de_Entrada <em>Transicao de Entrada</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acao de Saida</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acao de Saida</em>' reference.
   * @see #setAcao_de_Saida(Acao)
   * @see arduino.ArduinoPackage#getTransicoes_Acao_de_Saida()
   * @see arduino.Acao#getTransicao_de_Entrada
   * @model opposite="Transicao_de_Entrada"
   * @generated
   */
  Acao getAcao_de_Saida();

  /**
   * Sets the value of the '{@link arduino.Transicoes#getAcao_de_Saida <em>Acao de Saida</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acao de Saida</em>' reference.
   * @see #getAcao_de_Saida()
   * @generated
   */
  void setAcao_de_Saida(Acao value);

} // Transicoes
