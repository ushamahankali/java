/**
 *
 */
package com.ekatha.creditcardgateway.controller;

import com.ekatha.creditcardgateway.entity.Request;
import com.ekatha.creditcardgateway.service.CreditCardService;

/**
 * @author usha it is a controller class
 */
public class CreditCardController {
	public void doPost(Request request) {

		CreditCardService ccs = new CreditCardService();

		String ccNumber = request.getCreditCardNumber();

		ccs.validateCreditCard(ccNumber);
	}

}
