package com.ektha.creditcardgateway.demo;

public class BankService {

	BankDAO bdao = new BankDAO();

	public BankDB getBankInfo(String cCnumber) {
		BankDB bddn = bdao.getBankInfo(cCnumber);
		return bddn;

	}

	public boolean validateCreditCard(CreditCard cc) {

		BankDB bdb = bdao.getBankInfo(cc.creditCardNumber);

		if (bdb != null)
			return true;
		else
			return false;

	}

}
