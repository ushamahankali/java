package com.ektha.freshdeskweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdeskweb.dao.SignUpDao;
import com.ektha.freshdeskweb.domain.User;

@Service
public class SignUpService {

	@Autowired
	private SignUpDao signUpDao;

	public int registerUser(User user) {

		return signUpDao.saveUserDetails(user);

	}

}
