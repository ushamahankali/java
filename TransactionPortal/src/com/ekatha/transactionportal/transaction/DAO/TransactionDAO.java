package com.ekatha.transactionportal.transaction.DAO;

import java.util.ArrayList;

import com.ekatha.transactionportal.transaction.entity.TransactionDB;

public class TransactionDAO {

	public ArrayList<TransactionDB> getTransactionLists(int customerId) {

		TransactionDB tb = new TransactionDB();

		ArrayList<TransactionDB> transactionList = tb.getTransactionDetails(customerId);

		return transactionList;

	}
}
