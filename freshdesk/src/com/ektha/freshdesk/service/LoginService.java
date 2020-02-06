package com.ektha.freshdesk.service;

import com.ektha.freshdesk.dao.LoginDAO;

/*
 *  login Service class
 *
*/

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
