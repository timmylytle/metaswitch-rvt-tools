package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/LogInformation.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ClientSessionInterface.idl
* Thursday, June 18, 2020 8:33:04 PM CDT
*/

public final class LogInformation implements org.omg.CORBA.portable.IDLEntity
{
  public long time = (long)0;
  public int severity = (int)0;
  public boolean acknowledged = false;
  public boolean suppressed = false;
  public boolean ruleApplied = false;
  public String node = null;
  public String logSource = null;
  public String objectName = null;
  public String relatedObjects = null;
  public String description = null;
  public String cause = null;
  public String effect = null;
  public String action = null;
  public String userComments = null;
  public long associatedLogCorrelator = (long)0;
  public String associatedNodeName = null;
  public String associatedNodeUID = null;

  public LogInformation ()
  {
  } // ctor

  public LogInformation (long _time, int _severity, boolean _acknowledged, boolean _suppressed, boolean _ruleApplied, String _node, String _logSource, String _objectName, String _relatedObjects, String _description, String _cause, String _effect, String _action, String _userComments, long _associatedLogCorrelator, String _associatedNodeName, String _associatedNodeUID)
  {
    time = _time;
    severity = _severity;
    acknowledged = _acknowledged;
    suppressed = _suppressed;
    ruleApplied = _ruleApplied;
    node = _node;
    logSource = _logSource;
    objectName = _objectName;
    relatedObjects = _relatedObjects;
    description = _description;
    cause = _cause;
    effect = _effect;
    action = _action;
    userComments = _userComments;
    associatedLogCorrelator = _associatedLogCorrelator;
    associatedNodeName = _associatedNodeName;
    associatedNodeUID = _associatedNodeUID;
  } // ctor

} // class LogInformation
