package com.ektha.freshdesk.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.freshdesk.service.LoginService;

@Controller
public class LoginController {

	private static final Logger logger = LogManager.getLogger(LoginController.class);

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String emailid, @RequestParam String password, ModelMap model) {

		boolean result = loginService.validateUSer(emailid, password);

		if (!result) {
			model.put("infoMessage", "Please enter a valid email and password!!");

			logger.warn("This is Error message");
			return "login";

		}
		logger.error("This is Error message");

		return "home";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String ShowLoginPage() {

		if (logger.isDebugEnabled()) {
			logger.debug("getWelcome is executed!");
		}

		logger.warn("This is Error message");

		return "login";
	}

}
