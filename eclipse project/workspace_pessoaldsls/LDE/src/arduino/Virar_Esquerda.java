/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virar Esquerda</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Virar_Esquerda#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getVirar_Esquerda()
 * @model annotation="gmf.node figure='ellipse' border.color='64,207,255' color='64,207,255' label='nome' label.readOnly='true'"
 * @generated
 */
public interface Virar_Esquerda extends Corpo
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Virar Esquerda"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getVirar_Esquerda_Nome()
   * @model default="Virar Esquerda"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.Virar_Esquerda#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

} // Virar_Esquerda