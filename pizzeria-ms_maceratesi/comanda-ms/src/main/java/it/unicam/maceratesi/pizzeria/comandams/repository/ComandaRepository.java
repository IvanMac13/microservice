package it.unicam.maceratesi.pizzeria.comandams.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.unicam.maceratesi.pizzeria.comandams.model.Comanda;
import it.unicam.maceratesi.pizzeria.comandams.model_query.DettaglioScontrino;

@Repository
public interface ComandaRepository extends JpaRepository<Comanda, Integer> {
	
	// trova nome_portata, prezzo_unitario, prezzo totale per portata
	@Query(value = "select nome_portata, prezzo_unitario,quantita, (prezzo_unitario * quantita) as prezzo_portata from portata where cp_fk=?1", nativeQuery = true)
	public List<DettaglioScontrino> preScontrino(int comanda);

	@Query(value = "select sum(prezzo_unitario * quantita) as totale from portata where cp_fk=?1", nativeQuery = true)
	public Double totaleConto(int comanda);
	
}
