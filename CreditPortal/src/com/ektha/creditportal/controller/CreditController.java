package com.ektha.creditportal.controller;

import com.ektha.creditportal.entity.CreditApplicantInfo;
import com.ektha.creditportal.entity.Request;
import com.ektha.creditportal.service.CreditService;

public class CreditController {

	public void doPost(Request creq) {

		CreditService cs = new CreditService();

		CreditApplicantInfo apInfo = new CreditApplicantInfo();

		apInfo.setFirstName(creq.getFirstName());
		apInfo.setLastName(creq.getLastName());
		apInfo.setSsnNumber(creq.getSsnNumber());
		apInfo.setSalary(creq.getSalary());

		// check for salary limit
		if (!cs.validateSalary(apInfo))

		{
			System.out.println("Credit Card is Rejected");
		}

	}

}
