package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SEChildPropertiesHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEAccessInterface.idl
* Thursday, June 18, 2020 8:33:02 PM CDT
*/

abstract public class SEChildPropertiesHelper
{
  private static String  _id = "IDL:SEChildProperties:1.0";

  public static void insert (org.omg.CORBA.Any a, com.Metaswitch.MVS.Corba.SEChildProperties that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static com.Metaswitch.MVS.Corba.SEChildProperties extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "elementType",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "displayType",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_longlong);
          _members0[2] = new org.omg.CORBA.StructMember (
            "accessFlagsByGroup",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[3] = new org.omg.CORBA.StructMember (
            "currentAccessPermissions",
            _tcOf_members0,
            null);
          _tcOf_members0 = com.Metaswitch.MVS.Corba.ElementOrderHintValueHelper.type ();
          _members0[4] = new org.omg.CORBA.StructMember (
            "elementOrderHint",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (com.Metaswitch.MVS.Corba.SEChildPropertiesHelper.id (), "SEChildProperties", _members0);
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

  public static com.Metaswitch.MVS.Corba.SEChildProperties read (org.omg.CORBA.portable.InputStream istream)
  {
    com.Metaswitch.MVS.Corba.SEChildProperties value = new com.Metaswitch.MVS.Corba.SEChildProperties ();
    value.elementType = istream.read_string ();
    value.displayType = istream.read_string ();
    value.accessFlagsByGroup = istream.read_longlong ();
    value.currentAccessPermissions = istream.read_long ();
    value.elementOrderHint = com.Metaswitch.MVS.Corba.ElementOrderHintValueHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, com.Metaswitch.MVS.Corba.SEChildProperties value)
  {
    ostream.write_string (value.elementType);
    ostream.write_string (value.displayType);
    ostream.write_longlong (value.accessFlagsByGroup);
    ostream.write_long (value.currentAccessPermissions);
    com.Metaswitch.MVS.Corba.ElementOrderHintValueHelper.write (ostream, value.elementOrderHint);
  }

}
