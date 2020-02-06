package com.ektha.freshdeskorm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.freshdeskorm.dao.TicketDao;
import com.ektha.freshdeskorm.domain.Ticket;

@Service
public class TicketService {

	@Autowired
	TicketDao tickDao;

	public void saveTicket(Ticket ticket) {

		tickDao.saveAllTicket(ticket);
	}

	public List<Ticket> viewTicket() {

		return tickDao.getTickets();
	}

}
