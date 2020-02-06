package com.ektha.tenantportalpsb.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ektha.tenantportalpsb.dao.TenantInformationDAO;
import com.ektha.tenantportalpsb.entity.TenantInformation;

public class TenantInformationService {

	TenantInformationDAO tenantDAO = new TenantInformationDAO();

	/*
	 * inserting the tenant details into the database
	 */
	public void addTenantInfo(TenantInformation tenantInfo) {

		TenantInformationDAO tenantDAO = new TenantInformationDAO();
		tenantDAO.saveTenantInformation(tenantInfo);
	}

	/*
	 * getting the tenant contact details from the database
	 *
	 */

	public List<TenantInformation> getContactDetails() {

		List<TenantInformation> tenantInfoList = tenantDAO.getContactDetails();

		return tenantInfoList;
	}

	/* getting the tenant contact infomation from the database using hashmap */

	public Map<String, TenantInformation> getContactListForAllTenant() {
		{
			Map<String, TenantInformation> tenantMap = tenantDAO.getContactListForAllTenant();

			return tenantMap;
		}
	}

	/*
	 * getting the tenant infomation from the database
	 */

	public TenantInformation getTenantInfo(int suitNumber) throws ClassNotFoundException, SQLException {
		// System.out.println("hello tenantcontroler" + suitNumber);

		TenantInformation tenantDetails = tenantDAO.getTenantInfo(suitNumber);

		return tenantDetails;

	}

	/* based on the suit number getting tenant information */

	public List<TenantInformation> getTenantInformation() {

		List<TenantInformation> tenentList = tenantDAO.getTenantInformation();

		return tenentList;
	}
}
