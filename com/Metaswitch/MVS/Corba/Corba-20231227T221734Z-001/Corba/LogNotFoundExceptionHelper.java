package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/LogNotFoundExceptionHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * A log matching the specified correlator and MetaSwitch identifier could
 * not be found.  Reasons for this include:
 * - the log has not yet been retreived from the MetaSwitch,
 * - the log has been retreived from the MetaSwitch, but has since been
 *   deleted,
 * - the log has been filtered out,
 * - the EMS log storage facility is not currently available,
 * - the ClientSession has expired.
 */
abstract public class LogNotFoundExceptionHelper
{
  private static String  _id = "IDL:LogNotFoundException:1.0";

  public static void insert (org.omg.CORBA.Any a, com.Metaswitch.MVS.Corba.LogNotFoundException that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.Metaswitch.MVS.Corba.LogNotFoundException extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "nlsText",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[1] = new org.omg.CORBA.StructMember (
            "mainReturnCode",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[2] = new org.omg.CORBA.StructMember (
            "subReturnCode",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_wstring_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "wideNlsText",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (com.Metaswitch.MVS.Corba.LogNotFoundExceptionHelper.id (), "LogNotFoundException", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static com.Metaswitch.MVS.Corba.LogNotFoundException read (org.omg.CORBA.portable.InputStream istream)
  {
    com.Metaswitch.MVS.Corba.LogNotFoundException value = new com.Metaswitch.MVS.Corba.LogNotFoundException ();
    // read and discard the repository ID
    istream.read_string ();
    value.nlsText = istream.read_string ();
    value.mainReturnCode = istream.read_long ();
    value.subReturnCode = istream.read_long ();
    value.wideNlsText = istream.read_wstring ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.Metaswitch.MVS.Corba.LogNotFoundException value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.nlsText);
    ostream.write_long (value.mainReturnCode);
    ostream.write_long (value.subReturnCode);
    ostream.write_wstring (value.wideNlsText);
  }

}
