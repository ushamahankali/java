/**
 * IP2GeoLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws;

public class IP2GeoLocator extends org.apache.axis.client.Service implements com.cdyne.ws.IP2Geo {

/**
 * Our system uses a multiple sources for resolution.  Including a
 * host database, trace route information, and other systems.  Resolves
 * IP addresses to Organization, Country, City, and State/Province, Latitude,
 * Longitude.  In most US cities it will also provide some extra information
 * such as Area Code, and more.
 */

    public IP2GeoLocator() {
    }


    public IP2GeoLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IP2GeoLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IP2GeoSoap
    private java.lang.String IP2GeoSoap_address = "http://ws.cdyne.com/ip2geo/ip2geo.asmx";

    public java.lang.String getIP2GeoSoapAddress() {
        return IP2GeoSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IP2GeoSoapWSDDServiceName = "IP2GeoSoap";

    public java.lang.String getIP2GeoSoapWSDDServiceName() {
        return IP2GeoSoapWSDDServiceName;
    }

    public void setIP2GeoSoapWSDDServiceName(java.lang.String name) {
        IP2GeoSoapWSDDServiceName = name;
    }

    public com.cdyne.ws.IP2GeoSoap getIP2GeoSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IP2GeoSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIP2GeoSoap(endpoint);
    }

    public com.cdyne.ws.IP2GeoSoap getIP2GeoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.cdyne.ws.IP2GeoSoapStub _stub = new com.cdyne.ws.IP2GeoSoapStub(portAddress, this);
            _stub.setPortName(getIP2GeoSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIP2GeoSoapEndpointAddress(java.lang.String address) {
        IP2GeoSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.cdyne.ws.IP2GeoSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.cdyne.ws.IP2GeoSoapStub _stub = new com.cdyne.ws.IP2GeoSoapStub(new java.net.URL(IP2GeoSoap_address), this);
                _stub.setPortName(getIP2GeoSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IP2GeoSoap".equals(inputPortName)) {
            return getIP2GeoSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.cdyne.com/", "IP2Geo");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.cdyne.com/", "IP2GeoSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IP2GeoSoap".equals(portName)) {
            setIP2GeoSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
