package com.nivtek.ekthabank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nivtek.ekthabank.entity.Address;
import com.nivtek.ekthabank.entity.Customer;
import com.nivtek.ekthabank.entity.SecurityAnswer;
import com.nivtek.ekthabank.entity.SecurityQuestion;
import com.nivtek.ekthabank.service.CreditCadService;

@Controller
public class CreditCardController {

	@Autowired
	private CreditCadService creditcardService;

	@RequestMapping(value = "/processform", method = RequestMethod.POST)
	public String handleApplication(@RequestParam String firstName, @RequestParam String middleName,
			@RequestParam String lastName, @RequestParam String dateOfBirth, @RequestParam int ssn,
			@RequestParam String homeAddress, @RequestParam String appartment, @RequestParam int zipcode,
			@RequestParam String city, @RequestParam String state, @RequestParam String phoneNumber,
			@RequestParam String emailId, @RequestParam String securityhint, @RequestParam String securityAnswer,
			@RequestParam double income, ModelMap model) {

		Customer customer = new Customer();

		customer.setFirstName(firstName);
		customer.setMiddleName(middleName);
		customer.setLastName(lastName);
		// System.out.println("ssn");
		customer.setSsn(ssn);
		customer.setDateOfBirth(dateOfBirth);
		customer.setAnnualIncome(income);

		Address address = new Address();

		address.setHomeAddress(homeAddress);
		address.setAppartment(appartment);
		address.setCity(city);
		address.setState(state);
		address.setZipCode(zipcode);
		address.setEmailId(emailId);
		address.setPhoneNumber(phoneNumber);
		SecurityQuestion security = new SecurityQuestion();

		security.setQuestion(securityhint);
		SecurityAnswer sAnswer = new SecurityAnswer();

		sAnswer.setWord(securityAnswer);
		if (income >= 30000) {

			boolean result = creditcardService.processApplication(customer, address, security, sAnswer);

			if (result) {

				model.put("infoMessage", "Thank you applying Ektha CreditCard.  Now you can activate your card");
				return "cardactivate";
			}

		}
		creditcardService.saveApplication(customer, address, security, sAnswer);
		model.put("infoMessage", "Thank you applying Ektha CreditCard.  we will get back soon");
		return "cardresponse";
	}
}
