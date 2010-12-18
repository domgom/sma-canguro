/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.impl;

import Clases.Atributo;
import Clases.Clase;
import Clases.ClasesFactory;
import Clases.ClasesPackage;
import Clases.Diagrama;
import Clases.EnumRelaciones;
import Clases.EnumTipos;
import Clases.EnumTiposVoid;
import Clases.EnumVisibilidad;
import Clases.Metodo;
import Clases.Parametro;
import Clases.Relacion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClasesPackageImpl extends EPackageImpl implements ClasesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass diagramaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass claseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atributoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relacionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metodoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parametroEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum enumVisibilidadEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum enumTiposEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum enumTiposVoidEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum enumRelacionesEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see Clases.ClasesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ClasesPackageImpl()
  {
    super(eNS_URI, ClasesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ClasesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ClasesPackage init()
  {
    if (isInited) return (ClasesPackage)EPackage.Registry.INSTANCE.getEPackage(ClasesPackage.eNS_URI);

    // Obtain or create and register package
    ClasesPackageImpl theClasesPackage = (ClasesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClasesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClasesPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theClasesPackage.createPackageContents();

    // Initialize created meta-data
    theClasesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theClasesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ClasesPackage.eNS_URI, theClasesPackage);
    return theClasesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiagrama()
  {
    return diagramaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagrama_Clases()
  {
    return (EReference)diagramaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiagrama_Relaciones()
  {
    return (EReference)diagramaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClase()
  {
    return claseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClase_Atributos()
  {
    return (EReference)claseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClase_Visibilidad()
  {
    return (EAttribute)claseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClase_Paquete()
  {
    return (EAttribute)claseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClase_Metodos()
  {
    return (EReference)claseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClase_Nombre()
  {
    return (EAttribute)claseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtributo()
  {
    return atributoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributo_Nombre()
  {
    return (EAttribute)atributoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributo_Tipo()
  {
    return (EAttribute)atributoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtributo_Visibilidad()
  {
    return (EAttribute)atributoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelacion()
  {
    return relacionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelacion_Nombre()
  {
    return (EAttribute)relacionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelacion_Destino()
  {
    return (EReference)relacionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelacion_Origen()
  {
    return (EReference)relacionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetodo()
  {
    return metodoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetodo_TipoRetorno()
  {
    return (EAttribute)metodoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetodo_EsVoid()
  {
    return (EAttribute)metodoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetodo_Nombre()
  {
    return (EAttribute)metodoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetodo_ParametrosEntrada()
  {
    return (EReference)metodoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParametro()
  {
    return parametroEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParametro_Nombre()
  {
    return (EAttribute)parametroEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParametro_Tipo()
  {
    return (EAttribute)parametroEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEnumVisibilidad()
  {
    return enumVisibilidadEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEnumTipos()
  {
    return enumTiposEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEnumTiposVoid()
  {
    return enumTiposVoidEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEnumRelaciones()
  {
    return enumRelacionesEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClasesFactory getClasesFactory()
  {
    return (ClasesFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    diagramaEClass = createEClass(DIAGRAMA);
    createEReference(diagramaEClass, DIAGRAMA__CLASES);
    createEReference(diagramaEClass, DIAGRAMA__RELACIONES);

    claseEClass = createEClass(CLASE);
    createEReference(claseEClass, CLASE__ATRIBUTOS);
    createEAttribute(claseEClass, CLASE__VISIBILIDAD);
    createEAttribute(claseEClass, CLASE__PAQUETE);
    createEReference(claseEClass, CLASE__METODOS);
    createEAttribute(claseEClass, CLASE__NOMBRE);

    atributoEClass = createEClass(ATRIBUTO);
    createEAttribute(atributoEClass, ATRIBUTO__NOMBRE);
    createEAttribute(atributoEClass, ATRIBUTO__TIPO);
    createEAttribute(atributoEClass, ATRIBUTO__VISIBILIDAD);

    relacionEClass = createEClass(RELACION);
    createEAttribute(relacionEClass, RELACION__NOMBRE);
    createEReference(relacionEClass, RELACION__DESTINO);
    createEReference(relacionEClass, RELACION__ORIGEN);

    metodoEClass = createEClass(METODO);
    createEAttribute(metodoEClass, METODO__TIPO_RETORNO);
    createEAttribute(metodoEClass, METODO__ES_VOID);
    createEAttribute(metodoEClass, METODO__NOMBRE);
    createEReference(metodoEClass, METODO__PARAMETROS_ENTRADA);

    parametroEClass = createEClass(PARAMETRO);
    createEAttribute(parametroEClass, PARAMETRO__NOMBRE);
    createEAttribute(parametroEClass, PARAMETRO__TIPO);

    // Create enums
    enumVisibilidadEEnum = createEEnum(ENUM_VISIBILIDAD);
    enumTiposEEnum = createEEnum(ENUM_TIPOS);
    enumTiposVoidEEnum = createEEnum(ENUM_TIPOS_VOID);
    enumRelacionesEEnum = createEEnum(ENUM_RELACIONES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(diagramaEClass, Diagrama.class, "Diagrama", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDiagrama_Clases(), this.getClase(), null, "clases", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiagrama_Relaciones(), this.getRelacion(), null, "relaciones", null, 0, -1, Diagrama.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(claseEClass, Clase.class, "Clase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClase_Atributos(), this.getAtributo(), null, "atributos", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClase_Visibilidad(), this.getEnumVisibilidad(), "visibilidad", null, 0, 1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClase_Paquete(), ecorePackage.getEString(), "paquete", null, 0, 1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClase_Metodos(), this.getMetodo(), null, "metodos", null, 0, -1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClase_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Clase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atributoEClass, Atributo.class, "Atributo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtributo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributo_Tipo(), this.getEnumTipos(), "tipo", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtributo_Visibilidad(), this.getEnumVisibilidad(), "visibilidad", null, 0, 1, Atributo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relacionEClass, Relacion.class, "Relacion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelacion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelacion_Destino(), this.getClase(), null, "destino", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelacion_Origen(), this.getClase(), null, "origen", null, 1, 1, Relacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metodoEClass, Metodo.class, "Metodo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetodo_TipoRetorno(), this.getEnumTiposVoid(), "tipoRetorno", null, 0, 1, Metodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetodo_EsVoid(), ecorePackage.getEBoolean(), "esVoid", null, 0, 1, Metodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetodo_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Metodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetodo_ParametrosEntrada(), this.getParametro(), null, "parametrosEntrada", null, 0, -1, Metodo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parametroEClass, Parametro.class, "Parametro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParametro_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParametro_Tipo(), this.getEnumTipos(), "tipo", null, 0, 1, Parametro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(enumVisibilidadEEnum, EnumVisibilidad.class, "EnumVisibilidad");
    addEEnumLiteral(enumVisibilidadEEnum, EnumVisibilidad.PUBLIC);
    addEEnumLiteral(enumVisibilidadEEnum, EnumVisibilidad.PRIVATE);
    addEEnumLiteral(enumVisibilidadEEnum, EnumVisibilidad.PROTECTED);
    addEEnumLiteral(enumVisibilidadEEnum, EnumVisibilidad.DEFAULT);

    initEEnum(enumTiposEEnum, EnumTipos.class, "EnumTipos");
    addEEnumLiteral(enumTiposEEnum, EnumTipos.STRING);
    addEEnumLiteral(enumTiposEEnum, EnumTipos.INT);
    addEEnumLiteral(enumTiposEEnum, EnumTipos.BOOLEAN);
    addEEnumLiteral(enumTiposEEnum, EnumTipos.FLOAT);
    addEEnumLiteral(enumTiposEEnum, EnumTipos.DOUBLE);
    addEEnumLiteral(enumTiposEEnum, EnumTipos.LONG);
    addEEnumLiteral(enumTiposEEnum, EnumTipos.CHAR);

    initEEnum(enumTiposVoidEEnum, EnumTiposVoid.class, "EnumTiposVoid");
    addEEnumLiteral(enumTiposVoidEEnum, EnumTiposVoid.STRING);
    addEEnumLiteral(enumTiposVoidEEnum, EnumTiposVoid.INT);
    addEEnumLiteral(enumTiposVoidEEnum, EnumTiposVoid.BOOLEAN);
    addEEnumLiteral(enumTiposVoidEEnum, EnumTiposVoid.FLOAT);
    addEEnumLiteral(enumTiposVoidEEnum, EnumTiposVoid.DOUBLE);
    addEEnumLiteral(enumTiposVoidEEnum, EnumTiposVoid.LONG);
    addEEnumLiteral(enumTiposVoidEEnum, EnumTiposVoid.CHAR);
    addEEnumLiteral(enumTiposVoidEEnum, EnumTiposVoid.NONE);

    initEEnum(enumRelacionesEEnum, EnumRelaciones.class, "EnumRelaciones");
    addEEnumLiteral(enumRelacionesEEnum, EnumRelaciones.HERENCIA);
    addEEnumLiteral(enumRelacionesEEnum, EnumRelaciones.AGREGACION);
    addEEnumLiteral(enumRelacionesEEnum, EnumRelaciones.COMPOSICION);
    addEEnumLiteral(enumRelacionesEEnum, EnumRelaciones.IMPLEMENTACION);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // gmf
    createGmfAnnotations();
    // gmf.diagram
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.compartment
    createGmf_3Annotations();
    // gmf.link
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>gmf</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });									
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.diagram";			
    addAnnotation
      (diagramaEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });								
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";				
    addAnnotation
      (claseEClass, 
       source, 
       new String[] 
       {
       "label", "nombre",
       "figure", "rectangle",
       "label.icon", "false"
       });				
    addAnnotation
      (atributoEClass, 
       source, 
       new String[] 
       {
       "label", "nombre",
       "figure", "rectangle",
       "border.width", "0",
       "border.color", "255,255,255",
       "label.icon", "false"
       });			
    addAnnotation
      (metodoEClass, 
       source, 
       new String[] 
       {
       "label", "nombre",
       "figure", "rectangle",
       "border.width", "0",
       "border.color", "255,255,255",
       "label.icon", "false"
       });			
    addAnnotation
      (parametroEClass, 
       source, 
       new String[] 
       {
       "label", "nombre",
       "figure", "rectangle",
       "border.width", "0",
       "border.color", "255,255,255",
       "label.icon", "false"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.compartment";					
    addAnnotation
      (getClase_Atributos(), 
       source, 
       new String[] 
       {
       "foo", "bar",
       "layout", "list"
       });		
    addAnnotation
      (getClase_Metodos(), 
       source, 
       new String[] 
       {
       "foo", "bar",
       "layout", "list"
       });					
    addAnnotation
      (getMetodo_ParametrosEntrada(), 
       source, 
       new String[] 
       {
       "foo", "bar",
       "layout", "list"
       });	
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.link";								
    addAnnotation
      (relacionEClass, 
       source, 
       new String[] 
       {
       "label", "nombre",
       "source", "origen",
       "target", "destino",
       "style", "solid",
       "width", "2"
       });			
  }

} //ClasesPackageImpl
