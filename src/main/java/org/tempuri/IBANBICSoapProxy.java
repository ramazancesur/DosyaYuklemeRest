package org.tempuri;

public class IBANBICSoapProxy implements org.tempuri.IBANBICSoap {
  private String _endpoint = null;
  private org.tempuri.IBANBICSoap �BANBICSoap = null;
  
	public IBANBICSoapProxy() {
    _initIBANBICSoapProxy();
  }
  
  public IBANBICSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initIBANBICSoapProxy();
  }
  
  private void _initIBANBICSoapProxy() {
    try {
      �BANBICSoap = (new org.tempuri.IBANBICLocator()).getIBANBICSoap();
      if (�BANBICSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)�BANBICSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)�BANBICSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (�BANBICSoap != null)
      ((javax.xml.rpc.Stub)�BANBICSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IBANBICSoap getIBANBICSoap() {
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap;
  }
  
  public java.lang.String about() throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.about();
  }
  
  public java.lang.String version() throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.version();
  }
  
  public java.lang.String getBelgianBBAN(java.lang.String value) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.getBelgianBBAN(value);
  }
  
  public java.lang.String BBANtoIBANandBIC(java.lang.String value) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.BBANtoIBANandBIC(value);
  }
  
  public java.lang.String BBANtoIBAN(java.lang.String value) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.BBANtoIBAN(value);
  }
  
  public java.lang.String BBANtoBIC(java.lang.String value) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.BBANtoBIC(value);
  }
  
  public java.lang.String BBANtoBANKNAME(java.lang.String value) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.BBANtoBANKNAME(value);
  }
  
  public boolean checkBBAN(java.lang.String value) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.checkBBAN(value);
  }
  
  public org.tempuri.GetCountryListResponseGetCountryListResult getCountryList() throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.getCountryList();
  }
  
  public java.lang.String calculateIBAN1(java.lang.String ISOcountry, java.lang.String account) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.calculateIBAN1(ISOcountry, account);
  }
  
  public java.lang.String calculateIBAN2(java.lang.String ISOcountry, java.lang.String banknumber, java.lang.String account) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.calculateIBAN2(ISOcountry, banknumber, account);
  }
  
  public boolean controleIBAN(java.lang.String iban) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.controleIBAN(iban);
  }
  
  public java.lang.String querySwiftBICcode(java.lang.String institution, java.lang.String city, java.lang.String country) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.querySwiftBICcode(institution, city, country);
  }
  
  public java.lang.String querySwiftBICcode1(java.lang.String institution, java.lang.String country) throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.querySwiftBICcode1(institution, country);
  }
  
  public java.lang.String querySwiftBICcodeGetCountryList() throws java.rmi.RemoteException{
    if (�BANBICSoap == null)
      _initIBANBICSoapProxy();
    return �BANBICSoap.querySwiftBICcodeGetCountryList();
  }
  
  
}