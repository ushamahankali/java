package com.ektha.webservice.geoip;

import java.rmi.RemoteException;

import com.cdyne.ws.IP2GeoSoap;
import com.cdyne.ws.IP2GeoSoapProxy;
import com.cdyne.ws.IPInformation;

public class GeoIpClient {

	public static void main(String[] args) throws RemoteException {

		IP2GeoSoapProxy proxy = new IP2GeoSoapProxy();

		IP2GeoSoap soapMessage = proxy.getIP2GeoSoap();

		IPInformation information = soapMessage.resolveIP("139.130.4.5", "00186-064-167-130");

		System.out.println(information.getCity());
		System.out.println(information.getCountry());
		System.out.println(information.getRegionName());
		System.out.println(information.getAreaCode());
		System.out.println(information.getCountryCode());
		System.out.println(information.getTimeZone());

	}

}
