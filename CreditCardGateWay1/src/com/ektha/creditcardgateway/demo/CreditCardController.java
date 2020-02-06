package com.ektha.creditcardgateway.demo;

public class CreditCardController {

	public void doPost(CreditCardRequest request) {

		CreditCardService ccs = new CreditCardService();

		String ccNumber = request.getCreditCardNumber();

		ccs.validateCreditCard(ccNumber);
		// System.out.println("hello");

	}

}
