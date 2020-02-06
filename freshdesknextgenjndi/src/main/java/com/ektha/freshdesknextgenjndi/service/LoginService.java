package com.ektha.freshdesknextgenjndi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdesknextgenjndi.dao.LoginDAO;
import com.ektha.freshdesknextgenjndi.entity.User;

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
