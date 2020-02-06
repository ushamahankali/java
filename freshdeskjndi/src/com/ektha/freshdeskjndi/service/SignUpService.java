package com.ektha.freshdeskjndi.service;

import com.ektha.freshdeskjndi.dao.SignUpDAO;
import com.ektha.freshdeskjndi.entity.User;

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
