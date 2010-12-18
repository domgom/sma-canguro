/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.impl;

import Clases.ClasesPackage;
import Clases.EnumTiposVoid;
import Clases.Metodo;
import Clases.Parametro;

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
 * An implementation of the model object '<em><b>Metodo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Clases.impl.MetodoImpl#getTipoRetorno <em>Tipo Retorno</em>}</li>
 *   <li>{@link Clases.impl.MetodoImpl#isEsVoid <em>Es Void</em>}</li>
 *   <li>{@link Clases.impl.MetodoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link Clases.impl.MetodoImpl#getParametrosEntrada <em>Parametros Entrada</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetodoImpl extends EObjectImpl implements Metodo
{
  /**
   * The default value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoRetorno()
   * @generated
   * @ordered
   */
  protected static final EnumTiposVoid TIPO_RETORNO_EDEFAULT = EnumTiposVoid.STRING;

  /**
   * The cached value of the '{@link #getTipoRetorno() <em>Tipo Retorno</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipoRetorno()
   * @generated
   * @ordered
   */
  protected EnumTiposVoid tipoRetorno = TIPO_RETORNO_EDEFAULT;

  /**
   * The default value of the '{@link #isEsVoid() <em>Es Void</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsVoid()
   * @generated
   * @ordered
   */
  protected static final boolean ES_VOID_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEsVoid() <em>Es Void</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEsVoid()
   * @generated
   * @ordered
   */
  protected boolean esVoid = ES_VOID_EDEFAULT;

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
   * The cached value of the '{@link #getParametrosEntrada() <em>Parametros Entrada</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParametrosEntrada()
   * @generated
   * @ordered
   */
  protected EList<Parametro> parametrosEntrada;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MetodoImpl()
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
    return ClasesPackage.Literals.METODO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTiposVoid getTipoRetorno()
  {
    return tipoRetorno;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTipoRetorno(EnumTiposVoid newTipoRetorno)
  {
    EnumTiposVoid oldTipoRetorno = tipoRetorno;
    tipoRetorno = newTipoRetorno == null ? TIPO_RETORNO_EDEFAULT : newTipoRetorno;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.METODO__TIPO_RETORNO, oldTipoRetorno, tipoRetorno));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEsVoid()
  {
    return esVoid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEsVoid(boolean newEsVoid)
  {
    boolean oldEsVoid = esVoid;
    esVoid = newEsVoid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.METODO__ES_VOID, oldEsVoid, esVoid));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClasesPackage.METODO__NOMBRE, oldNombre, nombre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parametro> getParametrosEntrada()
  {
    if (parametrosEntrada == null)
    {
      parametrosEntrada = new EObjectContainmentEList<Parametro>(Parametro.class, this, ClasesPackage.METODO__PARAMETROS_ENTRADA);
    }
    return parametrosEntrada;
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
      case ClasesPackage.METODO__PARAMETROS_ENTRADA:
        return ((InternalEList<?>)getParametrosEntrada()).basicRemove(otherEnd, msgs);
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
      case ClasesPackage.METODO__TIPO_RETORNO:
        return getTipoRetorno();
      case ClasesPackage.METODO__ES_VOID:
        return isEsVoid();
      case ClasesPackage.METODO__NOMBRE:
        return getNombre();
      case ClasesPackage.METODO__PARAMETROS_ENTRADA:
        return getParametrosEntrada();
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
      case ClasesPackage.METODO__TIPO_RETORNO:
        setTipoRetorno((EnumTiposVoid)newValue);
        return;
      case ClasesPackage.METODO__ES_VOID:
        setEsVoid((Boolean)newValue);
        return;
      case ClasesPackage.METODO__NOMBRE:
        setNombre((String)newValue);
        return;
      case ClasesPackage.METODO__PARAMETROS_ENTRADA:
        getParametrosEntrada().clear();
        getParametrosEntrada().addAll((Collection<? extends Parametro>)newValue);
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
      case ClasesPackage.METODO__TIPO_RETORNO:
        setTipoRetorno(TIPO_RETORNO_EDEFAULT);
        return;
      case ClasesPackage.METODO__ES_VOID:
        setEsVoid(ES_VOID_EDEFAULT);
        return;
      case ClasesPackage.METODO__NOMBRE:
        setNombre(NOMBRE_EDEFAULT);
        return;
      case ClasesPackage.METODO__PARAMETROS_ENTRADA:
        getParametrosEntrada().clear();
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
      case ClasesPackage.METODO__TIPO_RETORNO:
        return tipoRetorno != TIPO_RETORNO_EDEFAULT;
      case ClasesPackage.METODO__ES_VOID:
        return esVoid != ES_VOID_EDEFAULT;
      case ClasesPackage.METODO__NOMBRE:
        return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
      case ClasesPackage.METODO__PARAMETROS_ENTRADA:
        return parametrosEntrada != null && !parametrosEntrada.isEmpty();
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
    result.append(" (tipoRetorno: ");
    result.append(tipoRetorno);
    result.append(", esVoid: ");
    result.append(esVoid);
    result.append(", nombre: ");
    result.append(nombre);
    result.append(')');
    return result.toString();
  }

} //MetodoImpl
