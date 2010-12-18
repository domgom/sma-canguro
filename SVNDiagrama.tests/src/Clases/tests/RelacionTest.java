/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Clases.tests;

import Clases.ClasesFactory;
import Clases.Relacion;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relacion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelacionTest extends TestCase
{

  /**
   * The fixture for this Relacion test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Relacion fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(RelacionTest.class);
  }

  /**
   * Constructs a new Relacion test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelacionTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Relacion test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(Relacion fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Relacion test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Relacion getFixture()
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
    setFixture(ClasesFactory.eINSTANCE.createRelacion());
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

} //RelacionTest
