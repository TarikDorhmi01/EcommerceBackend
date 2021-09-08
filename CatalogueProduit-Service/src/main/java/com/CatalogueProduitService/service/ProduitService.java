package com.CatalogueProduitService.service;

import com.CatalogueProduitService.beans.Produit;

import java.util.List;
import java.util.Optional;

public interface ProduitService {

    public Produit save(Produit produit);
    public Optional<Produit> findById(int id);
    public List<Produit> findAll();
    public Produit updateProduit(Produit produit);
    public void deleteComande(Produit produit);
}
