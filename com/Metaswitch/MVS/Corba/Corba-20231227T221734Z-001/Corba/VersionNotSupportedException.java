package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/VersionNotSupportedException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * Thrown if the range of EMS object versions, specified by the
 * lowestSuppliedVersion and highestSuppliedVersion parameters on the
 * ClientSessionManager login methods, does not overlap with the range of EMS
 * object versions supported by the EMS.
 */
public final class VersionNotSupportedException extends org.omg.CORBA.UserException
{
  public String nlsText = null;
  public String wideNlsText = null;

  public VersionNotSupportedException ()
  {
    super(VersionNotSupportedExceptionHelper.id());
  } // ctor

  public VersionNotSupportedException (String _nlsText, String _wideNlsText)
  {
    super(VersionNotSupportedExceptionHelper.id());
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor


  public VersionNotSupportedException (String $reason, String _nlsText, String _wideNlsText)
  {
    super(VersionNotSupportedExceptionHelper.id() + "  " + $reason);
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor

} // class VersionNotSupportedException
