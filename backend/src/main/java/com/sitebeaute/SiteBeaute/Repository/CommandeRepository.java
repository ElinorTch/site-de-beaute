package com.sitebeaute.SiteBeaute.Repository;

import com.sitebeaute.SiteBeaute.Model.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends JpaRepository<Commande,Long> {



}
