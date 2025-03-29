package com.cpms.cpms.services;

import com.cpms.cpms.dao.WorkerDAO;
import com.cpms.cpms.entities.Worker;
import java.util.List;

public class WorkerService {
    private WorkerDAO workerDAO = new WorkerDAO(); // DAO for database operations

    //Save worker to database
    public void addWorker(Worker worker) {
        if (worker.getWorkerName() != null && !worker.getWorkerName().isEmpty()) {
            workerDAO.addWorker(worker); 
        }
    }
    
    //Retrieve a worker by ID
    public Worker getWorker(int workerID) {
        return workerDAO.getWorker(workerID); 
    }

    //Update an existing worker
    public void updateWorker(Worker worker) {
        workerDAO.updateWorker(worker); 
    }
    
    //Delete a worker by ID
    public void deleteWorker(int workerID) {
        workerDAO.deleteWorker(workerID); 
    }

    public List<Worker> getAllWorkers() {
    	//Retrieve all workers
        return workerDAO.getAllWorkers(); 
    }
}