package com.ektha.freshdesknextgen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ektha.freshdesknextgen.entity.User;

@Repository
public class SignUpDAO {

	@Autowired
	private JDBCUtil jdbcutil;

	public int saveUser(User userDetails) {

		int numberOfRows = 0;
		try (Connection jdbcConnection = jdbcutil.getConnectionToDatabase();) {

			// writing the SQL query
			String sql = "insert into user values (?,?,?,?,?) ";

			PreparedStatement prepareStatement = jdbcConnection.prepareStatement(sql);

			// inserting the data

			prepareStatement.setString(1, userDetails.getFirstName());
			prepareStatement.setString(2, userDetails.getLastName());
			prepareStatement.setString(3, userDetails.getEmailId());
			prepareStatement.setString(4, userDetails.getPassword());
			prepareStatement.setString(5, userDetails.getPhoneNumber());

			numberOfRows = prepareStatement.executeUpdate();

		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

		return numberOfRows;
	}
}
