package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/ActionNotEnabledException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * The specified action is currently  not valid due to the state of the SE.
 * This indicates that the action is supported by this SE under some
 * circumstances but not currently.  For example, if an SE is active invoking
 * the activate action would throw an ActionNotEnabledException.
 */
public final class ActionNotEnabledException extends org.omg.CORBA.UserException
{
  public String nlsText = null;
  public String wideNlsText = null;

  public ActionNotEnabledException ()
  {
    super(ActionNotEnabledExceptionHelper.id());
  } // ctor

  public ActionNotEnabledException (String _nlsText, String _wideNlsText)
  {
    super(ActionNotEnabledExceptionHelper.id());
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor


  public ActionNotEnabledException (String $reason, String _nlsText, String _wideNlsText)
  {
    super(ActionNotEnabledExceptionHelper.id() + "  " + $reason);
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor

} // class ActionNotEnabledException
