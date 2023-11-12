package com.sitebeaute.SiteBeaute.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nom;
    private  String description;
    @JsonIgnore
    @OneToMany(mappedBy = "categorie")
    private Set<Produit> produit=new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "categorie")
    private Set<Services> service = new HashSet<>();
}
