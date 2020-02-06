package com.nivtek.ekthabank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nivtek.ekthabank.service.CreditCadService;

@Controller
public class ActivationController {

	@Autowired
	private CreditCadService creditcardService;

	@RequestMapping(value = "/getactivate", method = RequestMethod.POST)
	public String handleCardActivation(@RequestParam long cardNumber, ModelMap model) {

		System.out.println("hello from activation controller");
		System.out.println(cardNumber);
		boolean result = creditcardService.checkCredCard(cardNumber);

		if (result) {
			return "activationform";
		} else {

			model.put("infoMessage", "Your card does not exit please check your card number");
			return "cardresponse";

		}
	}

}
