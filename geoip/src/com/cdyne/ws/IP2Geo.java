/**
 * IP2Geo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cdyne.ws;

public interface IP2Geo extends javax.xml.rpc.Service {

/**
 * Our system uses a multiple sources for resolution.  Including a
 * host database, trace route information, and other systems.  Resolves
 * IP addresses to Organization, Country, City, and State/Province, Latitude,
 * Longitude.  In most US cities it will also provide some extra information
 * such as Area Code, and more.
 */
    public java.lang.String getIP2GeoSoapAddress();

    public com.cdyne.ws.IP2GeoSoap getIP2GeoSoap() throws javax.xml.rpc.ServiceException;

    public com.cdyne.ws.IP2GeoSoap getIP2GeoSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
