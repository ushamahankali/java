package com.psb.bizportal.tenant.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.psb.bizportal.tenant.entity.Address;
import com.psb.bizportal.tenant.entity.Contact;
import com.psb.bizportal.tenant.entity.Location;

public class LocationDAO {

	@Autowired
	private DataSource dataSource;
	//private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	/*public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setSimpleJdbcCall(SimpleJdbcCall simpleJdbcCall) {
		this.simpleJdbcCall = simpleJdbcCall;
	}*/

	/*returns the Location object*/
	public Location getLocationDetails(String locationName) {

		//jdbcTemplate = new JdbcTemplate(dataSource);
		simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getLocationInfoNew");

		SqlParameterSource in = new MapSqlParameterSource().addValue("locationName", locationName);
		Map<String, Object> out = simpleJdbcCall.execute(in);

		Location location = new Location();
		Address address = new Address();
		Contact contact = new Contact();

		address.setAddress_line1((String) out.get("out_address_line1"));
		address.setCity((String) out.get("out_city"));
		address.setState((String) out.get("out_state"));
		address.setZipcode(Integer.parseInt(String.valueOf(out.get("out_zipcode"))));
		address.setProperty_value((String) out.get("out_property_value"));

		contact.setName((String) out.get("out_contact_name"));
		contact.setPhone((String) out.get("out_phone"));
		contact.setEmail_id((String) out.get("out_emaild"));

		location.setName((String) out.get("out_location_name"));
		location.setAddress(address);
		location.setContact(contact);
		location.setNoOfTenants(Integer.parseInt(String.valueOf(out.get("out_num_of_tenants"))));

		return location;
	}

}
