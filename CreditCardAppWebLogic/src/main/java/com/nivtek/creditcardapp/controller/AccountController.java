package com.nivtek.creditcardapp.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nivtek.creditcardapp.entity.Account;
import com.nivtek.creditcardapp.entity.Contact;
import com.nivtek.creditcardapp.entity.CreditCard;
import com.nivtek.creditcardapp.entity.Customer;
import com.nivtek.creditcardapp.service.AccountService;
import com.nivtek.creditcardapp.service.CreditCardService;


@Controller
public class AccountController {
	
	private static Logger logger = Logger.getLogger(AccountController.class);
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	CreditCardService creditCardService;
	
	/**
	 * after successfully logged in
	 */
	@RequestMapping("/account")
	public ModelAndView goToAccount(HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		
		//if username not available in the session, show 404 page
		if(session.getAttribute("username")==null) {
			modelAndView.setViewName("forward:/html/404.html");
			return modelAndView;
		}
		
		String username = session.getAttribute("username").toString();
		logger.info("Logged into account." + username);
		
		//use username to get all the information from database
		Account account = accountService.getAccountByUsername(username);
		int cardId = account.getCardId();	
		CreditCard creditCard = creditCardService.getCreditCardByCardId(cardId);
		int customerId = creditCard.getCustomerId();	
		Customer customer = creditCardService.getCustomerByCustomerId(customerId);
		Contact contact = accountService.getContactByCustomerId(customerId);
		
		//for displaying activation status on account page
		String cardStatus = "activated";
		if(creditCard.getActivationStatus()==0) {
			cardStatus = "not activated";
		}
		
		modelAndView.addObject("creditCard", creditCard);
		modelAndView.addObject("contact", contact);
		modelAndView.addObject("customer",customer);
		modelAndView.addObject("cardStatus",cardStatus);
			
		//set customer into session for later use (to show personal details)
		session.setAttribute("customer", customer);
		
		//go to account home page
		modelAndView.setViewName("account/accounthome");
		return modelAndView;
	}

	/**
	 * after clicked "Personal Details" link on account home page
	 */
	@RequestMapping("/accountDetails")
	public String goToAccountDetails(HttpSession session) {	
		
		//if username not available in the session, show 404 page
		if(session.getAttribute("username")==null) {
			return "forward:/html/404.html";
		}
		
		//go to personal details page
		return "account/details";	
	}
}
