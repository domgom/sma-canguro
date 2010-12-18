/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.impl;

import Clases.Atributo;
import Clases.ClasesPackage;
import Clases.EnumTipos;
import Clases.EnumVisibilidad;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Clases.impl.AtributoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Clases.impl.AtributoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link Clases.impl.AtributoImpl#getVisibilidad <em>Visibilidad</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtributoImpl extends EObjectImpl implements Atributo
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
   * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected static final EnumTipos TIPO_EDEFAULT = EnumTipos.STRING;

  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected EnumTipos tipo = TIPO_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtributoImpl()
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
    return ClasesPackage.Literals.ATRIBUTO;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.ATRIBUTO__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTipos getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipo(EnumTipos newTipo)
  {
    EnumTipos oldTipo = tipo;
    tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.ATRIBUTO__TIPO, oldTipo, tipo));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.ATRIBUTO__VISIBILIDAD, oldVisibilidad, visibilidad));
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
      case ClasesPackage.ATRIBUTO__NOMBRE:
        return getNombre();
      case ClasesPackage.ATRIBUTO__TIPO:
        return getTipo();
      case ClasesPackage.ATRIBUTO__VISIBILIDAD:
        return getVisibilidad();
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
      case ClasesPackage.ATRIBUTO__NOMBRE:
        setNombre((String)newValue);
        return;
      case ClasesPackage.ATRIBUTO__TIPO:
        setTipo((EnumTipos)newValue);
        return;
      case ClasesPackage.ATRIBUTO__VISIBILIDAD:
        setVisibilidad((EnumVisibilidad)newValue);
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
      case ClasesPackage.ATRIBUTO__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case ClasesPackage.ATRIBUTO__TIPO:
        setTipo(TIPO_EDEFAULT);
        return;
      case ClasesPackage.ATRIBUTO__VISIBILIDAD:
        setVisibilidad(VISIBILIDAD_EDEFAULT);
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
      case ClasesPackage.ATRIBUTO__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case ClasesPackage.ATRIBUTO__TIPO:
        return tipo != TIPO_EDEFAULT;
      case ClasesPackage.ATRIBUTO__VISIBILIDAD:
        return visibilidad != VISIBILIDAD_EDEFAULT;
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
    result.append(", tipo: ");
    result.append(tipo);
    result.append(", visibilidad: ");
    result.append(visibilidad);
    result.append(')');
    return result.toString();
  }

} //AtributoImpl
