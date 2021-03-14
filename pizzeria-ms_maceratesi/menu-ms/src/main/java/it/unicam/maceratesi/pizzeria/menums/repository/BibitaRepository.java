package it.unicam.maceratesi.pizzeria.menums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.unicam.maceratesi.pizzeria.menums.model.Bibita;

@Repository
public interface BibitaRepository extends JpaRepository<Bibita, Integer> {

}
