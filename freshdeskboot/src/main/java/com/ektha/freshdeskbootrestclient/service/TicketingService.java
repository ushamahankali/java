package com.ektha.freshdeskbootrestclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ektha.freshdeskbootrestclient.entity.Ticket;

@Service
public class TicketingService {

	@Autowired
	private RestTemplate restTemplate;

	public String saveTicket(Ticket ticket) {
		String output = restTemplate.postForObject("http://localhost:9000/saveTicket", ticket, String.class);
		return output;
	}

	public List<Ticket> getTickets() {
		ResponseEntity<List<Ticket>> response = restTemplate.exchange("http://localhost:9000/getTickets",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Ticket>>() {
				});
		List<Ticket> ticketlist = response.getBody();
		return ticketlist;
	}
}
