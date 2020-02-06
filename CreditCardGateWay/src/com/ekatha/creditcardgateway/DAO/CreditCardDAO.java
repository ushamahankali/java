/**
 *
 */
package com.ekatha.creditcardgateway.DAO;

import com.ekatha.creditcardgateway.entity.CreditCardDB;

/**
 * @author usha
 *
 */
public class CreditCardDAO {
	CreditCardDB ccdb = new CreditCardDB();

	// Based on the credit card number getting all the details from creditcard
	// database
	public CreditCardDB getCreditCardInfo(String ccNumber) {

		if (ccdb.creditCardNumber.equalsIgnoreCase(ccNumber)) {

			return ccdb;

		}
		return null;
	}

}
