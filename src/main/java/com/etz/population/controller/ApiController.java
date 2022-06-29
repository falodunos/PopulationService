package com.etz.population.controller;

import com.etz.population.model.Population;
import com.etz.population.service.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Population createRecord(@RequestBody Population population) {

      Population response =  populationService.savePopulation(population);


        return response;
    }
    @GetMapping(value = "list/{id}")
    public Optional<Population> fetchById(@PathVariable Long id){
       Optional<Population> population = populationService.findById(id);

       return population;
    }

}
