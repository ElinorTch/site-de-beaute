package com.sitebeaute.SiteBeaute.Model;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private  String nom;
    private  Double prix;
    private  String description;
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categorie_id",referencedColumnName = "id")
    private Categorie categorie;


    @ManyToMany(mappedBy = "service")
    private Set<Commande> commande = new HashSet<>();

}
