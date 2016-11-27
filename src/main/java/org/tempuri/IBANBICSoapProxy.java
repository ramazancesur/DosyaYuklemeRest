package org.tempuri;

public class IBANBICSoapProxy implements org.tempuri.IBANBICSoap {
  private String _endpoint = null;
  private org.tempuri.IBANBICSoap ýBANBICSoap = null;
  
	public IBANBICSoapProxy() {
    _initIBANBICSoapProxy();
  }
  
  public IBANBICSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initIBANBICSoapProxy();
  }
  
  private void _initIBANBICSoapProxy() {
    try {
      ýBANBICSoap = (new org.tempuri.IBANBICLocator()).getIBANBICSoap();
      if (ýBANBICSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ýBANBICSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ýBANBICSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ýBANBICSoap != null)
      ((javax.xml.rpc.Stub)ýBANBICSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IBANBICSoap getIBANBICSoap() {
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap;
  }
  
  public java.lang.String about() throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.about();
  }
  
  public java.lang.String version() throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.version();
  }
  
  public java.lang.String getBelgianBBAN(java.lang.String value) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.getBelgianBBAN(value);
  }
  
  public java.lang.String BBANtoIBANandBIC(java.lang.String value) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.BBANtoIBANandBIC(value);
  }
  
  public java.lang.String BBANtoIBAN(java.lang.String value) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.BBANtoIBAN(value);
  }
  
  public java.lang.String BBANtoBIC(java.lang.String value) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.BBANtoBIC(value);
  }
  
  public java.lang.String BBANtoBANKNAME(java.lang.String value) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.BBANtoBANKNAME(value);
  }
  
  public boolean checkBBAN(java.lang.String value) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.checkBBAN(value);
  }
  
  public org.tempuri.GetCountryListResponseGetCountryListResult getCountryList() throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.getCountryList();
  }
  
  public java.lang.String calculateIBAN1(java.lang.String ISOcountry, java.lang.String account) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.calculateIBAN1(ISOcountry, account);
  }
  
  public java.lang.String calculateIBAN2(java.lang.String ISOcountry, java.lang.String banknumber, java.lang.String account) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.calculateIBAN2(ISOcountry, banknumber, account);
  }
  
  public boolean controleIBAN(java.lang.String iban) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.controleIBAN(iban);
  }
  
  public java.lang.String querySwiftBICcode(java.lang.String institution, java.lang.String city, java.lang.String country) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.querySwiftBICcode(institution, city, country);
  }
  
  public java.lang.String querySwiftBICcode1(java.lang.String institution, java.lang.String country) throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.querySwiftBICcode1(institution, country);
  }
  
  public java.lang.String querySwiftBICcodeGetCountryList() throws java.rmi.RemoteException{
    if (ýBANBICSoap == null)
      _initIBANBICSoapProxy();
    return ýBANBICSoap.querySwiftBICcodeGetCountryList();
  }
  
  
}