package com.ektha.freshdeskwebservices.service;

import java.util.List;

import javax.jws.WebService;

import com.ektha.freshdeskwebservices.dao.TicketDAO;
import com.ektha.freshdeskwebservices.entity.Ticket;

@WebService(targetNamespace = "http://service.freshdeskwebservices.ektha.com/", portName = "TicketServicePort", serviceName = "TicketServiceService")
public class TicketService {

	TicketDAO ticketDAO = new TicketDAO();

	public int createTicket(Ticket ticket) {

		return ticketDAO.saveTicket(ticket);

	}

	public List<Ticket> getTicket() {

		/*
		 * getting data from the DAO class
		 */

		List<Ticket> ticketList = ticketDAO.getTicket();
		return ticketList;

	}
}
