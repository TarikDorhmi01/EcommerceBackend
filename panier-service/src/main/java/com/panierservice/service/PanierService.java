package com.panierservice.service;

import com.panierservice.beans.Panier;

import java.util.List;
import java.util.Optional;

public interface PanierService {

    public Panier save(Panier panier);
    public Optional<Panier> findById(int id);
    public List<Panier> findAll();
    public Panier updatePanier(Panier panier);
    public void deletePanier(Panier panier);
}
