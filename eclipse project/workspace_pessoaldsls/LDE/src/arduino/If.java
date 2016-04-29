/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.If#getNome <em>Nome</em>}</li>
 *   <li>{@link arduino.If#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getIf()
 * @model annotation="gmf.node figure='ellipse' border.color='214,214,214' color='214,214,214' label='nome' label.readOnly='true'"
 * @generated
 */
public interface If extends Acoes_Condicionais
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"If"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getIf_Nome()
   * @model default="If"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.If#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' reference.
   * @see #setThen(Acao)
   * @see arduino.ArduinoPackage#getIf_Then()
   * @model required="true"
   * @generated
   */
  Acao getThen();

  /**
   * Sets the value of the '{@link arduino.If#getThen <em>Then</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Acao value);

} // If
