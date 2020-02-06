package com.ektha.freshdeskbootrestclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdeskbootrestclient.dao.SignUpDAO;
import com.ektha.freshdeskbootrestclient.entity.User;

@Service
public class SignUpService {

	@Autowired
	private SignUpDAO signupdao;

	public int saveUser(User user) {
		return signupdao.registerUser(user);
	}
}
