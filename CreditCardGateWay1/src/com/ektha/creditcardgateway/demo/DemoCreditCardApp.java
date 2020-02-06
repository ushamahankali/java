package com.ektha.creditcardgateway.demo;

import java.util.Scanner;

public class DemoCreditCardApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		CreditCardRequest ccd = new CreditCardRequest();

		// System.out.println("Enter the CreditCard Details");

		System.out.println("Enter the CreditCard Number:");
		ccd.setCreditCardNumber(scanner.next());
		scanCreditCardData(ccd);

		scanner.close();
	}

	private static void scanCreditCardData(CreditCardRequest request) {

		CreditCardController ccControl = new CreditCardController();

		ccControl.doPost(request);

	}
}
