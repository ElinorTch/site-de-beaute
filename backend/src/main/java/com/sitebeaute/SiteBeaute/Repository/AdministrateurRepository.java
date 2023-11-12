package com.sitebeaute.SiteBeaute.Repository;

import com.sitebeaute.SiteBeaute.Model.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur,Long> {
}
