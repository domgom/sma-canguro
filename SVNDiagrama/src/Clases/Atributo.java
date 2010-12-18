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
 * A representation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Clases.Atributo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Clases.Atributo#getTipo <em>Tipo</em>}</li>
 *   <li>{@link Clases.Atributo#getVisibilidad <em>Visibilidad</em>}</li>
 * </ul>
 * </p>
 *
 * @see Clases.ClasesPackage#getAtributo()
 * @model annotation="gmf.node label='nombre' figure='rectangle' border.width='0' border.color='255,255,255' label.icon='false'"
 * @generated
 */
public interface Atributo extends EObject
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
   * @see Clases.ClasesPackage#getAtributo_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link Clases.Atributo#getNombre <em>Nombre</em>}' attribute.
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
   * @see Clases.ClasesPackage#getAtributo_Tipo()
   * @model
   * @generated
   */
  EnumTipos getTipo();

  /**
   * Sets the value of the '{@link Clases.Atributo#getTipo <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo</em>' attribute.
   * @see Clases.EnumTipos
   * @see #getTipo()
   * @generated
   */
  void setTipo(EnumTipos value);

  /**
   * Returns the value of the '<em><b>Visibilidad</b></em>' attribute.
   * The literals are from the enumeration {@link Clases.EnumVisibilidad}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibilidad</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibilidad</em>' attribute.
   * @see Clases.EnumVisibilidad
   * @see #setVisibilidad(EnumVisibilidad)
   * @see Clases.ClasesPackage#getAtributo_Visibilidad()
   * @model
   * @generated
   */
  EnumVisibilidad getVisibilidad();

  /**
   * Sets the value of the '{@link Clases.Atributo#getVisibilidad <em>Visibilidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibilidad</em>' attribute.
   * @see Clases.EnumVisibilidad
   * @see #getVisibilidad()
   * @generated
   */
  void setVisibilidad(EnumVisibilidad value);

} // Atributo
