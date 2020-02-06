package com.ektha.freshdeskweb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.ektha.freshdeskweb.domain.User;

@Repository
public class SignInDao {

	@Autowired
	private JdbcTemplate jdbctemplate;

	// public User getUserPassword(User us) {
	public User getUserDetails(String email) {
		User user = null;

		String sql = "select * from user where email='" + email + "'";

		SqlRowSet set = jdbctemplate.queryForRowSet(sql);

		while (set.next()) {

			user = new User();
			user.setFirstName(set.getString("firstName"));
			user.setLastName(set.getString("lastName"));
			user.setEmail(set.getString("email"));
			user.setPassword(set.getString("password"));
			user.setPhoneNum(set.getString("phoneNum"));

		}
		return user;
	}

}
