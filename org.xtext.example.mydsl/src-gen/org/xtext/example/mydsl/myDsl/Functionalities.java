/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionalities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Functionalities#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Functionalities#getElements <em>Elements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Functionalities#getItems <em>Items</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Functionalities#getResources <em>Resources</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Functionalities#getAditionals <em>Aditionals</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionalities()
 * @model
 * @generated
 */
public interface Functionalities extends EObject
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ProfileManagement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionalities_Functions()
   * @model containment="true"
   * @generated
   */
  EList<ProfileManagement> getFunctions();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.AppAccess}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionalities_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AppAccess> getElements();

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.AlbumManagement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionalities_Items()
   * @model containment="true"
   * @generated
   */
  EList<AlbumManagement> getItems();

  /**
   * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.PhotoActions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resources</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionalities_Resources()
   * @model containment="true"
   * @generated
   */
  EList<PhotoActions> getResources();

  /**
   * Returns the value of the '<em><b>Aditionals</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.LandingActions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aditionals</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getFunctionalities_Aditionals()
   * @model containment="true"
   * @generated
   */
  EList<LandingActions> getAditionals();

} // Functionalities
