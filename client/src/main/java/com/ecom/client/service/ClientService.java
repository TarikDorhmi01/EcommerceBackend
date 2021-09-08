package com.ecom.client.service;
import com.ecom.client.entities.Client;
import java.util.List;

public interface ClientService {
    public Client saveClient(Client client);
    public List<Client> findAll();
    public Client findClientById(Long id);
    public void deleteClientById(Long id);
    public Client updateClientById(Client client);

}
