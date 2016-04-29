/**
 */
package farrusco;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prioridade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link farrusco.Prioridade#getNome <em>Nome</em>}</li>
 * </ul>
 * </p>
 *
 * @see farrusco.FarruscoPackage#getPrioridade()
 * @model annotation="gmf.node figure='figuresPlan.figures.PrioridadeFigure' label='Nome' label.readOnly='true' label.placement='none' tool.name='Decisor'"
 * @generated
 */
public interface Prioridade extends Behavior
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Decisor"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see farrusco.FarruscoPackage#getPrioridade_Nome()
   * @model default="Decisor"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link farrusco.Prioridade#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

} // Prioridade
