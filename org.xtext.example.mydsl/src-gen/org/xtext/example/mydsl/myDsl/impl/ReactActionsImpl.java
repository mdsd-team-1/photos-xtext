/**
 * generated by Xtext 2.18.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.ReactActions;
import org.xtext.example.mydsl.myDsl.ReactActionsContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>React Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ReactActionsImpl#getReactactcontent <em>Reactactcontent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactActionsImpl extends MinimalEObjectImpl.Container implements ReactActions
{
  /**
   * The cached value of the '{@link #getReactactcontent() <em>Reactactcontent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReactactcontent()
   * @generated
   * @ordered
   */
  protected EList<ReactActionsContent> reactactcontent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactActionsImpl()
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
    return MyDslPackage.Literals.REACT_ACTIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ReactActionsContent> getReactactcontent()
  {
    if (reactactcontent == null)
    {
      reactactcontent = new EObjectContainmentEList<ReactActionsContent>(ReactActionsContent.class, this, MyDslPackage.REACT_ACTIONS__REACTACTCONTENT);
    }
    return reactactcontent;
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
      case MyDslPackage.REACT_ACTIONS__REACTACTCONTENT:
        return ((InternalEList<?>)getReactactcontent()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.REACT_ACTIONS__REACTACTCONTENT:
        return getReactactcontent();
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
      case MyDslPackage.REACT_ACTIONS__REACTACTCONTENT:
        getReactactcontent().clear();
        getReactactcontent().addAll((Collection<? extends ReactActionsContent>)newValue);
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
      case MyDslPackage.REACT_ACTIONS__REACTACTCONTENT:
        getReactactcontent().clear();
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
      case MyDslPackage.REACT_ACTIONS__REACTACTCONTENT:
        return reactactcontent != null && !reactactcontent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReactActionsImpl
