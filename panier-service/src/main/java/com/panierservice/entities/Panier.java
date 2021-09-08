package com.panierservice.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String commande;
    private int clientid;
    private int total;

    public Panier( String commande, int clientid, int total) {
        this.commande = commande;
        this.clientid = clientid;
        this.total = total;
    }

    public Panier() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommande() {
        return commande;
    }

    public void setCommande(String commande) {
        this.commande = commande;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
