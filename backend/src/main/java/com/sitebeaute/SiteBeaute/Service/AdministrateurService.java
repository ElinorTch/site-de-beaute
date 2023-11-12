package com.sitebeaute.SiteBeaute.Service;

import com.sitebeaute.SiteBeaute.Model.Administrateur;
import com.sitebeaute.SiteBeaute.Model.Services;
import com.sitebeaute.SiteBeaute.Repository.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdministrateurService {

    @Autowired
    private AdministrateurRepository administrateurRepository;

    public List<Administrateur> getadministrateurs() {
        List<Administrateur> administrateurs = new ArrayList<>();

        administrateurRepository.findAll().forEach(administrateur -> {
            administrateurs.add(administrateur);
        });
        return administrateurs;
    }

    public Administrateur getadministrateur(Long id) {
        return administrateurRepository.findById(id).orElse(null);
    }

    public void addadministrateur(Administrateur administrateur) {
        administrateurRepository.save(administrateur);
    }

    public void updateadministrateur(Administrateur administrateur, Long id) {
        administrateurRepository.save(administrateur);
    }
}
