package com.nivtek.creditcardapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nivtek.creditcardapp.entity.SecurityQuestion;
import com.nivtek.creditcardapp.service.CreditCardService;


@Controller
public class ActivationController {
	
	private static Logger logger = Logger.getLogger(ActivationController.class);
	
	@Autowired
	CreditCardService creditCardService;

	/**
	 * after clicked "Activate" link 
	 */
	@RequestMapping("/preActivation")
	public ModelAndView goToPreActivation() {	
		ModelAndView modelAndView = new ModelAndView();
		
		//retrieve the security questions from database
		List<SecurityQuestion> listOfQuestion = creditCardService.getSecurityQuestion();
		modelAndView.addObject("listOfQuestion", listOfQuestion);
		
		//go to activation form
		modelAndView.setViewName("activation/activation-form");
		return modelAndView;
	}
	
	@RequestMapping(value="/activation", method = RequestMethod.GET)
	public String goToActivation() {
		return "redirect:preActivation.do";
	}
	
	/**
	 * after sent the activation form
	 */
	@RequestMapping(value="/activation", method = RequestMethod.POST)
	public ModelAndView goToActivation(@RequestParam("cardNo") String cardNo, @RequestParam("firstName") String firstName, 
			@RequestParam("lastName") String lastName, @RequestParam("last4Ssn") String last4Ssn, 
			@RequestParam("birthDate") String birthDate, @RequestParam("questionId") String questionId, 
			@RequestParam("word") String word) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		//add all the info into a list
		List<String> listOfInfo = new ArrayList<>();
		listOfInfo.add(cardNo); //index 0
		listOfInfo.add(firstName); //index 1
		listOfInfo.add(lastName);
		listOfInfo.add(last4Ssn);
		listOfInfo.add(birthDate);
		listOfInfo.add(questionId);
		listOfInfo.add(word);		
		modelAndView.addObject("listOfInfo", listOfInfo);
		
		//if card number not found
		if(!creditCardService.isCardNumberFound(cardNo)) {
			String cardNotFoundMessage = "The card " + cardNo + " couldn't be found. Please check it and try again.";
			modelAndView.addObject("cardNotFoundMessage", cardNotFoundMessage);
			
			List<SecurityQuestion> listOfQuestion = creditCardService.getSecurityQuestion();
			modelAndView.addObject("listOfQuestion", listOfQuestion);
			
			//stay at the same page
			modelAndView.setViewName("activation/activation-form");
			return modelAndView;
		}
		
		//if already activated
		if(creditCardService.getActivationStatus(cardNo)!=0) {
			
			//go to "already activated" page
			modelAndView.setViewName("activation/alreadyactivated");
			return modelAndView;
		}
		
		//if info not match
		if(!creditCardService.isValidForActivation(listOfInfo)) {
			String infoNotMatchMessage = "The info couldn't match what we have for the card "
					+ cardNo + ". Please check your info and try again.";
			modelAndView.addObject("infoNotMatchMessage", infoNotMatchMessage);
			
			List<SecurityQuestion> listOfQuestion = creditCardService.getSecurityQuestion();
			modelAndView.addObject("listOfQuestion", listOfQuestion);
			
			//stay at the same page
			modelAndView.setViewName("activation/activation-form");
			return modelAndView;			
		}
		
		logger.info("Ready to activate.");
		
		//go to "ready to activate" page with a confirm to activate button
		modelAndView.setViewName("activation/readytoactivate");
		return modelAndView;
	}
	

	@RequestMapping(value="/activationResult", method = RequestMethod.GET)
	public String goActivationResult() {
		return "redirect:preActivation.do";
	}
	
	/**
	 *  after clicked the confirm button to activate
	 */
	@RequestMapping(value="/activationResult", method=RequestMethod.POST)
	public ModelAndView goToActivationResult(@RequestParam("cardNo") String cardNo, @RequestParam("firstName") String firstName) {
		ModelAndView modelAndView = new ModelAndView();
		
		//activate the card
		creditCardService.activateCard(cardNo);
		
		//if activation not succeeded
		if(creditCardService.getActivationStatus(cardNo)==0) {
			modelAndView.setViewName("activation/failed");		
			return modelAndView;
		}
		
		modelAndView.addObject("cardNo", cardNo);
		modelAndView.addObject("firstName", firstName);
		
		//go to "activation successful" page
		modelAndView.setViewName("activation/successful");		
		return modelAndView;
	}
}
