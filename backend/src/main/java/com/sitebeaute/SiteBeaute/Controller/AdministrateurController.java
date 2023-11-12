package com.sitebeaute.SiteBeaute.Controller;

import com.sitebeaute.SiteBeaute.Model.Administrateur;

import com.sitebeaute.SiteBeaute.Service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("administrateur")
public class AdministrateurController {
    
    @Autowired
   private AdministrateurService administrateurService;

    @GetMapping("/list")
    public List<Administrateur> getadministrateurs(){
        return  administrateurService.getadministrateurs();
    }

    @GetMapping("/list/{id}")
    public Administrateur getadministrateur(@PathVariable("id")Long id){
        return  administrateurService.getadministrateur(id);
    }
    @PostMapping("/add")
    public void  add(@RequestBody Administrateur administrateur){
        administrateurService.addadministrateur(administrateur);
    }

    @PutMapping("/update/{id}")
    public void  update(@RequestBody Administrateur administrateur, @PathVariable Long id){
        administrateurService.updateadministrateur(administrateur,id);
    }


}