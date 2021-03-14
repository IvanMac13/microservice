package it.unicam.maceratesi.pizzeria.salams.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.unicam.maceratesi.pizzeria.salams.model.Tavolo;
import it.unicam.maceratesi.pizzeria.salams.model_query.TavoloL;

@Repository
public interface TavoloRepository extends JpaRepository<Tavolo, Integer>{

	// trova tavolo liberi con capienza x
	@Query(value = "select s.nome,t.id_tavolo, t.capienza from sala s, tavolo t where s.id_sala=t.st_fk and t.capienza >= ?1 and stato_tavolo=1", nativeQuery = true)
	public List<TavoloL> findTableFree(int x);

	// settare un tavolo come "occupato" attraverso l'id del tavolo
	@Modifying
	@Transactional
	@Query(value = "update tavolo set stato_tavolo = 0 where id_tavolo = ?1 ", nativeQuery = true)
	public void setTableOccupato(int id);

	// settare un tavolo come "libero" attraverso l'id del tavolo
	@Modifying
	@Transactional
	@Query(value = "update tavolo set stato_tavolo = 1 where id_tavolo = ?1 ", nativeQuery = true)
	public void setTableLibero(int id);
	
	// settare un tavolo come "in pagamento" attraverso l'id del tavolo
	@Modifying
	@Transactional
	@Query(value = "update tavolo set stato_tavolo = 2 where id_tavolo = ?1 ", nativeQuery = true)
	public void setTableInpagamento(int id);
		
	// settare un tavolo come "prenotato" attraverso l'id del tavolo
	@Modifying
	@Transactional
	@Query(value = "update tavolo set stato_tavolo = 3 where id_tavolo = ?1 ", nativeQuery = true)
	public void setTablePrenotato(int id);
}
