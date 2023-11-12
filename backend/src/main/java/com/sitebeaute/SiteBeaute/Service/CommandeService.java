package com.sitebeaute.SiteBeaute.Service;

import com.sitebeaute.SiteBeaute.Model.Commande;
import com.sitebeaute.SiteBeaute.Repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;
    public List<Commande> getCommandes() {
        List<Commande> commandes = new ArrayList<>();
        commandeRepository.findAll().forEach(commande -> {
            commandes.add(commande);
        });
        return commandes;
    }

    public void saveCommande(Commande commande) {
        commandeRepository.save(commande);
    }

    public void deleteCom(Long id) {
        commandeRepository.deleteById(id);
    }
}
