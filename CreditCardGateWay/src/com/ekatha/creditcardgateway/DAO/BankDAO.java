/**
 *
 */
package com.ekatha.creditcardgateway.DAO;

import com.ekatha.creditcardgateway.entity.BankdDB;

/**
 * @author usha
 *
 */
public class BankDAO {
	BankdDB bdb = new BankdDB();

	// Based on the credit card number getting all the details from bank database
	public BankdDB getBankInfo(String ccNumber) {

		if (bdb.creditCardNumber.equalsIgnoreCase(ccNumber)) {

			return bdb;

		}
		return null;
	}

}
