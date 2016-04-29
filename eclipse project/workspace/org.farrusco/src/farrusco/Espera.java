/**
 */
package farrusco;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Espera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link farrusco.Espera#getNome <em>Nome</em>}</li>
 *   <li>{@link farrusco.Espera#getTempo <em>Tempo</em>}</li>
 * </ul>
 * </p>
 *
 * @see farrusco.FarruscoPackage#getEspera()
 * @model annotation="gmf.node figure='figuresPlan.figures.EsperaFigure' label='Nome' label.readOnly='true' label.placement='none' tool.name='Rel\363gio'"
 * @generated
 */
public interface Espera extends Condition
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Tempo"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see farrusco.FarruscoPackage#getEspera_Nome()
   * @model default="Tempo"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link farrusco.Espera#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Tempo</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tempo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tempo</em>' attribute.
   * @see #setTempo(int)
   * @see farrusco.FarruscoPackage#getEspera_Tempo()
   * @model default="1"
   * @generated
   */
  int getTempo();

  /**
   * Sets the value of the '{@link farrusco.Espera#getTempo <em>Tempo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tempo</em>' attribute.
   * @see #getTempo()
   * @generated
   */
  void setTempo(int value);

} // Espera
