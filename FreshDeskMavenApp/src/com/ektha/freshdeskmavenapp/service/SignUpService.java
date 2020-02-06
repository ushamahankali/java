package com.ektha.freshdeskmavenapp.service;

import com.ektha.freshdeskmavenapp.dao.SignUpDAO;
import com.ektha.freshdeskmavenapp.entity.User;

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
