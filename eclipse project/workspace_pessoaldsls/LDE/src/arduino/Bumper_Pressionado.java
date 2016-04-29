/**
 */
package arduino;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bumper Pressionado</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Bumper_Pressionado#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getBumper_Pressionado()
 * @model annotation="gmf.node figure='ellipse' border.color='214,214,214' color='214,214,214' label='nome' label.readOnly='true'"
 * @generated
 */
public interface Bumper_Pressionado extends Condicao
{

  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Bumper"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getBumper_Pressionado_Nome()
   * @model default="Bumper"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.Bumper_Pressionado#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);
} // Bumper_Pressionado
