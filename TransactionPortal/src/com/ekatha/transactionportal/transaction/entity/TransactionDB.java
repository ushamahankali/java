/**
 *
 */
package com.ekatha.transactionportal.transaction.entity;

import java.util.ArrayList;

/**
 * @author BootCampJava018
 *
 */
public class TransactionDB {

	public String date;

	public int amount;
	public String location;

	public TransactionDB() {
	}

	public TransactionDB(String date, int amount, String location) {
		super();
		this.date = date;
		this.amount = amount;
		this.location = location;
	}

	public ArrayList<TransactionDB> getTransactionDetails(int customerId) {
		ArrayList<TransactionDB> transactionList = new ArrayList<TransactionDB>();

		if (customerId == 1) {

			transactionList.add(new TransactionDB("03/1/2019", 300, "xyz"));
			transactionList.add(new TransactionDB("04/1/2019", 200, "abc"));
			transactionList.add(new TransactionDB("04/1/2019", 300, "xyz"));
		}

		if (customerId == 2) {
			transactionList.add(new TransactionDB("25/04/2019", 250, "abc"));
			transactionList.add(new TransactionDB("25/04/2019", 200, "abz"));
			transactionList.add(new TransactionDB("25/04/2019", 50, "dbc"));
			transactionList.add(new TransactionDB("25/04/2019", 250, "acc"));

		}
		if (customerId == 3) {
			transactionList.add(new TransactionDB("29/01/2019", 250, "fdd"));
			transactionList.add(new TransactionDB("29/01/2019", 250, "fdd"));
			transactionList.add(new TransactionDB("29/01/2019", 250, "fdd"));
			transactionList.add(new TransactionDB("29/01/2019", 250, "fdd"));

		}

		if (customerId == 4) {
			transactionList.add(new TransactionDB("2/03/2019", 250, "dfd"));

		}

		if (customerId == 5) {
			transactionList.add(new TransactionDB("25/01/2019", 250, "few"));

		}

		return transactionList;
	}
}
