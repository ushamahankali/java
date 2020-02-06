package com.ektha.freshdeskjndi.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ektha.freshdeskjndi.entity.User;
import com.ektha.freshdeskjndi.service.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();

	}

	/**
	 * it is the dopost method to login to the application
	 */

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			LoginService login = new LoginService();
			User user = new User();
			response.setContentType("text/html");

			HttpSession session = request.getSession(true);

			/* getting the user inputs from the login page */

			String emailId = request.getParameter("emailid");
			String password = request.getParameter("password");
			user.setEmailId(emailId);
			user.setPassword(password);

			boolean result = login.checkUser(emailId, password);

			/* redirecting the result to the Jsp pages */

			if (!(emailId.isEmpty() || password.isEmpty())) {
				if (result != false) {

					session.setAttribute("currentUser", user);
					response.sendRedirect("jsps/login.jsp");
				}
			} else {
				response.sendRedirect("errorpage.html");

			}

		} catch (

		Throwable TheException) {
			System.out.println("The exception");
		}

	}

}
