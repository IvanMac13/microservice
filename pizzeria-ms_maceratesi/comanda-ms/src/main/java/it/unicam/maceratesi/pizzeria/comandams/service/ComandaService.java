package it.unicam.maceratesi.pizzeria.comandams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unicam.maceratesi.pizzeria.comandams.model.Comanda;
import it.unicam.maceratesi.pizzeria.comandams.model_query.DettaglioScontrino;
import it.unicam.maceratesi.pizzeria.comandams.repository.ComandaRepository;

@Service
public class ComandaService {
	
	@Autowired
	private ComandaRepository comandarepository;
	
	// aggiungi una nuova comanda
	public void addComanda(Comanda comanda) {
		comandarepository.save(comanda);
	}
	
	//ritorna tutte le comande presenti
	public List<Comanda> getComande(){
		return comandarepository.findAll();
	}
	
	//ritorna la comanda con id_comanda
	public Comanda getComandaById(int id_comanda) {
		return comandarepository.findById(id_comanda).orElse(null);
	}
	
	//cancella la comanda con id_comanda
	public void deleteComanda(int id_comanda) {
		comandarepository.deleteById(id_comanda);
	}
	
	//aggiorna la comanda con id_comanda
	public void updateComanda(int id_comanda,Comanda comanda) {
		comandarepository.save(comanda);
	}
	
	//crea il conto con i dettagli
	public List<DettaglioScontrino> getDettagliConto(int id_comanda){
		return comandarepository.preScontrino(id_comanda);
	}
	
	//crea totale del conto 
	public Double getTotale(int id_comanda) {
		return comandarepository.totaleConto(id_comanda);
	}
	
}
