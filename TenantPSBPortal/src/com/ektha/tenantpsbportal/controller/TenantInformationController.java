package com.ektha.tenantpsbportal.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ektha.tenantpsbportal.entity.TenantInformation;
import com.ektha.tenantpsbportal.service.TenantInformationService;

/**
 * Servlet implementation class TenantInformationController
 */
@WebServlet("/TenantInformationController")
public class TenantInformationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TenantInformationController() {
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
		PrintWriter out = response.getWriter();

		TenantInformationService tiService = new TenantInformationService();

		List<TenantInformation> tenentList = tiService.getsortedTenantInformation();

		out.print("<html>");
		out.print("<body>");

		out.print("<center><h1>TENANTINFORMATION TABLE</h1></center>");
		out.print("<table border='1' width='75%'>");
		out.print("<tr><th>CompanyName</th><th>SuitNumber</th><th>PhoneNumber</th><th>EmailId</th></tr>");
		for (TenantInformation i : tenentList) {
			out.print("<tr><td>" + i.getCompanyName() + "</td><td>" + i.getSuitNumber() + "</td><td>"
					+ i.getPhoneNumber() + "</td><td>" + i.getEmailId() + "</td></tr>");

		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");

		out.close();

	}

}
