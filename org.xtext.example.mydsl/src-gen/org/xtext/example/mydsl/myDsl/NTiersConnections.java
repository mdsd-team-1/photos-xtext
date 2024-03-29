/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NTiers Connections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.NTiersConnections#getNtierconnection <em>Ntierconnection</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.NTiersConnections#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.NTiersConnections#getNtierorigin <em>Ntierorigin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.NTiersConnections#getNtiertarget <em>Ntiertarget</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNTiersConnections()
 * @model
 * @generated
 */
public interface NTiersConnections extends EObject
{
  /**
   * Returns the value of the '<em><b>Ntierconnection</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ntierconnection</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNTiersConnections_Ntierconnection()
   * @model unique="false"
   * @generated
   */
  EList<String> getNtierconnection();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNTiersConnections_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.NTiersConnections#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ntierorigin</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.NTierSource}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ntierorigin</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNTiersConnections_Ntierorigin()
   * @model containment="true"
   * @generated
   */
  EList<NTierSource> getNtierorigin();

  /**
   * Returns the value of the '<em><b>Ntiertarget</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.NTierTarget}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ntiertarget</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getNTiersConnections_Ntiertarget()
   * @model containment="true"
   * @generated
   */
  EList<NTierTarget> getNtiertarget();

} // NTiersConnections
