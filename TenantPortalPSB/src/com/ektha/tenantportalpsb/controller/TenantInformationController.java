package com.ektha.tenantportalpsb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ektha.tenantportalpsb.entity.TenantInformation;
import com.ektha.tenantportalpsb.service.TenantInformationService;

/**
 * Servlet implementation class TenentInformationController
 */
@WebServlet("/TenantInformationController")
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

		response.setContentType("text/josn");

		TenantInformationService tiService = new TenantInformationService();

		List<TenantInformation> tenentList = tiService.getTenantInformation();
		for (TenantInformation i : tenentList) {

			System.out.println("Company Name: " + i.getCompanyName());
			System.out.println("Suit Number :" + i.getSuitNumber());
			System.out.println("Phone Number :" + i.getPhoneNumber());
			System.out.println("EmailId :" + i.getEmailId());
		}

	}

}
