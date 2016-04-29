/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Inicio#getNome <em>Nome</em>}</li>
 *   <li>{@link arduino.Inicio#isEvitarObstaculo <em>Evitar Obstaculo</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getInicio()
 * @model annotation="gmf.node figure='ellipse' border.color='0,255,0' color='0,255,0' label='nome' label.readOnly='true' label.icon='false'"
 * @generated
 */
public interface Inicio extends Acao
{

  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"In\u00edcio"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getInicio_Nome()
   * @model default="In\u00edcio"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.Inicio#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Evitar Obstaculo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evitar Obstaculo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evitar Obstaculo</em>' attribute.
   * @see #setEvitarObstaculo(boolean)
   * @see arduino.ArduinoPackage#getInicio_EvitarObstaculo()
   * @model
   * @generated
   */
  boolean isEvitarObstaculo();

  /**
   * Sets the value of the '{@link arduino.Inicio#isEvitarObstaculo <em>Evitar Obstaculo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evitar Obstaculo</em>' attribute.
   * @see #isEvitarObstaculo()
   * @generated
   */
  void setEvitarObstaculo(boolean value);
} // Inicio
