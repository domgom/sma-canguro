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
 * A representation of the model object '<em><b>Metodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Clases.Metodo#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link Clases.Metodo#isEsVoid <em>Es Void</em>}</li>
 *   <li>{@link Clases.Metodo#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Clases.Metodo#getParametrosEntrada <em>Parametros Entrada</em>}</li>
 * </ul>
 * </p>
 *
 * @see Clases.ClasesPackage#getMetodo()
 * @model annotation="gmf.node label='nombre' figure='rectangle' border.width='0' border.color='255,255,255' label.icon='false'"
 * @generated
 */
public interface Metodo extends EObject
{
  /**
   * Returns the value of the '<em><b>Tipo Retorno</b></em>' attribute.
   * The literals are from the enumeration {@link Clases.EnumTiposVoid}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tipo Retorno</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tipo Retorno</em>' attribute.
   * @see Clases.EnumTiposVoid
   * @see #setTipoRetorno(EnumTiposVoid)
   * @see Clases.ClasesPackage#getMetodo_TipoRetorno()
   * @model
   * @generated
   */
  EnumTiposVoid getTipoRetorno();

  /**
   * Sets the value of the '{@link Clases.Metodo#getTipoRetorno <em>Tipo Retorno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tipo Retorno</em>' attribute.
   * @see Clases.EnumTiposVoid
   * @see #getTipoRetorno()
   * @generated
   */
  void setTipoRetorno(EnumTiposVoid value);

  /**
   * Returns the value of the '<em><b>Es Void</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Es Void</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Es Void</em>' attribute.
   * @see #setEsVoid(boolean)
   * @see Clases.ClasesPackage#getMetodo_EsVoid()
   * @model
   * @generated
   */
  boolean isEsVoid();

  /**
   * Sets the value of the '{@link Clases.Metodo#isEsVoid <em>Es Void</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Es Void</em>' attribute.
   * @see #isEsVoid()
   * @generated
   */
  void setEsVoid(boolean value);

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
   * @see Clases.ClasesPackage#getMetodo_Nombre()
   * @model
   * @generated
   */
  String getNombre();

  /**
   * Sets the value of the '{@link Clases.Metodo#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(String value);

  /**
   * Returns the value of the '<em><b>Parametros Entrada</b></em>' containment reference list.
   * The list contents are of type {@link Clases.Parametro}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parametros Entrada</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parametros Entrada</em>' containment reference list.
   * @see Clases.ClasesPackage#getMetodo_ParametrosEntrada()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar' layout='list'"
   * @generated
   */
  EList<Parametro> getParametrosEntrada();

} // Metodo
