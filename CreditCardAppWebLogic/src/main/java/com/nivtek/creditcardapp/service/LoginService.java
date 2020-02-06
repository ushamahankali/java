package com.nivtek.creditcardapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.creditcardapp.dao.AccountDAO;
import com.nivtek.creditcardapp.entity.Account;

@Service
public class LoginService {
	
	@Autowired
	AccountDAO accountDAO;
	
	public boolean isValidUser(String username, String password) {
		Account account = accountDAO.getAccountByUsername(username);
		if(account==null) {
			return false;
		}
		return password.equals(account.getPassword());
	}
}
