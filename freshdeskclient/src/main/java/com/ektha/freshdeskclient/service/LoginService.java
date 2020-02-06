package com.ektha.freshdeskclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdeskclient.dao.LoginDAO;
import com.ektha.freshdeskclient.entity.User;

@Service
public class LoginService {

	@Autowired
	private LoginDAO loginDAO;

	public boolean validateUSer(String emailId, String password) {

		boolean result = false;

		User user = loginDAO.checkUser(emailId, password);

		if (user != null) {
			if (user.getEmailId().equalsIgnoreCase(emailId) && user.getPassword().equals(password)) {
				result = true;
			}
		}
		return result;

	}
}
