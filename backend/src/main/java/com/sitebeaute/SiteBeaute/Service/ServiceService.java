package com.sitebeaute.SiteBeaute.Service;


import com.sitebeaute.SiteBeaute.Model.Services;
import com.sitebeaute.SiteBeaute.Repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;
    public List<Services> getservices() {

        List<Services> services=new ArrayList<>();
        serviceRepository.findAll().forEach(service -> {
            services.add(service);
        });
        return services;
    }

    public Services getservice(Long id) {
        return serviceRepository.findById(id).orElse(null);
    }

    public void addservice(Services service) {
        serviceRepository.save(service);
    }

    public void updateservice(Services service, Long id) {
        serviceRepository.save(service);
    }
}
