/**
 *
 */
package com.ekatha.transactionportal.transaction.util;

import java.util.Scanner;

import com.ekatha.transactionportal.transaction.controller.TransactionController;
import com.ekatha.transactionportal.transaction.entity.TransactionRequest;

/**
 * @author BootCampJava018
 *
 */
public class DemoTransaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TransactionRequest tr = new TransactionRequest();

		System.out.println("Enter the customer Id");
		tr.setCustomerId(scanner.nextInt());
		scanCustomerId(tr);
		scanner.close();

	}

	private static void scanCustomerId(TransactionRequest request) {

		TransactionController tControl = new TransactionController();

		tControl.doGet(request);

	}

}
