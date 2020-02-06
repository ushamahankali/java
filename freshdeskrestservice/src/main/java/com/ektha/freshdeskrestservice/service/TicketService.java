package com.ektha.freshdeskrestservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdeskrestservice.dao.TicketDAO;
import com.ektha.freshdeskrestservice.entity.Ticket;

@Service
public class TicketService {

	@Autowired
	private TicketDAO ticketDAO;

	public int createTicket(Ticket ticket) {

		int numberOfRows = 0;

		if (!(ticket.getTitle().isEmpty() || ticket.getCategory().isEmpty() || ticket.getPriority().isEmpty()
				|| ticket.getDescription().isEmpty())) {

			numberOfRows = ticketDAO.saveTicket(ticket);
		}
		return numberOfRows;

	}

	public List<Ticket> getTicket() {

		/*
		 * getting data from the DAO class
		 */

		List<Ticket> ticketList = ticketDAO.getTicket();
		return ticketList;

	}
}
