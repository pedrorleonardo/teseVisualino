/**
 */
package farrusco;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link farrusco.Servo#getNome <em>Nome</em>}</li>
 *   <li>{@link farrusco.Servo#getPosicao_Minima <em>Posicao Minima</em>}</li>
 *   <li>{@link farrusco.Servo#getPosicao_Maxima <em>Posicao Maxima</em>}</li>
 *   <li>{@link farrusco.Servo#getPasso_a_Passo <em>Passo aPasso</em>}</li>
 * </ul>
 * </p>
 *
 * @see farrusco.FarruscoPackage#getServo()
 * @model annotation="gmf.node figure='figuresPlan.figures.ServoFigure' label='Nome' label.readOnly='true' label.placement='none' tool.name='Pesco\347o'"
 * @generated
 */
public interface Servo extends Actuate
{
  /**
   * Returns the value of the '<em><b>Nome</b></em>' attribute.
   * The default value is <code>"Servo"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nome</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nome</em>' attribute.
   * @see #setNome(String)
   * @see farrusco.FarruscoPackage#getServo_Nome()
   * @model default="Servo"
   * @generated
   */
  String getNome();

  /**
   * Sets the value of the '{@link farrusco.Servo#getNome <em>Nome</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nome</em>' attribute.
   * @see #getNome()
   * @generated
   */
  void setNome(String value);

  /**
   * Returns the value of the '<em><b>Posicao Minima</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Posicao Minima</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Posicao Minima</em>' attribute.
   * @see #setPosicao_Minima(int)
   * @see farrusco.FarruscoPackage#getServo_Posicao_Minima()
   * @model default="0"
   * @generated
   */
  int getPosicao_Minima();

  /**
   * Sets the value of the '{@link farrusco.Servo#getPosicao_Minima <em>Posicao Minima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Posicao Minima</em>' attribute.
   * @see #getPosicao_Minima()
   * @generated
   */
  void setPosicao_Minima(int value);

  /**
   * Returns the value of the '<em><b>Posicao Maxima</b></em>' attribute.
   * The default value is <code>"160"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Posicao Maxima</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Posicao Maxima</em>' attribute.
   * @see #setPosicao_Maxima(int)
   * @see farrusco.FarruscoPackage#getServo_Posicao_Maxima()
   * @model default="160"
   * @generated
   */
  int getPosicao_Maxima();

  /**
   * Sets the value of the '{@link farrusco.Servo#getPosicao_Maxima <em>Posicao Maxima</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Posicao Maxima</em>' attribute.
   * @see #getPosicao_Maxima()
   * @generated
   */
  void setPosicao_Maxima(int value);

  /**
   * Returns the value of the '<em><b>Passo aPasso</b></em>' attribute.
   * The default value is <code>"10"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Passo aPasso</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Passo aPasso</em>' attribute.
   * @see #setPasso_a_Passo(int)
   * @see farrusco.FarruscoPackage#getServo_Passo_a_Passo()
   * @model default="10"
   * @generated
   */
  int getPasso_a_Passo();

  /**
   * Sets the value of the '{@link farrusco.Servo#getPasso_a_Passo <em>Passo aPasso</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Passo aPasso</em>' attribute.
   * @see #getPasso_a_Passo()
   * @generated
   */
  void setPasso_a_Passo(int value);

} // Servo
