/**
 * generated by Xtext 2.17.1
 */
package org.xtext.photos.mydsl;

import org.xtext.photos.mydsl.MyDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MyDslStandaloneSetup extends MyDslStandaloneSetupGenerated {
  public static void doSetup() {
    new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
