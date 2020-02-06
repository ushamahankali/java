package com.nivtek.trustbank.creditcard.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Dipendra Pokharel
 *
 */
@Repository
public class LoginDAO {

	/**
	 * Checks if userName and Password is correct
	 * 
	 * @param userName
	 * @param passWord
	 * @return
	 */

	@Autowired
	public JdbcTemplate jdbcTemplate;

	/**
	 * 
	 */
	public LoginDAO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param jdbcTemplate
	 */
	public LoginDAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean validateLogin(String userName, String passWord) {

		String sql = "SELECT count(*) FROM user WHERE username = ? and password = ?";
		boolean isValidated = false;

		int count = jdbcTemplate.queryForObject(sql, new Object[] { userName, passWord }, Integer.class);

		if (count > 0) {
			isValidated = true;
		}

		return isValidated;
	}

}
