package com.ektha.corejava.datatype.string.lab5;

import java.util.Scanner;

public class DemoValidateRegularExpressions {

	public static void main(String args[]) {

		ValidateRegularExpressions validate = new ValidateRegularExpressions();

		Scanner scanner = new Scanner(System.in);

		String phoneNumber;
		String ipAddress;
		String emailId;

		// validatin for phone number

		System.out.println("enter phone number");

		phoneNumber = scanner.nextLine();
		if (validate.isValidPhoneNumber(phoneNumber)) {
			System.out.println("entered  phone number is valid phone number");
		} else {
			System.out.println("please enter the valid phone number");
		}

		// validation for ip address

		System.out.println("enter ip address");

		ipAddress = scanner.nextLine();

		if (validate.isValidIp(ipAddress)) {
			System.out.println("entered ipaddress is valid ipaddress");
		} else {
			System.out.println("entered ipaddress is not valid ipaddress");
		}

		// validation for email id.

		System.out.println("enter email id");

		emailId = scanner.nextLine();

		if (validate.isValidEmailAddress(emailId)) {
			System.out.println("entered emailid is not valid email id");

		} else {
			System.out.println("entered emailid is not valid emailid");
		}

		scanner.close();
	}

}
