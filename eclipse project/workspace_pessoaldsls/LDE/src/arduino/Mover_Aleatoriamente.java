/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mover Aleatoriamente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Mover_Aleatoriamente#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getMover_Aleatoriamente()
 * @model annotation="gmf.node figure='ellipse' border.color='64,207,255' color='64,207,255' label='nome' label.readOnly='true'"
 * @generated
 */
public interface Mover_Aleatoriamente extends Corpo
{

  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Mover Aleatoriamente"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getMover_Aleatoriamente_Nome()
   * @model default="Mover Aleatoriamente"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.Mover_Aleatoriamente#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);
} // Mover_Aleatoriamente
