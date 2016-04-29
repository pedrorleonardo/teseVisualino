/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabeca Modificavel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Cabeca_Modificavel#getGraus <em>Graus</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getCabeca_Modificavel()
 * @model abstract="true"
 * @generated
 */
public interface Cabeca_Modificavel extends Acoes_Modificaveis
{
  /**
   * Returns the value of the '<em><b>Graus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graus</em>' attribute.
   * @see #setGraus(int)
   * @see arduino.ArduinoPackage#getCabeca_Modificavel_Graus()
   * @model
   * @generated
   */
  int getGraus();

  /**
   * Sets the value of the '{@link arduino.Cabeca_Modificavel#getGraus <em>Graus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graus</em>' attribute.
   * @see #getGraus()
   * @generated
   */
  void setGraus(int value);

} // Cabeca_Modificavel
