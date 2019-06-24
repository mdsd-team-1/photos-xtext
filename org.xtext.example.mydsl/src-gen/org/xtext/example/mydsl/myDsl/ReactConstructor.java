/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReactConstructor#getComponentclass <em>Componentclass</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReactConstructor()
 * @model
 * @generated
 */
public interface ReactConstructor extends EObject
{
  /**
   * Returns the value of the '<em><b>Componentclass</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Componentclass</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReactConstructor_Componentclass()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getComponentclass();

} // ReactConstructor
