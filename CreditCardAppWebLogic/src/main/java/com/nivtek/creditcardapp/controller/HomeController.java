package com.nivtek.creditcardapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	/**
	 * after clicked "Home" link or enter the url of the app
	 * (The default welcome page is set to `home.jsp`, and it redirects to `home.do`.)
	 */
	@RequestMapping("/home")
	public String goToHome() {
		return "forward:/html/home.html";
	}
}
