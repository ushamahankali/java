package com.ektha.freshdeskweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.freshdeskweb.domain.User;
import com.ektha.freshdeskweb.service.SignUpService;

@Controller
public class SignUpController {

	@Autowired
	private SignUpService signUpService;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String showRegisterPage() {
		return "signup";
	}

	@RequestMapping(value = "signupProcess", method = RequestMethod.POST)
	public String handleSignUpRequest(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String email, @RequestParam String password, @RequestParam String phoneNum, ModelMap model) {

		boolean isEmptyParams = firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty();

		if (isEmptyParams) {
			model.put("infoMessage", "Please enter a valid registration details");
			return "signup";
		}

		User user = new User();

		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhoneNum(phoneNum);

		int numberOfRows = signUpService.registerUser(user);

		if (numberOfRows == 0) {
			model.put("message", "Sorry an error occured!!");
			return "signup";
		}
		model.put("message", "You have registered successfully. You can now login!!");
		return "signinin";

	}

}
