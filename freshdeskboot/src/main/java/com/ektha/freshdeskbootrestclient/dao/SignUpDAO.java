package com.ektha.freshdeskbootrestclient.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.freshdeskbootrestclient.entity.User;

@Repository
public class SignUpDAO {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public int registerUser(User user) {
		int rowsAffected = 0;

		String sql = "insert into user values(?,?,?,?,?)";

		try {
			rowsAffected = jdbctemplate.update(sql, user.getFname(), user.getLname(), user.getEmail(),
					user.getPassword(), user.getPhone());
		} catch (BadSqlGrammarException e) {
			return rowsAffected;
		} catch (CannotGetJdbcConnectionException e) {
			return rowsAffected;
		}
		return rowsAffected;
	}
}
