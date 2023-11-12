package com.sitebeaute.SiteBeaute.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nom;
    private  String Prenom;
    private  String adresseMail;
    private  Long telephone;
    private  String motPasse;
    @JsonIgnore
    @OneToMany(mappedBy = "utilisateur")
    private Set<Commande> commande=new HashSet<>();


}
