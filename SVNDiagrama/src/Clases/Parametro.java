/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parametro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Clases.Parametro#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Clases.Parametro#getTipo <em>Tipo</em>}</li>
 * </ul>
 * </p>
 *
 * @see Clases.ClasesPackage#getParametro()
 * @model annotation="gmf.node label='nombre' figure='rectangle' border.width='0' border.color='255,255,255' label.icon='false'"
 * @generated
 */
public interface Parametro extends EObject
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(String)
   * @see Clases.ClasesPackage#getParametro_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link Clases.Parametro#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Tipo</b></em>' attribute.
   * The literals are from the enumeration {@link Clases.EnumTipos}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo</em>' attribute.
   * @see Clases.EnumTipos
   * @see #setTipo(EnumTipos)
   * @see Clases.ClasesPackage#getParametro_Tipo()
   * @model
   * @generated
   */
  EnumTipos getTipo();

  /**
   * Sets the value of the '{@link Clases.Parametro#getTipo <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' attribute.
   * @see Clases.EnumTipos
   * @see #getTipo()
   * @generated
   */
  void setTipo(EnumTipos value);

} // Parametro
