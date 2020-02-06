package com.nivtek.trustbank.creditcard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.nivtek.trustbank.creditcard.entity.Address;
import com.nivtek.trustbank.creditcard.entity.CreditCard;
import com.nivtek.trustbank.creditcard.entity.Customer;
import com.nivtek.trustbank.creditcard.entity.Security;
import com.nivtek.trustbank.creditcard.entity.SecurityHint;
import com.nivtek.trustbank.creditcard.exception.SsnException;

/**
 * DAO class that takes responsibility of credit card related persistance
 * 
 * @author Dipendra Pokharel
 *
 */
@Repository
public class CreditCardDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * 
	 */
	public CreditCardDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param jdbcTemplate
	 */
	public CreditCardDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * DAO layer action that takes request to save the credit card application.
	 * 
	 * @param customer
	 * @param address
	 * @param security
	 * @param secHint
	 * @param cardDetails
	 */
	public void saveApplication(Customer customer, Address address, Security security, SecurityHint secHint,
			CreditCard cardDetails) throws SsnException {

		customer.setCustomerId(saveCustomer(customer));
		saveAddress(customer, address);

		cardDetails.setCustomer(customer);
		saveCreditCard(cardDetails);

		security.setCustomer(customer);
		security.setHint(secHint);
		saveSecurity(security);

	}

	/**
	 * Saves Credit card to Database
	 * 
	 * @param cardDetails
	 */
	private void saveCreditCard(CreditCard cardDetails) {

		int customerId = cardDetails.getCustomer().getCustomerId();
		String cardNumber = cardDetails.getCardNumber();
		String cvv = cardDetails.getCvv();
		String expiryDate = cardDetails.getExpiryDate();
		int creditLimit = cardDetails.getLimit();
		String name = cardDetails.getName();

		jdbcTemplate.update(
				"INSERT INTO credit_card (customer_id, card_number, cvv, card_date, credit_limit, card_status, cardholder_name) VALUES (?, ?, ?, ?, ?, ?, ?)",
				customerId, cardNumber, cvv, expiryDate, creditLimit, "approved", name);
	}

	/**
	 * Saves Security details to the database
	 * 
	 * @param security
	 */
	private void saveSecurity(Security security) {

		int hint = security.getHint().getHintId();
		int customerId = security.getCustomer().getCustomerId();
		String word = security.getWord();

		jdbcTemplate.update("INSERT INTO security (hint, customer_id, word) VALUES (?, ?, ?)", hint, customerId, word);
	}

	/**
	 * Saves Address to the Database
	 * 
	 * @param customer
	 * @param address
	 */
	private void saveAddress(Customer customer, Address address) {

		int customerId = customer.getCustomerId();
		String home = address.getHome();
		String apt = address.getApt();
		String zip = address.getZip();
		String city = address.getCity();
		String email = address.getCity();
		String phone = address.getPhone();

		jdbcTemplate.update(
				"INSERT INTO address (customer_id, home, apt, zip, city, state, email, phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
				customerId, home, apt, apt, zip, city, email, phone);
	}

	/**
	 * Saves Customer Details returns the auto generated primary key which is then
	 * used
	 * throws custom created exception if SSN exists
	 * 
	 * @param customer
	 * @return
	 * @throws SsnException
	 */
	private int saveCustomer(Customer customer) throws SsnException {

		final String firstName = customer.getFirstName();
		final String middleName = customer.getMiddleName();
		final String lastName = customer.getLastName();
		final String ssn = customer.getSsn();
		final int income = customer.getAnnualIncome();

		if (checkIfSsnExists(customer.getSsn())) {
			throw new SsnException("SSN exists");
		}

		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pst = con.prepareStatement(
						"INSERT INTO customer (first_name, middle_name, last_name, ssn, annual_income) VALUES (?, ?, ?, ?, ?)",
						new String[] { "customer_id" });
				pst.setString(1, firstName);
				pst.setString(2, middleName);
				pst.setString(3, lastName);
				pst.setString(4, ssn);
				pst.setInt(5, income);
				return pst;
			}
		}, keyHolder);

		return keyHolder.getKey().intValue();

	}

	/**
	 * checks if SSN exists returns true if exists otherwise false, based on the SQL
	 * count
	 * 
	 * @param ssn
	 * @return
	 */
	private boolean checkIfSsnExists(String ssn) {
		Integer count = jdbcTemplate.queryForObject("select count(*) from customer where ssn = ? ",
				new Object[] { ssn }, Integer.class);

		if (count == 0)
			return false;
		else
			return true;
	}

	/**
	 * Retrieves Credit Card by credit Card number returns the CreditCard entity
	 * object
	 * 
	 * @param creditCardNumber
	 * @return
	 */
	public CreditCard getCardByNumber(String creditCardNumber) {

		CreditCard cc = new CreditCard();
		String sql = "SELECT * FROM credit_card where card_number = ?";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, creditCardNumber);

		for (Map<String, Object> row : rows) {

			int customerId = (Integer) (row.get("customer_id"));
			cc.setCcId((Integer) (row.get("card_id")));
			cc.setCustomer(getCustomerById(customerId));
			cc.setCardNumber((String) (row.get("card_number")));
			cc.setCvv((String) (row.get("cvv")));
			cc.setExpiryDate((String) (row.get("card_date")));
			cc.setLimit((Integer) (row.get("credit_limit")));
			cc.setStatus((String) (row.get("card_status")));
			cc.setName((String) (row.get("card_name")));
		}

		return cc;
	}

	/**
	 * Retrieves customer using customer_id
	 * 
	 * @param customerId
	 * @return
	 */
	private Customer getCustomerById(int customerId) {

		Customer cust = new Customer();
		String sql = "SELECT * FROM customer where customer_id = ?";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, customerId);

		for (Map<String, Object> row : rows) {

			cust.setCustomerId(customerId);
			cust.setFirstName((String) (row.get("first_name")));
			cust.setMiddleName((String) (row.get("middle_name")));
			cust.setLastName((String) (row.get("last_name")));
			cust.setSsn((String) (row.get("ssn")));
			cust.setAnnualIncome((Integer) (row.get("annual_income")));

		}

		return cust;

	}

	/**
	 * Set the status of the card to isActivated
	 * 
	 * @param cardNumber
	 */
	public void activateCard(String cardNumber) {

		jdbcTemplate.update("Update credit_card set card_status = \"activated\" where card_number = ?", cardNumber);

	}

	/**
	 * Returns security Entity class object based on CustomerId
	 * 
	 * @param customerId
	 * @return
	 */
	public Security getSecurityByCustomerId(int customerId) {

		Security security = new Security();

		String sql = "SELECT * FROM security where customer_id = ?";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, customerId);
		for (Map<String, Object> row : rows) {

			security.setCustomer(getCustomerById((Integer) (row.get("customer_id"))));
			security.setWord((String) (row.get("word")));
			security.setSecurityId((Integer) (row.get("security_id")));
			security.setHint(getHintById((Integer) (row.get("hint"))));
		}
		return security;
	}

	/**
	 * Returns Security Hint type object based on hint Id
	 * 
	 * @param hintId
	 * @return
	 */
	private SecurityHint getHintById(Integer hintId) {

		SecurityHint sHint = new SecurityHint();

		String sql = "SELECT * FROM security_hint where hint_id = ?";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, hintId);
		for (Map<String, Object> row : rows) {

			sHint.setHintId((Integer) (row.get("hint_id")));
			sHint.setQuestion((String) (row.get("question")));
		}
		return sHint;
	}

	

	/**
	 * Retrieves Credit Card by User Name Used to display credit card information
	 * and customer personal information after logged in
	 * 
	 * @param userName
	 * @return
	 */
	public CreditCard getCardByUserName(String userName) {

		CreditCard cc = new CreditCard();
		String sql = "select * from credit_card left join user on credit_card.customer_id = user.customer_id where user.username = ?";
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, userName);
		for (Map<String, Object> row : rows) {

			int customerId = (Integer) (row.get("customer_id"));
			cc.setCcId((Integer) (row.get("card_id")));
			cc.setCustomer(getCustomerById(customerId));
			cc.setCardNumber((String) (row.get("card_number")));
			cc.setCvv((String) (row.get("cvv")));
			cc.setExpiryDate((String) (row.get("card_date")));
			cc.setLimit((Integer) (row.get("credit_limit")));
			cc.setStatus((String) (row.get("card_status")));
			cc.setName((String) (row.get("card_name")));
		}

		return cc;
	}

}
