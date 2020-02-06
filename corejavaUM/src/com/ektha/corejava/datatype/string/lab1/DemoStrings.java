/**
 *
 */
package com.ektha.corejava.datatype.string.lab1;

/**
 * @author usha
 *
 */
public class DemoStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String sentance = "hello how are you";
		String firstString = " Hello ";
		String secondString = "HELLO";
		String reverseString = "NITIN";
		String checkString = "HELLO HOW ARE YOU AND WHERE ARE YOU";
		String replaceString = "This  is a java institute of insurance and insu. ";

		MyFirstStringProgram fsp = new MyFirstStringProgram();

		fsp.getStringCount(sentance);
		fsp.getStringLength(sentance);
		fsp.getReplaceString(sentance);
		fsp.getReplaceWhiteSpaceWithComma(sentance);
		fsp.getFirst3CharactersInString(sentance);
		fsp.compareString(firstString, secondString);
		fsp.checkStringPalindrome(reverseString);
		fsp.findOccuraceOfCharacter(checkString, 'A');
		System.out.println("The string before replacing \n" + replaceString);
		fsp.findStringandReplace(replaceString);

	}

}
