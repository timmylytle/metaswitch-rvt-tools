package com.Metaswitch.MVS.Corba;


/**
* com/Metaswitch/MVS/Corba/ElementOrderHintValue.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from SEAccessInterface.idl
* Thursday, June 18, 2020 8:33:02 PM CDT
*/

public class ElementOrderHintValue implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 6;
  private static com.Metaswitch.MVS.Corba.ElementOrderHintValue[] __array = new com.Metaswitch.MVS.Corba.ElementOrderHintValue [__size];

  public static final int _stringNumber = 0;
  public static final com.Metaswitch.MVS.Corba.ElementOrderHintValue stringNumber = new com.Metaswitch.MVS.Corba.ElementOrderHintValue(_stringNumber);
  public static final int _lexicographic = 1;
  public static final com.Metaswitch.MVS.Corba.ElementOrderHintValue lexicographic = new com.Metaswitch.MVS.Corba.ElementOrderHintValue(_lexicographic);
  public static final int _alphabetic = 2;
  public static final com.Metaswitch.MVS.Corba.ElementOrderHintValue alphabetic = new com.Metaswitch.MVS.Corba.ElementOrderHintValue(_alphabetic);
  public static final int _elementName = 3;
  public static final com.Metaswitch.MVS.Corba.ElementOrderHintValue elementName = new com.Metaswitch.MVS.Corba.ElementOrderHintValue(_elementName);
  public static final int _reverseStringNumber = 4;
  public static final com.Metaswitch.MVS.Corba.ElementOrderHintValue reverseStringNumber = new com.Metaswitch.MVS.Corba.ElementOrderHintValue(_reverseStringNumber);
  public static final int _orderOnSpecificField = 5;
  public static final com.Metaswitch.MVS.Corba.ElementOrderHintValue orderOnSpecificField = new com.Metaswitch.MVS.Corba.ElementOrderHintValue(_orderOnSpecificField);

  public int value ()
  {
    return __value;
  }

  public static com.Metaswitch.MVS.Corba.ElementOrderHintValue from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ElementOrderHintValue (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ElementOrderHintValue