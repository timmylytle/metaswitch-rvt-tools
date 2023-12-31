package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SequenceOfSEActionsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEAccessInterface.idl
* Thursday, June 18, 2020 8:33:02 PM CDT
*/


/**
 * Define SequenceOfSEActions to be a sequence of SEAction objects.
 * We use this because we want an unbounded number of SEActions - an IDL
 * sequence is unbounded, but an array is not.
 */
abstract public class SequenceOfSEActionsHelper
{
  private static String  _id = "IDL:SequenceOfSEActions:1.0";

  public static void insert (org.omg.CORBA.Any a, com.Metaswitch.MVS.Corba.SEAction[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.Metaswitch.MVS.Corba.SEAction[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = com.Metaswitch.MVS.Corba.SEActionHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (com.Metaswitch.MVS.Corba.SequenceOfSEActionsHelper.id (), "SequenceOfSEActions", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.Metaswitch.MVS.Corba.SEAction[] read (org.omg.CORBA.portable.InputStream istream)
  {
    com.Metaswitch.MVS.Corba.SEAction value[] = null;
    int _len0 = istream.read_long ();
    value = new com.Metaswitch.MVS.Corba.SEAction[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = com.Metaswitch.MVS.Corba.SEActionHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.Metaswitch.MVS.Corba.SEAction[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      com.Metaswitch.MVS.Corba.SEActionHelper.write (ostream, value[_i0]);
  }

}
