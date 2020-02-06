package com.ektha.freshdesk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.freshdesk.entity.User;
import com.ektha.freshdesk.service.SignUpService;

@Controller
public class SignUpController {

	@Autowired
	private SignUpService signupService;

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String emailid, @RequestParam String firstName,
			@RequestParam String lastName, @RequestParam String phoneNumber, @RequestParam String password,
			ModelMap model) {

		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmailId(emailid);
		user.setPassword(password);
		user.setPhoneNumber(phoneNumber);

		boolean result = signupService.createUser(user);
		if (result) {
			model.put("infoMessage", "Please Enter a valid user details");
			return "signup";
		}
		return "login";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String ShowLoginPage() {
		return "signup";
	}

}
