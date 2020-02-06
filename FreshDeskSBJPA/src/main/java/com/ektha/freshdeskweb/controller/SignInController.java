package com.ektha.freshdeskweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ektha.freshdeskweb.service.SignInService;

@Controller
public class SignInController {

	@Autowired
	private SignInService signInService;

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("signin");

		model.addObject("signin");
		return model;
	}

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String loginProcess(@RequestParam String email, @RequestParam String password, ModelMap model) {

		boolean isEmptyParams = email.isEmpty() || password.isEmpty();

		if (isEmptyParams) {
			model.put("infoMessage", "Please enter a valid email and password!!");
			return "signin";
		}

		boolean isValidUser = signInService.validateUser(email, password);

		if (isValidUser) {
			return "home";
		}

		model.put("infoMessage", "Email and password is invalid");
		return "signin";

	}

}