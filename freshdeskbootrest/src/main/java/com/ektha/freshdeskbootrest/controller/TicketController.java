package com.ektha.freshdeskbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.freshdeskbootrest.dao.TicketDAO;
import com.ektha.freshdeskbootrest.entity.Ticket;

@RestController
public class TicketController {

	@Autowired
	private TicketDAO ticketDAO;

	@GetMapping(path = "/getTickets", produces = "application/xml")
	public List<Ticket> getEmployees() {
		return ticketDAO.getTickets();
	}

	@PostMapping(path = "/saveTicket", consumes = "application/xml", produces = "application/xml")
	public String saveTicket(@RequestBody Ticket ticket) {
		String result = "Sorry an error occured";
		int rowsAffected = ticketDAO.saveTicket(ticket);
		if (rowsAffected != 0) {
			result = "Ticket is saved successfully!!";
		}
		return result;
	}

}
