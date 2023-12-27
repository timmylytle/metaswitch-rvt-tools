package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SequenceOfOctetsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SettingsUserInterface.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * Define SequenceOfOctets to be a sequence of octets.  We use this to provide
 * an unbounded number of octets.
 **/
public final class SequenceOfOctetsHolder implements org.omg.CORBA.portable.Streamable
{
  public byte value[] = null;

  public SequenceOfOctetsHolder ()
  {
  }

  public SequenceOfOctetsHolder (byte[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.SequenceOfOctetsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.SequenceOfOctetsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.SequenceOfOctetsHelper.type ();
  }

}
