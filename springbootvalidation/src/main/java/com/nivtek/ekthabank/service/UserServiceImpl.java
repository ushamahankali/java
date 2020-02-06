package com.nivtek.ekthabank.service;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nivtek.ekthabank.dao.RoleRepository;
import com.nivtek.ekthabank.dao.UserRepository;
import com.nivtek.ekthabank.entity.Role;
import com.nivtek.ekthabank.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	BCryptPasswordEncoder encoder;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Override
	public boolean isUserAlredayPresent(User user) {

		return false;
	}

	@Override
	public void saveUser(User user) {

		user.setPassword(encoder.encode(user.getPassword()));
		user.setStatus("Verified");
		Role userRole = roleRepository.findByRole("SITE_USER");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));

		userRepository.save(user);

	}

}
