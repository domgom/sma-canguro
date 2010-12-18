/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.util;

import Clases.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Clases.ClasesPackage
 * @generated
 */
public class ClasesAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ClasesPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClasesAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ClasesPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClasesSwitch<Adapter> modelSwitch =
    new ClasesSwitch<Adapter>()
    {
      @Override
      public Adapter caseDiagrama(Diagrama object)
      {
        return createDiagramaAdapter();
      }
      @Override
      public Adapter caseClase(Clase object)
      {
        return createClaseAdapter();
      }
      @Override
      public Adapter caseAtributo(Atributo object)
      {
        return createAtributoAdapter();
      }
      @Override
      public Adapter caseRelacion(Relacion object)
      {
        return createRelacionAdapter();
      }
      @Override
      public Adapter caseMetodo(Metodo object)
      {
        return createMetodoAdapter();
      }
      @Override
      public Adapter caseParametro(Parametro object)
      {
        return createParametroAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link Clases.Diagrama <em>Diagrama</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see Clases.Diagrama
   * @generated
   */
  public Adapter createDiagramaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link Clases.Clase <em>Clase</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see Clases.Clase
   * @generated
   */
  public Adapter createClaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link Clases.Atributo <em>Atributo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see Clases.Atributo
   * @generated
   */
  public Adapter createAtributoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link Clases.Relacion <em>Relacion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see Clases.Relacion
   * @generated
   */
  public Adapter createRelacionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link Clases.Metodo <em>Metodo</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see Clases.Metodo
   * @generated
   */
  public Adapter createMetodoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link Clases.Parametro <em>Parametro</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see Clases.Parametro
   * @generated
   */
  public Adapter createParametroAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ClasesAdapterFactory
