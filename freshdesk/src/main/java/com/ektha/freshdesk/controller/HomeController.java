package com.ektha.freshdesk.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger logger = LogManager.getLogger(HomeController.class);

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String showHomePage() {

		if (logger.isDebugEnabled()) {
			logger.warn("getWelcome is executed!");
		}

		logger.warn("inside showHomePage");

		return "home";
	}

	@RequestMapping(value = { "/index", "/" }, method = RequestMethod.GET)
	public String showLandingPage() {

		/*
		 * if (logger.isDebugEnabled()) { logger.debug("getWelcome is executed!"); }
		 */

		logger.warn("inside showLandingPage");

		return "index";
	}
}
