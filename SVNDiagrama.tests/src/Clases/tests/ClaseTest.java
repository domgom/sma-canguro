/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.tests;

import Clases.Clase;
import Clases.ClasesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Clase</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaseTest extends TestCase
{

  /**
   * The fixture for this Clase test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Clase fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ClaseTest.class);
  }

  /**
   * Constructs a new Clase test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClaseTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Clase test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Clase fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Clase test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Clase getFixture()
  {
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(ClasesFactory.eINSTANCE.createClase());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //ClaseTest
