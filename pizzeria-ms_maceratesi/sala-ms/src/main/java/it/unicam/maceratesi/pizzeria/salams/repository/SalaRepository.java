package it.unicam.maceratesi.pizzeria.salams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.unicam.maceratesi.pizzeria.salams.model.Sala;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Integer>{

}
