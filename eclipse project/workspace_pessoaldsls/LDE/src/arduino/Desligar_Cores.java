/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desligar Cores</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Desligar_Cores#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getDesligar_Cores()
 * @model annotation="gmf.node figure='ellipse' border.color='255,255,64' color='255,255,64' label='nome' label.readOnly='true'"
 * @generated
 */
public interface Desligar_Cores extends Varias_Cores
{

  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Desligar Cores"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getDesligar_Cores_Nome()
   * @model default="Desligar Cores"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.Desligar_Cores#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);
} // Desligar_Cores
