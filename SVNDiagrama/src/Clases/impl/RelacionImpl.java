/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.impl;

import Clases.Clase;
import Clases.ClasesPackage;
import Clases.Relacion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Clases.impl.RelacionImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Clases.impl.RelacionImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link Clases.impl.RelacionImpl#getOrigen <em>Origen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelacionImpl extends EObjectImpl implements Relacion
{
  /**
   * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected static final String NOMBRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre()
   * @generated
   * @ordered
   */
  protected String nombre = NOMBRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestino()
   * @generated
   * @ordered
   */
  protected Clase destino;

  /**
   * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrigen()
   * @generated
   * @ordered
   */
  protected Clase origen;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelacionImpl()
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
    return ClasesPackage.Literals.RELACION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNombre()
  {
    return nombre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNombre(String newNombre)
  {
    String oldNombre = nombre;
    nombre = newNombre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.RELACION__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clase getDestino()
  {
    if (destino != null && destino.eIsProxy())
    {
      InternalEObject oldDestino = (InternalEObject)destino;
      destino = (Clase)eResolveProxy(oldDestino);
      if (destino != oldDestino)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClasesPackage.RELACION__DESTINO, oldDestino, destino));
      }
    }
    return destino;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clase basicGetDestino()
  {
    return destino;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestino(Clase newDestino)
  {
    Clase oldDestino = destino;
    destino = newDestino;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.RELACION__DESTINO, oldDestino, destino));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clase getOrigen()
  {
    if (origen != null && origen.eIsProxy())
    {
      InternalEObject oldOrigen = (InternalEObject)origen;
      origen = (Clase)eResolveProxy(oldOrigen);
      if (origen != oldOrigen)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClasesPackage.RELACION__ORIGEN, oldOrigen, origen));
      }
    }
    return origen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clase basicGetOrigen()
  {
    return origen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrigen(Clase newOrigen)
  {
    Clase oldOrigen = origen;
    origen = newOrigen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.RELACION__ORIGEN, oldOrigen, origen));
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
      case ClasesPackage.RELACION__NOMBRE:
        return getNombre();
      case ClasesPackage.RELACION__DESTINO:
        if (resolve) return getDestino();
        return basicGetDestino();
      case ClasesPackage.RELACION__ORIGEN:
        if (resolve) return getOrigen();
        return basicGetOrigen();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ClasesPackage.RELACION__NOMBRE:
        setNombre((String)newValue);
        return;
      case ClasesPackage.RELACION__DESTINO:
        setDestino((Clase)newValue);
        return;
      case ClasesPackage.RELACION__ORIGEN:
        setOrigen((Clase)newValue);
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
      case ClasesPackage.RELACION__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case ClasesPackage.RELACION__DESTINO:
        setDestino((Clase)null);
        return;
      case ClasesPackage.RELACION__ORIGEN:
        setOrigen((Clase)null);
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
      case ClasesPackage.RELACION__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case ClasesPackage.RELACION__DESTINO:
        return destino != null;
      case ClasesPackage.RELACION__ORIGEN:
        return origen != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (nombre: ");
    result.append(nombre);
    result.append(')');
    return result.toString();
  }

} //RelacionImpl
