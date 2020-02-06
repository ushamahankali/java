package com.nivtek.autoinsuranceportal.quote.service;

import com.nivtek.autoinsuranceportal.quote.dao.VehicleDao;
import com.nivtek.autoinsuranceportal.quote.entity.Vehicle;

/**
 * @author Sartha Tamang.
 *
 */
public class VehicleService {

	/**
	 * @param vin
	 * @return return vehicle make;
	 */
	public Vehicle getVehicle(String vin) {
		
		VehicleDao vehicleDao = new VehicleDao();
		
		// call VehicleDao method.
		return vehicleDao.getVehicle(vin);
	}

}
