package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/FieldNoRegisteredAPException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * Thrown by the "get adjustmnents" methods on the SettingsUserInterface
 * if the field does not have an AdjustmentsProvider.  If the
 * hasAdjustments method returns true then this exception will not be
 * thrown.
 */
public final class FieldNoRegisteredAPException extends org.omg.CORBA.UserException
{
  public String nlsText = null;
  public String wideNlsText = null;

  public FieldNoRegisteredAPException ()
  {
    super(FieldNoRegisteredAPExceptionHelper.id());
  } // ctor

  public FieldNoRegisteredAPException (String _nlsText, String _wideNlsText)
  {
    super(FieldNoRegisteredAPExceptionHelper.id());
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor


  public FieldNoRegisteredAPException (String $reason, String _nlsText, String _wideNlsText)
  {
    super(FieldNoRegisteredAPExceptionHelper.id() + "  " + $reason);
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor

} // class FieldNoRegisteredAPException
