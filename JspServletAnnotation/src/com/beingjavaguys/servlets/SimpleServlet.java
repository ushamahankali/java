package com.beingjavaguys.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Simple Servlet", description = "This is a simple servlet with annotations", urlPatterns = "/getServlet")
public class SimpleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("get request");
		response.sendRedirect("register.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Name : " + request.getParameter("name"));
		System.out.println("Gender : " + request.getParameter("gender"));
		System.out.println("Email : " + request.getParameter("email"));
		System.out.println("Phone : " + request.getParameter("phone"));
		System.out.println("City : " + request.getParameter("city"));

		request.getRequestDispatcher("details.jsp").forward(request, response);

	}
}