package com.ecom.client.service.Impl;

import com.ecom.client.dao.ClientDao;
import com.ecom.client.entities.Client;
import com.ecom.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientDao clientDao;
    @Override
    public Client saveClient(Client client) {
         return clientDao.save(client);
    }

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public Client findClientById(Long id) {
        return clientDao.getOne(id);
    }

    @Override
    public void deleteClientById(Long id) {
        Client c= clientDao.getOne(id);
        clientDao.deleteById(c.getId());
    }

    @Override
    public Client updateClientById(Client client) {

        Client c=findClientById(client.getId());
        c.setAdresse(client.getAdresse());
        c.setEmail(client.getEmail());
        c.setNom(client.getNom());
        c.setPrenom(client.getPrenom());
        c.setTel(client.getTel());

        return clientDao.save(c);
    }

}
