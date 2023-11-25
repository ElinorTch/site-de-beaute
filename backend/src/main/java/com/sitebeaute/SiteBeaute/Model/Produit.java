package com.sitebeaute.SiteBeaute.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nom;
    private String description;
    private Double prix;

    private String sexe;
    private String image_name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categorie_id",referencedColumnName = "id")
    private  Categorie categorie;

    @JsonIgnore
    @ManyToMany(mappedBy = "produit")
    private Set<Commande> commande=new HashSet<>();
}
