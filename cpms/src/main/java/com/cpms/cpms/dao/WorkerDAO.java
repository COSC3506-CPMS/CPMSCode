package com.cpms.cpms.dao;

import com.cpms.cpms.entities.Worker;
import com.cpms.cpms.config.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class WorkerDAO {
	
	//to add worker
    public void addWorker(Worker worker) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(worker);
        transaction.commit();
        session.close();
    }

    //to remove worker
    public Worker getWorker(int workerID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Worker worker = session.get(Worker.class, workerID);
        session.close();
        return worker;
    }

    //to update worker
    public void updateWorker(Worker worker) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(worker);
        transaction.commit();
        session.close();
    }
    
    //delete worker
    public void deleteWorker(int workerID) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Worker worker = session.get(Worker.class, workerID);
        if (worker != null) {
            session.delete(worker);
        }
        transaction.commit();
        session.close();
    }

    public List<Worker> getAllWorkers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Worker> workers = session.createQuery("from Worker", Worker.class).list();
        session.close();
        return workers;
    }
}