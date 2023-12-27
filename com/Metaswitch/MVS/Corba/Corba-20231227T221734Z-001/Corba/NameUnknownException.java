package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/NameUnknownException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * The SE's name is not known because the SE has not been fully created.
 * This is the case after an attachToNew, before the first successful
 * doAction(APPLY).
 */
public final class NameUnknownException extends org.omg.CORBA.UserException
{
  public String nlsText = null;
  public String wideNlsText = null;

  public NameUnknownException ()
  {
    super(NameUnknownExceptionHelper.id());
  } // ctor

  public NameUnknownException (String _nlsText, String _wideNlsText)
  {
    super(NameUnknownExceptionHelper.id());
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor


  public NameUnknownException (String $reason, String _nlsText, String _wideNlsText)
  {
    super(NameUnknownExceptionHelper.id() + "  " + $reason);
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor

} // class NameUnknownException
