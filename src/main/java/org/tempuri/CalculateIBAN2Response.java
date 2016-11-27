/**
 * CalculateIBAN2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CalculateIBAN2Response  implements java.io.Serializable {
    private java.lang.String calculateIBAN2Result;

    public CalculateIBAN2Response() {
    }

    public CalculateIBAN2Response(
           java.lang.String calculateIBAN2Result) {
           this.calculateIBAN2Result = calculateIBAN2Result;
    }


    /**
     * Gets the calculateIBAN2Result value for this CalculateIBAN2Response.
     * 
     * @return calculateIBAN2Result
     */
    public java.lang.String getCalculateIBAN2Result() {
        return calculateIBAN2Result;
    }


    /**
     * Sets the calculateIBAN2Result value for this CalculateIBAN2Response.
     * 
     * @param calculateIBAN2Result
     */
    public void setCalculateIBAN2Result(java.lang.String calculateIBAN2Result) {
        this.calculateIBAN2Result = calculateIBAN2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculateIBAN2Response)) return false;
        CalculateIBAN2Response other = (CalculateIBAN2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calculateIBAN2Result==null && other.getCalculateIBAN2Result()==null) || 
             (this.calculateIBAN2Result!=null &&
              this.calculateIBAN2Result.equals(other.getCalculateIBAN2Result())));
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
        if (getCalculateIBAN2Result() != null) {
            _hashCode += getCalculateIBAN2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculateIBAN2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">calculateIBAN2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculateIBAN2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "calculateIBAN2Result"));
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
