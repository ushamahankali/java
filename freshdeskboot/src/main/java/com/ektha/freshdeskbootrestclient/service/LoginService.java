package com.ektha.freshdeskbootrestclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdeskbootrestclient.dao.LoginDAO;
import com.ektha.freshdeskbootrestclient.entity.User;

@Service
public class LoginService {

	@Autowired
	private LoginDAO logindao;
	

	public boolean validateUser(String email, String password) {
		boolean isValidUser = false;

		User user = logindao.getProfileDetails(email);
		if (user != null) {
			if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
				isValidUser = true;
			}
		}
		return isValidUser;
	}
}
