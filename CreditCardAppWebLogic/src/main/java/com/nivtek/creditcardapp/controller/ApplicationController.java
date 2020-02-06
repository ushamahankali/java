package com.nivtek.creditcardapp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nivtek.creditcardapp.entity.Application;
import com.nivtek.creditcardapp.entity.Contact;
import com.nivtek.creditcardapp.entity.CreditCard;
import com.nivtek.creditcardapp.entity.Customer;
import com.nivtek.creditcardapp.entity.SecurityQuestion;
import com.nivtek.creditcardapp.service.CreditCardService;


@Controller
public class ApplicationController {
	
	private static Logger logger = Logger.getLogger(ApplicationController.class);
	
	@Autowired
	CreditCardService creditCardService;
	
	/**
	 * after clicked "Credit Card" tab
	 */
	@RequestMapping("/creditcard")
	public String goToCreditCard() {
		return "forward:/html/creditcard.html";
	}
	
	/**
	 *  after clicked "Apply" button or link
	 */
	@RequestMapping("/application")
	public ModelAndView goToApplication(ModelAndView modelAndView) {
		//for binding the data
		Customer customer = new Customer();
		Contact contact = new Contact();
		Application application = new Application();	
		modelAndView.addObject("customer", customer);
		modelAndView.addObject("contact", contact);
		modelAndView.addObject("application", application);
		
		//get security questions from database
		List<SecurityQuestion> listOfQuestion = creditCardService.getSecurityQuestion();
		modelAndView.addObject("listOfQuestion", listOfQuestion);
	
		//go to the Application Form
		modelAndView.setViewName("application/application-form");		
		return modelAndView;
	}
	

	@RequestMapping(value="/applicationResult", method = RequestMethod.GET)
	public String goApplicationResult() {
		return "redirect:application.do";
	}
	
	/**
	 * after sent the application form
	 */
	@RequestMapping(value = "/applicationResult", method = RequestMethod.POST) 
	public ModelAndView goToApplicationResult(@ModelAttribute Customer customer, @ModelAttribute Application application, @ModelAttribute Contact contact) {		
		ModelAndView modelAndView = new ModelAndView();
		logger.debug("form submitted");
		
		modelAndView.addObject("customer", customer);
		
		//if ssn number is duplicate
		String ssn = customer.getSsn();	
		if(creditCardService.isSsnDuplicate(ssn)) {
			
			logger.debug("duplicate ssn number found: " + ssn);			
			String ssnDuplicateMessage = "Dear " + customer.getFirstName() + ", the SSN number "
										+ customer.getSsn() +" is already used for a card.<br>Please check it and try again.";
			
			modelAndView.addObject("customer", customer);
			modelAndView.addObject("application", application);
			modelAndView.addObject("contact", contact);
			modelAndView.addObject("ssnDuplicateMessage", ssnDuplicateMessage);
			
			List<SecurityQuestion> listOfQuestion = creditCardService.getSecurityQuestion();
			modelAndView.addObject("listOfQuestion", listOfQuestion);
			
			//stay at the same page
			modelAndView.setViewName("application/application-form");
			return modelAndView;
		}
		
		//if the application is not approved
		if(!creditCardService.isApplicationApproved(customer)) {
			logger.info("Card Disapproved.");
			
			//go to "card disapproved" page
			modelAndView.setViewName("application/disapproved");
			return modelAndView; 
		}
		
		//create a credit card
		CreditCard creditCard = creditCardService.createCreditCard(customer, application, contact);		
		modelAndView.addObject("creditCard", creditCard);
		
		//go to "card approved" page
		modelAndView.setViewName("application/approved");		
		return modelAndView; 
	}
}