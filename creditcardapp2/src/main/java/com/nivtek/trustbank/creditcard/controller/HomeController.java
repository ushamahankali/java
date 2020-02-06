package com.nivtek.trustbank.creditcard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nivtek.trustbank.creditcard.service.CreditCardService;

/**
 * Home Controller as for now used only to display the home.jsp homepage
 * 
 * @author Dipendra Pokharel
 * @return
 *
 */
@Controller
public class HomeController {

	@Autowired
	public CreditCardService ccService;

	/**
	 * @return
	 */
	@RequestMapping("/home")
	public String home() {

		return "home";
	}

}
