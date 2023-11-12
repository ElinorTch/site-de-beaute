package com.sitebeaute.SiteBeaute.Repository;

import com.sitebeaute.SiteBeaute.Model.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Services,Long> {
}
