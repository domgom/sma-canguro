/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.impl;

import Clases.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClasesFactoryImpl extends EFactoryImpl implements ClasesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ClasesFactory init()
  {
    try
    {
      ClasesFactory theClasesFactory = (ClasesFactory)EPackage.Registry.INSTANCE.getEFactory("diagrama"); 
      if (theClasesFactory != null)
      {
        return theClasesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ClasesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClasesFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ClasesPackage.DIAGRAMA: return createDiagrama();
      case ClasesPackage.CLASE: return createClase();
      case ClasesPackage.ATRIBUTO: return createAtributo();
      case ClasesPackage.RELACION: return createRelacion();
      case ClasesPackage.METODO: return createMetodo();
      case ClasesPackage.PARAMETRO: return createParametro();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ClasesPackage.ENUM_VISIBILIDAD:
        return createEnumVisibilidadFromString(eDataType, initialValue);
      case ClasesPackage.ENUM_TIPOS:
        return createEnumTiposFromString(eDataType, initialValue);
      case ClasesPackage.ENUM_TIPOS_VOID:
        return createEnumTiposVoidFromString(eDataType, initialValue);
      case ClasesPackage.ENUM_RELACIONES:
        return createEnumRelacionesFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ClasesPackage.ENUM_VISIBILIDAD:
        return convertEnumVisibilidadToString(eDataType, instanceValue);
      case ClasesPackage.ENUM_TIPOS:
        return convertEnumTiposToString(eDataType, instanceValue);
      case ClasesPackage.ENUM_TIPOS_VOID:
        return convertEnumTiposVoidToString(eDataType, instanceValue);
      case ClasesPackage.ENUM_RELACIONES:
        return convertEnumRelacionesToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Diagrama createDiagrama()
  {
    DiagramaImpl diagrama = new DiagramaImpl();
    return diagrama;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clase createClase()
  {
    ClaseImpl clase = new ClaseImpl();
    return clase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atributo createAtributo()
  {
    AtributoImpl atributo = new AtributoImpl();
    return atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relacion createRelacion()
  {
    RelacionImpl relacion = new RelacionImpl();
    return relacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metodo createMetodo()
  {
    MetodoImpl metodo = new MetodoImpl();
    return metodo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametro createParametro()
  {
    ParametroImpl parametro = new ParametroImpl();
    return parametro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumVisibilidad createEnumVisibilidadFromString(EDataType eDataType, String initialValue)
  {
    EnumVisibilidad result = EnumVisibilidad.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumVisibilidadToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTipos createEnumTiposFromString(EDataType eDataType, String initialValue)
  {
    EnumTipos result = EnumTipos.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumTiposToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTiposVoid createEnumTiposVoidFromString(EDataType eDataType, String initialValue)
  {
    EnumTiposVoid result = EnumTiposVoid.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumTiposVoidToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumRelaciones createEnumRelacionesFromString(EDataType eDataType, String initialValue)
  {
    EnumRelaciones result = EnumRelaciones.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEnumRelacionesToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClasesPackage getClasesPackage()
  {
    return (ClasesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ClasesPackage getPackage()
  {
    return ClasesPackage.eINSTANCE;
  }

} //ClasesFactoryImpl
