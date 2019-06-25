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
import org.xtext.example.mydsl.myDsl.NTierTarget;
import org.xtext.example.mydsl.myDsl.NTiersRelations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NTier Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.NTierTargetImpl#getNtierconnection <em>Ntierconnection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTierTargetImpl extends MinimalEObjectImpl.Container implements NTierTarget
{
  /**
   * The cached value of the '{@link #getNtierconnection() <em>Ntierconnection</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNtierconnection()
   * @generated
   * @ordered
   */
  protected EList<NTiersRelations> ntierconnection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NTierTargetImpl()
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
    return MyDslPackage.Literals.NTIER_TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<NTiersRelations> getNtierconnection()
  {
    if (ntierconnection == null)
    {
      ntierconnection = new EObjectContainmentEList<NTiersRelations>(NTiersRelations.class, this, MyDslPackage.NTIER_TARGET__NTIERCONNECTION);
    }
    return ntierconnection;
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
      case MyDslPackage.NTIER_TARGET__NTIERCONNECTION:
        return ((InternalEList<?>)getNtierconnection()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.NTIER_TARGET__NTIERCONNECTION:
        return getNtierconnection();
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
      case MyDslPackage.NTIER_TARGET__NTIERCONNECTION:
        getNtierconnection().clear();
        getNtierconnection().addAll((Collection<? extends NTiersRelations>)newValue);
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
      case MyDslPackage.NTIER_TARGET__NTIERCONNECTION:
        getNtierconnection().clear();
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
      case MyDslPackage.NTIER_TARGET__NTIERCONNECTION:
        return ntierconnection != null && !ntierconnection.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NTierTargetImpl