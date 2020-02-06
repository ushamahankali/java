package com.ektha.freshdesknextgenjndi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.freshdesknextgenjndi.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String emailid, @RequestParam String password, ModelMap model) {

		boolean result = loginService.validateUSer(emailid, password);

		if (!result) {
			model.put("infoMessage", "Please enter a valid email and password!!");
			return "login";

		}
		return "home";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String ShowLoginPage() {
		return "login";
	}

}
