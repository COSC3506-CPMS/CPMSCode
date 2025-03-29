package com.cpms.cpms.services;

import com.cpms.cpms.dao.ServiceRequestDAO;
import com.cpms.cpms.entities.ServiceRequest;
import java.util.List;

public class ServiceRequestService {
    private ServiceRequestDAO requestDAO = new ServiceRequestDAO();

    //Save service request to database
    public void addRequest(ServiceRequest request) {
        requestDAO.addRequest(request); 
    }

    //Retrieve a service request by ID
    public ServiceRequest getRequest(int requestID) {
        return requestDAO.getRequest(requestID); 
    }

    //Update an existing service request
    public void updateRequest(ServiceRequest request) {
        requestDAO.updateRequest(request); 
    }
    
    //Delete a service request by ID
    public void deleteRequest(int requestID) {
        requestDAO.deleteRequest(requestID); 
    }

    public List<ServiceRequest> getAllRequests() {
        return requestDAO.getAllRequests(); //Retrieve all service requests
    }
}
