/**
 * QuerySwiftBICcodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QuerySwiftBICcodeResponse  implements java.io.Serializable {
    private java.lang.String querySwiftBICcodeResult;

    public QuerySwiftBICcodeResponse() {
    }

    public QuerySwiftBICcodeResponse(
           java.lang.String querySwiftBICcodeResult) {
           this.querySwiftBICcodeResult = querySwiftBICcodeResult;
    }


    /**
     * Gets the querySwiftBICcodeResult value for this QuerySwiftBICcodeResponse.
     * 
     * @return querySwiftBICcodeResult
     */
    public java.lang.String getQuerySwiftBICcodeResult() {
        return querySwiftBICcodeResult;
    }


    /**
     * Sets the querySwiftBICcodeResult value for this QuerySwiftBICcodeResponse.
     * 
     * @param querySwiftBICcodeResult
     */
    public void setQuerySwiftBICcodeResult(java.lang.String querySwiftBICcodeResult) {
        this.querySwiftBICcodeResult = querySwiftBICcodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySwiftBICcodeResponse)) return false;
        QuerySwiftBICcodeResponse other = (QuerySwiftBICcodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.querySwiftBICcodeResult==null && other.getQuerySwiftBICcodeResult()==null) || 
             (this.querySwiftBICcodeResult!=null &&
              this.querySwiftBICcodeResult.equals(other.getQuerySwiftBICcodeResult())));
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
        if (getQuerySwiftBICcodeResult() != null) {
            _hashCode += getQuerySwiftBICcodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySwiftBICcodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">querySwiftBICcodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySwiftBICcodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "querySwiftBICcodeResult"));
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
