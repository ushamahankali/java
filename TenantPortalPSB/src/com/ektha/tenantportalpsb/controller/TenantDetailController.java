package com.ektha.tenantportalpsb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ektha.tenantportalpsb.entity.ContactDetails;
import com.ektha.tenantportalpsb.entity.TenantInformation;
import com.ektha.tenantportalpsb.service.TenantInformationService;

/**
 * Servlet implementation class TenantDetails
 */
@WebServlet("/TenantDetails")
public class TenantDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TenantDetailController() {
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

		response.setContentType("text/html");

		TenantInformationService tiService = new TenantInformationService();

		List<TenantInformation> tenantInfoList = tiService.getContactDetails();

		for (TenantInformation i : tenantInfoList) {

			List<ContactDetails> contactList = i.getContactDetailsList();

			for (ContactDetails j : contactList) {

				if (("primary".equals(j.getContactType()))) {

					System.out.println("Company Name :" + i.getCompanyName());

					System.out.println("Primary Contact Details ");

					System.out.println("Contact Name :" + j.getContactName());

					System.out.println("Phone Number :" + j.getPhoneNumber());

					System.out.println("Email Id : " + j.getEmailId());

				} else {
					// System.out.println("Company Name :" + i.getCompanyName());

					System.out.println("Secondry Contact Details:");

					System.out.println("Contact Name :" + j.getContactName());

					System.out.println("Phone Number :" + j.getPhoneNumber());

					System.out.println("Email Id : " + j.getEmailId());

					System.out.println("*********************************");
				}

			}
		}
	}
}
