package com.ecom.client.rest;
import com.ecom.client.entities.Client;
import com.ecom.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientRest {

    @Autowired
    ClientService clientService;

    @PostMapping("/client")
    public Client saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @GetMapping("/client")
    public List<Client> findAll(){
        return clientService.findAll();
    }

    @GetMapping("/client/{id}")
    public Client findClient(@PathVariable Long id) {
        return clientService.findClientById(id);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClientById(id);
    }
    @PutMapping("/clients/{id}")
    public Client updateClient(@RequestBody Client client){
        return clientService.updateClientById(client);
    }
}
