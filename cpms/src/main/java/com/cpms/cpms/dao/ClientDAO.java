package com.cpms.cpms.dao;

import com.cpms.cpms.entities.Client;
import com.cpms.cpms.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ClientDAO {
	
	//to add client 
    public void addClient(Client client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.close();
    }

    //to get client
    public Client getClient(int clientID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Client client = session.get(Client.class, clientID);
        session.close();
        return client;
    }

    //to update client
    public void updateClient(Client client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(client);
        transaction.commit();
        session.close();
    }
    
    //to delete client
    public void deleteClient(int clientID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Client client = session.get(Client.class, clientID);
        if (client != null) {
            session.delete(client);
        }
        transaction.commit();
        session.close();
    }
    //list for client
    public List<Client> getAllClients() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Client> clients = session.createQuery("from Client", Client.class).list();
        session.close();
        return clients;
    }
}