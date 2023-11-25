package com.sitebeaute.SiteBeaute.Service;

import com.sitebeaute.SiteBeaute.Model.Utilisateur;
import com.sitebeaute.SiteBeaute.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> getutilisateurs() {
         return utilisateurRepository.findAll();
    }

    public Utilisateur getutilisateur(Long id) {
       return utilisateurRepository.findById(id).orElse(null);
    }

    public void addUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }

    public void updateUtilisateur(Utilisateur utilisateur, Long id) {
        utilisateurRepository.save(utilisateur);

    }
}
