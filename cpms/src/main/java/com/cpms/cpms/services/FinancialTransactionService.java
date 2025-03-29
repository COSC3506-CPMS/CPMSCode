package com.cpms.cpms.services;

import com.cpms.cpms.dao.FinancialTransactionDAO;
import com.cpms.cpms.entities.FinancialTransaction;
import java.util.List;

public class FinancialTransactionService {
    private FinancialTransactionDAO transactionDAO = new FinancialTransactionDAO();

    //Save transaction to database
    public void addTransaction(FinancialTransaction transaction) {
        transactionDAO.addTransaction(transaction); 
    }

    //Retrieve a transaction by ID
    public FinancialTransaction getTransaction(int transactionID) {
        return transactionDAO.getTransaction(transactionID); 
    }

    //Update an existing transaction
    public void updateTransaction(FinancialTransaction transaction) {
        transactionDAO.updateTransaction(transaction); 
    }

    //Delete a transaction by ID
    public void deleteTransaction(int transactionID) {
        transactionDAO.deleteTransaction(transactionID); 
    }

    //Retrieve all transactions
    public List<FinancialTransaction> getAllTransactions() {
        return transactionDAO.getAllTransactions(); 
    }
}
