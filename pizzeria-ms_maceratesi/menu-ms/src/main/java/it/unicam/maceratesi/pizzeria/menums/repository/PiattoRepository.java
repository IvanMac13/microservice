package it.unicam.maceratesi.pizzeria.menums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.unicam.maceratesi.pizzeria.menums.model.Piatto;

@Repository
public interface PiattoRepository extends JpaRepository<Piatto, Integer>{

}
