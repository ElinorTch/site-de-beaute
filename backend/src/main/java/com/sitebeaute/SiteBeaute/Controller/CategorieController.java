package com.sitebeaute.SiteBeaute.Controller;

import com.sitebeaute.SiteBeaute.Model.Categorie;
import com.sitebeaute.SiteBeaute.Service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @GetMapping("/list")
    public List<Categorie> getCategories(){
        return categorieService.getCategories();
    }
    @PostMapping("/add")
    public void addCat(@RequestBody Categorie categorie){
        categorieService.addCategorie(categorie);
    }

    @PutMapping("/update/{id}")
    public void updateCat(@RequestBody Categorie categorie, @PathVariable Long id){
        categorieService.updateCat(categorie,id);
    }
    @DeleteMapping("/delete/id")
    public void deleteCat(@PathVariable Long id){
        categorieService.deleteCat(id);

    }
}
