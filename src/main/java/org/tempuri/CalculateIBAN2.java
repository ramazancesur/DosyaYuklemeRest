/**
 * CalculateIBAN2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CalculateIBAN2  implements java.io.Serializable {
    private java.lang.String ISOcountry;

    private java.lang.String banknumber;

    private java.lang.String account;

    public CalculateIBAN2() {
    }

    public CalculateIBAN2(
           java.lang.String ISOcountry,
           java.lang.String banknumber,
           java.lang.String account) {
           this.ISOcountry = ISOcountry;
           this.banknumber = banknumber;
           this.account = account;
    }


    /**
     * Gets the ISOcountry value for this CalculateIBAN2.
     * 
     * @return ISOcountry
     */
    public java.lang.String getISOcountry() {
        return ISOcountry;
    }


    /**
     * Sets the ISOcountry value for this CalculateIBAN2.
     * 
     * @param ISOcountry
     */
    public void setISOcountry(java.lang.String ISOcountry) {
        this.ISOcountry = ISOcountry;
    }


    /**
     * Gets the banknumber value for this CalculateIBAN2.
     * 
     * @return banknumber
     */
    public java.lang.String getBanknumber() {
        return banknumber;
    }


    /**
     * Sets the banknumber value for this CalculateIBAN2.
     * 
     * @param banknumber
     */
    public void setBanknumber(java.lang.String banknumber) {
        this.banknumber = banknumber;
    }


    /**
     * Gets the account value for this CalculateIBAN2.
     * 
     * @return account
     */
    public java.lang.String getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CalculateIBAN2.
     * 
     * @param account
     */
    public void setAccount(java.lang.String account) {
        this.account = account;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculateIBAN2)) return false;
        CalculateIBAN2 other = (CalculateIBAN2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ISOcountry==null && other.getISOcountry()==null) || 
             (this.ISOcountry!=null &&
              this.ISOcountry.equals(other.getISOcountry()))) &&
            ((this.banknumber==null && other.getBanknumber()==null) || 
             (this.banknumber!=null &&
              this.banknumber.equals(other.getBanknumber()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getISOcountry() != null) {
            _hashCode += getISOcountry().hashCode();
        }
        if (getBanknumber() != null) {
            _hashCode += getBanknumber().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculateIBAN2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">calculateIBAN2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISOcountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ISOcountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banknumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "banknumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
