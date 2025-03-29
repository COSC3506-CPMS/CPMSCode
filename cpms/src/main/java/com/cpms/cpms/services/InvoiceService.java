package com.cpms.cpms.services;

import com.cpms.cpms.dao.InvoiceDAO;
import com.cpms.cpms.entities.Invoice;
import java.util.List;

public class InvoiceService {
    private InvoiceDAO invoiceDAO = new InvoiceDAO();

    //Save invoice to database
    public void addInvoice(Invoice invoice) {
        invoiceDAO.addInvoice(invoice); 
    }

    //Retrieve an invoice by ID
    public Invoice getInvoice(int invoiceID) {
        return invoiceDAO.getInvoice(invoiceID); 
    }

    
    //Update an existing invoice
    public void updateInvoice(Invoice invoice) {
        invoiceDAO.updateInvoice(invoice); 
    }

    //Delete an invoice by ID
    public void deleteInvoice(int invoiceID) {
        invoiceDAO.deleteInvoice(invoiceID); 
    }
    
    //Retrieve all invoices
    public List<Invoice> getAllInvoices() {
        return invoiceDAO.getAllInvoices(); 
    }
}