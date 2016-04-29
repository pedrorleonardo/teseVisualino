/**
 */
package farrusco;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequencial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link farrusco.Sequencial#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @see farrusco.FarruscoPackage#getSequencial()
 * @model annotation="gmf.node figure='figuresPlan.figures.SequencialFigure' label='Nome' label.readOnly='true' label.placement='none' tool.name='Sequencia'"
 * @generated
 */
public interface Sequencial extends Behavior
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Sequencia"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see farrusco.FarruscoPackage#getSequencial_Nome()
   * @model default="Sequencia"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link farrusco.Sequencial#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

} // Sequencial
