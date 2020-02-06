package com.ektha.calculatorservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ektha.calculatorservice.ICalculator")
public class CalculatorImpl implements ICalculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {

		return a - b;
	}

}
