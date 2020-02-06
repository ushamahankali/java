package com.ektha.freshdeskclient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ektha.freshdeskwebservices.service.Ticket;
import com.ektha.freshdeskwebservices.service.TicketServiceService;

@Service
public class TicketService {

	public int createTicket(Ticket ticket) {

		TicketServiceService service = new TicketServiceService();
		com.ektha.freshdeskwebservices.service.TicketService port = service.getTicketServicePort();
		int numberOfRows = port.createTicket(ticket);

		return numberOfRows;

	}

	public List<Ticket> getTicket() {

		TicketServiceService service = new TicketServiceService();
		com.ektha.freshdeskwebservices.service.TicketService port = service.getTicketServicePort();
		List<Ticket> ticketList = port.getTicket();
		return ticketList;

	}
}
