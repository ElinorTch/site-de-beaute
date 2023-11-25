package com.sitebeaute.SiteBeaute.Service;

import com.sitebeaute.SiteBeaute.Model.Produit;
import com.sitebeaute.SiteBeaute.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;
    public List<Produit> getproduits() {
        return produitRepository.findAll();
    }

    public Produit getproduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    public void saveProduit(Produit produit) {
        produitRepository.save(produit);
    }

    public void addproduit(Produit produit) {
        produitRepository.save(produit);
    }

    public void updateproduit(Produit produit, Long id) {
        produitRepository.save(produit);
    }
}
