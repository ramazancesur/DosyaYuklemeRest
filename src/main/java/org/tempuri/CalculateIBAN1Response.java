/**
 * CalculateIBAN1Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CalculateIBAN1Response  implements java.io.Serializable {
    private java.lang.String calculateIBAN1Result;

    public CalculateIBAN1Response() {
    }

    public CalculateIBAN1Response(
           java.lang.String calculateIBAN1Result) {
           this.calculateIBAN1Result = calculateIBAN1Result;
    }


    /**
     * Gets the calculateIBAN1Result value for this CalculateIBAN1Response.
     * 
     * @return calculateIBAN1Result
     */
    public java.lang.String getCalculateIBAN1Result() {
        return calculateIBAN1Result;
    }


    /**
     * Sets the calculateIBAN1Result value for this CalculateIBAN1Response.
     * 
     * @param calculateIBAN1Result
     */
    public void setCalculateIBAN1Result(java.lang.String calculateIBAN1Result) {
        this.calculateIBAN1Result = calculateIBAN1Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalculateIBAN1Response)) return false;
        CalculateIBAN1Response other = (CalculateIBAN1Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.calculateIBAN1Result==null && other.getCalculateIBAN1Result()==null) || 
             (this.calculateIBAN1Result!=null &&
              this.calculateIBAN1Result.equals(other.getCalculateIBAN1Result())));
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
        if (getCalculateIBAN1Result() != null) {
            _hashCode += getCalculateIBAN1Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CalculateIBAN1Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">calculateIBAN1Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculateIBAN1Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "calculateIBAN1Result"));
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
