package com.ektha.mokito;

public class Calculator {

	CalculatorService service;

	public Calculator(CalculatorService service) {
		this.service = service;
	}

	public int perform(int a, int b)

	{
		return service.add(a, b) * a;

		/* return (a + b) * a; */
	}

}
