package com.ektha.tenantpsbportal.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ektha.tenantpsbportal.dao.TenantInformationDAO;
import com.ektha.tenantpsbportal.entity.TenantInformation;

public class TenantInformationService {
	public List<TenantInformation> getsortedTenantInformation() {

		TenantInformationDAO tenentDAO = new TenantInformationDAO();

		List<TenantInformation> sortedtenantList = tenentDAO.getTenantInformation();

		if (!sortedtenantList.isEmpty()) {
			Collections.sort(sortedtenantList, new Comparator<TenantInformation>() {

				@Override
				public int compare(TenantInformation t1, TenantInformation t2) {
					return t1.getCompanyName().compareToIgnoreCase(t2.getCompanyName());

				}
			});
		}
		return sortedtenantList;
	}

}
