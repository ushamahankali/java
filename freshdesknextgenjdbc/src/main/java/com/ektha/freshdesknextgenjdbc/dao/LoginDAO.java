package com.ektha.freshdesknextgenjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.ektha.freshdesknextgenjdbc.entity.User;

@Repository
public class LoginDAO {

	@Autowired
	private JDBCUtil jdbcutil;

	public User checkUser(String emailId, String pass) {

		User users = new User();
		boolean result = false;

		JdbcTemplate template = jdbcutil.getJdbcTemplate();

		// writing the SQL query
		String sql = "select * from user where emailid ='" + emailId + "' and password='" + pass + "'";
		// preparing the statement
		SqlRowSet rs = template.queryForRowSet(sql);
		result = rs.next();

		if (result) {

			users.setEmailId(emailId);
			users.setPassword(pass);
			users.setFirstName(rs.getString("firstname"));
			users.setValid(true);

		} else {
			return null;
		}

		return users;

	}
}