package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SequenceOfSequenceOfIntegersHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SettingsUserInterface.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * Define SequenceOfSequenceOfIntegers to be a sequence of SequenceOfIntegers.
 * We use this to provide an unbounded number of integers.
 **/
public final class SequenceOfSequenceOfIntegersHolder implements org.omg.CORBA.portable.Streamable
{
  public int value[][] = null;

  public SequenceOfSequenceOfIntegersHolder ()
  {
  }

  public SequenceOfSequenceOfIntegersHolder (int[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.SequenceOfSequenceOfIntegersHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.SequenceOfSequenceOfIntegersHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.SequenceOfSequenceOfIntegersHelper.type ();
  }

}