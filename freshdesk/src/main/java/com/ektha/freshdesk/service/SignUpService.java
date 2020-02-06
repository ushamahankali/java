package com.ektha.freshdesk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdesk.dao.SignUpDAO;
import com.ektha.freshdesk.entity.User;

@Service
public class SignUpService {

	@Autowired
	SignUpDAO signUpDAO;

	public boolean createUser(User users) {

		boolean result = false;
		if (users != null) {

			if ((users.getFirstName().isEmpty() || users.getLastName().isEmpty() || users.getEmailId().isEmpty()
					|| users.getPhoneNumber().isEmpty() || users.getPassword().isEmpty())) {

				return result = true;
			}

		}
		return result;
	}

	public int saveUser(User user) {
		return signUpDAO.saveUser(user);

	}
}
