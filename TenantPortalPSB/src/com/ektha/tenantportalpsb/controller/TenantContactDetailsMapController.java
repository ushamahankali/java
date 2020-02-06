package com.ektha.tenantportalpsb.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ektha.tenantportalpsb.entity.ContactDetails;
import com.ektha.tenantportalpsb.entity.TenantInformation;
import com.ektha.tenantportalpsb.service.TenantInformationService;

/**
 * Servlet implementation class TenantContactDetailsMapController
 */
@WebServlet("/TenantContactDetailsMapController")
public class TenantContactDetailsMapController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TenantContactDetailsMapController() {
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

		TenantInformationService mapService = new TenantInformationService();

		Map<String, TenantInformation> tenantMap = mapService.getContactListForAllTenant();
		for (String str : tenantMap.keySet()) {
			System.out.println(str);
			TenantInformation tenantInfo = tenantMap.get(str);
			List<ContactDetails> contactList = tenantInfo.getContactDetailsList();
			for (ContactDetails i : contactList) {
				System.out.println("Contact Type :" + i.getContactType());

				System.out.println("Contact Name :" + i.getContactName());

				System.out.println("Phone Number :" + i.getPhoneNumber());

				System.out.println("Email Id : " + i.getEmailId());

			}
			System.out.println("\n ********************************* \n");
		}
	}
}
