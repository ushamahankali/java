package com.nivtek.creditcardapp.service;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.creditcardapp.dao.ApplicationDAO;
import com.nivtek.creditcardapp.dao.ContactDAO;
import com.nivtek.creditcardapp.dao.CreditCardDAO;
import com.nivtek.creditcardapp.dao.CustomerDAO;
import com.nivtek.creditcardapp.dao.SecurityQuestionDAO;
import com.nivtek.creditcardapp.entity.Application;
import com.nivtek.creditcardapp.entity.Contact;
import com.nivtek.creditcardapp.entity.CreditCard;
import com.nivtek.creditcardapp.entity.Customer;
import com.nivtek.creditcardapp.entity.SecurityQuestion;

@Service
public class CreditCardService {
	private static Logger logger = Logger.getLogger(CreditCardService.class);

	@Autowired
	CustomerDAO customerDAO;

	@Autowired
	ContactDAO contactDAO;

	@Autowired
	ApplicationDAO applicationDAO;

	@Autowired
	CreditCardDAO creditCardDAO;

	@Autowired
	SecurityQuestionDAO securityQuestionDAO;

	public void activateCard(String cardNo) {
		creditCardDAO.activateCard(cardNo);
	}

	public CreditCard createCreditCard(Customer customer, Application application, Contact contact) {

		// 1. save customer
		customerDAO.saveCustomer(customer);

		// 2. save contact
		String ssn = customer.getSsn();
		int customerId = customerDAO.getCustomerIdBySsn(ssn);
		contact.setCustomerId(customerId);
		contactDAO.saveContact(contact);

		// 3. save application /security word
		application.setCustomerId(customerId);
		applicationDAO.saveApplication(application);

		// 4. generate credit card number
		// 5. generate cvv number
		// 6. calculate creditLimit
		String cardNo = generateUniqueCreditCardNo();
		String cvv = generateCvv();
		int creditLimit = (int) (0.1 * (customer.getAnnualIncome()));

		// 7. get approved date
		// 8. get expiration date (+5 years of the approved date)
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		Format dateformat = new SimpleDateFormat("yyyy-MM-dd");
		String approvedDate = dateformat.format(date.getTime()).toString();
		date.add(Calendar.YEAR, 5);
		String expirationDate = dateformat.format(date.getTime()).toString();

		// 9. set, save and return creditCard object
		CreditCard creditCard = new CreditCard();
		creditCard.setCustomerId(customerId);
		creditCard.setCardNo(cardNo);
		creditCard.setCvv(cvv);
		creditCard.setCreditLimit(creditLimit);
		creditCard.setActivationStatus(0); // 0 for approved and not activated
		creditCard.setApprovedDate(approvedDate);
		creditCard.setExpirationDate(expirationDate);

		creditCardDAO.saveCreditCard(creditCard);

		return creditCard;
	}

	private String generateCreditCardNo() {
		String first4Digits = "5424";
		String randomNumber = String.valueOf((long) (Math.random() * 1e12));
		String last12Digits = ("000000000000" + randomNumber).substring(randomNumber.length());
		return first4Digits + last12Digits;
	}

	private String generateCvv() {
		String cvv = Integer.toString((int) (Math.random() * 1000));
		String cvvOf3Digits = ("000" + cvv).substring(cvv.length());
		return cvvOf3Digits;
	}

	private String generateUniqueCreditCardNo() {
		String cardNo = "";

		// make sure the card number is not duplicated
		while (true) {
			cardNo = generateCreditCardNo();
			if (!isCardNumberFound(cardNo)) {
				break;
			}
		}

		return cardNo;
	}

	public int getActivationStatus(String cardNo) {
		return creditCardDAO.getActivationStatus(cardNo);
	}

	public CreditCard getCreditCardByCardId(int cardId) {
		return creditCardDAO.getCreditCardByCardId(cardId);
	}

	public CreditCard getCreditCardByCardNo(String cardNo) {
		return creditCardDAO.getCreditCardByCardNo(cardNo);
	}

	public Customer getCustomerByCustomerId(int customerId) {
		return customerDAO.getCustomerByCustomerId(customerId);
	}

	public List<SecurityQuestion> getSecurityQuestion() {
		return securityQuestionDAO.getSecurityQuestion();
	}

	public boolean isApplicationApproved(Customer customer) {
		return customer.getAnnualIncome() >= 30000;
	}

	public boolean isCardNumberFound(String cardNo) {
		return creditCardDAO.getCreditCardByCardNo(cardNo) != null;
	}

	public boolean isSsnDuplicate(String ssn) {
		logger.debug("come into the creditcard service layer, check duplicate ssn: " + ssn);
		return customerDAO.getCustomerBySsn(ssn) != null;
	}

	public boolean isValidForActivation(List<String> info) {
		int customerId = creditCardDAO.getCustomerIdByCardNo(info.get(0));
		if (customerId == -1) {
			return false;
		}

		Customer customer = customerDAO.getCustomerByCustomerId(customerId);

		String lastName = customer.getLastName();
		String ssn = customer.getSsn();
		String last4Ssn = ssn.substring(ssn.length() - 4);
		String birthDate = customer.getBirthDate();

		Application application = applicationDAO.getApplicationByCustomerId(customerId);
		String questionId = Integer.toString(application.getQuestionId());
		String word = application.getWord();

		return firstName.equalsIgnoreCase(info.get(1)) && lastName.equalsIgnoreCase(info.get(2))
				&& last4Ssn.equals(info.get(3)) && birthDate.equals(info.get(4)) && questionId.equals(info.get(5))
				&& word.equalsIgnoreCase(info.get(6));

	}

	public boolean isValidForRegistration(List<String> info) {
		if (info == null) {
			return false;
		}

		int customerId = creditCardDAO.getCustomerIdByCardNo(info.get(0));
		if (customerId == -1) {
			return false;
		}

		Customer customer = customerDAO.getCustomerByCustomerId(customerId);
		String firstName = customer.getFirstName();
		String lastName = customer.getLastName();
		String ssn = customer.getSsn();
		// String last4Ssn = ssn.substring(ssn.length() - 4);

		CreditCard creditCard = getCreditCardByCardNo(info.get(0));
		String cvv = creditCard.getCvv();

		return cvv.equals(info.get(1)) && firstName.equalsIgnoreCase(info.get(2))
				&& lastName.equalsIgnoreCase(info.get(3)) && ssn.equals(info.get(4));
	}
}
