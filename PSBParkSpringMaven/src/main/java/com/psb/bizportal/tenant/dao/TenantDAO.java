package com.psb.bizportal.tenant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.psb.bizportal.tenant.entity.Address;
import com.psb.bizportal.tenant.entity.Contact;
import com.psb.bizportal.tenant.entity.Tenant;

public class TenantDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/* get tenants returns a HashMap with key: location name and value: list of tenants in that location */

	public HashMap<String, List<Tenant>> getTenants() {
		String sql = "SELECT location_name,tenant_name,address_line1,address_line2,\r\n" + "    city,state,zipcode,property_value,contact_name,phone,emaild\r\n" + "FROM\r\n" + "    location l INNER JOIN tenant t INNER JOIN address a INNER JOIN\r\n" + "    contact c ON l.location_id = t.location_id AND t.address_id = a.address_id AND t.contact_id = c.contact_id;";
		return (HashMap<String, List<Tenant>>) jdbcTemplate.query(sql, new ResultSetExtractor<HashMap<String, List<Tenant>>>() {

			@Override
			public HashMap<String, List<Tenant>> extractData(ResultSet rs) throws SQLException {
				HashMap<String, List<Tenant>> tenantMap = new HashMap<String, List<Tenant>>();

				while (rs.next()) {

					Tenant tnt = new Tenant();
					Address ad = new Address();
					Contact cnt = new Contact();

					ad.setAddress_line1(rs.getString("ADDRESS_LINE1"));
					ad.setAddress_line2(rs.getString("ADDRESS_LINE2"));
					ad.setCity(rs.getString("CITY"));
					ad.setState(rs.getString("STATE"));
					ad.setZipcode(rs.getInt("ZIPCODE"));
					ad.setProperty_value(rs.getString("PROPERTY_VALUE"));

					cnt.setName(rs.getString("CONTACT_NAME"));
					cnt.setPhone(rs.getString("PHONE"));
					cnt.setEmail_id(rs.getString("EMAILD"));

					tnt.setName(rs.getString("TENANT_NAME"));
					tnt.setAddress(ad);
					tnt.setContact(cnt);

					/* 1.if tenantMap contains location name append current tenant to the existing tenant(s)
					  2. else add element to tenantMap with key : location name and value : tenantList */

					if (tenantMap.containsKey(rs.getString("LOCATION_NAME"))) {

						tenantMap.get(rs.getString("LOCATION_NAME")).add(tnt);

					} else {

						ArrayList<Tenant> tenantList = new ArrayList<Tenant>();
						tenantList.add(tnt);
						tenantMap.put(rs.getString("LOCATION_NAME"), tenantList);

					}

				}

				return tenantMap;
			}
		});
	}
}
