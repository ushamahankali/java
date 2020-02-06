package com.ektha.freshdeskbootrestclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ektha.freshdeskbootrestclient.entity.Ticket;
import com.ektha.freshdeskbootrestclient.service.TicketingService;

@Controller
public class TicketController {

	@Autowired
	private TicketingService ticketingservice;

	@RequestMapping(value = "/ticket", method = RequestMethod.GET)
	public String showTicketPage() {
		return "ticket";
	}

	@RequestMapping(value = "/createticket", method = RequestMethod.GET)
	public String showCreateTicketPage() {
		return "createticket";
	}

	@RequestMapping(value = "/createticket", method = RequestMethod.POST)
	public String handleCreateTicketRequest(@RequestParam String title, @RequestParam String category,
			@RequestParam String priority, @RequestParam String description, ModelMap model) {

		Ticket ticket = new Ticket();
		ticket.setTitle(title);
		ticket.setCategory(category);
		ticket.setPriority(priority);
		ticket.setDescription(description);

		model.put("infoMessage", ticketingservice.saveTicket(ticket));
		return "ticket";
	}

	@RequestMapping(value = "/viewtickets", method = RequestMethod.GET)
	public String handleViewTicketsRequest(ModelMap model) {

		List<Ticket> tickets = ticketingservice.getTickets();
		if (tickets != null && !tickets.isEmpty()) {
			model.put("tickets", tickets);
			return "viewtickets";
		}
		model.put("infoMessage", "Sorry there are no tickets to display!!!");
		return "ticket";
	}

}
