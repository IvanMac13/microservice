package it.unicam.maceratesi.pizzeria.salams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unicam.maceratesi.pizzeria.salams.model.Tavolo;
import it.unicam.maceratesi.pizzeria.salams.model_query.TavoloL;
import it.unicam.maceratesi.pizzeria.salams.repository.TavoloRepository;

@Service
public class TavoloService {

	@Autowired
	private TavoloRepository tavolorepository;

	public List<Tavolo> getTavoli() {
		return tavolorepository.findAll();
	}

	public void addTavolo(Tavolo tavolo) {
		tavolorepository.save(tavolo);
	}

	public String deleteTavolo(int id_tavolo) {
		tavolorepository.deleteById(id_tavolo);
		return "tavolo rimosso" + id_tavolo;
	}

	public Tavolo getTavoloById(int id_tavolo) {
		return tavolorepository.findById(id_tavolo).orElse(null);
	}

	public void updateTavoli(int id_tavolo, Tavolo tavolo) {

		tavolorepository.save(tavolo);
	}

	// fai tornare solo i tavoli liberi
	public List<TavoloL> getTavoliLiberi(int x) {
		return tavolorepository.findTableFree(x);
	}

	// settare lo stato di un tavolo in occupato
	public void updateStatoTavoloOccupato(int id) {
		tavolorepository.setTableOccupato(id);
	}

	// settare lo stato di un tavolo in libero
	public void updateStatoTavoloLibero(int id) {
		tavolorepository.setTableLibero(id);
	}

	// settare lo stato di un tavolo in in pagamento
	public void updateStatoTavoloInpagamento(int id) {
		tavolorepository.setTableInpagamento(id);
	}

	// settare lo stato di un tavolo in prenotato
	public void updateStatoTavoloPrenotato(int id) {
		tavolorepository.setTablePrenotato(id);
	}

}
