package com.nivtek.trustbank.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.trustbank.creditcard.dao.CreditCardDAO;
import com.nivtek.trustbank.creditcard.dao.LoginDAO;
import com.nivtek.trustbank.creditcard.entity.CreditCard;

@Service
public class LoginService {

	@Autowired
	public LoginDAO loginDAO;
	@Autowired
	public CreditCardDAO ccDAO;

	/**
	 * 
	 */
	public LoginService() {
		super();
	}

	/**
	 * @param loginDAO
	 * @param ccDAO
	 */
	public LoginService(LoginDAO loginDAO, CreditCardDAO ccDAO) {
		super();
		this.loginDAO = loginDAO;
		this.ccDAO = ccDAO;
	}

	/**
	 * Validates Login details
	 * 
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public CreditCard validateLogin(String userName, String passWord) {

		CreditCard card = new CreditCard();
		if (loginDAO.validateLogin(userName, passWord)) {

			card = ccDAO.getCardByUserName(userName);
		}

		return card;
	}

}
