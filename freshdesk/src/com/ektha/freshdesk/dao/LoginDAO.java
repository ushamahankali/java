package com.ektha.freshdesk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ektha.freshdesk.entity.User;

/*loginDAO Class*/

public class LoginDAO {

	private final String url = "jdbc:mysql://localhost:3306/sys";
	private final String user = "root";
	private final String password = "ektha";
	PreparedStatement prepareStatement = null;
	Connection jdbcConnection = null;

	public boolean checkUser(String emailId, String pass) {
		User users = new User();
		boolean result = false;

		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);

			// writing the SQL query
			String sql = "select * from user where emailid ='" + emailId + "' and password='" + pass + "'";
			// preparing the statement
			prepareStatement = jdbcConnection.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery(sql);
			result = rs.next();

			if (result) {

				users.setValid(true);

			}

			rs.close();
		} catch (

		SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (prepareStatement != null)
					jdbcConnection.close();
			} catch (SQLException se) {
			} // do nothing
			try {
				if (jdbcConnection != null)
					jdbcConnection.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try

		return result;

	}
}
