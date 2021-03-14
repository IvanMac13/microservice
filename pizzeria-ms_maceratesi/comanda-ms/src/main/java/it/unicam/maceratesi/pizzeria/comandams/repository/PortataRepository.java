package it.unicam.maceratesi.pizzeria.comandams.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.unicam.maceratesi.pizzeria.comandams.model.Portata;

@Repository
public interface PortataRepository extends JpaRepository<Portata, Integer> {

	// aggiungi una portata ad una specifica comanda
	@Modifying
	@Transactional
	@Query(value = "update portata set cp_fk = ?1 where id_portata = ?2 ", nativeQuery = true)
	public void addPortataByIdComanda(int id_comanda, int id_portata);

	// trova tutte le portate di una singola comanda
	@Query(value = "select * from portata where cp_fk= ?1 ", nativeQuery = true)
	public List<Portata> findPortateByIdComanda(int id_comanda);
	
}
