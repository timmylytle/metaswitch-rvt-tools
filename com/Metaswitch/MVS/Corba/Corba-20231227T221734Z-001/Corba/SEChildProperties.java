package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SEChildProperties.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEAccessInterface.idl
* Thursday, June 18, 2020 8:33:02 PM CDT
*/

public final class SEChildProperties implements org.omg.CORBA.portable.IDLEntity
{
  public String elementType = null;
  public String displayType = null;
  public long accessFlagsByGroup = (long)0;
  public int currentAccessPermissions = (int)0;
  public com.Metaswitch.MVS.Corba.ElementOrderHintValue elementOrderHint = null;

  public SEChildProperties ()
  {
  } // ctor

  public SEChildProperties (String _elementType, String _displayType, long _accessFlagsByGroup, int _currentAccessPermissions, com.Metaswitch.MVS.Corba.ElementOrderHintValue _elementOrderHint)
  {
    elementType = _elementType;
    displayType = _displayType;
    accessFlagsByGroup = _accessFlagsByGroup;
    currentAccessPermissions = _currentAccessPermissions;
    elementOrderHint = _elementOrderHint;
  } // ctor

} // class SEChildProperties