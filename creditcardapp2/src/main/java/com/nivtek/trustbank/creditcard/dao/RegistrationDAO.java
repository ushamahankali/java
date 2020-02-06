/**
 * 
 */
package com.nivtek.trustbank.creditcard.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * DAO class responsible for registering user to the db
 * 
 * @author Dipendra Pokharel
 *
 */
@Repository
public class RegistrationDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/**
	 * 
	 */
	public RegistrationDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param jdbcTemplate
	 */
	public RegistrationDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * Takes username and password and registers
	 * 
	 * @param userName
	 * @param passWord
	 * @param customerId
	 * @return
	 */
	public boolean registerUser(String userName, String passWord, int customerId) {

		boolean isRegistered = false;

		try {
			jdbcTemplate.update("INSERT INTO user (username, password, customer_id) VALUES ( ?, ?, ?)", userName,
					passWord, customerId);
			isRegistered = true;
		}

		catch (Exception e) {
			// create a log

		}

		return isRegistered;
	}

}
