package com.Metaswitch.MVS.Corba;

/**
* com/Metaswitch/MVS/Corba/LogInformationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ClientSessionInterface.idl
* Thursday, June 18, 2020 8:33:04 PM CDT
*/

public final class LogInformationHolder implements org.omg.CORBA.portable.Streamable
{
  public com.Metaswitch.MVS.Corba.LogInformation value = null;

  public LogInformationHolder ()
  {
  }

  public LogInformationHolder (com.Metaswitch.MVS.Corba.LogInformation initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.LogInformationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.LogInformationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.LogInformationHelper.type ();
  }

}
