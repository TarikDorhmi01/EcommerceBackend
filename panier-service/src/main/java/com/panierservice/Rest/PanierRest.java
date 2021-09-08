package com.panierservice.web;

import com.panierservice.beans.Panier;
import com.panierservice.service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PanierRest {
    @Autowired
    PanierService panierService;

    @PostMapping("/panier")
    public Panier save(@RequestBody Panier panier){
        return panierService.save(panier);
    }
    @GetMapping("/panier/{id}")
    public Optional<Panier> findById(int id){
        return panierService.findById(id);
    }
    @GetMapping("/paniers")
    public List<Panier> findAll(){
        return panierService.findAll();
    }
    @PutMapping("/panier")
    public Panier updatePanier(Panier panier){
        return panierService.updatePanier(panier);
    }
    @DeleteMapping("/panier")
    public void deletePanier(Panier panier){
        panierService.deletePanier(panier);
    }
}
