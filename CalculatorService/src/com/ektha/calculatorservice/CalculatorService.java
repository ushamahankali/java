package com.ektha.calculatorservice;

import javax.jws.WebService;

@WebService(targetNamespace = "http://calculatorservice.ektha.com/", portName = "CalculatorServicePort", serviceName = "CalculatorServiceService")
public class CalculatorService {

	public int add(int a, int b) {
		return a + b;

	}

	public int sub(int a, int b)

	{
		return a - b;
	}

}
