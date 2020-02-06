/**
 *
 */
package com.ekatha.creditcardgateway.service;

import com.ekatha.creditcardgateway.DAO.BankDAO;
import com.ekatha.creditcardgateway.entity.BankdDB;
import com.ekatha.creditcardgateway.entity.CreditCard;

/**
 * @author usha
 *
 */
public class BankService {
	BankDAO bdao = new BankDAO();

	public BankdDB getBankInfo(String cCnumber) {
		BankdDB bddn = bdao.getBankInfo(cCnumber);
		return bddn;

	}

	public boolean validateCreditCard(CreditCard cc) {

		com.ekatha.creditcardgateway.entity.BankdDB bdb = bdao.getBankInfo(cc.creditCardNumber);

		if (bdb != null)
			return true;
		else
			return false;

	}

}
