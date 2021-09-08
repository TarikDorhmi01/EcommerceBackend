package com.CatalogueProduitService.web;

import com.CatalogueProduitService.beans.Produit;
import com.CatalogueProduitService.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProduitRest {
    @Autowired
    ProduitService produitService;

    @PostMapping("/produit")
    public Produit save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @GetMapping("/produit/{id}")
    public Optional<Produit> findById(@PathVariable int id) {
        return produitService.findById(id);
    }

    @GetMapping("/produits")
    public List<Produit> findAll() {
        return produitService.findAll();
    }

    @PutMapping("/produit")
    public Produit updateComande(@RequestBody Produit produit) {
        return produitService.updateProduit(produit);
    }

    @DeleteMapping("/Produit")
    public void deleteComande(@RequestBody Produit produit) {
        produitService.deleteComande(produit);
    }
}
