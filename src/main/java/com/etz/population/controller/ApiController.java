package com.etz.population.controller;

import com.etz.population.model.Population;
import com.etz.population.service.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/population/v1/")
public class ApiController {

    @Autowired
    PopulationService populationService;

    @GetMapping(value = "list")
    public List<Population> fetchList() {
        return populationService.fetchList();
    }

    @PostMapping(value = "create")
    public Population createRecord() {
        Population population =  new Population();
        population.setCount(3400);
        population.setEmail("desiree@gmail.com");
        population.setNation("Nigeria");
        population.setOfficer("Emmanuel");

        return population;
    }

}
