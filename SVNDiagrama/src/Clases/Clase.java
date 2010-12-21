/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Clases.Clase#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link Clases.Clase#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link Clases.Clase#getPaquete <em>Paquete</em>}</li>
 *   <li>{@link Clases.Clase#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link Clases.Clase#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @see Clases.ClasesPackage#getClase()
 * @model annotation="gmf.node label='nombre' figure='rectangle' label.icon='false'"
 * @generated
 */
public interface Clase extends EObject
{
  /**
   * Returns the value of the '<em><b>Atributos</b></em>' containment reference list.
   * The list contents are of type {@link Clases.Atributo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atributos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atributos</em>' containment reference list.
   * @see Clases.ClasesPackage#getClase_Atributos()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar' layout='list'"
   * @generated
   */
  EList<Atributo> getAtributos();

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
   * @see Clases.ClasesPackage#getClase_Visibilidad()
   * @model
   * @generated
   */
  EnumVisibilidad getVisibilidad();

  /**
   * Sets the value of the '{@link Clases.Clase#getVisibilidad <em>Visibilidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibilidad</em>' attribute.
   * @see Clases.EnumVisibilidad
   * @see #getVisibilidad()
   * @generated
   */
  void setVisibilidad(EnumVisibilidad value);

  /**
   * Returns the value of the '<em><b>Paquete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paquete</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paquete</em>' attribute.
   * @see #setPaquete(String)
   * @see Clases.ClasesPackage#getClase_Paquete()
   * @model
   * @generated
   */
  String getPaquete();

  /**
   * Sets the value of the '{@link Clases.Clase#getPaquete <em>Paquete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Paquete</em>' attribute.
   * @see #getPaquete()
   * @generated
   */
  void setPaquete(String value);

  /**
   * Returns the value of the '<em><b>Metodos</b></em>' containment reference list.
   * The list contents are of type {@link Clases.Metodo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Metodos</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metodos</em>' containment reference list.
   * @see Clases.ClasesPackage#getClase_Metodos()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar' layout='list'"
   * @generated
   */
  EList<Metodo> getMetodos();

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
   * @see Clases.ClasesPackage#getClase_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link Clases.Clase#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

} // Clase
