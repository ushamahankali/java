package com.ektha.freshdeskbootrest.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.ektha.freshdeskbootrest.entity.Ticket;

@Repository
public class TicketDAO {

	@Autowired
	private JdbcTemplate jdbctemplate;

	public int saveTicket(Ticket ticket) {
		int rowsAffected = 0;

		String sql = "insert into ticket values(?,?,?,?)";

		rowsAffected = jdbctemplate.update(sql, ticket.getTitle(), ticket.getCategory(), ticket.getPriority(),
				ticket.getDescription());

		return rowsAffected;
	}

	public List<Ticket> getTickets() {
		Ticket ticket = null;
		List<Ticket> tickets = new ArrayList<>();

		String sql = "select * from ticket";

		SqlRowSet set = jdbctemplate.queryForRowSet(sql);

		while (set.next()) {
			ticket = new Ticket();
			ticket.setTitle(set.getString("title"));
			ticket.setCategory(set.getString("category"));
			ticket.setPriority(set.getString("priority"));
			ticket.setDescription(set.getString("description"));
			tickets.add(ticket);
		}
		return tickets;
	}
}
