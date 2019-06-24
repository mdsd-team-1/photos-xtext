/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReactActions#getReactactcontent <em>Reactactcontent</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReactActions()
 * @model
 * @generated
 */
public interface ReactActions extends EObject
{
  /**
   * Returns the value of the '<em><b>Reactactcontent</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.ReactActionsContent}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reactactcontent</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReactActions_Reactactcontent()
   * @model containment="true"
   * @generated
   */
  EList<ReactActionsContent> getReactactcontent();

} // ReactActions
