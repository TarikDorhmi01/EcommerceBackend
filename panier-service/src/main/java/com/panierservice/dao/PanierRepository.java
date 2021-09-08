package com.panierservice.repository;

import com.panierservice.beans.Panier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanierRepository extends JpaRepository<Panier,Integer> {
}
