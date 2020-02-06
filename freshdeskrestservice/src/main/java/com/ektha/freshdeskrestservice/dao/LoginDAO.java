package com.ektha.freshdeskrestservice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ektha.freshdeskrestservice.entity.User;

@Repository
public class LoginDAO {

	@Autowired
	private JDBCUtil jdbcutil;

	public User checkUser(String emailId, String pass) {

		User users = new User();
		boolean result = false;

		try (Connection jdbcConnection = jdbcutil.getConnectionToDatabase();) {

			// writing the SQL query
			String sql = "select * from user where emailid ='" + emailId + "' and password='" + pass + "'";
			// preparing the statement
			PreparedStatement prepareStatement = jdbcConnection.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery(sql);
			result = rs.next();

			if (result) {

				users.setEmailId(emailId);
				users.setPassword(pass);
				users.setFirstName(rs.getString("firstname"));
				users.setValid(true);

			} else
				return null;

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} // end try

		return users;

	}
}