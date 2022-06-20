package com.etz.population.controller;

import com.etz.population.service.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/population/v1/")
public class ApiController {

    @Autowired
    PopulationService populationService;

    @GetMapping(value = "list")
    public String fetchList() {

//        return "Desiree";
//        PopulationService ps = new PopulationService();
        return populationService.fetchList();
    }


}
