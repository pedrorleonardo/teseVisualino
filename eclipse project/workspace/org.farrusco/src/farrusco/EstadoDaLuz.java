/**
 */
package farrusco;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Estado Da Luz</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see farrusco.FarruscoPackage#getEstadoDaLuz()
 * @model
 * @generated
 */
public enum EstadoDaLuz implements Enumerator
{
  /**
   * The '<em><b>Ligado</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIGADO_VALUE
   * @generated
   * @ordered
   */
  LIGADO(0, "Ligado", "Ligado"),

  /**
   * The '<em><b>Desligado</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DESLIGADO_VALUE
   * @generated
   * @ordered
   */
  DESLIGADO(1, "Desligado", "Desligado");

  /**
   * The '<em><b>Ligado</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ligado</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LIGADO
   * @model name="Ligado"
   * @generated
   * @ordered
   */
  public static final int LIGADO_VALUE = 0;

  /**
   * The '<em><b>Desligado</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Desligado</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DESLIGADO
   * @model name="Desligado"
   * @generated
   * @ordered
   */
  public static final int DESLIGADO_VALUE = 1;

  /**
   * An array of all the '<em><b>Estado Da Luz</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EstadoDaLuz[] VALUES_ARRAY =
    new EstadoDaLuz[]
    {
      LIGADO,
      DESLIGADO,
    };

  /**
   * A public read-only list of all the '<em><b>Estado Da Luz</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EstadoDaLuz> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Estado Da Luz</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EstadoDaLuz get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EstadoDaLuz result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Estado Da Luz</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EstadoDaLuz getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EstadoDaLuz result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Estado Da Luz</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EstadoDaLuz get(int value)
  {
    switch (value)
    {
      case LIGADO_VALUE: return LIGADO;
      case DESLIGADO_VALUE: return DESLIGADO;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EstadoDaLuz(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EstadoDaLuz
