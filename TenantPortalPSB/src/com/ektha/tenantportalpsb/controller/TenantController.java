
package com.ektha.tenantportalpsb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ektha.tenantportalpsb.entity.TenantInformation;
import com.ektha.tenantportalpsb.service.TenantInformationService;

/**
 * Servlet implementation class TenentController
 */

@WebServlet("/TenantController")
public class TenantController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public TenantController() {
		super(); // TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		TenantInformation tenantInfo = new TenantInformation();

		response.setContentType("text/html");

		int suitNumber = Integer.parseInt(request.getParameter("suitNumber"));

		tenantInfo.setSuitNumber(suitNumber);

		TenantInformationService tService = new TenantInformationService();
		try {
			TenantInformation tenantDetails = tService.getTenantInfo(suitNumber);

			if (tenantDetails != null) {

				System.out.println("Company Name: " + tenantDetails.getCompanyName());
				System.out.println("Suit Number :" + tenantDetails.getSuitNumber());
				System.out.println("Phone Number :" + tenantDetails.getPhoneNumber());
				System.out.println("Email Id :" + tenantDetails.getEmailId());
			}
		} catch (Exception e) {
		}
	}
}
