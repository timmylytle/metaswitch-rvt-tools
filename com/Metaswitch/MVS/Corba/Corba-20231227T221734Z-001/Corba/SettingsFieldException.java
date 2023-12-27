package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/SettingsFieldException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEExceptions.idl
* Thursday, June 18, 2020 8:33:02 PM CDT
*/


/**
 * Indicates that a field value is incorrect: the value is wrong or
 * inconsistent.  The user should refer to the nlsText and other fields in this
 * exception for details.
 *
 * See the comment at the top of this file for details on individual fields.
 */
public final class SettingsFieldException extends org.omg.CORBA.UserException
{
  public String nlsText = null;
  public int mainReturnCode = (int)0;
  public int subReturnCode = (int)0;
  public String erroredField = null;
  public long errorLogIndex = (long)0;
  public String errorNEName = null;
  public String neIdentifier = null;
  public String wideNlsText = null;

  public SettingsFieldException ()
  {
    super(SettingsFieldExceptionHelper.id());
  } // ctor

  public SettingsFieldException (String _nlsText, int _mainReturnCode, int _subReturnCode, String _erroredField, long _errorLogIndex, String _errorNEName, String _neIdentifier, String _wideNlsText)
  {
    super(SettingsFieldExceptionHelper.id());
    nlsText = _nlsText;
    mainReturnCode = _mainReturnCode;
    subReturnCode = _subReturnCode;
    erroredField = _erroredField;
    errorLogIndex = _errorLogIndex;
    errorNEName = _errorNEName;
    neIdentifier = _neIdentifier;
    wideNlsText = _wideNlsText;
  } // ctor


  public SettingsFieldException (String $reason, String _nlsText, int _mainReturnCode, int _subReturnCode, String _erroredField, long _errorLogIndex, String _errorNEName, String _neIdentifier, String _wideNlsText)
  {
    super(SettingsFieldExceptionHelper.id() + "  " + $reason);
    nlsText = _nlsText;
    mainReturnCode = _mainReturnCode;
    subReturnCode = _subReturnCode;
    erroredField = _erroredField;
    errorLogIndex = _errorLogIndex;
    errorNEName = _errorNEName;
    neIdentifier = _neIdentifier;
    wideNlsText = _wideNlsText;
  } // ctor

} // class SettingsFieldException