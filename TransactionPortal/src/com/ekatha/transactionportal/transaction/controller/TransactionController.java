package com.ekatha.transactionportal.transaction.controller;

import java.util.ArrayList;

import com.ekatha.transactionportal.transaction.entity.TransactionDB;
import com.ekatha.transactionportal.transaction.entity.TransactionRequest;

public class TransactionController {

	public void doGet(TransactionRequest req) {
		com.ekatha.transactionportal.transaction.service.TransactionService ts = new com.ekatha.transactionportal.transaction.service.TransactionService();
		int customerId = req.getCustomerId();
		ts.getTransaction(customerId);
		ArrayList<TransactionDB> transactionList = ts.getTransactionLists(customerId);
		for (TransactionDB i : transactionList) {
			System.out.println(i.date + " -- " + i.location + " -- " + i.amount);

		}

	}

}
