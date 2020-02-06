package com.nivtek.creditcardapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nivtek.creditcardapp.entity.Account;
import com.nivtek.creditcardapp.entity.CreditCard;
import com.nivtek.creditcardapp.service.AccountService;
import com.nivtek.creditcardapp.service.CreditCardService;

@Controller
public class RegistrationController {
	private static Logger logger = Logger.getLogger(RegistrationController.class);
	
	@Autowired
	CreditCardService creditCardService;
	
	@Autowired
	AccountService accountService;
	
	/**
	 * after clicked "Register" button
	 */
	@RequestMapping("/preRegistration")
	public String goToPreRegistration() {
		
		return "registration/registration-form";
	}
	
	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String goToRegistration() {
		return "redirect:preRegistration.do";
	}
	
	/**
	 * after sent the registration form
	 */
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public ModelAndView goToRegistration(@RequestParam("cardNo") String cardNo, 
			@RequestParam("cvv") String cvv, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("ssn") String ssn) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		List<String> listOfInfo = new ArrayList<>();
		listOfInfo.add(cardNo);
		listOfInfo.add(cvv);
		listOfInfo.add(firstName);
		listOfInfo.add(lastName);
		listOfInfo.add(ssn);		
		modelAndView.addObject("listOfInfo", listOfInfo);
		modelAndView.addObject("cardNo", cardNo);
		modelAndView.addObject("firstName", firstName);
			
		//if card not found
		if(!creditCardService.isCardNumberFound(cardNo)) {
			String cardNotFoundMessage = "The card " + cardNo 
					+ " couldn't be found.\n Please correct it and try again.";
			modelAndView.addObject("cardNotFoundMessage", cardNotFoundMessage);	
			
			//stay at the same page
			modelAndView.setViewName("registration/registration-form");
			return modelAndView;
		}
		
		//if user info doesn't match
		if(!creditCardService.isValidForRegistration(listOfInfo)) {
			String cardNotFoundMessage = "The infomation below couldn't match what we have with card " + cardNo 
					+ ". <br> Please check your infomation and try again.";
			modelAndView.addObject("cardNotFoundMessage", cardNotFoundMessage);	
			
			//stay at the same page
			modelAndView.setViewName("registration/registration-form");
			return modelAndView;			
		}
		
		//if account already set up with the card
		CreditCard creditCard = creditCardService.getCreditCardByCardNo(cardNo);
		int cardId = creditCard.getCardId();	
		Account accountInDB = accountService.getAccountByCardId(cardId);
		if(accountInDB!=null) {
			modelAndView.addObject("username", accountInDB.getUsername());
			modelAndView.addObject("cardNo", cardNo);
			modelAndView.addObject("firstName", firstName);
			
			//go to "already registered" page
			modelAndView.setViewName("registration/alreadyregistered");
			return modelAndView;
		}
		
		String registrationMessage = "Dear "+ firstName + " , you are registering an account for the card "+ cardNo +".";
		modelAndView.addObject("registrationMessage", registrationMessage);
		
		//set model attribute to retain username and password
		Account account = new Account();
		modelAndView.addObject("account", account);
		
		//go to the username and password setting up page
		modelAndView.setViewName("registration/laststep-form");
		return modelAndView;
	}
	
	@RequestMapping(value="/registrationResult", method = RequestMethod.GET)
	public String goToRegistrationResult() {
		return "redirect:preRegistration.do";
	}
	
	/**
	 * after sent username and password
	 */
	@RequestMapping(value="/registrationResult", method=RequestMethod.POST)
	public ModelAndView goToRegistrationResult(@ModelAttribute Account account, @RequestParam("cardNo") String cardNo, @RequestParam("firstName") String firstName) {
		ModelAndView modelAndView = new ModelAndView();	
		logger.info("before set up password. print cardNo-" + cardNo);
		
		if(cardNo==null || cardNo.length()==0) {
			logger.debug("insdie cardNo==null. print cardNo-" + cardNo);
			modelAndView.setViewName("registration/laststepfailed");
			return modelAndView;
		}
			
		//if there is already an account linked to the card
		int cardId = (creditCardService.getCreditCardByCardNo(cardNo)).getCardId();
		Account accountInDB = accountService.getAccountByCardId(cardId);
		if(accountInDB!=null) {			
			logger.debug("insdie found an account. print cardNo-" + cardNo);
			modelAndView.setViewName("registration/laststepfailed");
			return modelAndView;
		}
		
		//if username is duplicate
		String username = account.getUsername();		
		if(accountService.isUsernameFound(username)) {
			String usernameDuplicateMessage = "Dear "+ firstName+", the username \""+ username +"\" is already in use. Please choose another one.";
			
			//stay at the same page
			modelAndView.addObject("usernameDuplicateMessage", usernameDuplicateMessage);
			modelAndView.addObject("cardNo", cardNo);
			modelAndView.addObject("firstName", firstName);
			modelAndView.setViewName("registration/laststep-form");
			return modelAndView;
		}
		
		//save the account into database
		String password = account.getPassword();
		logger.debug("before save the account, in the controller print the cardNo" + cardNo);	
		accountService.saveAccount(username, password, cardNo);
		
		if(!accountService.isUsernameFound(username)) {
			logger.info("registration failed.");
			String registrationFailedMessage = "Dear "+ username +", your account for card " + cardNo + " is not set successfully. <br>Please try again or contact our Customer Service at 123-123-1234.";
			
			modelAndView.addObject("registrationFailedMessage", registrationFailedMessage);
			modelAndView.setViewName("registration/laststep-form");
			return modelAndView;
		}
		
		logger.info("Registration suceeded with username [" + username + "] and password [" + password +"]");		
		modelAndView.addObject("username", username);
		modelAndView.addObject("firstName", firstName);	
		
		//go to the "account successfully set up" page
		modelAndView.setViewName("registration/tologin");		
		return modelAndView;
	}
	
}
