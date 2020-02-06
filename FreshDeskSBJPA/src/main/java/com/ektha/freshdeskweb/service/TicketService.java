package com.ektha.freshdeskweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdeskweb.dao.TicketDao;
import com.ektha.freshdeskweb.domain.Ticket;

@Service
public class TicketService {

	@Autowired
	TicketDao tickDao;

	public void saveTicket(Ticket ticket) {

		tickDao.saveAllTicket(ticket);
	}

	public List<Ticket> viewAllTicket() {

		return tickDao.getAllTickets();
	}

}
