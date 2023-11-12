package com.sitebeaute.SiteBeaute.Repository;

import com.sitebeaute.SiteBeaute.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
