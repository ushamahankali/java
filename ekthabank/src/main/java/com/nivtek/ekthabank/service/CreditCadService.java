package com.nivtek.ekthabank.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nivtek.ekthabank.dao.AddressRepository;
import com.nivtek.ekthabank.dao.CreditCardRepository;
import com.nivtek.ekthabank.dao.CustomerRepository;
import com.nivtek.ekthabank.dao.SecurityAnswerRepository;
import com.nivtek.ekthabank.dao.SecurityQuestionRepository;
import com.nivtek.ekthabank.dao.UserRepository;
import com.nivtek.ekthabank.entity.Address;
import com.nivtek.ekthabank.entity.CreditCard;
import com.nivtek.ekthabank.entity.Customer;
import com.nivtek.ekthabank.entity.SecurityAnswer;
import com.nivtek.ekthabank.entity.SecurityQuestion;

@Service
public class CreditCadService {

	@Autowired
	AddressRepository addressDAO;

	@Autowired
	CreditCardRepository creditCardDAO;

	@Autowired
	CustomerRepository customerDAO;

	@Autowired
	SecurityQuestionRepository questionDAO;

	@Autowired
	SecurityAnswerRepository answerDAO;

	@Autowired
	UserRepository userDAO;

	public boolean checkCredCard(long cardNumber) {

		System.out.println("from activation service" + cardNumber);
		boolean result = false;
		CreditCard creditcard = creditCardDAO.findBycardNumber(cardNumber);

		if (creditcard != null) {
			System.out.println(creditcard.getCardNumber() + "=" + cardNumber);
			return result = true;
		}
		return result;

	}

	public CreditCard generateCreditCardNo() {

		CreditCard cCard = new CreditCard();

		String firstDigit = "3249";
		String randomNumber = String.valueOf((long) (Math.random() * 1e12));
		String lastDigits = ("000000000000" + randomNumber).substring(randomNumber.length());
		long number = Long.parseLong(firstDigit + lastDigits);

		LocalDateTime ldt = LocalDateTime.now().plusYears(3);
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
		String date = formatDate.format(ldt);

		cCard.setCardNumber(number);
		cCard.setCardStatus("approved");
		cCard.setCvvNumber(getCVVNumber());
		cCard.setExpiryDate(date);

		return cCard;

	}

	private double getCardLimit(double income) {
		double limit = (income * .1);

		return limit;
	}

	private long getCVVNumber() {

		long n3 = Math.round(Math.random() * (999 - 100) + 100);

		if (n3 < 100 || n3 >= 1000)
			System.out.println(n3);

		return n3;
	}

	public boolean processApplication(Customer customer, Address address, SecurityQuestion question,
			SecurityAnswer answer) {

		boolean result = false;

		CreditCard ccDetails = generateCreditCardNo();

		ccDetails.setCreditLimit(getCardLimit(customer.getAnnualIncome()));

		if (customer != null && address != null && question != null && answer != null && ccDetails != null) {

			ccDetails.setCustomer(customer);
			address.setCustomer(customer);
			answer.setCustomer(customer);
			answer.setSecurityquestion(question);
			question.setCustomer(customer);
			customerDAO.save(customer);
			addressDAO.save(address);
			creditCardDAO.save(ccDetails);
			questionDAO.save(question);
			answerDAO.save(answer);

			return result = true;

		}

		return result;

	}

	public boolean saveApplication(Customer customer, Address address, SecurityQuestion question,
			SecurityAnswer answer) {
		boolean result = false;

		if (customer != null && address != null && question != null && answer != null)

		{

			address.setCustomer(customer);
			answer.setCustomer(customer);
			answer.setSecurityquestion(question);
			question.setCustomer(customer);
			customerDAO.save(customer);
			addressDAO.save(address);

			questionDAO.save(question);
			answerDAO.save(answer);

			return result = true;

		}
		return result;
	}
}
