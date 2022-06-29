package com.etz.population.service;

import com.etz.population.model.Population;
import com.etz.population.repository.PopulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PopulationService {

    @Autowired
    PopulationRepository populationRepository;

    public List<Population> fetchList() {

        return populationRepository.findAll();
    }

    public Population savePopulation(Population population) {

        try {
            populationRepository.save(population);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return population;
    }

    public Optional<Population> findById(Long id){


      Optional<Population> population = populationRepository.findById(id);

      if (population == null) {
          System.out.println("This ID does not exist");
      }
      return population;
    }
}
