package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/_NLSSupportInterfaceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from NLSSupportInterface.idl
* Thursday, June 18, 2020 8:33:02 PM CDT
*/


/**
 * The NLSSupportInterface provides translation from National Language Support
 * (NLS) enabled text into human-readable displayable text.
 */
public class _NLSSupportInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements com.Metaswitch.MVS.Corba.NLSSupportInterface
{


  /**
     * Verifies the passed NLS locale specifiers and returns a Locale structure
     * that can be supplied to other NLSSupportInterface methods.
     *
     * @param  The language parameter is a valid ISO Language Code. These codes
     *         are the lower-case two-letter codes as defined by ISO-639.
     *         The language "en" is guaranteed to be supported.
     * @param  The country parameter is a valid ISO Country Code. These codes are
     *         the upper-case two-letter codes as defined by ISO-3166.
     *         The country "US" is guaranteed to be supported.
     *
     * @throws UnsupportedLocaleException  If the supplied country and language
     *   codes do not form a recognized Locale for which the EMS Server has
     *   National Language Support.  For example, if "FR" & "fr" are passed to
     *   an EMS Server that does not support NLS translation to French then this
     *   exception is thrown.
     **/
  public com.Metaswitch.MVS.Corba.NLSLocale getLocale (String language, String country) throws com.Metaswitch.MVS.Corba.UnsupportedLocaleException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getLocale", true);
                $out.write_string (language);
                $out.write_string (country);
                $in = _invoke ($out);
                com.Metaswitch.MVS.Corba.NLSLocale $result = com.Metaswitch.MVS.Corba.NLSLocaleHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:UnsupportedLocaleException:1.0"))
                    throw com.Metaswitch.MVS.Corba.UnsupportedLocaleExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getLocale (language, country        );
            } finally {
                _releaseReply ($in);
            }
  } // getLocale


  /**
     * Translates the NLS-enabled maybeNLSText string into a human-readable
     * displayable string specific to the Locale defined by nlsLocale.
     * If the maybeNLSText string is not an NLS-enabled string generated by
     * the EMS Server, then the returned string is maybeNLSText and
     * the value of isNLSText is false; otherwise the value of isNLSText is
     * true.
     *
     * @param maybeNLSText  String to translate.  This should be a string
     *                      returned by the EMS Server from a method that
     *                      declares it to be an NLS string.
     * @param locale        NLSLocale structure returned by getLocale that
     *                      specifies the Locale into which the maybeNLSText
     *                      should be translated.
     * @param isNLSText     Boolean out parameter that is true if the
     *                      maybeNLSText string contained NLS-enabled text
     *                      that was translated or false if it was not
     *                      NLS-enabled text.
     * @return              String containing either a translation of an
     *                      NLS-enabled string (if isNLSText is true) or
     *                      the original maybeNLSText string (if isNLStext
     *                      is false).
     */
  public String makeDisplayText (String maybeNLSText, com.Metaswitch.MVS.Corba.NLSLocale locale, org.omg.CORBA.BooleanHolder isNLSText)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("makeDisplayText", true);
                $out.write_string (maybeNLSText);
                com.Metaswitch.MVS.Corba.NLSLocaleHelper.write ($out, locale);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                isNLSText.value = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return makeDisplayText (maybeNLSText, locale, isNLSText        );
            } finally {
                _releaseReply ($in);
            }
  } // makeDisplayText


  /**
     * Translates the NLS Integer IDentifier (NLSIID) into a human-readable
     * displayable string specific to the Locale defined by nlsLocale.
     * Only NLS-enabled integers should be passed as NLSIIDs.
     *
     * @param maybeNLSText  String to translate.  This should be a string
     *                      returned by the EMS Server from a method that
     *                      declares it to be an NLS string.
     * @param locale        NLSLocale structure returned by getLocale that
     *                      specifies the Locale into which the NLSIID
     *                      should be translated.
     * @return              String containing a translation of the NLSIID
     *                      into human-readable displayable form.
     * @throws UnrecognizedNLSIIDException  If the NLSIID is not recognized by
     *                      the EMS Server as a valid NLS key.
     */
  public String makeDisplayTextFromNLSIID (int NLSIID, com.Metaswitch.MVS.Corba.NLSLocale locale) throws com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("makeDisplayTextFromNLSIID", true);
                $out.write_long (NLSIID);
                com.Metaswitch.MVS.Corba.NLSLocaleHelper.write ($out, locale);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:UnrecognizedNLSIIDException:1.0"))
                    throw com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return makeDisplayTextFromNLSIID (NLSIID, locale        );
            } finally {
                _releaseReply ($in);
            }
  } // makeDisplayTextFromNLSIID


  /**
     * Obtains the information associated with a log ID in an NLS-translated
     * displayable form.  The logs are stored and retrieved from a database on
     * the EMS Server.  The log ID included in each log provides a correlator
     * for accessing additional resources/information.  This method takes the
     * log ID and returns the resource/information type as specified by
     * resourceType.  The resource types include: the log "Severity" level,
     * "Cause", "Effect", "Action" and "Description" as documented in the
     * explanation of the EMS Server Log Database.
     *
     * This method should only be used for translating log IDs.
     *
     * @param logID         A log identifier as documented for the logs database.
     * @param resourceType  One of the NLS_LOG_ constants defined above.
     * @param locale        NLSLocale structure returned by getLocale that
     *                      specifies the Locale into which information
     *                      associated with the logID should be translated.
     * @return              String containing information associated with the
     *                      passed logID in a Locale-specific translation.
     * @throws UnrecognizedNLSIIDException  If the logID is not recognized by the
     *                      EMS Server as a valid NLS key.
     */
  public String makeDisplayTextFromLogID (int logID, int resourceType, com.Metaswitch.MVS.Corba.NLSLocale locale) throws com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("makeDisplayTextFromLogID", true);
                $out.write_long (logID);
                $out.write_long (resourceType);
                com.Metaswitch.MVS.Corba.NLSLocaleHelper.write ($out, locale);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:UnrecognizedNLSIIDException:1.0"))
                    throw com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return makeDisplayTextFromLogID (logID, resourceType, locale        );
            } finally {
                _releaseReply ($in);
            }
  } // makeDisplayTextFromLogID


  /**
     * See makeDisplayTextFromLogID for initial information on the method and
     * its parameters.  This method extends the functionality of
     * makeDisplayTextFromLogID by taking a sequence of parameters that are
     * to be integrated into the outputted displayable text.  These parameters
     * are included as extra columns for each entry in the log database.  See
     * the EMS Server Log Database documentation for more information on which
     * columns to use.
     *
     * @param logID         A log identifier as documented for the logs database.
     * @param params        Sequence of strings containing the insertable values
     *                      that are to be added into the outputted display text.
     *                      The entries in the params sequence must be in the
     *                      order in which they occur as columns in the log
     *                      database.
     * @param resourceType  One of the NLS_LOG_ constants defined above.
     *                      Currently, only NLS_LOG_DESCRIPTION strings require
     *                      the additional params sequence.
     * @param locale        NLSLocale structure returned by getLocale that
     *                      specifies the Locale into which information
     *                      associated with the logID should be translated.
     * @return              String containing information associated with the
     *                      passed logID in a Locale-specific translation.
     * @throws UnrecognizedNLSIIDException  If the logID is not recognized by the
     *                      EMS Server as a valid NLS key.
     */
  public String makeDisplayTextFromLogIDWithParams (int logID, String[] params, int resourceType, com.Metaswitch.MVS.Corba.NLSLocale locale) throws com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("makeDisplayTextFromLogIDWithParams", true);
                $out.write_long (logID);
                com.Metaswitch.MVS.Corba.SequenceOfNamesHelper.write ($out, params);
                $out.write_long (resourceType);
                com.Metaswitch.MVS.Corba.NLSLocaleHelper.write ($out, locale);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:UnrecognizedNLSIIDException:1.0"))
                    throw com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return makeDisplayTextFromLogIDWithParams (logID, params, resourceType, locale        );
            } finally {
                _releaseReply ($in);
            }
  } // makeDisplayTextFromLogIDWithParams


  /**
     * Refer to makeDisplayText for details of this method and its parameters.
     * This is an equivalent using wstring for all string parameters and return.
     */
  public String makeWideDisplayText (String maybeNLSText, com.Metaswitch.MVS.Corba.NLSLocale locale, org.omg.CORBA.BooleanHolder isNLSText)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("makeWideDisplayText", true);
                $out.write_wstring (maybeNLSText);
                com.Metaswitch.MVS.Corba.NLSLocaleHelper.write ($out, locale);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                isNLSText.value = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return makeWideDisplayText (maybeNLSText, locale, isNLSText        );
            } finally {
                _releaseReply ($in);
            }
  } // makeWideDisplayText


  /**
     * Refer to makeDisplayTextFromNLSIID for details of this method and its
     * parameters. This is an equivalent using wstring for all string 
     * parameters and return.
     */
  public String makeWideDisplayTextFromNLSIID (int NLSIID, com.Metaswitch.MVS.Corba.NLSLocale locale) throws com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("makeWideDisplayTextFromNLSIID", true);
                $out.write_long (NLSIID);
                com.Metaswitch.MVS.Corba.NLSLocaleHelper.write ($out, locale);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:UnrecognizedNLSIIDException:1.0"))
                    throw com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return makeWideDisplayTextFromNLSIID (NLSIID, locale        );
            } finally {
                _releaseReply ($in);
            }
  } // makeWideDisplayTextFromNLSIID


  /**
     * Refer to makeDisplayTextFromLogID for details of this method and its
     * parameters. This is an equivalent using wstring for all string parameters
     * and return.
     */
  public String makeWideDisplayTextFromLogID (int logID, int resourceType, com.Metaswitch.MVS.Corba.NLSLocale locale) throws com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("makeWideDisplayTextFromLogID", true);
                $out.write_long (logID);
                $out.write_long (resourceType);
                com.Metaswitch.MVS.Corba.NLSLocaleHelper.write ($out, locale);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:UnrecognizedNLSIIDException:1.0"))
                    throw com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return makeWideDisplayTextFromLogID (logID, resourceType, locale        );
            } finally {
                _releaseReply ($in);
            }
  } // makeWideDisplayTextFromLogID


  /**
     * Refer to makeDisplayTextFromLogIDWithParams for details of this method
     * and its parameters. This is an equivalent using wstring for all string
     * parameters and return.
     */
  public String makeWideDisplayTextFromLogIDWithParams (int logID, String[] params, int resourceType, com.Metaswitch.MVS.Corba.NLSLocale locale) throws com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("makeWideDisplayTextFromLogIDWithParams", true);
                $out.write_long (logID);
                com.Metaswitch.MVS.Corba.SequenceOfNamesHelper.write ($out, params);
                $out.write_long (resourceType);
                com.Metaswitch.MVS.Corba.NLSLocaleHelper.write ($out, locale);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:UnrecognizedNLSIIDException:1.0"))
                    throw com.Metaswitch.MVS.Corba.UnrecognizedNLSIIDExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return makeWideDisplayTextFromLogIDWithParams (logID, params, resourceType, locale        );
            } finally {
                _releaseReply ($in);
            }
  } // makeWideDisplayTextFromLogIDWithParams

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:NLSSupportInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _NLSSupportInterfaceStub