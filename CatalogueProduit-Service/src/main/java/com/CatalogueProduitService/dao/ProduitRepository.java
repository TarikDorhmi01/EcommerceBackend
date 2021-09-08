package com.CatalogueProduitService.repository;

import com.CatalogueProduitService.beans.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
}
