package com.ektha.psbportal.tenantinformation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ektha.psbportal.tenantinformation.entity.TenantInformation;
import com.ektha.psbportal.tenantinformation.service.TenantInformationService;

/**
 * Servlet implementation class TenentInformationController
 */
/*
 * @WebServlet(urlPatterns = "/tcontroller"
 * ,initParams={@WebInitParam(name="ccc", value="333") } )
 */
public class TenantInformationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TenantInformationController() {
		super();

	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		/*
		 * RequestDispatcher rd = request.getRequestDispatcher("/hello");
		 * rd.forward(request, response);
		 */
		 

		
		
		 

		response.setContentType("text/html");
		ServletConfig config = getServletConfig();
		System.out.println(config.getInitParameter("name"));
		/*
		 * ServletContext context =config.getServletContext() ;
		 * System.out.println(context.getServletContextName());
		 */
		

		PrintWriter out = response.getWriter();

		
		
		 
		/* session.setAttribute(name, value); */

		TenantInformationService tiService = new TenantInformationService();

		List<TenantInformation> tenentList = tiService.getTenantInformation();
		for (TenantInformation i : tenentList) {
			out.println("Company Name: " + i.getCompanyName() + "\n");
			out.println("Suit Number :" + i.getSuitNumber() + "\n");
			out.println("Phone Number :" + i.getPhoneNumber() + "\n");
			out.println("EmailId :" + i.getEmailId());
		}

	}

}
