package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SequenceOfSEActionsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEAccessInterface.idl
* Thursday, June 18, 2020 8:33:02 PM CDT
*/


/**
 * Define SequenceOfSEActions to be a sequence of SEAction objects.
 * We use this because we want an unbounded number of SEActions - an IDL
 * sequence is unbounded, but an array is not.
 */
public final class SequenceOfSEActionsHolder implements org.omg.CORBA.portable.Streamable
{
  public com.Metaswitch.MVS.Corba.SEAction value[] = null;

  public SequenceOfSEActionsHolder ()
  {
  }

  public SequenceOfSEActionsHolder (com.Metaswitch.MVS.Corba.SEAction[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.SequenceOfSEActionsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.SequenceOfSEActionsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.SequenceOfSEActionsHelper.type ();
  }

}