package com.sitebeaute.SiteBeaute.Repository;

import com.sitebeaute.SiteBeaute.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}
