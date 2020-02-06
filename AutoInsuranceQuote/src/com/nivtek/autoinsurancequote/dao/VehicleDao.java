package com.nivtek.autoinsurancequote.dao;

import com.nivtek.autoinsurancequote.entity.Vehicle;

/**
 * @author Bootcamp User 024
 *
 */
public class VehicleDao {

	/**
	 * @param vin
	 * @return Make of a Car
	 */
	public Vehicle getVehicle(String vin) {
		// remove last 5 characters of vin
		String makeName = vin.substring(0, vin.length()-5);
		
		Vehicle vehicle = new Vehicle();
		
		//set vehicle Make
		vehicle.setMake(makeName);
		
		return vehicle;
	}

}
