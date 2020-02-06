/**
 *
 */
package com.ekatha.creditcardgateway.service;

import com.ekatha.creditcardgateway.DAO.CreditCardDAO;
import com.ekatha.creditcardgateway.entity.BankdDB;
import com.ekatha.creditcardgateway.entity.CreditCard;
import com.ekatha.creditcardgateway.entity.CreditCardDB;

/**
 * @author usha
 *
 */
public class CreditCardService {

	public String getCreditCardNumber(String cCardNumber) {
		return cCardNumber;
	}

	// validating the card and printing the creditcard details
	public boolean validateCreditCard(String cCardNumber) {

		CreditCardDAO ccDAO = new CreditCardDAO();

		CreditCardDB ccDB = ccDAO.getCreditCardInfo(cCardNumber);
		if (ccDB != null) {

			CreditCard cc = new CreditCard();
			cc.setCreditCardNumber(cCardNumber);
			cc.setCvvNumber(ccDB.cvvNumber);
			cc.setNameOnTheCard(ccDB.nameOnTheCard);
			cc.setZipCode(ccDB.zipCode);

			BankService bService = new BankService();
			boolean result = bService.validateCreditCard(cc);

			if (result) {
				// System.out.println("Credit card validation successful");
				BankdDB bdb = bService.getBankInfo(cCardNumber);
				System.out.println(bdb.getCreditCardNumber());
				System.out.println(bdb.getNameOnTheCard());
				System.out.println(bdb.getCvvNumber());
				System.out.println(bdb.getZipCode());

				return true;
			}

			else {
				System.out.println("Credit card validation failed");

			}

		}
		System.out.println("Enter the Valid creditCard number");
		return false;

	}
}
