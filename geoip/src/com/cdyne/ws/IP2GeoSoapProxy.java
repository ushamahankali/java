package com.cdyne.ws;

public class IP2GeoSoapProxy implements com.cdyne.ws.IP2GeoSoap {
  private String _endpoint = null;
  private com.cdyne.ws.IP2GeoSoap iP2GeoSoap = null;
  
  public IP2GeoSoapProxy() {
    _initIP2GeoSoapProxy();
  }
  
  public IP2GeoSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initIP2GeoSoapProxy();
  }
  
  private void _initIP2GeoSoapProxy() {
    try {
      iP2GeoSoap = (new com.cdyne.ws.IP2GeoLocator()).getIP2GeoSoap();
      if (iP2GeoSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iP2GeoSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iP2GeoSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iP2GeoSoap != null)
      ((javax.xml.rpc.Stub)iP2GeoSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.cdyne.ws.IP2GeoSoap getIP2GeoSoap() {
    if (iP2GeoSoap == null)
      _initIP2GeoSoapProxy();
    return iP2GeoSoap;
  }
  
  public com.cdyne.ws.IPInformation resolveIP(java.lang.String ipAddress, java.lang.String licenseKey) throws java.rmi.RemoteException{
    if (iP2GeoSoap == null)
      _initIP2GeoSoapProxy();
    return iP2GeoSoap.resolveIP(ipAddress, licenseKey);
  }
  
  
}