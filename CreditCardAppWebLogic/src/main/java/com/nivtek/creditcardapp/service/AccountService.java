package com.nivtek.creditcardapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.creditcardapp.dao.AccountDAO;
import com.nivtek.creditcardapp.dao.ContactDAO;
import com.nivtek.creditcardapp.entity.Account;
import com.nivtek.creditcardapp.entity.Contact;

@Service
public class AccountService {
	
	@Autowired
	AccountDAO accountDAO;
	
	@Autowired
	ContactDAO contactDAO;
	
	public boolean isUsernameFound(String username) {	
		return accountDAO.getAccountByUsername(username)!=null;
	}

	public void saveAccount(String username, String password, String cardNo) {
		accountDAO.saveAccount(username, password, cardNo);	
	}

	public Account getAccountByUsername(String username) {
		return accountDAO.getAccountByUsername(username);
	}

	public Contact getContactByCustomerId(int customerId) {
		return contactDAO.getContactByCustomerId(customerId);
	}

	public Account getAccountByCardId(int cardId) {
		return accountDAO.getAccountByCardId(cardId);
	}
}
