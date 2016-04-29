/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acoes Condicionais</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Acoes_Condicionais#getTem <em>Tem</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getAcoes_Condicionais()
 * @model abstract="true"
 * @generated
 */
public interface Acoes_Condicionais extends Acao
{
  /**
   * Returns the value of the '<em><b>Tem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tem</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tem</em>' reference.
   * @see #setTem(Condicao)
   * @see arduino.ArduinoPackage#getAcoes_Condicionais_Tem()
   * @model required="true"
   * @generated
   */
  Condicao getTem();

  /**
   * Sets the value of the '{@link arduino.Acoes_Condicionais#getTem <em>Tem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tem</em>' reference.
   * @see #getTem()
   * @generated
   */
  void setTem(Condicao value);

} // Acoes_Condicionais
