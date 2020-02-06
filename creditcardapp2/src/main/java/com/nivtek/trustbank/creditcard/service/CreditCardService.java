package com.nivtek.trustbank.creditcard.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.trustbank.creditcard.dao.CreditCardDAO;
import com.nivtek.trustbank.creditcard.entity.Address;
import com.nivtek.trustbank.creditcard.entity.CreditCard;
import com.nivtek.trustbank.creditcard.entity.Customer;
import com.nivtek.trustbank.creditcard.entity.Security;
import com.nivtek.trustbank.creditcard.entity.SecurityHint;
import com.nivtek.trustbank.creditcard.exception.SsnException;

/**
 * @author Dipendra Pokharel
 *
 */
@Service
public class CreditCardService {

	@Autowired
	public CreditCardDAO ccDAO;

	/**
	 *
	 */
	public CreditCardService() {
		super();
	}

	/**
	 * @param ccDAO
	 */
	public CreditCardService(CreditCardDAO ccDAO) {
		super();
		this.ccDAO = ccDAO;
	}

	/**
	 * Service method that returns if card is activated or not
	 *
	 * @param lastName
	 * @param ssn
	 * @param secHint
	 * @param secWord
	 * @return
	 */
	public String activateCard(String lastName, String ssn, int secHint, String secWord, String cardNumber) {

		CreditCard cc = ccDAO.getCardByNumber(cardNumber);
		String returnString = "";
		boolean lastNameMatches = true;
		Security security = ccDAO.getSecurityByCustomerId(cc.getCustomer().getCustomerId());

		if (!lastName.equals(cc.getCustomer().getLastName())) {
			returnString += " Last Name mismatch";
			lastNameMatches = false;
		}

		boolean secWordMatches = true;

		if (!(secHint == security.getHint().getHintId() && secWord.contentEquals(security.getWord()))) {
			secWordMatches = false;
			returnString += " Security Word mismatch";
		}

		String ssnFromDB = cc.getCustomer().getSsn();

		boolean lastSSNMatches = true;

		if (!(ssn.equals(ssnFromDB.substring((ssnFromDB.length() - 4))))) {
			lastSSNMatches = false;
			returnString += " SSN mismatch";
		}

		if (lastNameMatches && secWordMatches && lastSSNMatches) {
			ccDAO.activateCard(cardNumber);
			returnString = "Your card has been activated";
		}

		return returnString;
	}

	/**
	 * Checks if card exists by creditCardNumber and sends messageback
	 *
	 * @param creditCardNumber
	 * @return
	 */
	public boolean checkCardExists(String creditCardNumber) {
		CreditCard cc = ccDAO.getCardByNumber(creditCardNumber);
		boolean hasCard = false;
		if (cc.getCardNumber() != null)
			hasCard = true;
		return hasCard;
	}

	/**
	 * This method generated random 16 digit credit card number and random cvv
	 * number
	 *
	 * @param nameOnCard
	 * @return
	 */
	public CreditCard generateCreditCard(String nameOnCard) {

		final String CARDNUMS = "1234567890";
		StringBuilder sb = new StringBuilder();
		Random rnd = new Random();

		while (sb.length() < 16) {
			int index = (int) (rnd.nextFloat() * CARDNUMS.length());
			sb.append(CARDNUMS.charAt(index));
		}
		String ccNumber = sb.toString();

		LocalDateTime ldt = LocalDateTime.now().plusYears(3);
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM/yy", Locale.ENGLISH);
		String expiry = formatDate.format(ldt);

		sb.setLength(0);
		while (sb.length() < 3) {
			int index = (int) (rnd.nextFloat() * CARDNUMS.length());
			sb.append(CARDNUMS.charAt(index));
		}

		String cvv = sb.toString();

		CreditCard card = new CreditCard();
		card.setName(nameOnCard);
		card.setCardNumber(ccNumber);
		card.setExpiryDate(expiry);
		card.setCvv(cvv);

		return card;
	}

	/**
	 * This method calculates the credit Card Limit based on the salary
	 *
	 * @param annualIncome
	 * @return
	 */
	public int getCardLimit(int annualIncome) {
		double cardLimit = (annualIncome / 10);
		System.out.println(cardLimit);
		return (int) cardLimit;
	}

	/**
	 * Used to get credit card data from DAO layer
	 *
	 * @param cardNumber
	 * @return
	 */
	public CreditCard getCreditCard(String cardNumber) {
		CreditCard cc = ccDAO.getCardByNumber(cardNumber);
		return cc;
	}

	/**
	 * Forwards the request to processApplication to the DAO layer
	 *
	 * @param customer
	 * @param address
	 * @param security
	 * @param secHint
	 * @return
	 */
	public CreditCard processApplication(Customer customer, Address address, Security security, SecurityHint secHint)
			throws SsnException {

		// credit card customer.
		CreditCard cardDetails = generateCreditCard(customer.getFirstName() + " " + customer.getLastName());
		cardDetails.setLimit(getCardLimit(customer.getAnnualIncome()));
		cardDetails.setStatus("approved");
		// ccDAO.saveApplication(customer, address, security, secHint, cardDetails);

		ccDAO.saveApplication(customer, address, security, secHint, cardDetails);
		return cardDetails;
	}

}
