package com.ektha.samplerestwebservice.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {

	private String empNo;
	private String empName;
	private String position;

	// This default constructor is required if there are other constructors.
	public Employee() {

	}

	public Employee(String empNo, String empName, String position) {
		this.empNo = empNo;
		this.empName = empName;
		this.position = position;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public String getPosition() {
		return position;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}