/**
 */
package farrusco;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distancia</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link farrusco.Distancia#getNome <em>Nome</em>}</li>
 *   <li>{@link farrusco.Distancia#getDistancia <em>Distancia</em>}</li>
 *   <li>{@link farrusco.Distancia#getMenor_Maior <em>Menor Maior</em>}</li>
 * </ul>
 * </p>
 *
 * @see farrusco.FarruscoPackage#getDistancia()
 * @model annotation="gmf.node figure='figuresPlan.figures.DistanciaFigure' label='Nome' label.readOnly='true' label.placement='none' tool.name='Distancia'"
 * @generated
 */
public interface Distancia extends Condition
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Distancia"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see farrusco.FarruscoPackage#getDistancia_Nome()
   * @model default="Distancia"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link farrusco.Distancia#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Distancia</b></em>' attribute.
   * The default value is <code>"300"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distancia</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distancia</em>' attribute.
   * @see #setDistancia(int)
   * @see farrusco.FarruscoPackage#getDistancia_Distancia()
   * @model default="300"
   * @generated
   */
  int getDistancia();

  /**
   * Sets the value of the '{@link farrusco.Distancia#getDistancia <em>Distancia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Distancia</em>' attribute.
   * @see #getDistancia()
   * @generated
   */
  void setDistancia(int value);

  /**
   * Returns the value of the '<em><b>Menor Maior</b></em>' attribute.
   * The default value is <code>"Maior"</code>.
   * The literals are from the enumeration {@link farrusco.TipoDistancia}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Menor Maior</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Menor Maior</em>' attribute.
   * @see farrusco.TipoDistancia
   * @see #setMenor_Maior(TipoDistancia)
   * @see farrusco.FarruscoPackage#getDistancia_Menor_Maior()
   * @model default="Maior"
   * @generated
   */
  TipoDistancia getMenor_Maior();

  /**
   * Sets the value of the '{@link farrusco.Distancia#getMenor_Maior <em>Menor Maior</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Menor Maior</em>' attribute.
   * @see farrusco.TipoDistancia
   * @see #getMenor_Maior()
   * @generated
   */
  void setMenor_Maior(TipoDistancia value);

} // Distancia
