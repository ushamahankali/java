/**
 *
 */
package com.ektha.freshdesk.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import com.ektha.freshdesk.entity.Ticket;

/**
 * TicketDAO class
 *
 */
public class TicketDAO {

	private final String url = "jdbc:mysql://localhost:3306/sys";
	private final String user = "root";
	private final String password = "ektha";
	PreparedStatement prepareStatement = null;
	Connection jdbcConnection = null;

	public boolean creatTicket(Ticket ticket) {
		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);

			// writing the SQL query
			String sql = "insert into ticket values (?,?,?,?) ";

			prepareStatement = jdbcConnection.prepareStatement(sql);
			// inserting the data

			prepareStatement.setString(1, ticket.getTitle());
			prepareStatement.setString(2, ticket.getCategory());
			prepareStatement.setString(3, ticket.getPriority());
			prepareStatement.setString(4, ticket.getDescription());

			prepareStatement.executeUpdate();

		} catch (

		SQLIntegrityConstraintViolationException se) {
			// Handle errors for JDBC
			System.out.println("The entered suit number already available");
			// se.printStackTrace();
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

	public List<Ticket> getTicket() {
		List<Ticket> ticketList = new ArrayList<Ticket>();
		try {
			// Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// getting the Connection
			jdbcConnection = DriverManager.getConnection(url, user, password);

			// writing the SQL query
			String sql = "select * from ticket";

			prepareStatement = jdbcConnection.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery(sql);

			// reading the resultSet
			while (rs.next()) {
				Ticket ticket = new Ticket();
				ticket.setTitle(rs.getString("title"));
				ticket.setCategory(rs.getString("category"));
				ticket.setPriority(rs.getString("priority"));
				ticket.setDescription(rs.getString("description"));
				ticketList.add(ticket);
			}
			rs.close();

			return ticketList;
		} catch (

		SQLIntegrityConstraintViolationException se) {
			// Handle errors for JDBC
			System.out.println("The entered suit number already available");
			// se.printStackTrace();
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

		return ticketList;
	}

}