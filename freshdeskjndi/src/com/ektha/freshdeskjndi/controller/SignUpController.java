package com.ektha.freshdeskjndi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ektha.freshdeskjndi.entity.User;
import com.ektha.freshdeskjndi.service.SignUpService;

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/signup")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignUpController() {
		super();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SignUpService signUp = new SignUpService();
		User user = new User();
		response.setContentType("text/html");

		/*
		 * getting the user inputs from the signup page
		 */

		String emailId = request.getParameter("emailid");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String phoneNumber = request.getParameter("phoneNumber");
		user.setEmailId(emailId);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPhoneNumber(phoneNumber);

		/* redirecting the result to the Jsp pages */

		if (!(firstName.isEmpty() || lastName.isEmpty() || emailId.isEmpty() || password.isEmpty()
				|| phoneNumber.isEmpty())) {

			boolean result = signUp.createUser(user);

			if (result != false) {
				response.sendRedirect("jsps/login.jsp");
			}
		} else {

			response.sendRedirect("signuperror.html");

		}
	}

}
