package com.nivtek.trustbank.creditcard.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nivtek.trustbank.creditcard.entity.CreditCard;
import com.nivtek.trustbank.creditcard.service.CreditCardService;
import com.nivtek.trustbank.creditcard.service.RegistrationService;

/**
 * Controller used to handle all the registration related actions.
 * 
 * @author Dipendra Pokharel
 *
 */
@Controller
public class RegistrationController {

	@Autowired
	CreditCardService ccService;
	@Autowired
	RegistrationService rrService;

	public static final Logger log = Logger.getLogger(RegistrationController.class);

	/**
	 * Used to display the register page which takes credit card
	 * 
	 * @return
	 */
	@RequestMapping("/register")
	public String register() {
		return "register";
	}

	/**
	 * After card number is found, user needs to validate with last name, last 4
	 * digits of SSN and security word which is validated and further registration
	 * process continues.
	 * 
	 * @param lastName
	 * @param ssn
	 * @param secHint
	 * @param secWord
	 * @param cardNumber
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/validateCard")
	public String validateRegistrationDetails(@RequestParam("lastname") String lastName,
			@RequestParam("ssn") String ssn, @RequestParam("securityhint") int secHint,
			@RequestParam("secword") String secWord, @RequestParam("cardnumber") String cardNumber, ModelMap model,
			HttpServletRequest request) {

		String message = ccService.activateCard(lastName, ssn, secHint, secWord, cardNumber);
		CreditCard cc = ccService.getCreditCard(cardNumber);

		// adding creditCard Details in session, so that could get customerId in
		// registration process.
		request.getSession().setAttribute("card", cc);
		model.put("message", message);

		return "finalRegister";
	}

	/**
	 * This action is used to register user after validatio is done.
	 * 
	 * @param userName
	 * @param passWord
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/registeruser")
	public String registerUser(@RequestParam("username") String userName, @RequestParam("pass") String passWord,
			HttpServletRequest request, ModelMap model) {
		CreditCard card = (CreditCard) request.getSession().getAttribute("card");

		boolean isRegistered = rrService.createUser(userName, passWord, card.getCustomer());
		model.put("isRegistered", isRegistered);
		model.put("userName", userName);
		model.put("card", card);
		log.info("User registered" + userName);
		return "userRegistered";
	}

}
