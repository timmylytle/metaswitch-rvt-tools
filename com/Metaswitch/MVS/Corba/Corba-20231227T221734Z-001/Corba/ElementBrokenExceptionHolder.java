package com.Metaswitch.MVS.Corba;

/**
* com/Metaswitch/MVS/Corba/ElementBrokenExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:02 PM CDT
*/


/**
 * Some subcomponent of the SE is missing; it may have been deleted.
 * Fixing this situation requires explicit action by the user
 * to reconstitute the SE.  The user should refer to the nlsText field for
 * details.
 *
 * See the comment at the top of this file for details on individual fields.
 */
public final class ElementBrokenExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public com.Metaswitch.MVS.Corba.ElementBrokenException value = null;

  public ElementBrokenExceptionHolder ()
  {
  }

  public ElementBrokenExceptionHolder (com.Metaswitch.MVS.Corba.ElementBrokenException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.Metaswitch.MVS.Corba.ElementBrokenExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.Metaswitch.MVS.Corba.ElementBrokenExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.Metaswitch.MVS.Corba.ElementBrokenExceptionHelper.type ();
  }

}