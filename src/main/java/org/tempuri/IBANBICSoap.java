/**
 * IBANBICSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IBANBICSoap extends java.rmi.Remote {
    public java.lang.String about() throws java.rmi.RemoteException;
    public java.lang.String version() throws java.rmi.RemoteException;
    public java.lang.String getBelgianBBAN(java.lang.String value) throws java.rmi.RemoteException;
    public java.lang.String BBANtoIBANandBIC(java.lang.String value) throws java.rmi.RemoteException;
    public java.lang.String BBANtoIBAN(java.lang.String value) throws java.rmi.RemoteException;
    public java.lang.String BBANtoBIC(java.lang.String value) throws java.rmi.RemoteException;
    public java.lang.String BBANtoBANKNAME(java.lang.String value) throws java.rmi.RemoteException;
    public boolean checkBBAN(java.lang.String value) throws java.rmi.RemoteException;
    public org.tempuri.GetCountryListResponseGetCountryListResult getCountryList() throws java.rmi.RemoteException;
    public java.lang.String calculateIBAN1(java.lang.String ISOcountry, java.lang.String account) throws java.rmi.RemoteException;
    public java.lang.String calculateIBAN2(java.lang.String ISOcountry, java.lang.String banknumber, java.lang.String account) throws java.rmi.RemoteException;
    public boolean controleIBAN(java.lang.String iban) throws java.rmi.RemoteException;
    public java.lang.String querySwiftBICcode(java.lang.String institution, java.lang.String city, java.lang.String country) throws java.rmi.RemoteException;
    public java.lang.String querySwiftBICcode1(java.lang.String institution, java.lang.String country) throws java.rmi.RemoteException;
    public java.lang.String querySwiftBICcodeGetCountryList() throws java.rmi.RemoteException;
}
