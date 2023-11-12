package com.sitebeaute.SiteBeaute.Service;

import com.sitebeaute.SiteBeaute.Model.Categorie;
import com.sitebeaute.SiteBeaute.Repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;
    public List<Categorie> getCategories() {
        List<Categorie> categories=new ArrayList<>();
        categorieRepository.findAll().forEach(categorie -> {
            categories.add(categorie);
        });
        return categories;
    }

    public void addCategorie(Categorie categorie) {
        categorieRepository.save(categorie);
    }

    public void updateCat(Categorie categorie, Long id) {
        categorieRepository.save(categorie);
    }

    public void deleteCat(Long id) {
        categorieRepository.deleteById(id);
    }
}
