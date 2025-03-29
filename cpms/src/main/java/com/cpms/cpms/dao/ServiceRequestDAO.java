package com.cpms.cpms.dao;

import com.cpms.cpms.entities.ServiceRequest;
import com.cpms.cpms.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class ServiceRequestDAO {
	
	//to add request
    public void addRequest(ServiceRequest serviceRequest) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(serviceRequest);
        tx.commit();
        session.close();
    }

    //to get request
    public ServiceRequest getRequest(int requestID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ServiceRequest request = session.get(ServiceRequest.class, requestID);
        session.close();
        return request;
    }

    //to update request
    public void updateRequest(ServiceRequest serviceRequest) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(serviceRequest);
        tx.commit();
        session.close();
    }

    //to delete request
    public void deleteRequest(int requestID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        ServiceRequest request = session.get(ServiceRequest.class, requestID);
        if (request != null) {
            session.delete(request);
        }
        tx.commit();
        session.close();
    }

    //list for service request
    public List<ServiceRequest> getAllRequests() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<ServiceRequest> requests = session.createQuery("from ServiceRequest", ServiceRequest.class).list();
        session.close();
        return requests;
    }
}