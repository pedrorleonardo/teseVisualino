/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corpo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Corpo#isEvitarObstaculo <em>Evitar Obstaculo</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getCorpo()
 * @model abstract="true"
 * @generated
 */
public interface Corpo extends Acoes_Predefinidas
{

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
   * @see arduino.ArduinoPackage#getCorpo_EvitarObstaculo()
   * @model
   * @generated
   */
  boolean isEvitarObstaculo();

  /**
   * Sets the value of the '{@link arduino.Corpo#isEvitarObstaculo <em>Evitar Obstaculo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Evitar Obstaculo</em>' attribute.
   * @see #isEvitarObstaculo()
   * @generated
   */
  void setEvitarObstaculo(boolean value);
} // Corpo
