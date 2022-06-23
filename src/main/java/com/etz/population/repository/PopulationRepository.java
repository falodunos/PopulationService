package com.etz.population.repository;

import com.etz.population.model.Population;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopulationRepository extends JpaRepository<Population, Long> {
}
