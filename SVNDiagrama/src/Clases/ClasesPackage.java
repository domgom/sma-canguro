/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Clases.ClasesFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface ClasesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "Clases";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "diagrama";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "diagrama";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ClasesPackage eINSTANCE = Clases.impl.ClasesPackageImpl.init();

  /**
   * The meta object id for the '{@link Clases.impl.DiagramaImpl <em>Diagrama</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.impl.DiagramaImpl
   * @see Clases.impl.ClasesPackageImpl#getDiagrama()
   * @generated
   */
  int DIAGRAMA = 0;

  /**
   * The feature id for the '<em><b>Clases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAMA__CLASES = 0;

  /**
   * The feature id for the '<em><b>Relaciones</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAMA__RELACIONES = 1;

  /**
   * The number of structural features of the '<em>Diagrama</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIAGRAMA_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link Clases.impl.ClaseImpl <em>Clase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.impl.ClaseImpl
   * @see Clases.impl.ClasesPackageImpl#getClase()
   * @generated
   */
  int CLASE = 1;

  /**
   * The feature id for the '<em><b>Atributos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASE__ATRIBUTOS = 0;

  /**
   * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASE__VISIBILIDAD = 1;

  /**
   * The feature id for the '<em><b>Paquete</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASE__PAQUETE = 2;

  /**
   * The feature id for the '<em><b>Metodos</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASE__METODOS = 3;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASE__NOMBRE = 4;

  /**
   * The number of structural features of the '<em>Clase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link Clases.impl.AtributoImpl <em>Atributo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.impl.AtributoImpl
   * @see Clases.impl.ClasesPackageImpl#getAtributo()
   * @generated
   */
  int ATRIBUTO = 2;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__TIPO = 1;

  /**
   * The feature id for the '<em><b>Visibilidad</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO__VISIBILIDAD = 2;

  /**
   * The number of structural features of the '<em>Atributo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATRIBUTO_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link Clases.impl.RelacionImpl <em>Relacion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.impl.RelacionImpl
   * @see Clases.impl.ClasesPackageImpl#getRelacion()
   * @generated
   */
  int RELACION = 3;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELACION__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Destino</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELACION__DESTINO = 1;

  /**
   * The feature id for the '<em><b>Origen</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELACION__ORIGEN = 2;

  /**
   * The number of structural features of the '<em>Relacion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELACION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link Clases.impl.MetodoImpl <em>Metodo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.impl.MetodoImpl
   * @see Clases.impl.ClasesPackageImpl#getMetodo()
   * @generated
   */
  int METODO = 4;

  /**
   * The feature id for the '<em><b>Tipo Retorno</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METODO__TIPO_RETORNO = 0;

  /**
   * The feature id for the '<em><b>Es Void</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METODO__ES_VOID = 1;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METODO__NOMBRE = 2;

  /**
   * The feature id for the '<em><b>Parametros Entrada</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METODO__PARAMETROS_ENTRADA = 3;

  /**
   * The number of structural features of the '<em>Metodo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METODO_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link Clases.impl.ParametroImpl <em>Parametro</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.impl.ParametroImpl
   * @see Clases.impl.ClasesPackageImpl#getParametro()
   * @generated
   */
  int PARAMETRO = 5;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRO__NOMBRE = 0;

  /**
   * The feature id for the '<em><b>Tipo</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRO__TIPO = 1;

  /**
   * The number of structural features of the '<em>Parametro</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link Clases.EnumVisibilidad <em>Enum Visibilidad</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.EnumVisibilidad
   * @see Clases.impl.ClasesPackageImpl#getEnumVisibilidad()
   * @generated
   */
  int ENUM_VISIBILIDAD = 6;

  /**
   * The meta object id for the '{@link Clases.EnumTipos <em>Enum Tipos</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.EnumTipos
   * @see Clases.impl.ClasesPackageImpl#getEnumTipos()
   * @generated
   */
  int ENUM_TIPOS = 7;

  /**
   * The meta object id for the '{@link Clases.EnumTiposVoid <em>Enum Tipos Void</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.EnumTiposVoid
   * @see Clases.impl.ClasesPackageImpl#getEnumTiposVoid()
   * @generated
   */
  int ENUM_TIPOS_VOID = 8;

  /**
   * The meta object id for the '{@link Clases.EnumRelaciones <em>Enum Relaciones</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Clases.EnumRelaciones
   * @see Clases.impl.ClasesPackageImpl#getEnumRelaciones()
   * @generated
   */
  int ENUM_RELACIONES = 9;


  /**
   * Returns the meta object for class '{@link Clases.Diagrama <em>Diagrama</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Diagrama</em>'.
   * @see Clases.Diagrama
   * @generated
   */
  EClass getDiagrama();

  /**
   * Returns the meta object for the containment reference list '{@link Clases.Diagrama#getClases <em>Clases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clases</em>'.
   * @see Clases.Diagrama#getClases()
   * @see #getDiagrama()
   * @generated
   */
  EReference getDiagrama_Clases();

  /**
   * Returns the meta object for the containment reference list '{@link Clases.Diagrama#getRelaciones <em>Relaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relaciones</em>'.
   * @see Clases.Diagrama#getRelaciones()
   * @see #getDiagrama()
   * @generated
   */
  EReference getDiagrama_Relaciones();

  /**
   * Returns the meta object for class '{@link Clases.Clase <em>Clase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clase</em>'.
   * @see Clases.Clase
   * @generated
   */
  EClass getClase();

  /**
   * Returns the meta object for the containment reference list '{@link Clases.Clase#getAtributos <em>Atributos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atributos</em>'.
   * @see Clases.Clase#getAtributos()
   * @see #getClase()
   * @generated
   */
  EReference getClase_Atributos();

  /**
   * Returns the meta object for the attribute '{@link Clases.Clase#getVisibilidad <em>Visibilidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibilidad</em>'.
   * @see Clases.Clase#getVisibilidad()
   * @see #getClase()
   * @generated
   */
  EAttribute getClase_Visibilidad();

  /**
   * Returns the meta object for the attribute '{@link Clases.Clase#getPaquete <em>Paquete</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Paquete</em>'.
   * @see Clases.Clase#getPaquete()
   * @see #getClase()
   * @generated
   */
  EAttribute getClase_Paquete();

  /**
   * Returns the meta object for the containment reference list '{@link Clases.Clase#getMetodos <em>Metodos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Metodos</em>'.
   * @see Clases.Clase#getMetodos()
   * @see #getClase()
   * @generated
   */
  EReference getClase_Metodos();

  /**
   * Returns the meta object for the attribute '{@link Clases.Clase#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see Clases.Clase#getNombre()
   * @see #getClase()
   * @generated
   */
  EAttribute getClase_Nombre();

  /**
   * Returns the meta object for class '{@link Clases.Atributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atributo</em>'.
   * @see Clases.Atributo
   * @generated
   */
  EClass getAtributo();

  /**
   * Returns the meta object for the attribute '{@link Clases.Atributo#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see Clases.Atributo#getNombre()
   * @see #getAtributo()
   * @generated
   */
  EAttribute getAtributo_Nombre();

  /**
   * Returns the meta object for the attribute '{@link Clases.Atributo#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo</em>'.
   * @see Clases.Atributo#getTipo()
   * @see #getAtributo()
   * @generated
   */
  EAttribute getAtributo_Tipo();

  /**
   * Returns the meta object for the attribute '{@link Clases.Atributo#getVisibilidad <em>Visibilidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibilidad</em>'.
   * @see Clases.Atributo#getVisibilidad()
   * @see #getAtributo()
   * @generated
   */
  EAttribute getAtributo_Visibilidad();

  /**
   * Returns the meta object for class '{@link Clases.Relacion <em>Relacion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relacion</em>'.
   * @see Clases.Relacion
   * @generated
   */
  EClass getRelacion();

  /**
   * Returns the meta object for the attribute '{@link Clases.Relacion#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see Clases.Relacion#getNombre()
   * @see #getRelacion()
   * @generated
   */
  EAttribute getRelacion_Nombre();

  /**
   * Returns the meta object for the reference '{@link Clases.Relacion#getDestino <em>Destino</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destino</em>'.
   * @see Clases.Relacion#getDestino()
   * @see #getRelacion()
   * @generated
   */
  EReference getRelacion_Destino();

  /**
   * Returns the meta object for the reference '{@link Clases.Relacion#getOrigen <em>Origen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Origen</em>'.
   * @see Clases.Relacion#getOrigen()
   * @see #getRelacion()
   * @generated
   */
  EReference getRelacion_Origen();

  /**
   * Returns the meta object for class '{@link Clases.Metodo <em>Metodo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metodo</em>'.
   * @see Clases.Metodo
   * @generated
   */
  EClass getMetodo();

  /**
   * Returns the meta object for the attribute '{@link Clases.Metodo#getTipoRetorno <em>Tipo Retorno</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo Retorno</em>'.
   * @see Clases.Metodo#getTipoRetorno()
   * @see #getMetodo()
   * @generated
   */
  EAttribute getMetodo_TipoRetorno();

  /**
   * Returns the meta object for the attribute '{@link Clases.Metodo#isEsVoid <em>Es Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Es Void</em>'.
   * @see Clases.Metodo#isEsVoid()
   * @see #getMetodo()
   * @generated
   */
  EAttribute getMetodo_EsVoid();

  /**
   * Returns the meta object for the attribute '{@link Clases.Metodo#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see Clases.Metodo#getNombre()
   * @see #getMetodo()
   * @generated
   */
  EAttribute getMetodo_Nombre();

  /**
   * Returns the meta object for the containment reference list '{@link Clases.Metodo#getParametrosEntrada <em>Parametros Entrada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parametros Entrada</em>'.
   * @see Clases.Metodo#getParametrosEntrada()
   * @see #getMetodo()
   * @generated
   */
  EReference getMetodo_ParametrosEntrada();

  /**
   * Returns the meta object for class '{@link Clases.Parametro <em>Parametro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parametro</em>'.
   * @see Clases.Parametro
   * @generated
   */
  EClass getParametro();

  /**
   * Returns the meta object for the attribute '{@link Clases.Parametro#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see Clases.Parametro#getNombre()
   * @see #getParametro()
   * @generated
   */
  EAttribute getParametro_Nombre();

  /**
   * Returns the meta object for the attribute '{@link Clases.Parametro#getTipo <em>Tipo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tipo</em>'.
   * @see Clases.Parametro#getTipo()
   * @see #getParametro()
   * @generated
   */
  EAttribute getParametro_Tipo();

  /**
   * Returns the meta object for enum '{@link Clases.EnumVisibilidad <em>Enum Visibilidad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enum Visibilidad</em>'.
   * @see Clases.EnumVisibilidad
   * @generated
   */
  EEnum getEnumVisibilidad();

  /**
   * Returns the meta object for enum '{@link Clases.EnumTipos <em>Enum Tipos</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enum Tipos</em>'.
   * @see Clases.EnumTipos
   * @generated
   */
  EEnum getEnumTipos();

  /**
   * Returns the meta object for enum '{@link Clases.EnumTiposVoid <em>Enum Tipos Void</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enum Tipos Void</em>'.
   * @see Clases.EnumTiposVoid
   * @generated
   */
  EEnum getEnumTiposVoid();

  /**
   * Returns the meta object for enum '{@link Clases.EnumRelaciones <em>Enum Relaciones</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enum Relaciones</em>'.
   * @see Clases.EnumRelaciones
   * @generated
   */
  EEnum getEnumRelaciones();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ClasesFactory getClasesFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link Clases.impl.DiagramaImpl <em>Diagrama</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.impl.DiagramaImpl
     * @see Clases.impl.ClasesPackageImpl#getDiagrama()
     * @generated
     */
    EClass DIAGRAMA = eINSTANCE.getDiagrama();

    /**
     * The meta object literal for the '<em><b>Clases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAMA__CLASES = eINSTANCE.getDiagrama_Clases();

    /**
     * The meta object literal for the '<em><b>Relaciones</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIAGRAMA__RELACIONES = eINSTANCE.getDiagrama_Relaciones();

    /**
     * The meta object literal for the '{@link Clases.impl.ClaseImpl <em>Clase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.impl.ClaseImpl
     * @see Clases.impl.ClasesPackageImpl#getClase()
     * @generated
     */
    EClass CLASE = eINSTANCE.getClase();

    /**
     * The meta object literal for the '<em><b>Atributos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASE__ATRIBUTOS = eINSTANCE.getClase_Atributos();

    /**
     * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASE__VISIBILIDAD = eINSTANCE.getClase_Visibilidad();

    /**
     * The meta object literal for the '<em><b>Paquete</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASE__PAQUETE = eINSTANCE.getClase_Paquete();

    /**
     * The meta object literal for the '<em><b>Metodos</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASE__METODOS = eINSTANCE.getClase_Metodos();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASE__NOMBRE = eINSTANCE.getClase_Nombre();

    /**
     * The meta object literal for the '{@link Clases.impl.AtributoImpl <em>Atributo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.impl.AtributoImpl
     * @see Clases.impl.ClasesPackageImpl#getAtributo()
     * @generated
     */
    EClass ATRIBUTO = eINSTANCE.getAtributo();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO__NOMBRE = eINSTANCE.getAtributo_Nombre();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO__TIPO = eINSTANCE.getAtributo_Tipo();

    /**
     * The meta object literal for the '<em><b>Visibilidad</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATRIBUTO__VISIBILIDAD = eINSTANCE.getAtributo_Visibilidad();

    /**
     * The meta object literal for the '{@link Clases.impl.RelacionImpl <em>Relacion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.impl.RelacionImpl
     * @see Clases.impl.ClasesPackageImpl#getRelacion()
     * @generated
     */
    EClass RELACION = eINSTANCE.getRelacion();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELACION__NOMBRE = eINSTANCE.getRelacion_Nombre();

    /**
     * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELACION__DESTINO = eINSTANCE.getRelacion_Destino();

    /**
     * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELACION__ORIGEN = eINSTANCE.getRelacion_Origen();

    /**
     * The meta object literal for the '{@link Clases.impl.MetodoImpl <em>Metodo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.impl.MetodoImpl
     * @see Clases.impl.ClasesPackageImpl#getMetodo()
     * @generated
     */
    EClass METODO = eINSTANCE.getMetodo();

    /**
     * The meta object literal for the '<em><b>Tipo Retorno</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METODO__TIPO_RETORNO = eINSTANCE.getMetodo_TipoRetorno();

    /**
     * The meta object literal for the '<em><b>Es Void</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METODO__ES_VOID = eINSTANCE.getMetodo_EsVoid();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METODO__NOMBRE = eINSTANCE.getMetodo_Nombre();

    /**
     * The meta object literal for the '<em><b>Parametros Entrada</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METODO__PARAMETROS_ENTRADA = eINSTANCE.getMetodo_ParametrosEntrada();

    /**
     * The meta object literal for the '{@link Clases.impl.ParametroImpl <em>Parametro</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.impl.ParametroImpl
     * @see Clases.impl.ClasesPackageImpl#getParametro()
     * @generated
     */
    EClass PARAMETRO = eINSTANCE.getParametro();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETRO__NOMBRE = eINSTANCE.getParametro_Nombre();

    /**
     * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETRO__TIPO = eINSTANCE.getParametro_Tipo();

    /**
     * The meta object literal for the '{@link Clases.EnumVisibilidad <em>Enum Visibilidad</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.EnumVisibilidad
     * @see Clases.impl.ClasesPackageImpl#getEnumVisibilidad()
     * @generated
     */
    EEnum ENUM_VISIBILIDAD = eINSTANCE.getEnumVisibilidad();

    /**
     * The meta object literal for the '{@link Clases.EnumTipos <em>Enum Tipos</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.EnumTipos
     * @see Clases.impl.ClasesPackageImpl#getEnumTipos()
     * @generated
     */
    EEnum ENUM_TIPOS = eINSTANCE.getEnumTipos();

    /**
     * The meta object literal for the '{@link Clases.EnumTiposVoid <em>Enum Tipos Void</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.EnumTiposVoid
     * @see Clases.impl.ClasesPackageImpl#getEnumTiposVoid()
     * @generated
     */
    EEnum ENUM_TIPOS_VOID = eINSTANCE.getEnumTiposVoid();

    /**
     * The meta object literal for the '{@link Clases.EnumRelaciones <em>Enum Relaciones</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Clases.EnumRelaciones
     * @see Clases.impl.ClasesPackageImpl#getEnumRelaciones()
     * @generated
     */
    EEnum ENUM_RELACIONES = eINSTANCE.getEnumRelaciones();

  }

} //ClasesPackage
