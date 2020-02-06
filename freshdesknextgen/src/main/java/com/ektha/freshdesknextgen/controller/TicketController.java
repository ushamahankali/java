package com.ektha.freshdesknextgen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.freshdesknextgen.entity.Ticket;
import com.ektha.freshdesknextgen.service.TicketService;

@Controller
public class TicketController {
	@Autowired
	private TicketService ticketingservice;

	@RequestMapping(value = "/createticket", method = RequestMethod.POST)
	public String handleCreateTicketRequest(@RequestParam String title, @RequestParam String category,
			@RequestParam String priority, @RequestParam String description, ModelMap model) {

		Ticket ticket = new Ticket();
		ticket.setTitle(title);
		ticket.setCategory(category);
		ticket.setPriority(priority);
		ticket.setDescription(description);

		int rowsAffected = ticketingservice.createTicket(ticket);

		if (rowsAffected == 0) {
			model.put("infoMessage", "Please enter a valid ticket information!!");
			return "createticket";
		}
		model.put("infoMessage", "Ticket is created successfully!");
		return "ticket";
	}

	@RequestMapping(value = "/viewticket", method = RequestMethod.GET)
	public String handleViewTicketsRequest(ModelMap model) {

		List<Ticket> tickets = ticketingservice.getTicket();
		if (tickets != null && !tickets.isEmpty()) {
			model.put("tickets", tickets);
			return "viewticket";
		}
		model.put("infoMessage", "Sorry there are no tickets to display!!!");
		return "ticket";
	}

	@RequestMapping(value = "/createticket", method = RequestMethod.GET)
	public String showCreateTicketPage() {
		return "createticket";
	}

	@RequestMapping(value = "/ticket", method = RequestMethod.GET)
	public String showTicketPage() {
		return "ticket";
	}

}
