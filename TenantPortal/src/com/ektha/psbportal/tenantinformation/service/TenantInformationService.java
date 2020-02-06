package com.ektha.psbportal.tenantinformation.service;

import java.util.List;

import com.ektha.psbportal.tenantinformation.dao.TenantInformationDAO;
import com.ektha.psbportal.tenantinformation.entity.TenantInformation;

public class TenantInformationService {

	public List<TenantInformation> getTenantInformation() {

		TenantInformationDAO tenentDAO = new TenantInformationDAO();

		List<TenantInformation> tenentList = tenentDAO.getTenantInformation();

		return tenentList;
	}

}
