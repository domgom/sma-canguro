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
 * A representation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Clases.Relacion#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Clases.Relacion#getDestino <em>Destino</em>}</li>
 *   <li>{@link Clases.Relacion#getOrigen <em>Origen</em>}</li>
 * </ul>
 * </p>
 *
 * @see Clases.ClasesPackage#getRelacion()
 * @model annotation="gmf.link label='nombre' source='origen' target='destino' style='solid' width='2'"
 * @generated
 */
public interface Relacion extends EObject
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
   * @see Clases.ClasesPackage#getRelacion_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link Clases.Relacion#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Destino</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destino</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destino</em>' reference.
   * @see #setDestino(Clase)
   * @see Clases.ClasesPackage#getRelacion_Destino()
   * @model required="true"
   * @generated
   */
  Clase getDestino();

  /**
   * Sets the value of the '{@link Clases.Relacion#getDestino <em>Destino</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destino</em>' reference.
   * @see #getDestino()
   * @generated
   */
  void setDestino(Clase value);

  /**
   * Returns the value of the '<em><b>Origen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origen</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Origen</em>' reference.
   * @see #setOrigen(Clase)
   * @see Clases.ClasesPackage#getRelacion_Origen()
   * @model required="true"
   * @generated
   */
  Clase getOrigen();

  /**
   * Sets the value of the '{@link Clases.Relacion#getOrigen <em>Origen</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Origen</em>' reference.
   * @see #getOrigen()
   * @generated
   */
  void setOrigen(Clase value);

} // Relacion
