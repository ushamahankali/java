package com.ektha.freshdesk.service;

import com.ektha.freshdesk.dao.SignUpDAO;
import com.ektha.freshdesk.entity.User;

/*
 * getting the data from the
 * */
public class SignUpService {

	/*
	 * getting the data from the DAO
	 */
	public boolean createUser(User users) {

		SignUpDAO signUp = new SignUpDAO();

		boolean result = signUp.saveUser(users);

		return result;
	}
}
