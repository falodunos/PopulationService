package com.etz.population.service;

import com.etz.population.exceptions.NotFoundException;
import com.etz.population.model.Population;
import com.etz.population.repository.PopulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
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

    public Population findById(Long id) {

        return populationRepository.findById(id).orElseThrow(() ->new NotFoundException("jj"));

//      Population response = population.orElseThrow(() -> new EntityNotFoundException("The id (" + id + ") is not found in the system"));
//        return Optional.ofNullable(response);
    }
}
