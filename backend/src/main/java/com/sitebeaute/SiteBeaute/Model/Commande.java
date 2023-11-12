package com.sitebeaute.SiteBeaute.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
     private  Long quantite;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    private Utilisateur utilisateur;

    @ManyToMany
    @JoinTable(
            name = "CommandeService",
            joinColumns = @JoinColumn(name = "commande_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "service_id",referencedColumnName = "id")
    )
    private Set<Services> service= new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "ProduitCommande",
            joinColumns = @JoinColumn(name = "commande_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id",referencedColumnName = "id")
    )
     private Set<Produit> produit=new HashSet<>();
}
