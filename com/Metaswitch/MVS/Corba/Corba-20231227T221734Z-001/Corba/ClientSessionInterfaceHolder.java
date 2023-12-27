package com.Metaswitch.MVS.Corba;

/**
* com/Metaswitch/MVS/Corba/ClientSessionInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ClientSessionInterface.idl
* Thursday, June 18, 2020 8:33:04 PM CDT
*/


/**
 * The ClientSessionInterface provides methods for managing the client's
 * session.  The session is terminated when one of the following occurs:
 * - the client application invokes the logout method;
 * - a fixed timeout period expires;
 * - another EMS user changes the details of the EMS user account associated
 * with this client session.
 */
public final class ClientSessionInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public com.Metaswitch.MVS.Corba.ClientSessionInterface value = null;

  public ClientSessionInterfaceHolder ()
  {
  }

  public ClientSessionInterfaceHolder (com.Metaswitch.MVS.Corba.ClientSessionInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.ClientSessionInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.ClientSessionInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.ClientSessionInterfaceHelper.type ();
  }

}