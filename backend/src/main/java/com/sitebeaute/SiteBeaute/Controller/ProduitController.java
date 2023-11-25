package com.sitebeaute.SiteBeaute.Controller;

import com.sitebeaute.SiteBeaute.Model.Produit;
import com.sitebeaute.SiteBeaute.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("api/produit")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping("/list")
    public List<Produit> getproduits(){
        return  produitService.getproduits();
    }

    @GetMapping("/list/{id}")
    public Produit getproduit(
            @PathVariable("id") Long id
    ){
        return  produitService.getproduit(id);
    }

    @PostMapping("/add")
    public void add(
            @RequestBody Produit produit
    ){
        produitService.addproduit(produit);
    }

    @PutMapping("/update/{id}")
    public void update(
            @RequestBody Produit produit,
            @PathVariable("id") Long id
    ) {
        produitService.updateproduit(produit,id);
    }

}
