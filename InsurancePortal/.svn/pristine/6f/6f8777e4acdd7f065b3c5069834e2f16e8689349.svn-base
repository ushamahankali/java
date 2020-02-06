package com.nivtek.autoinsuranceportal.quote.dao;

import com.nivtek.autoinsuranceportal.quote.entity.Vehicle;

/**
 * @author Sartha Tamang.
 *
 */
public class VehicleDao {

	/**
	 * @param vin
	 * @return make of the vehicle.
	 */
	public Vehicle getVehicle(String vin) {
		
		// logic used to remove last 5 characters of vin.

		String makeName = vin.substring(0, vin.length() - 5);
		Vehicle vehicle = new Vehicle();
		
		// set the vehicle make;

		vehicle.setMake(makeName);

		return vehicle;

	}

}
