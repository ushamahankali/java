package com.ektha.corejava.datatype.string.lab1;

/**
 * @author usha
 *
 */
public class MyFirstStringProgram {

	public void checkStringPalindrome(String str)

	{
		if (str.equals(reverseString(str))) {
			System.out.println("The given String are equal \n");

		} else {
			System.out.println("The given String are not  equal \n");
		}
	}

	public void compareString(String a, String b) {

		if (a.equals(b)) {
			System.out.println("The given String are equal \n");

		} else {
			System.out.println("The given String are not  equal \n ");
		}
	}

	public int findOccuraceOfCharacter(String str, char A) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == A) {
				count++;
			}
		}
		System.out.println("In a given String character 'A' occured :" + count + "time\n");
		return count;
	}

	public void findStringandReplace(String str) {

		String compare = "institute";
		int iFound = 0;
		{
			iFound = str.indexOf(compare);
			if (iFound != -1) { // -1 means the word is found in the string
				String s1 = str.substring(0, iFound);
				String s2 = str.substring(iFound + 3, str.length());

				String s4 = s1 + "JSS" + s2;

				System.out.println("The string after replacing \n" + s4);
			}

		}

	}

	public void getFirst3CharactersInString(String str) {
		String a = "";

		if (str.length() > 3) {
			a = str.substring(0, 3);

		} else {
			a = str;
		}

		System.out.println(a);
	}

	public void getReplaceString(String str) {

		System.out.println("String valu after Replacing :" + str.replace("hello", "HELLO") + "\n");

	}

	public void getReplaceWhiteSpaceWithComma(String str) {

		System.out.println(str.replaceAll("\\s", ",") + "\n");
	}

	public int getStringCount(String str) {

		int count = 0;

		if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {

			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == ' ') {
					count++;
				}
			}
			count = count + 1;
		}
		System.out.println("Number of Words in the given String :" + count + "\n");
		return count; // returns 0 if string starts or ends with space " ".
	}

	public void getStringLength(String str) {

		System.out.println("The length of the given String :" + str.length() + "\n");

	}

	public String reverseString(String str) {
		{
			String reverse = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reverse = reverse + str.charAt(i);
			}
		}
		return str;
	}
}
