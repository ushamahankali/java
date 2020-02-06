package com.ektha.corejava.datatype.string.lab5;

public class ValidateRegularExpressions {

	public boolean isValidPhoneNumber(String phoneNum) {
		String case1 = "^[1-9]\\d{2}-\\d{3}-\\d{4}";
		String case2 = "^[1-9]\\d{2}.\\d{3}.\\d{4}";
		String case3 = "^[1-9]\\d{2}\\s\\d{3}\\s\\d{4}";
		if (phoneNum.matches(case1) || phoneNum.matches(case2) || phoneNum.matches(case3)) {
			return true;
		}
		return false;
	}

	public boolean isValidIp(String ipAddress) {
		String ip = "\\d{1,3}.\\d{1,3}.\\d{1,3}.\\d{1,3}";
		if(ipAddress.matches(ip)) {
			return true;
		}
		return false;
	}
	
	public boolean isValidEmailAddress(String emailAddress) {
		String email = "\\w{1,}@\\w{1,}.com";
		if(emailAddress.matches(email)) {
			return true;
		}
		return false;
	}

}
