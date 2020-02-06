package com.ektha.freshdeskmavenapp.service;

import com.ektha.freshdeskmavenapp.dao.LoginDAO;

public class LoginService {

	/*
	 * getting the data from the DAO class
	 */
	public boolean checkUser(String emailId, String password) {

		LoginDAO login = new LoginDAO();

		boolean result = login.checkUser(emailId, password);
		return result;
	}
}
