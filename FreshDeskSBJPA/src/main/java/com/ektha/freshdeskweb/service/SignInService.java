package com.ektha.freshdeskweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdeskweb.dao.SignInDao;
import com.ektha.freshdeskweb.domain.User;

@Service
public class SignInService {

	@Autowired
	private SignInDao signInDao;

	public Boolean validateUser(String email, String password) {

		boolean isValidUser = false;

		User user = signInDao.getUserDetails(email);
		if (user != null) {
			if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
				isValidUser = true;
			}
		}
		return isValidUser;
	}
}