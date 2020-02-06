package com.ektha.freshdesk.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.freshdesk.entity.Ticket;
import com.ektha.freshdesk.service.TicketService;

@Controller
public class TicketController {

	private static final Logger logger = LogManager.getLogger(TicketController.class);

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

		logger.info("Info level log message");
		logger.debug("Debug level log message");
		logger.error("Error level log message");
		return "createticket";
	}

	@RequestMapping(value = "/ticket", method = RequestMethod.GET)
	public String showTicketPage() {
		return "ticket";
	}

}
