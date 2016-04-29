/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.While#getNome <em>Nome</em>}</li>
 *   <li>{@link arduino.While#getCorpo <em>Corpo</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getWhile()
 * @model annotation="gmf.node figure='ellipse' border.color='214,214,214' color='214,214,214' label='nome' label.readOnly='true'"
 * @generated
 */
public interface While extends Acoes_Condicionais
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"While"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getWhile_Nome()
   * @model default="While"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.While#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Corpo</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Corpo</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Corpo</em>' reference.
   * @see #setCorpo(Acao)
   * @see arduino.ArduinoPackage#getWhile_Corpo()
   * @model required="true"
   * @generated
   */
  Acao getCorpo();

  /**
   * Sets the value of the '{@link arduino.While#getCorpo <em>Corpo</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Corpo</em>' reference.
   * @see #getCorpo()
   * @generated
   */
  void setCorpo(Acao value);

} // While
