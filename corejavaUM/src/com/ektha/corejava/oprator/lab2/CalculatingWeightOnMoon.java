/**
 *
 */
package com.ektha.corejava.oprator.lab2;

import java.util.Scanner;

/**
 * @author usha
 *
 */
public class CalculatingWeightOnMoon {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the weight on Earth");
		double weight = scanner.nextDouble();

		weightOnMoonCalculating(weight);
		scanner.close();

	}

	/**
	 * @param args
	 *
	 */

	public static void weightOnMoonCalculating(double weight) {
		double weightOnMoon = weight * 0.17;
		System.out.println("Weight on the Moon is:" + weightOnMoon);
	}

}
