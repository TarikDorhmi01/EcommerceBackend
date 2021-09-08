package com.example.commande.dao;

import com.example.commande.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeDao extends JpaRepository<Commande, Long> {

}
