package com.ektha.freshdeskweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ektha.freshdeskweb.domain.Ticket;

@Repository
public class TicketDao {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Ticket> getAllTickets() {

		Query query = entityManager.createNamedQuery("from ticket");
		return query.getResultList();
	}

	public void saveAllTicket(Ticket ticket) {

		entityManager.persist(ticket);
	}
}
