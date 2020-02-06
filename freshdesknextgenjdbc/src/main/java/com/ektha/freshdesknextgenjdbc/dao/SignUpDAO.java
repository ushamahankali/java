package com.ektha.freshdesknextgenjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.freshdesknextgenjdbc.entity.User;

@Repository
public class SignUpDAO {

	@Autowired
	private JDBCUtil jdbcutil;

	public int saveUser(User userDetails) {

		int numberOfRows = 0;

		JdbcTemplate template = jdbcutil.getJdbcTemplate();

		// writing the SQL query
		String sql = "insert into user values (?,?,?,?,?) ";

		numberOfRows = template.update(sql, userDetails.getFirstName(), userDetails.getLastName(),
				userDetails.getEmailId(), userDetails.getPassword(), userDetails.getPhoneNumber());

		return numberOfRows;
	}
}
