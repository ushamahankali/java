package main.com.ektha.filemax.fileprocess.dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.com.ektha.filemax.fileprocess.entity.Customer;

public class FileDAO {

	public void saveCustomer(Customer customer) throws SQLException, ClassNotFoundException, FileNotFoundException {

		Connection connection = DBUtil.getConnectionToDatabase();
		PreparedStatement prepareStatement = null;
		try {

			String sqlInsertQuery = "insert into customer values (?,?,?,?) ";
			prepareStatement = connection.prepareStatement(sqlInsertQuery);

			// inserting the data
			prepareStatement.setString(1, customer.getFirstName());
			prepareStatement.setString(2, customer.getLastName());
			prepareStatement.setString(3, customer.getEmailId());
			prepareStatement.setString(4, customer.getPhoneNumber());

			prepareStatement.executeUpdate();

		}

		catch (SQLException e) {
			// Handle errors for Class.forName

		} finally {

			connection.close();

		}

	}
}
