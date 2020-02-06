package com.ektha.freshdeskweb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.freshdeskweb.domain.User;

@Repository
public class SignUpDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public int saveUserDetails(User user) {

		int rowsAffected = 0;

		String sql = "insert into user values(?,?,?,?,?)";

		try {
			rowsAffected = jdbctemplate.update(sql, user.getFirstName(), user.getLastName(), user.getEmail(),
					user.getPassword(), user.getPhoneNum());
		} catch (BadSqlGrammarException e) {
			return rowsAffected;
		} catch (CannotGetJdbcConnectionException e) {
			return rowsAffected;
		}
		return rowsAffected;
	}
}