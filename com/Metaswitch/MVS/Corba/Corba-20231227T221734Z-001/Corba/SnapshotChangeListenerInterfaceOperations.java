package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SnapshotChangeListenerInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SnapshotChangeListenerInterface.idl
* Thursday, June 18, 2020 8:33:05 PM CDT
*/

public interface SnapshotChangeListenerInterfaceOperations 
{

  /**
     * Called by the SEAccess to notify the implementing object of a change in
     * the SE's state.
     *
     * @param source     SEAccessInterface with which this
     *                   SnapshotChangeListenerInterface was registered.
     * @param fundamental  If true, any outstanding changes to the
     *                   SettingsUserInterface object currently held by the
     *                   SEAccessInterface user, will be rejected with
     *                   ElementChangedException if an action is performed.
     *                   This is because another user has significantly changed
     *                   the SE's state.  If false, actions may be performed
     *                   without an calling getSnapshot.
     **/
  void newSnapshotAvailable (com.Metaswitch.MVS.Corba.SEAccessInterface source, boolean fundamental);
} // interface SnapshotChangeListenerInterfaceOperations
