package com.ektha.freshdeskbootrestclient.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.ektha.freshdeskbootrestclient.entity.User;

@Repository
public class LoginDAO {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public User getProfileDetails(String email) {
		User user = null;

		String sql = "select * from user where email='" + email + "'";

		SqlRowSet set = jdbctemplate.queryForRowSet(sql);

		while (set.next()) {
			user = new User();
			user.setFname(set.getString("fname"));
			user.setLname(set.getString("lname"));
			user.setEmail(set.getString("email"));
			user.setPassword(set.getString("password"));
			user.setPhone(set.getString("phone"));

		}
		return user;
	}
}
