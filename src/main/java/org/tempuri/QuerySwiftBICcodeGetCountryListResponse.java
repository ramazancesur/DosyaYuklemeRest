/**
 * QuerySwiftBICcodeGetCountryListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QuerySwiftBICcodeGetCountryListResponse  implements java.io.Serializable {
    private java.lang.String querySwiftBICcodeGetCountryListResult;

    public QuerySwiftBICcodeGetCountryListResponse() {
    }

    public QuerySwiftBICcodeGetCountryListResponse(
           java.lang.String querySwiftBICcodeGetCountryListResult) {
           this.querySwiftBICcodeGetCountryListResult = querySwiftBICcodeGetCountryListResult;
    }


    /**
     * Gets the querySwiftBICcodeGetCountryListResult value for this QuerySwiftBICcodeGetCountryListResponse.
     * 
     * @return querySwiftBICcodeGetCountryListResult
     */
    public java.lang.String getQuerySwiftBICcodeGetCountryListResult() {
        return querySwiftBICcodeGetCountryListResult;
    }


    /**
     * Sets the querySwiftBICcodeGetCountryListResult value for this QuerySwiftBICcodeGetCountryListResponse.
     * 
     * @param querySwiftBICcodeGetCountryListResult
     */
    public void setQuerySwiftBICcodeGetCountryListResult(java.lang.String querySwiftBICcodeGetCountryListResult) {
        this.querySwiftBICcodeGetCountryListResult = querySwiftBICcodeGetCountryListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuerySwiftBICcodeGetCountryListResponse)) return false;
        QuerySwiftBICcodeGetCountryListResponse other = (QuerySwiftBICcodeGetCountryListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.querySwiftBICcodeGetCountryListResult==null && other.getQuerySwiftBICcodeGetCountryListResult()==null) || 
             (this.querySwiftBICcodeGetCountryListResult!=null &&
              this.querySwiftBICcodeGetCountryListResult.equals(other.getQuerySwiftBICcodeGetCountryListResult())));
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
        if (getQuerySwiftBICcodeGetCountryListResult() != null) {
            _hashCode += getQuerySwiftBICcodeGetCountryListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuerySwiftBICcodeGetCountryListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">querySwiftBICcodeGetCountryListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySwiftBICcodeGetCountryListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "querySwiftBICcodeGetCountryListResult"));
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
