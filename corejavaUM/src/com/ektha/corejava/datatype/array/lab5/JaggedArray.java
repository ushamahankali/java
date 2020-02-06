/**
 *
 */
package com.ektha.corejava.datatype.array.lab5;

/**
 * @author usha
 *
 */
public class JaggedArray {

	public static void main(String args[]) {

		/* Declaring 2D array and Initalizing Array */
		String studentArray[][] = new String[4][];

		studentArray[0] = new String[] { "Tony", "JAVA", "C", "C++" };
		studentArray[1] = new String[] { "Thomas", "JAVA", "UNIX" };
		studentArray[2] = new String[] { "Dinil", "Linux", "Oracle" };
		studentArray[3] = new String[] { "Delvin", "RDBMS", "C#", "ORACLE" };

		System.out.println("tutorials attended by  Delvin :");
		for (int i = 1; i < studentArray[3].length; i++) {
			System.out.print(studentArray[3][i] + "\t");
		}

	}
}