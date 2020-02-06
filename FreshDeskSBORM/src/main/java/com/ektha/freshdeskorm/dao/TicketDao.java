package com.ektha.freshdeskorm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ektha.freshdeskorm.domain.Ticket;

@Repository
public class TicketDao {

	@Autowired
	private SessionFactory sessionfactory;

	public String saveAllTicket(Ticket ticket) {

		Session session = sessionfactory.getCurrentSession();
		int isSuccess = (int) session.save(ticket);

		if (isSuccess >= 1) {
			return "Success!";
		} else {
			return "Error while Saving Ticket";
		}
	}

	@SuppressWarnings("unchecked")
	public List<Ticket> getTickets() {

		Session session = sessionfactory.getCurrentSession();
		List<Ticket> tickets = session.createQuery("from Ticket").list();

		session.close();
		return tickets;
	}
}
