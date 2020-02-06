package com.ektha.freshdeskmavenapp.service;

import java.util.List;

import com.ektha.freshdeskmavenapp.dao.TicketDAO;
import com.ektha.freshdeskmavenapp.entity.Ticket;

public class TicketService {

	TicketDAO ticketDAO = new TicketDAO();

	public boolean createTicket(Ticket ticket) {

		/*
		 * sending data to the DAO class
		 */

		boolean result = ticketDAO.creatTicket(ticket);
		return result;
	}

	public List<Ticket> getTicket() {

		/*
		 * getting data from the DAO class
		 */

		List<Ticket> ticketList = ticketDAO.getTicket();
		return ticketList;

	}
}
