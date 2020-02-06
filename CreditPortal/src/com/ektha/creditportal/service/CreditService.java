package com.ektha.creditportal.service;

import com.ektha.creditportal.dao.CreditDAO;
import com.ektha.creditportal.entity.CreditApplicantInfo;

public class CreditService {

	CreditDAO ccDAO = new CreditDAO();

// Validating the Salary
	public boolean validateSalary(CreditApplicantInfo cpI) {
		int limit = 0;
		if (cpI.getSalary() < 25000) {
			return false;
		} else if (cpI.getSalary() > 25000 && cpI.getSalary() <= 50000) {
			limit = 1000;

		} else if (cpI.getSalary() > 50000 && cpI.getSalary() <= 75000) {
			limit = 2000;

		} else if (cpI.getSalary() > 75000 && cpI.getSalary() <= 100000) {
			limit = 5000;
		}
		ccDAO.save(limit);
		return true;

	}
}
