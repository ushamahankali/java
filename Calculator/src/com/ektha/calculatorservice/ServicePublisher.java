package com.ektha.calculatorservice;

import javax.xml.ws.Endpoint;

public class ServicePublisher {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8080/ws/cal", new CalculatorImpl());
	}

}
