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
import org.xtext.example.mydsl.myDsl.ReactConfiguration;
import org.xtext.example.mydsl.myDsl.ReactConfigurations;
import org.xtext.example.mydsl.myDsl.ReactDependencies;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>React Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ReactConfigurationImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ReactConfigurationImpl#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactConfigurationImpl extends MinimalEObjectImpl.Container implements ReactConfiguration
{
  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected EList<ReactDependencies> dependencies;

  /**
   * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigurations()
   * @generated
   * @ordered
   */
  protected EList<ReactConfigurations> configurations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactConfigurationImpl()
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
    return MyDslPackage.Literals.REACT_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ReactDependencies> getDependencies()
  {
    if (dependencies == null)
    {
      dependencies = new EObjectContainmentEList<ReactDependencies>(ReactDependencies.class, this, MyDslPackage.REACT_CONFIGURATION__DEPENDENCIES);
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ReactConfigurations> getConfigurations()
  {
    if (configurations == null)
    {
      configurations = new EObjectContainmentEList<ReactConfigurations>(ReactConfigurations.class, this, MyDslPackage.REACT_CONFIGURATION__CONFIGURATIONS);
    }
    return configurations;
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
      case MyDslPackage.REACT_CONFIGURATION__DEPENDENCIES:
        return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
      case MyDslPackage.REACT_CONFIGURATION__CONFIGURATIONS:
        return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.REACT_CONFIGURATION__DEPENDENCIES:
        return getDependencies();
      case MyDslPackage.REACT_CONFIGURATION__CONFIGURATIONS:
        return getConfigurations();
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
      case MyDslPackage.REACT_CONFIGURATION__DEPENDENCIES:
        getDependencies().clear();
        getDependencies().addAll((Collection<? extends ReactDependencies>)newValue);
        return;
      case MyDslPackage.REACT_CONFIGURATION__CONFIGURATIONS:
        getConfigurations().clear();
        getConfigurations().addAll((Collection<? extends ReactConfigurations>)newValue);
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
      case MyDslPackage.REACT_CONFIGURATION__DEPENDENCIES:
        getDependencies().clear();
        return;
      case MyDslPackage.REACT_CONFIGURATION__CONFIGURATIONS:
        getConfigurations().clear();
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
      case MyDslPackage.REACT_CONFIGURATION__DEPENDENCIES:
        return dependencies != null && !dependencies.isEmpty();
      case MyDslPackage.REACT_CONFIGURATION__CONFIGURATIONS:
        return configurations != null && !configurations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReactConfigurationImpl
