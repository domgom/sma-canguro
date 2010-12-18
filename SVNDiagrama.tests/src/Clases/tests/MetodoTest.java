/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.tests;

import Clases.ClasesFactory;
import Clases.Metodo;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metodo</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetodoTest extends TestCase
{

  /**
   * The fixture for this Metodo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Metodo fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(MetodoTest.class);
  }

  /**
   * Constructs a new Metodo test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetodoTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Metodo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Metodo fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Metodo test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Metodo getFixture()
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
    setFixture(ClasesFactory.eINSTANCE.createMetodo());
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

} //MetodoTest
