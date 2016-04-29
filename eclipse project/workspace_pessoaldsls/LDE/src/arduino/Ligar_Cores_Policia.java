/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ligar Cores Policia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Ligar_Cores_Policia#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getLigar_Cores_Policia()
 * @model annotation="gmf.node figure='ellipse' border.color='255,255,64' color='255,255,64' label='nome' label.readOnly='true'"
 * @generated
 */
public interface Ligar_Cores_Policia extends Varias_Cores
{

  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Ligar Cores Pol\u00edcia"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getLigar_Cores_Policia_Nome()
   * @model default="Ligar Cores Pol\u00edcia"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.Ligar_Cores_Policia#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);
} // Ligar_Cores_Policia
