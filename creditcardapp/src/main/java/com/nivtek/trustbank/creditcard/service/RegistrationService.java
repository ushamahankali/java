/**
 * 
 */
package com.nivtek.trustbank.creditcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.trustbank.creditcard.dao.CreditCardDAO;
import com.nivtek.trustbank.creditcard.dao.RegistrationDAO;
import com.nivtek.trustbank.creditcard.entity.CreditCard;
import com.nivtek.trustbank.creditcard.entity.Customer;

/**
 * @author Dipendra Pokharel
 *
 */
@Service
public class RegistrationService {

	@Autowired
	RegistrationDAO rrDAO;
	@Autowired
	CreditCardDAO ccDAO;

	/**
	 * 
	 */
	public RegistrationService() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param rrDAO
	 * @param ccDAO
	 */
	public RegistrationService(RegistrationDAO rrDAO, CreditCardDAO ccDAO) {
		super();
		this.rrDAO = rrDAO;
		this.ccDAO = ccDAO;
	}

	/**
	 * Takes username and password and forwards it to Registration DAO layer
	 * 
	 * @param userName
	 * @param passWord
	 * @param customer
	 * @return
	 */
	public boolean createUser(String userName, String passWord, Customer customer) {

		boolean isRegistered = rrDAO.registerUser(userName, passWord, customer.getCustomerId());
		return isRegistered;
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
		if (ccDAO.validateLogin(userName, passWord)) {

			card = ccDAO.getCardByUserName(userName);
		}

		return card;
	}
}
