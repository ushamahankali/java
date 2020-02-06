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
 * Servlet implementation class TenantInsertController
 */
@WebServlet("/TenantInsertController")
public class TenantInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TenantInsertController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		TenantInformation tenantInfo = new TenantInformation();

		response.setContentType("text/html");

		String companyName = request.getParameter("companyName");
		tenantInfo.setCompanyName(companyName);

		int suitNumber = Integer.parseInt(request.getParameter("suitNumber"));
		tenantInfo.setSuitNumber(suitNumber);

		String phoneNumber = request.getParameter("phoneNumber");
		tenantInfo.setPhoneNumber(phoneNumber);

		String emailId = request.getParameter("emailId");
		tenantInfo.setEmailId(emailId);

		TenantInformationService tenantService = new TenantInformationService();

		tenantService.addTenantInfo(tenantInfo);

	}

}
