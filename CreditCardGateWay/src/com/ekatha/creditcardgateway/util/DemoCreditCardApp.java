/**
 *
 */
package com.ekatha.creditcardgateway.util;

/**
 * @author usha
 *
 */
import java.util.Scanner;

import com.ekatha.creditcardgateway.controller.CreditCardController;
import com.ekatha.creditcardgateway.entity.Request;

public class DemoCreditCardApp {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Request ccd = new Request();

		// System.out.println("Enter the CreditCard Details");

		System.out.println("Enter the CreditCard Number:");
		ccd.setCreditCardNumber(scanner.next());
		scanCreditCardData(ccd);

		scanner.close();
	}

	private static void scanCreditCardData(Request request) {

		CreditCardController ccControl = new CreditCardController();

		ccControl.doPost(request);

	}
}
