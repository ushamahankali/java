package com.ektha.freshdeskrestservice.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ektha.freshdeskrestservice.entity.Ticket;

@Repository
public class TicketDAO {

	@Autowired
	private JDBCUtil jdbcutil;
	PreparedStatement prepareStatement = null;

	public List<Ticket> getTicket() {

		List<Ticket> ticketList = new ArrayList<Ticket>();
		try {
			Connection connection = jdbcutil.getConnectionToDatabase();

			String sql = "select * from ticket";
			prepareStatement = connection.prepareStatement(sql);
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
		} catch (SQLException e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

		return ticketList;
	}

	public int saveTicket(Ticket ticket) {

		int numberOfRows = 0;
		try {
			Connection connection = jdbcutil.getConnectionToDatabase();

			String sql = "insert into ticket values (?,?,?,?) ";

			prepareStatement = connection.prepareStatement(sql);
			// inserting the data

			prepareStatement.setString(1, ticket.getTitle());
			prepareStatement.setString(2, ticket.getCategory());
			prepareStatement.setString(3, ticket.getPriority());
			prepareStatement.setString(4, ticket.getDescription());

			numberOfRows = prepareStatement.executeUpdate();

		} catch (

		SQLIntegrityConstraintViolationException se) {
			// Handle errors for JDBC
			System.out.println("The entered suit number already available");
			// se.printStackTrace();
		} catch (SQLException e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

		return numberOfRows;
	}

}
