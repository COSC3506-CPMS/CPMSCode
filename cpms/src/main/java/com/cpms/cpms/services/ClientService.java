package com.cpms.cpms.services;

import com.cpms.cpms.dao.ClientDAO;
import com.cpms.cpms.entities.Client;
import java.util.List;

public class ClientService {
    private ClientDAO clientDAO = new ClientDAO();
    //Save client to database
    public void addClient(Client client) {
        if (client.getClientName() != null && !client.getClientName().isEmpty()) {
            clientDAO.addClient(client); 
        }
    }

    //Retrieve a client by ID
    public Client getClient(int clientID) {
        return clientDAO.getClient(clientID); 
    }

    //Update an existing client
    public void updateClient(Client client) {
        clientDAO.updateClient(client); 
    }

    
    //Delete a client by ID
    public void deleteClient(int clientID) {
        clientDAO.deleteClient(clientID); 
    }

    //Retrieve all clients
    public List<Client> getAllClients() {
        return clientDAO.getAllClients(); 
    }
}