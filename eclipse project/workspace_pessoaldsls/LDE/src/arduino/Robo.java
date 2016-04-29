/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arduino.Robo#getTemAcoes <em>Tem Acoes</em>}</li>
 *   <li>{@link arduino.Robo#getTemTransicoes <em>Tem Transicoes</em>}</li>
 *   <li>{@link arduino.Robo#getNome <em>Nome</em>}</li>
 *   <li>{@link arduino.Robo#getTemCondicoes <em>Tem Condicoes</em>}</li>
 * </ul>
 * </p>
 *
 * @see arduino.ArduinoPackage#getRobo()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Robo extends EObject
{
  /**
   * Returns the value of the '<em><b>Tem Acoes</b></em>' containment reference list.
   * The list contents are of type {@link arduino.Acao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tem Acoes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tem Acoes</em>' containment reference list.
   * @see arduino.ArduinoPackage#getRobo_TemAcoes()
   * @model containment="true"
   * @generated
   */
  EList<Acao> getTemAcoes();

  /**
   * Returns the value of the '<em><b>Tem Transicoes</b></em>' containment reference list.
   * The list contents are of type {@link arduino.Transicoes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tem Transicoes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tem Transicoes</em>' containment reference list.
   * @see arduino.ArduinoPackage#getRobo_TemTransicoes()
   * @model containment="true"
   * @generated
   */
  EList<Transicoes> getTemTransicoes();

  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see arduino.ArduinoPackage#getRobo_Nome()
   * @model
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link arduino.Robo#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Tem Condicoes</b></em>' containment reference list.
   * The list contents are of type {@link arduino.Condicao}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tem Condicoes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tem Condicoes</em>' containment reference list.
   * @see arduino.ArduinoPackage#getRobo_TemCondicoes()
   * @model containment="true"
   * @generated
   */
  EList<Condicao> getTemCondicoes();

} // Robo
