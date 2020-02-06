/**
 *
 */
package com.ektha.freshdesk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ektha.freshdesk.entity.User;

/**
 * SignUpDAO class
 *
 */
public class SignUpDAO {

	private final String url = "jdbc:mysql://localhost:3306/sys";
	private final String user = "root";
	private final String password = "ektha";
	PreparedStatement prepareStatement = null;
	Connection jdbcConnection = null;

	public boolean saveUser(User userDetails) {

		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);

			// writing the SQL query
			String sql = "insert into user values (?,?,?,?,?) ";

			prepareStatement = jdbcConnection.prepareStatement(sql);

			// inserting the data

			prepareStatement.setString(1, userDetails.getFirstName());
			prepareStatement.setString(2, userDetails.getLastName());
			prepareStatement.setString(3, userDetails.getEmailId());
			prepareStatement.setString(4, userDetails.getPassword());
			prepareStatement.setString(5, userDetails.getPhoneNumber());

			prepareStatement.executeUpdate();

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
		}

		return true;
	}
}
