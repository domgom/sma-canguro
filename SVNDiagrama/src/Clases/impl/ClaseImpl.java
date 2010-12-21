/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.impl;

import Clases.Atributo;
import Clases.Clase;
import Clases.ClasesPackage;
import Clases.EnumVisibilidad;
import Clases.Metodo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Clases.impl.ClaseImpl#getAtributos <em>Atributos</em>}</li>
 *   <li>{@link Clases.impl.ClaseImpl#getVisibilidad <em>Visibilidad</em>}</li>
 *   <li>{@link Clases.impl.ClaseImpl#getPaquete <em>Paquete</em>}</li>
 *   <li>{@link Clases.impl.ClaseImpl#getMetodos <em>Metodos</em>}</li>
 *   <li>{@link Clases.impl.ClaseImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaseImpl extends EObjectImpl implements Clase
{
  /**
   * The cached value of the '{@link #getAtributos() <em>Atributos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributos()
   * @generated
   * @ordered
   */
  protected EList<Atributo> atributos;

  /**
   * The default value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibilidad()
   * @generated
   * @ordered
   */
  protected static final EnumVisibilidad VISIBILIDAD_EDEFAULT = EnumVisibilidad.PUBLIC;

  /**
   * The cached value of the '{@link #getVisibilidad() <em>Visibilidad</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibilidad()
   * @generated
   * @ordered
   */
  protected EnumVisibilidad visibilidad = VISIBILIDAD_EDEFAULT;

  /**
   * The default value of the '{@link #getPaquete() <em>Paquete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaquete()
   * @generated
   * @ordered
   */
  protected static final String PAQUETE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPaquete() <em>Paquete</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPaquete()
   * @generated
   * @ordered
   */
  protected String paquete = PAQUETE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetodos() <em>Metodos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetodos()
   * @generated
   * @ordered
   */
  protected EList<Metodo> metodos;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClaseImpl()
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
    return ClasesPackage.Literals.CLASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Atributo> getAtributos()
  {
    if (atributos == null)
    {
      atributos = new EObjectContainmentEList<Atributo>(Atributo.class, this, ClasesPackage.CLASE__ATRIBUTOS);
    }
    return atributos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumVisibilidad getVisibilidad()
  {
    return visibilidad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibilidad(EnumVisibilidad newVisibilidad)
  {
    EnumVisibilidad oldVisibilidad = visibilidad;
    visibilidad = newVisibilidad == null ? VISIBILIDAD_EDEFAULT : newVisibilidad;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.CLASE__VISIBILIDAD, oldVisibilidad, visibilidad));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPaquete()
  {
    return paquete;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPaquete(String newPaquete)
  {
    String oldPaquete = paquete;
    paquete = newPaquete;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.CLASE__PAQUETE, oldPaquete, paquete));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Metodo> getMetodos()
  {
    if (metodos == null)
    {
      metodos = new EObjectContainmentEList<Metodo>(Metodo.class, this, ClasesPackage.CLASE__METODOS);
    }
    return metodos;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.CLASE__NOMBRE, oldNombre, nombre));
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
      case ClasesPackage.CLASE__ATRIBUTOS:
        return ((InternalEList<?>)getAtributos()).basicRemove(otherEnd, msgs);
      case ClasesPackage.CLASE__METODOS:
        return ((InternalEList<?>)getMetodos()).basicRemove(otherEnd, msgs);
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
      case ClasesPackage.CLASE__ATRIBUTOS:
        return getAtributos();
      case ClasesPackage.CLASE__VISIBILIDAD:
        return getVisibilidad();
      case ClasesPackage.CLASE__PAQUETE:
        return getPaquete();
      case ClasesPackage.CLASE__METODOS:
        return getMetodos();
      case ClasesPackage.CLASE__NOMBRE:
        return getNombre();
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
      case ClasesPackage.CLASE__ATRIBUTOS:
        getAtributos().clear();
        getAtributos().addAll((Collection<? extends Atributo>)newValue);
        return;
      case ClasesPackage.CLASE__VISIBILIDAD:
        setVisibilidad((EnumVisibilidad)newValue);
        return;
      case ClasesPackage.CLASE__PAQUETE:
        setPaquete((String)newValue);
        return;
      case ClasesPackage.CLASE__METODOS:
        getMetodos().clear();
        getMetodos().addAll((Collection<? extends Metodo>)newValue);
        return;
      case ClasesPackage.CLASE__NOMBRE:
        setNombre((String)newValue);
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
      case ClasesPackage.CLASE__ATRIBUTOS:
        getAtributos().clear();
        return;
      case ClasesPackage.CLASE__VISIBILIDAD:
        setVisibilidad(VISIBILIDAD_EDEFAULT);
        return;
      case ClasesPackage.CLASE__PAQUETE:
        setPaquete(PAQUETE_EDEFAULT);
        return;
      case ClasesPackage.CLASE__METODOS:
        getMetodos().clear();
        return;
      case ClasesPackage.CLASE__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
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
      case ClasesPackage.CLASE__ATRIBUTOS:
        return atributos != null && !atributos.isEmpty();
      case ClasesPackage.CLASE__VISIBILIDAD:
        return visibilidad != VISIBILIDAD_EDEFAULT;
      case ClasesPackage.CLASE__PAQUETE:
        return PAQUETE_EDEFAULT == null ? paquete != null : !PAQUETE_EDEFAULT.equals(paquete);
      case ClasesPackage.CLASE__METODOS:
        return metodos != null && !metodos.isEmpty();
      case ClasesPackage.CLASE__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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
    result.append(" (visibilidad: ");
    result.append(visibilidad);
    result.append(", paquete: ");
    result.append(paquete);
    result.append(", nombre: ");
    result.append(nombre);
    result.append(')');
    return result.toString();
  }

} //ClaseImpl
