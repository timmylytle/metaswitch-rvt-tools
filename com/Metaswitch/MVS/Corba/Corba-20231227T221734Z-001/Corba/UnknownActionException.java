package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/UnknownActionException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * The specified action is not supported by this SE under any circumstance.
 * All supported actions are listed in the SEProperties object returned on
 * attachment.
 */
public final class UnknownActionException extends org.omg.CORBA.UserException
{
  public String nlsText = null;
  public String wideNlsText = null;

  public UnknownActionException ()
  {
    super(UnknownActionExceptionHelper.id());
  } // ctor

  public UnknownActionException (String _nlsText, String _wideNlsText)
  {
    super(UnknownActionExceptionHelper.id());
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor


  public UnknownActionException (String $reason, String _nlsText, String _wideNlsText)
  {
    super(UnknownActionExceptionHelper.id() + "  " + $reason);
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor

} // class UnknownActionException
