package com.sitebeaute.SiteBeaute.Controller;

import com.sitebeaute.SiteBeaute.Model.Services;
import com.sitebeaute.SiteBeaute.Service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/service")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping("/list")
    public List<Services> getservices() {
        return serviceService.getservices();
    }

    @GetMapping("/list/{id}")
    public Services getservice(
            @PathVariable("id") Long id
    ) {
        return serviceService.getservice(id);
    }

    @PostMapping("/add")
    public void add(
            @RequestBody Services service
    ) {
        serviceService.addservice(service);
    }

    @PutMapping("/update/{id}")
    public void update(
            @RequestBody Services service,
            @PathVariable("id") Long id
    ) {
        serviceService.updateservice(service, id);
    }

}
