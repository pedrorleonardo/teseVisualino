/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virar Max Esq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Virar_Max_Esq#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getVirar_Max_Esq()
 * @model annotation="gmf.node figure='ellipse' border.color='255,130,253' color='255,130,253' label='nome' label.readOnly='true'"
 * @generated
 */
public interface Virar_Max_Esq extends Cabeca
{

  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Virar M\u00e1x. Esquerda"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getVirar_Max_Esq_Nome()
   * @model default="Virar M\u00e1x. Esquerda"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.Virar_Max_Esq#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);
} // Virar_Max_Esq
