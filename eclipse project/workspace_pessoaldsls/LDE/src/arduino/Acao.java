/**
 */
package arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acao</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Acao#getTransicao_de_Entrada <em>Transicao de Entrada</em>}</li>
 *   <li>{@link arduino.Acao#getTransicao_de_Saida <em>Transicao de Saida</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getAcao()
 * @model abstract="true"
 * @generated
 */
public interface Acao extends EObject
{
  /**
   * Returns the value of the '<em><b>Transicao de Entrada</b></em>' reference.
   * It is bidirectional and its opposite is '{@link arduino.Transicoes#getAcao_de_Saida <em>Acao de Saida</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transicao de Entrada</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transicao de Entrada</em>' reference.
   * @see #setTransicao_de_Entrada(Transicoes)
   * @see arduino.ArduinoPackage#getAcao_Transicao_de_Entrada()
   * @see arduino.Transicoes#getAcao_de_Saida
   * @model opposite="Acao_de_Saida"
   * @generated
   */
  Transicoes getTransicao_de_Entrada();

  /**
   * Sets the value of the '{@link arduino.Acao#getTransicao_de_Entrada <em>Transicao de Entrada</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transicao de Entrada</em>' reference.
   * @see #getTransicao_de_Entrada()
   * @generated
   */
  void setTransicao_de_Entrada(Transicoes value);

  /**
   * Returns the value of the '<em><b>Transicao de Saida</b></em>' reference.
   * It is bidirectional and its opposite is '{@link arduino.Transicoes#getAcao_de_Entrada <em>Acao de Entrada</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transicao de Saida</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transicao de Saida</em>' reference.
   * @see #setTransicao_de_Saida(Transicoes)
   * @see arduino.ArduinoPackage#getAcao_Transicao_de_Saida()
   * @see arduino.Transicoes#getAcao_de_Entrada
   * @model opposite="Acao_de_Entrada"
   * @generated
   */
  Transicoes getTransicao_de_Saida();

  /**
   * Sets the value of the '{@link arduino.Acao#getTransicao_de_Saida <em>Transicao de Saida</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transicao de Saida</em>' reference.
   * @see #getTransicao_de_Saida()
   * @generated
   */
  void setTransicao_de_Saida(Transicoes value);

} // Acao
