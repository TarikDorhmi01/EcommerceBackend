package com.example.commande.service.Impl;

import com.example.commande.dao.CommandeDao;
import com.example.commande.dao.CommandeItemDao;
import com.example.commande.entities.Commande;
import com.example.commande.entities.CommandeItem;
import com.example.commande.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    public CommandeItemDao commandeItemDao;
    @Autowired
    public CommandeDao commandeDao;

    @Override
    public int createCommande(Commande cmd) {
        cmd.setDate(new Date());
        calculerTotal(cmd , cmd.getCommandeItems());
        saveCommandeItems(cmd , cmd.getCommandeItems());
        commandeDao.save(cmd);
        return 0;
    }

    @Override
    public List<Commande> findAll() {
        return commandeDao.findAll();
    }

    public int saveCommandeItems(Commande commande, List<CommandeItem> commandeItems) {
        if (commandeItems == null || commandeItems.isEmpty()) {
            return -1;
        } else {
            for (CommandeItem commandeItem : commandeItems) {
                    commandeItemDao.save(commandeItem);
            }
            return 1;
        }
    }
    private void calculerTotal(Commande commande, List<CommandeItem> commandeItems) {
        double total = 0;
        if (commandeItems != null || !commandeItems.isEmpty()) {
            for (CommandeItem commandeItem : commandeItems) {
                total = total + (commandeItem.getPrix() * commandeItem.getQte());
            }
        }
        commande.setMontant(total);
    }
}
