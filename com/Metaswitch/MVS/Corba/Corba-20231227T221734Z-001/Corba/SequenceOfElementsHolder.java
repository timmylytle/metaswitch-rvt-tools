package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SequenceOfElementsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEAccessInterface.idl
* Thursday, June 18, 2020 8:33:02 PM CDT
*/


/**
 * Define SequenceOfElements to be a sequence of Element objects.
 * We use a sequence because we want an unbounded number of SEActions - arrays
 * are bounded.
 */
public final class SequenceOfElementsHolder implements org.omg.CORBA.portable.Streamable
{
  public com.Metaswitch.MVS.Corba.Element value[] = null;

  public SequenceOfElementsHolder ()
  {
  }

  public SequenceOfElementsHolder (com.Metaswitch.MVS.Corba.Element[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.SequenceOfElementsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.SequenceOfElementsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.SequenceOfElementsHelper.type ();
  }

}
