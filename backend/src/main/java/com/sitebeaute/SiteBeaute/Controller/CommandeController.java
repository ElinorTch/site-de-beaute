package com.sitebeaute.SiteBeaute.Controller;

import com.sitebeaute.SiteBeaute.Model.Commande;
import com.sitebeaute.SiteBeaute.Service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commande")
public class CommandeController {


    @Autowired
    private CommandeService commandeService;

    @GetMapping("/list")
    public List<Commande> getCommandes(){
        return commandeService.getCommandes();
    }

    @PostMapping("/add")
    public void saveCommande(@RequestBody Commande commande){
        commandeService.saveCommande(commande);

    }

    @DeleteMapping("/delete/{id}")
    public void  deleteCommande(@PathVariable Long id){
        commandeService.deleteCom(id);
    }

}
