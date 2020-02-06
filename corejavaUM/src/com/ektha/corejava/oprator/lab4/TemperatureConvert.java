/**
 *
 */
package com.ektha.corejava.oprator.lab4;

import java.util.Scanner;

/**
 * @author usha
 *
 */
public class TemperatureConvert {

	public static void getCelsius(double n) {

		double celsiusTemperature = (n - 32) * 5 / 9;
		System.out.println("Celsius Temperature is: " + celsiusTemperature);

	}

	public static void getFahrenheit(double n) {

		double fahrenheitTemperature = ((9 * n) / 5) + 32;
		System.out.println("Fahrenheit Temperature is: " + fahrenheitTemperature);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Celsicus Temperature");
		double celsicusTemperature = scanner.nextDouble();
		// getFahrenheit(celsicusTemperature);
		System.out.println("Enter the Fahrenheit Temperature");
		double fahrenheitTemperature = scanner.nextDouble();
		getCelsius(fahrenheitTemperature);
		getFahrenheit(celsicusTemperature);

		scanner.close();

	}
}