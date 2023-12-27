package com.Metaswitch.MVS.Corba;

/**
* com/Metaswitch/MVS/Corba/InvalidElementTypeExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * The request failed because the supplied elementType parameter is not a valid
 * element type. This is thrown if the elementType does not exist or, for
 * example, if the elementType must be a possible child type and is not.
 */
public final class InvalidElementTypeExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public com.Metaswitch.MVS.Corba.InvalidElementTypeException value = null;

  public InvalidElementTypeExceptionHolder ()
  {
  }

  public InvalidElementTypeExceptionHolder (com.Metaswitch.MVS.Corba.InvalidElementTypeException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.InvalidElementTypeExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.InvalidElementTypeExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.InvalidElementTypeExceptionHelper.type ();
  }

}