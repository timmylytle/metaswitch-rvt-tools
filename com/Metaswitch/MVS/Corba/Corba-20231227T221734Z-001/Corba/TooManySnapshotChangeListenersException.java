package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/TooManySnapshotChangeListenersException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * Thrown on an addSnapshotChangeListener request if an interface is already
 * registered as listening. Only one SnapshotChangeListener is allowed.
 */
public final class TooManySnapshotChangeListenersException extends org.omg.CORBA.UserException
{
  public String nlsText = null;
  public String wideNlsText = null;

  public TooManySnapshotChangeListenersException ()
  {
    super(TooManySnapshotChangeListenersExceptionHelper.id());
  } // ctor

  public TooManySnapshotChangeListenersException (String _nlsText, String _wideNlsText)
  {
    super(TooManySnapshotChangeListenersExceptionHelper.id());
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor


  public TooManySnapshotChangeListenersException (String $reason, String _nlsText, String _wideNlsText)
  {
    super(TooManySnapshotChangeListenersExceptionHelper.id() + "  " + $reason);
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor

} // class TooManySnapshotChangeListenersException
