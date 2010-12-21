/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum Relaciones</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Clases.ClasesPackage#getEnumRelaciones()
 * @model
 * @generated
 */
public enum EnumRelaciones implements Enumerator
{
  /**
   * The '<em><b>Herencia</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HERENCIA_VALUE
   * @generated
   * @ordered
   */
  HERENCIA(0, "Herencia", "Herencia"),

  /**
   * The '<em><b>Agregacion</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AGREGACION_VALUE
   * @generated
   * @ordered
   */
  AGREGACION(1, "Agregacion", "Agregacion"),

  /**
   * The '<em><b>Composicion</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COMPOSICION_VALUE
   * @generated
   * @ordered
   */
  COMPOSICION(2, "Composicion", "Composicion"),

  /**
   * The '<em><b>Implementacion</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IMPLEMENTACION_VALUE
   * @generated
   * @ordered
   */
  IMPLEMENTACION(3, "Implementacion", "Implementacion");

  /**
   * The '<em><b>Herencia</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Herencia</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HERENCIA
   * @model name="Herencia"
   * @generated
   * @ordered
   */
  public static final int HERENCIA_VALUE = 0;

  /**
   * The '<em><b>Agregacion</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Agregacion</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AGREGACION
   * @model name="Agregacion"
   * @generated
   * @ordered
   */
  public static final int AGREGACION_VALUE = 1;

  /**
   * The '<em><b>Composicion</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Composicion</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COMPOSICION
   * @model name="Composicion"
   * @generated
   * @ordered
   */
  public static final int COMPOSICION_VALUE = 2;

  /**
   * The '<em><b>Implementacion</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Implementacion</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IMPLEMENTACION
   * @model name="Implementacion"
   * @generated
   * @ordered
   */
  public static final int IMPLEMENTACION_VALUE = 3;

  /**
   * An array of all the '<em><b>Enum Relaciones</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EnumRelaciones[] VALUES_ARRAY =
    new EnumRelaciones[]
    {
      HERENCIA,
      AGREGACION,
      COMPOSICION,
      IMPLEMENTACION,
    };

  /**
   * A public read-only list of all the '<em><b>Enum Relaciones</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EnumRelaciones> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Enum Relaciones</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EnumRelaciones get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumRelaciones result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Relaciones</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EnumRelaciones getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EnumRelaciones result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Enum Relaciones</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EnumRelaciones get(int value)
  {
    switch (value)
    {
      case HERENCIA_VALUE: return HERENCIA;
      case AGREGACION_VALUE: return AGREGACION;
      case COMPOSICION_VALUE: return COMPOSICION;
      case IMPLEMENTACION_VALUE: return IMPLEMENTACION;
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
  private EnumRelaciones(int value, String name, String literal)
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
  
} //EnumRelaciones
