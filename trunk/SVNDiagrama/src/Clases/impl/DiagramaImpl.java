/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.impl;

import Clases.Clase;
import Clases.ClasesPackage;
import Clases.Diagrama;
import Clases.Relacion;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagrama</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Clases.impl.DiagramaImpl#getClases <em>Clases</em>}</li>
 *   <li>{@link Clases.impl.DiagramaImpl#getRelaciones <em>Relaciones</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramaImpl extends EObjectImpl implements Diagrama
{
  /**
   * The cached value of the '{@link #getClases() <em>Clases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClases()
   * @generated
   * @ordered
   */
  protected EList<Clase> clases;

  /**
   * The cached value of the '{@link #getRelaciones() <em>Relaciones</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelaciones()
   * @generated
   * @ordered
   */
  protected EList<Relacion> relaciones;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DiagramaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ClasesPackage.Literals.DIAGRAMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Clase> getClases()
  {
    if (clases == null)
    {
      clases = new EObjectContainmentEList<Clase>(Clase.class, this, ClasesPackage.DIAGRAMA__CLASES);
    }
    return clases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relacion> getRelaciones()
  {
    if (relaciones == null)
    {
      relaciones = new EObjectContainmentEList<Relacion>(Relacion.class, this, ClasesPackage.DIAGRAMA__RELACIONES);
    }
    return relaciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ClasesPackage.DIAGRAMA__CLASES:
        return ((InternalEList<?>)getClases()).basicRemove(otherEnd, msgs);
      case ClasesPackage.DIAGRAMA__RELACIONES:
        return ((InternalEList<?>)getRelaciones()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ClasesPackage.DIAGRAMA__CLASES:
        return getClases();
      case ClasesPackage.DIAGRAMA__RELACIONES:
        return getRelaciones();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ClasesPackage.DIAGRAMA__CLASES:
        getClases().clear();
        getClases().addAll((Collection<? extends Clase>)newValue);
        return;
      case ClasesPackage.DIAGRAMA__RELACIONES:
        getRelaciones().clear();
        getRelaciones().addAll((Collection<? extends Relacion>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ClasesPackage.DIAGRAMA__CLASES:
        getClases().clear();
        return;
      case ClasesPackage.DIAGRAMA__RELACIONES:
        getRelaciones().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ClasesPackage.DIAGRAMA__CLASES:
        return clases != null && !clases.isEmpty();
      case ClasesPackage.DIAGRAMA__RELACIONES:
        return relaciones != null && !relaciones.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DiagramaImpl
