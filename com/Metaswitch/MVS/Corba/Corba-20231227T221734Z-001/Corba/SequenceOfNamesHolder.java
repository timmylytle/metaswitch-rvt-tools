package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SequenceOfNamesHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SettingsUserInterface.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * Define SequenceOfNames to be a sequence of strings.  We use this to provide
 * an unbounded number of strings.
 **/
public final class SequenceOfNamesHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public SequenceOfNamesHolder ()
  {
  }

  public SequenceOfNamesHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.SequenceOfNamesHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.SequenceOfNamesHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.SequenceOfNamesHelper.type ();
  }

}
