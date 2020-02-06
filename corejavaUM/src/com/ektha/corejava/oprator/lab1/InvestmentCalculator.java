/**
 *
 */
package com.ektha.corejava.oprator.lab1;

/**
 * @author usha
 *
 *
 */
/*
 * Create a program that calculates how much a $14,000 investment would be worth
 * if it increased in value by 40% during the first year, lost $1,500 in value
 * the second year, and increased 12% in the third year.
 */

public class InvestmentCalculator {

	public static void calculateInvestment(double investment) {

		double result1 = (investment + (investment * 40) / 100);

		System.out.println("investment in Ist year  \n" + "$" + result1);

		double result2 = result1 - 1500;
		System.out.println("investment in IInd year\n" + "$" + result2);

		double result3 = (result2 + (result2 * 12) / 100);

		System.out.println("investment in IIIrd year\n" + "$" + result3);

	}

	public static void main(String args[]) {
		// InvestmentCalculator ic = new InvestmentCalculator();

		calculateInvestment(14000);
	}
}
