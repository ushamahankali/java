package com.nivtek.trustbank.creditcard.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nivtek.trustbank.creditcard.entity.Address;
import com.nivtek.trustbank.creditcard.entity.CreditCard;
import com.nivtek.trustbank.creditcard.entity.Customer;
import com.nivtek.trustbank.creditcard.entity.Security;
import com.nivtek.trustbank.creditcard.entity.SecurityHint;
import com.nivtek.trustbank.creditcard.exception.SsnException;
import com.nivtek.trustbank.creditcard.service.CreditCardService;

/**
 * Credit Card Controller deals with the actions needed to perform credit card
 * related tasks such as applying and activating credit card
 * 
 * @author Dipendra Pokharel
 *
 */
@Controller
public class CreditCardController {

	@Autowired
	public CreditCardService ccService;

	public static final Logger log = Logger.getLogger(CreditCardController.class);

	/**
	 * Used to display creditcard.jsp page which has links to activating,
	 * registering and applying for credit card.
	 * 
	 * @return
	 */
	@RequestMapping("/credit")
	public String showCreditPage() {
		return "creditcard";
	}

	/**
	 * @return Used to display apply.jsp, first page that initiates credit card
	 *         application:
	 */
	@RequestMapping("/apply")
	public String applyCard() {
		return "apply";
	}

	/**
	 * 
	 * This method is mapped to validatecredit url This method gets request from
	 * apply.jsp Method Type post
	 * 
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param month
	 * @param day
	 * @param year
	 * @param ssn
	 * @param homeAddress
	 * @param apt
	 * @param zip
	 * @param city
	 * @param state
	 * @param phone
	 * @param email
	 * @param securityHint
	 * @param securityWord
	 * @param income
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getcard", method = RequestMethod.POST)
	public String receiveApplication(@RequestParam("fname") String firstName, @RequestParam("mname") String middleName,
			@RequestParam("lname") String lastName, @RequestParam("dob1") int month, @RequestParam("dob2") int day,
			@RequestParam("dob3") int year, @RequestParam("ssn") String ssn, @RequestParam("home") String homeAddress,
			@RequestParam("apt") String apt, @RequestParam("zip") String zip, @RequestParam("city") String city,
			@RequestParam("state") String state, @RequestParam("phone") String phone,
			@RequestParam("email") String email, @RequestParam("securityhint") int securityHint,
			@RequestParam("secword") String securityWord, @RequestParam("income") int income, ModelMap model) {

		// if the income is greater, the request proceeds
		if (income >= 30000) {

			Customer customer = new Customer();
			customer.setFirstName(firstName);
			customer.setMiddleName(middleName);
			customer.setLastName(lastName);
			customer.setSsn(ssn);
			customer.setAnnualIncome(income);

			Address address = new Address();
			address.setHome(homeAddress);
			address.setApt(apt);
			address.setZip(zip);
			address.setCity(city);
			address.setState(state);
			address.setEmail(email);
			address.setPhone(phone);

			Security security = new Security();
			security.setWord(securityWord);

			SecurityHint secHint = new SecurityHint();
			secHint.setHintId(securityHint);

			/*
			 * At this point, customerid addressid, customer in address, security hint in
			 * security word security id, hint and customer are empty *
			 */

			CreditCard cc;
			try {
				cc = ccService.processApplication(customer, address, security, secHint);
				model.put("card", cc.getCardNumber());
				model.put("cvv", cc.getCvv());
				model.put("creditLimit", cc.getLimit());
				model.put("date", cc.getExpiryDate());
			} catch (SsnException e) {

				log.info("ssn duplicate entry: Message shown: " + e.getMessage());
				e.getMessage();
				model.put("error", e.getMessage());
			}

		} else {
			model.put("error", "Your annual income is not equals or greater than 30,000");
			log.info("Creit Card not approved for" + firstName + " " + lastName + " Annual Income: " + income);
		}

		return "cardGenerated";
	}

	/**
	 * This action takes care of activate.jsp which is the first intergace for
	 * activating credit card.
	 * 
	 * @return
	 */
	@RequestMapping("/activate")
	public String loadActivateView() {
		return "activateCard";
	}

	/**
	 * It checks if the card exists Used in two places as for now, one is checking
	 * if card exists while activating and other is checking when registering. Based
	 * on where the request comes from, it loads the respective view.
	 * 
	 * @param creditCardNumber
	 * @param model
	 * @return
	 */
	@RequestMapping("/validatecredit")
	public String checkCreditCard(@RequestParam("creditcard") String creditCardNumber,
			@RequestParam("requestpage") String requestPage, ModelMap model) {

		boolean cardExists = ccService.checkCardExists(creditCardNumber);
		model.put("cardNumber", creditCardNumber);
		model.put("cardExists", cardExists);
		return requestPage;
	}

	/**
	 * After card exists, last Name, last 4 digit of SSN and security word is
	 * checked and processed through this method.
	 * 
	 * @param creditCardNumber
	 * @param model
	 * @return
	 */
	@RequestMapping("/activatecard")
	public String activateCreditCard(@RequestParam("lastname") String lastName, @RequestParam("ssn") String ssn,
			@RequestParam("securityhint") int secHint, @RequestParam("secword") String secWord,
			@RequestParam("cardnumber") String cardNumber, ModelMap model) {

		String message = ccService.activateCard(lastName, ssn, secHint, secWord, cardNumber);
		model.put("message", message);

		return "cardActive";
	}
}
