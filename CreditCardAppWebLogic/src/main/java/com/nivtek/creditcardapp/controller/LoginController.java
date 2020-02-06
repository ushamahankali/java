package com.nivtek.creditcardapp.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nivtek.creditcardapp.service.LoginService;


@Controller
public class LoginController {
	
	private static Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	/**
	 * after clicked "Login" button on the "registration successful" page
	 */
	@RequestMapping("/login")
	public String showLogin() {					
		return "forward:/html/login.html";
	}
	
	@RequestMapping(value="/processLogin", method = RequestMethod.GET)
	public String login() {
		return "redirect:login.do";
	}
	
	/**
	 * after sent the username and password
	 */
	@RequestMapping(value="/processLogin", method=RequestMethod.POST)
	public String login(@RequestParam String username, @RequestParam String password, HttpSession session) {			
		
		//if username and password not valid
		if(username==null || password==null || username.length()==0 || password.length()==0 || !loginService.isValidUser(username, password)) {
			logger.info("Login failed with username "+username +" and password "+password);
			//go to "login failed" page
			return "forward:/html/loginfail.html";
		}
		
		//use session if logged in
		session.setAttribute("username", username);
			
		//go to account home page
		return "redirect:account.do";
	}	
}
