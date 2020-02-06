package com.ektha.corejava.datatype.string.lab3;

import java.util.Scanner;

public class EmailCheck {

	public static void main(String args[]) {

		EmailCheck emailid = new EmailCheck();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the EmailId ");

		try {
			String emailId = scanner.nextLine();
			emailid.setEmailId(emailId);

			int emailLength = emailid.getEmailId().length();
			int count = 0;
			boolean isValidLength = false;
			boolean isUpperCase = false;
			boolean isValidAtDot = false;
			boolean isAlphabet = false;
			boolean isValidCombination = false;

			// getting the index number for @ symbol

			int a = emailid.getEmailId().indexOf("@");

			try {
				// dividing the email id as 2 strings
				String stringBeforAtSymbol = emailid.getEmailId().substring(0, a);

				// checking for email id length

				if ((emailLength > 3 && emailLength < 20) == true) {
					isValidLength = true;
				}

				// checking the the Ist letter upper case

				if (Character.isUpperCase(emailid.getEmailId().charAt(0)) == true) {
					isUpperCase = true;
				}

				// checking for special characters and '.'

				if (a > 0) {

					for (int i = a; i < emailLength; i++) {

						if (emailid.getEmailId().charAt(i) == '.') {
							// isValidDot = true;
							count = count + 1;
						}
						if (count > 0 && count < 3) {
							isValidAtDot = true;
						} else {
							isValidAtDot = false;
						}

					}
				}

				// checking for combination of username

				for (int i = 0; i < stringBeforAtSymbol.length(); i++) {

					if (Character.isAlphabetic(stringBeforAtSymbol.charAt(i)))
						isAlphabet = true;

					if (stringBeforAtSymbol.charAt(i) == '_')
						isValidCombination = true;

				}

				// printing the Appropriate Error Message

				if (!isValidLength) {

					System.out.println("Invalid length of the email id");

				} else if (!isUpperCase) {

					System.out.println("Invalid case of the First Letter");

				} else if (!isValidAtDot) {

					System.out.println("Invalid position of special character");

				} else if (!isValidCombination || !isAlphabet) {

					System.out.println("Invalid combination of User name");

				} else {

					System.out.println("valid email id");

				}

			} catch (StringIndexOutOfBoundsException e) {

				System.out.println("Enter the valid charachers");
			}

		} finally {

			scanner.close();

		}

	}

	private String emailId;

	/*
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}