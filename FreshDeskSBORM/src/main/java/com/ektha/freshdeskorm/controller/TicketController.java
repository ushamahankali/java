package com.ektha.freshdeskorm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ektha.freshdeskorm.domain.Ticket;
import com.ektha.freshdeskorm.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@RequestMapping(value = "/ticket", method = RequestMethod.GET)
	public String showHomePage() {
		return "ticket";
	}

	@RequestMapping(value = "/createticket", method = RequestMethod.GET)
	public ModelAndView showCreateAndView(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("createticket");

		model.addObject("createticket");
		return model;
	}

	@RequestMapping(value = "/createticket", method = RequestMethod.POST)
	public String createTicket(@RequestParam String title, @RequestParam String category, @RequestParam String priority,
			@RequestParam String description, ModelMap model) {

		Ticket ticket = new Ticket();

		ticket.setTitle(title);
		ticket.setCategory(category);
		ticket.setPriority(priority);
		ticket.setDescription(description);

		ticketService.saveTicket(ticket);

		model.put("message", "Ticket is created Successful!");

		return "ticket";

	}

	@RequestMapping(value = "/viewticket", method = RequestMethod.GET)
	protected String viewTicket(ModelMap model) {

		List<Ticket> tiList = ticketService.viewTicket();

		if (tiList != null) {
			for (Ticket ticket : tiList) {
				model.put("ticket", ticket);
				return "viewticket";
			}
		}
		model.put("message", "Sorry there are no tickets");
		return "createticket";
	}
}
