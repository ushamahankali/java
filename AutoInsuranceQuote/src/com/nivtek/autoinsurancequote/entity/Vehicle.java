package com.nivtek.autoinsurancequote.entity;

/**
 * @author Bootcamp User 024
 *
 */
public class Vehicle {
	// instance variable
	private String vin;
	private String make;
	private String manufacturer;
	
	//getters and setters
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
}
