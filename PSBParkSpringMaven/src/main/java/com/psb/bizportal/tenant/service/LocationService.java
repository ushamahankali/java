package com.psb.bizportal.tenant.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.psb.bizportal.tenant.dao.LocationDAO;
import com.psb.bizportal.tenant.entity.Location;

public class LocationService {

	@Autowired
	private LocationDAO locationDao;

	/*public void setLocationDao(LocationDAO locationDao) {
		this.locationDao = locationDao;
	}*/

	/*returns the Location object*/
	public Location getLocationDetails(String locationName) {

		Location location = locationDao.getLocationDetails(locationName);

		return location;
	}

	public String printHi(String locationName) {
		System.out.println("hai" + locationName);
		return locationName;
	}
}
