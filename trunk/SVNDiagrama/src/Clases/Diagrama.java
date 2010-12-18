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
 * A representation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Clases.Diagrama#getClases <em>Clases</em>}</li>
 *   <li>{@link Clases.Diagrama#getRelaciones <em>Relaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @see Clases.ClasesPackage#getDiagrama()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface Diagrama extends EObject
{
  /**
   * Returns the value of the '<em><b>Clases</b></em>' containment reference list.
   * The list contents are of type {@link Clases.Clase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clases</em>' containment reference list.
   * @see Clases.ClasesPackage#getDiagrama_Clases()
   * @model containment="true"
   * @generated
   */
  EList<Clase> getClases();

  /**
   * Returns the value of the '<em><b>Relaciones</b></em>' containment reference list.
   * The list contents are of type {@link Clases.Relacion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relaciones</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relaciones</em>' containment reference list.
   * @see Clases.ClasesPackage#getDiagrama_Relaciones()
   * @model containment="true"
   * @generated
   */
  EList<Relacion> getRelaciones();

} // Diagrama
