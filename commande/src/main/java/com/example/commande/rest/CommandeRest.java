package com.example.commande.rest;

import com.example.commande.entities.Commande;
import com.example.commande.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommandeRest {

    @Autowired
    CommandeService commandeService;

    @PostMapping("/commande/")
    public int saveCommande(@RequestBody Commande commande){
        return commandeService.createCommande(commande);
    }

    @GetMapping("/commande")
    public List<Commande> findAll(){
        return commandeService.findAll();
    }
}