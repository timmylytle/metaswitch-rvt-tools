package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/PropertiesListHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ClientSessionManagerInterface.idl
* Thursday, June 18, 2020 8:33:04 PM CDT
*/


/**
 * An array of strings containing key and value pairs of the form
 * "key=value": see the getServerProperties method.
 */
public final class PropertiesListHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public PropertiesListHolder ()
  {
  }

  public PropertiesListHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.PropertiesListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.PropertiesListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.PropertiesListHelper.type ();
  }

}
