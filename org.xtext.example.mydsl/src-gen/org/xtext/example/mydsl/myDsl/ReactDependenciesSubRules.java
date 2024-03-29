/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Dependencies Sub Rules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ReactDependenciesSubRules#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReactDependenciesSubRules()
 * @model
 * @generated
 */
public interface ReactDependenciesSubRules extends EObject
{
  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.SingleDependencies}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getReactDependenciesSubRules_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<SingleDependencies> getDependencies();

} // ReactDependenciesSubRules
