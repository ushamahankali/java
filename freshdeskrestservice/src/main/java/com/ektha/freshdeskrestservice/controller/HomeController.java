package com.ektha.freshdeskrestservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHomePage() {
		return "home";
	}

	@RequestMapping(value = { "/index", "/" }, method = RequestMethod.GET)
	public String showLandingPage() {
		System.out.println("inside showLandingPage");
		return "index";
	}
}
