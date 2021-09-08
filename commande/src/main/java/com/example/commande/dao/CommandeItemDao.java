package com.example.commande.dao;


import com.example.commande.entities.CommandeItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeItemDao extends JpaRepository<CommandeItem, Long> {

}
