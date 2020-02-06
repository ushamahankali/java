package com.ektha.freshdeskbootrestclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.freshdeskbootrestclient.entity.User;
import com.ektha.freshdeskbootrestclient.service.SignUpService;

@Controller
public class SignUpController {

	@Autowired
	private SignUpService signupservice;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String showSignUpPage() {
		return "signup";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String handleSignUpRequest(@RequestParam String fname, @RequestParam String lname,
			@RequestParam String email, @RequestParam String password, @RequestParam String phone, ModelMap model) {

		boolean isEmptyParams = fname.isEmpty() || lname.isEmpty() || email.isEmpty() || password.isEmpty();
		
		if(isEmptyParams) {
			model.put("infoMessage", "Please enter a valid registration details");
			return "signup";
		}
		
		User user = new User();
		user.setFname(fname);
		user.setLname(lname);
		user.setEmail(email);
		user.setPassword(password);
		user.setPhone(phone);
		
		int rowsAffected = signupservice.saveUser(user);
		
		if(rowsAffected==0) {
			model.put("infoMessage", "Sorry an error occured!!");
			return "signup";
		}
		model.put("infoMessage", "You have registered successfully. You can now login!!");
		return "login";
	}
}
