package com.etz.population.service;

import com.etz.population.model.Population;
import com.etz.population.repository.PopulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopulationService {

    @Autowired
    PopulationRepository populationRepository;

    public List<Population> fetchList() {

        return populationRepository.findAll();
    }
}
