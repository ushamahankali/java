package com.ektha.freshdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdesk.dao.LoginDAO;
import com.ektha.freshdesk.entity.User;

@Service
public class LoginService {

	@Autowired
	LoginDAO loginDAO;

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
