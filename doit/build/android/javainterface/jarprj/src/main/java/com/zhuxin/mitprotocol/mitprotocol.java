/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.zhuxin.mitprotocol;

public class mitprotocol {
  public static MitProtocolInterface CreateMitProtocolInterface() {
    long cPtr = mitprotocolJNI.CreateMitProtocolInterface();
    return (cPtr == 0) ? null : new MitProtocolInterface(cPtr, false);
  }

}
