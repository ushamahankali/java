package com.ektha.freshdesk.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ektha.freshdesk.entity.Ticket;
import com.ektha.freshdesk.service.TicketService;

/**
 * Servlet implementation class TicketController
 */
@WebServlet("/ticket")
public class TicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TicketController() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(true);
		TicketService viewTicket = new TicketService();
		List<Ticket> ticketList = viewTicket.getTicket();
		session.setAttribute("ticketList", ticketList);
		request.getRequestDispatcher("/jsps/viewticket.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		TicketService createTicket = new TicketService();
		Ticket ticket = new Ticket();

		/*
		 * getting the input from user
		 *
		 */

		response.setContentType("text/html");
		HttpSession session = request.getSession(true);
		String title = request.getParameter("title");
		String category = request.getParameter("category");
		String priority = request.getParameter("priority");
		String description = request.getParameter("description");

		ticket.setTitle(title);
		ticket.setCategory(category);
		ticket.setPriority(priority);
		ticket.setDescription(description);

		/*
		 * redirecting the result to the Jsp pages
		 */
		if (!(title.isEmpty() || category.isEmpty() || priority.isEmpty() || description.isEmpty())) {

			boolean result = createTicket.createTicket(ticket);

			session.setAttribute("currentTicket", ticket);
			if (result != false) {

				response.sendRedirect("jsps/createticket.jsp");
			}

		} else {
			response.sendRedirect("ticketerrorpage.html");

		}
	}
}
