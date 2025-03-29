package com.cpms.cpms.dao;

import com.cpms.cpms.entities.Invoice;
import com.cpms.cpms.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class InvoiceDAO {
	
	//add invoice
    public void addInvoice(Invoice invoice) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(invoice);
        tx.commit();
        session.close();
    }

    //to get invoice 
    public Invoice getInvoice(int invoiceID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Invoice invoice = session.get(Invoice.class, invoiceID);
        session.close();
        return invoice;
    }

    //to update invoice
    public void updateInvoice(Invoice invoice) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(invoice);
        tx.commit();
        session.close();
    }
    
    //to delete invoice
    public void deleteInvoice(int invoiceID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Invoice invoice = session.get(Invoice.class, invoiceID);
        if (invoice != null) {
            session.delete(invoice);
        }
        tx.commit();
        session.close();
    }

    //list for invoice 
    public List<Invoice> getAllInvoices() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Invoice> invoices = session.createQuery("from Invoice", Invoice.class).list();
        session.close();
        return invoices;
    }
}