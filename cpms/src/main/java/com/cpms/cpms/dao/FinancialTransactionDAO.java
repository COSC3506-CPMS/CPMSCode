package com.cpms.cpms.dao;

import com.cpms.cpms.entities.FinancialTransaction;
import com.cpms.cpms.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class FinancialTransactionDAO {
	
	//to add transaction
    public void addTransaction(FinancialTransaction transaction) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(transaction);
        tx.commit();
        session.close();
    }

    //to get transaction
    public FinancialTransaction getTransaction(int transactionID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        FinancialTransaction transaction = session.get(FinancialTransaction.class, transactionID);
        session.close();
        return transaction;
    }

    //to update transaction
    public void updateTransaction(FinancialTransaction transaction) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(transaction);
        tx.commit();
        session.close();
    }

    //to delete transaction
    public void deleteTransaction(int transactionID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        FinancialTransaction transaction = session.get(FinancialTransaction.class, transactionID);
        if (transaction != null) {
            session.delete(transaction);
        }
        tx.commit();
        session.close();
    }

    //list for financial transaction
    public List<FinancialTransaction> getAllTransactions() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<FinancialTransaction> transactions = session.createQuery("from FinancialTransaction", FinancialTransaction.class).list();
        session.close();
        return transactions;
    }
}