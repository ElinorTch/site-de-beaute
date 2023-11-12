package com.sitebeaute.SiteBeaute.Controller;

import com.sitebeaute.SiteBeaute.Model.Utilisateur;
import com.sitebeaute.SiteBeaute.Service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/list")
    public List<Utilisateur> getUtilisateurs(){
        return  utilisateurService.getutilisateurs();
    }

    @GetMapping("/list/{id}")
    public Utilisateur getUtilisateur(@PathVariable("id")Long id){
        return  utilisateurService.getutilisateur(id);
    }
    @PostMapping("/add")
    public void  add(@RequestBody Utilisateur utilisateur){
        utilisateurService.addUtilisateur(utilisateur);
    }

    @PutMapping("/update/{id}")
    public void  update(@RequestBody Utilisateur utilisateur, @PathVariable Long id){
        utilisateurService.updateUtilisateur(utilisateur,id);
    }

}
