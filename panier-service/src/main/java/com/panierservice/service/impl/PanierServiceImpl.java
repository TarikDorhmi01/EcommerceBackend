package com.panierservice.service.impl;

import com.panierservice.beans.Panier;
import com.panierservice.repository.PanierRepository;
import com.panierservice.service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PanierServiceImpl implements PanierService {

    @Autowired
    PanierRepository panierRepository;

    @Override
    public Panier save(Panier panier) {
        return panierRepository.save(panier);
    }

    @Override
    public Optional<Panier> findById(int id) {
        return panierRepository.findById(id);
    }

    @Override
    public List<Panier> findAll() {
        return panierRepository.findAll();
    }

    @Override
    public Panier updatePanier(Panier panier) {
        Panier p = findById(panier.getId()).get();
        p.setClientid(panier.getClientid());
        p.setCommande(panier.getCommande());
        p.setTotal(panier.getTotal());
        panierRepository.save(p);
        return p;
    }

    @Override
    public void deletePanier(Panier panier) {
        panierRepository.delete(panier);
    }
}
