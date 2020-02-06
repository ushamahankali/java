package com.ektha.creditcardgateway.demo;

public class CreditCardDAO {
	CreditCardDB ccdb = new CreditCardDB();

	public CreditCardDB getCreditCardInfo(String ccNumber) {

		if (ccdb.creditCardNumber.equalsIgnoreCase(ccNumber)) {

			return ccdb;

		}
		return null;
	}

}
