package com.psb.bizportal.tenant.service;

import java.util.HashMap;
import java.util.List;

import com.psb.bizportal.tenant.dao.TenantDAO;
import com.psb.bizportal.tenant.entity.Tenant;

public class TenantService {

	private TenantDAO tenantDao;

	public void setTenantDao(TenantDAO tenantDao) {
		this.tenantDao = tenantDao;
	}

	/* get tenants returns a HashMap with key: location name and value: list of tenants in that location */
	public HashMap<String, List<Tenant>> getTenants() {

		HashMap<String, List<Tenant>> tenantMap = new HashMap<String, List<Tenant>>();
		tenantMap = tenantDao.getTenants();

		return tenantMap;
	}
}
