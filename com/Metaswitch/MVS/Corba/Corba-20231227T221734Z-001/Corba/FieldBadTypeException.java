package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/FieldBadTypeException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * Thrown if a method is invoked on a SettingsUserInterface field of the wrong
 * type.  For example, this exception is thrown if getFieldAsLongByIndex is
 * invoked on a field of type TYPE_STRING.
 */
public final class FieldBadTypeException extends org.omg.CORBA.UserException
{
  public String nlsText = null;
  public String wideNlsText = null;

  public FieldBadTypeException ()
  {
    super(FieldBadTypeExceptionHelper.id());
  } // ctor

  public FieldBadTypeException (String _nlsText, String _wideNlsText)
  {
    super(FieldBadTypeExceptionHelper.id());
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor


  public FieldBadTypeException (String $reason, String _nlsText, String _wideNlsText)
  {
    super(FieldBadTypeExceptionHelper.id() + "  " + $reason);
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor

} // class FieldBadTypeException
