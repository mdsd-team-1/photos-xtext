/**
 * generated by Xtext 2.17.1
 */
package org.xtext.photos.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.photos.mydsl.myDsl.Functionality#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.photos.mydsl.myDsl.MyDslPackage#getFunctionality()
 * @model
 * @generated
 */
public interface Functionality extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.photos.mydsl.myDsl.Functionalities}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.photos.mydsl.myDsl.MyDslPackage#getFunctionality_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Functionalities> getElements();

} // Functionality
