package com.Metaswitch.MVS.Corba;

/**
* com/Metaswitch/MVS/Corba/InvalidFilterExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * The supplied filter is not valid.  See comments on individual methods that
 * declare this exception.
 */
public final class InvalidFilterExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public com.Metaswitch.MVS.Corba.InvalidFilterException value = null;

  public InvalidFilterExceptionHolder ()
  {
  }

  public InvalidFilterExceptionHolder (com.Metaswitch.MVS.Corba.InvalidFilterException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.InvalidFilterExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.InvalidFilterExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.InvalidFilterExceptionHelper.type ();
  }

}
