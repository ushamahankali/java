package com.ektha.freshdeskorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdeskorm.dao.SignUpDao;
import com.ektha.freshdeskorm.domain.User;

@Service
public class SignUpService {

	@Autowired
	private SignUpDao signUpDao;

	public int registerUser(User user) {

		return signUpDao.saveUserDetails(user);

	}

}
