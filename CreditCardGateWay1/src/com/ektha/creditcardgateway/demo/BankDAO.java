package com.ektha.creditcardgateway.demo;

public class BankDAO {

	BankDB bdb = new BankDB();

	public BankDB getBankInfo(String ccNumber) {

		if (bdb.creditCardNumber.equalsIgnoreCase(ccNumber)) {

			return bdb;

		}
		return null;
	}

}