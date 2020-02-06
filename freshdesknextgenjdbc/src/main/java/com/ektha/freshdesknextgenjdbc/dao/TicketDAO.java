package com.ektha.freshdesknextgenjdbc.dao;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.ektha.freshdesknextgenjdbc.entity.Ticket;

@Repository
public class TicketDAO {

	@Autowired
	private JDBCUtil jdbcutil;
	PreparedStatement prepareStatement = null;

	public List<Ticket> getTicket() {

		List<Ticket> ticketList = new ArrayList<Ticket>();

		JdbcTemplate template = jdbcutil.getJdbcTemplate();

		String sql = "select * from ticket";

		SqlRowSet rs = template.queryForRowSet(sql);

		// reading the resultSet
		while (rs.next()) {
			Ticket ticket = new Ticket();
			ticket.setTitle(rs.getString("title"));
			ticket.setCategory(rs.getString("category"));
			ticket.setPriority(rs.getString("priority"));
			ticket.setDescription(rs.getString("description"));
			ticketList.add(ticket);
		}

		return ticketList;

	}

	public int saveTicket(Ticket ticket) {

		int numberOfRows = 0;

		JdbcTemplate template = jdbcutil.getJdbcTemplate();

		String sql = "insert into ticket values (?,?,?,?) ";

		@SuppressWarnings("unused")
		SqlRowSet rs = template.queryForRowSet(sql);

		/*
		 * prepareStatement = connection.prepareStatement(sql); // inserting the data
		 *
		 * prepareStatement.setString(1, ); prepareStatement.setString(2,);
		 * prepareStatement.setString(3, ); prepareStatement.setString(4, );
		 */
		numberOfRows = template.update(sql, ticket.getTitle(), ticket.getCategory(), ticket.getPriority(),
				ticket.getDescription());

		return numberOfRows;
	}

}
