package it.unicam.maceratesi.pizzeria.menums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.unicam.maceratesi.pizzeria.menums.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer>{

}
