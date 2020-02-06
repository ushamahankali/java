package com.ektha.freshdeskbootrestclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.freshdeskbootrestclient.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginservice;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String email, @RequestParam String password, ModelMap model) {

		boolean isEmptyParams = email.isEmpty() || password.isEmpty();
		
		if(isEmptyParams) {
			model.put("infoMessage", "Please enter a valid email and password!!");
			return "login";
		}
		boolean isValidUser = loginservice.validateUser(email, password);
		
		if(isValidUser) {
			return "home";
		}
		model.put("infoMessage", "Email and password is invalid");
		return "login";

	}
}
