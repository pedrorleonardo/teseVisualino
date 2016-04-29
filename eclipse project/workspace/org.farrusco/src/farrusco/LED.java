/**
 */
package farrusco;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link farrusco.LED#getNome <em>Nome</em>}</li>
 *   <li>{@link farrusco.LED#getLigado_ou_Desligado <em>Ligado ou Desligado</em>}</li>
 * </ul>
 * </p>
 *
 * @see farrusco.FarruscoPackage#getLED()
 * @model annotation="gmf.node figure='figuresPlan.figures.LEDFigure' label='Nome' label.readOnly='true' label.placement='none' tool.name='Luz'"
 * @generated
 */
public interface LED extends Actuate
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Luz"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see farrusco.FarruscoPackage#getLED_Nome()
   * @model default="Luz"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link farrusco.LED#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Ligado ou Desligado</b></em>' attribute.
   * The default value is <code>"Ligado"</code>.
   * The literals are from the enumeration {@link farrusco.EstadoDaLuz}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ligado ou Desligado</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ligado ou Desligado</em>' attribute.
   * @see farrusco.EstadoDaLuz
   * @see #setLigado_ou_Desligado(EstadoDaLuz)
   * @see farrusco.FarruscoPackage#getLED_Ligado_ou_Desligado()
   * @model default="Ligado"
   * @generated
   */
  EstadoDaLuz getLigado_ou_Desligado();

  /**
   * Sets the value of the '{@link farrusco.LED#getLigado_ou_Desligado <em>Ligado ou Desligado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ligado ou Desligado</em>' attribute.
   * @see farrusco.EstadoDaLuz
   * @see #getLigado_ou_Desligado()
   * @generated
   */
  void setLigado_ou_Desligado(EstadoDaLuz value);

} // LED
