/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class MsrpCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MsrpCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MsrpCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_MsrpCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    tinyWRAPJNI.MsrpCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    tinyWRAPJNI.MsrpCallback_change_ownership(this, swigCPtr, true);
  }

  public MsrpCallback() {
    this(tinyWRAPJNI.new_MsrpCallback(), true);
    tinyWRAPJNI.MsrpCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public int OnEvent(MsrpEvent e) {
    return (getClass() == MsrpCallback.class) ? tinyWRAPJNI.MsrpCallback_OnEvent(swigCPtr, this, MsrpEvent.getCPtr(e), e) : tinyWRAPJNI.MsrpCallback_OnEventSwigExplicitMsrpCallback(swigCPtr, this, MsrpEvent.getCPtr(e), e);
  }

}
