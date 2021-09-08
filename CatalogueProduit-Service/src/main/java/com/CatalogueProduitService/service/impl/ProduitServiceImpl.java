package com.CatalogueProduitService.service.impl;

import com.CatalogueProduitService.beans.Produit;
import com.CatalogueProduitService.repository.ProduitRepository;
import com.CatalogueProduitService.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    ProduitRepository produitRepository;
    @Override
    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Optional<Produit> findById(int id) {
        return produitRepository.findById(id);
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public Produit updateProduit(Produit produit) {
        Produit p=findById(produit.getId()).get();
        p.setPrix(produit.getPrix());
        p.setQuantite(produit.getQuantite());
        p.setReference(produit.getReference());
        produitRepository.save(p);
        return p;
    }

    @Override
    public void deleteComande(Produit produit) {
        produitRepository.delete(produit);
    }
}
