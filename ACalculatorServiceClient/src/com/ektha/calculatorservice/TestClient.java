package com.ektha.calculatorservice;

import java.rmi.RemoteException;

public class TestClient {

	public static void main(String[] args) throws RemoteException {

		CalculatorServiceStub stub = new CalculatorServiceStub();

		CalculatorServiceStub.Add add = new CalculatorServiceStub.Add();
		add.setA(30);
		add.setB(40);

		CalculatorServiceStub.AddResponse res = stub.add(add);
		int result = res.get_return();
		System.out.println("Addition of 2 number is " + result);

		CalculatorServiceStub.Sub sub = new CalculatorServiceStub.Sub();
		sub.setA(70);
		sub.setB(40);

		CalculatorServiceStub.SubResponse rese = stub.sub(sub);
		int sresutl = rese.get_return();
		System.out.println("Subtraction of 2 number is " + sresutl);

	}

}
