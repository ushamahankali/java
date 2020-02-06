package com.ekatha.transactionportal.transaction.service;

import java.util.ArrayList;

import com.ekatha.transactionportal.transaction.DAO.TransactionDAO;
import com.ekatha.transactionportal.transaction.entity.TransactionDB;

public class TransactionService {
	TransactionDAO tDAO = new TransactionDAO();

	public void getTransaction(int customerId)

	{

		tDAO.getTransactionLists(customerId);

	}

	public ArrayList<TransactionDB> getTransactionLists(int customerId) {

		ArrayList<TransactionDB> transactionList = tDAO.getTransactionLists(customerId);
		return transactionList;

	}
}