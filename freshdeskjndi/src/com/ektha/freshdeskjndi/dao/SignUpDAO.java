package com.ektha.freshdeskjndi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;

import com.ektha.freshdeskjndi.entity.User;

public class SignUpDAO {

	Context ctx = null;
	PreparedStatement prepareStatement = null;
	Connection jdbcConnection = null;

	public boolean saveUser(User userDetails) {

		try {

			jdbcConnection = JDBCUtil.getConnection();

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
