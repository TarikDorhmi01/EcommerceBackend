package com.example.commande.service;

import com.example.commande.entities.Commande;

import java.util.List;

public interface CommandeService {
    public int createCommande(Commande cmd);
    public List<Commande> findAll();

}
