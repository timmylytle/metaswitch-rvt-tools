package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/InvalidElementTypeException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:03 PM CDT
*/


/**
 * The request failed because the supplied elementType parameter is not a valid
 * element type. This is thrown if the elementType does not exist or, for
 * example, if the elementType must be a possible child type and is not.
 */
public final class InvalidElementTypeException extends org.omg.CORBA.UserException
{
  public String nlsText = null;
  public String wideNlsText = null;

  public InvalidElementTypeException ()
  {
    super(InvalidElementTypeExceptionHelper.id());
  } // ctor

  public InvalidElementTypeException (String _nlsText, String _wideNlsText)
  {
    super(InvalidElementTypeExceptionHelper.id());
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor


  public InvalidElementTypeException (String $reason, String _nlsText, String _wideNlsText)
  {
    super(InvalidElementTypeExceptionHelper.id() + "  " + $reason);
    nlsText = _nlsText;
    wideNlsText = _wideNlsText;
  } // ctor

} // class InvalidElementTypeException
