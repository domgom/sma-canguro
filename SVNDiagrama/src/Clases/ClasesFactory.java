/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Clases.ClasesPackage
 * @generated
 */
public interface ClasesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ClasesFactory eINSTANCE = Clases.impl.ClasesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Diagrama</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Diagrama</em>'.
   * @generated
   */
  Diagrama createDiagrama();

  /**
   * Returns a new object of class '<em>Clase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clase</em>'.
   * @generated
   */
  Clase createClase();

  /**
   * Returns a new object of class '<em>Atributo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atributo</em>'.
   * @generated
   */
  Atributo createAtributo();

  /**
   * Returns a new object of class '<em>Relacion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relacion</em>'.
   * @generated
   */
  Relacion createRelacion();

  /**
   * Returns a new object of class '<em>Metodo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metodo</em>'.
   * @generated
   */
  Metodo createMetodo();

  /**
   * Returns a new object of class '<em>Parametro</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parametro</em>'.
   * @generated
   */
  Parametro createParametro();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ClasesPackage getClasesPackage();

} //ClasesFactory
