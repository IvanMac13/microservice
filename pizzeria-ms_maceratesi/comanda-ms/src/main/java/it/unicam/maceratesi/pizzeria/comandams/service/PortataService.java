package it.unicam.maceratesi.pizzeria.comandams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unicam.maceratesi.pizzeria.comandams.model.Portata;
import it.unicam.maceratesi.pizzeria.comandams.repository.PortataRepository;

@Service
public class PortataService {
	
	@Autowired
	private PortataRepository portatarepository;
	
	// aggiungi una nuova portata 
	public void addPortata(Portata portata) {
		portatarepository.save(portata);
	}
	
	//ritorna tutte le portate presenti
	public List<Portata> getPortate(){
		return portatarepository.findAll();
	}
	
	//ritorna la portata con id_portata
	public Portata getPortataById(int id_portata) {
		return portatarepository.findById(id_portata).orElse(null);
	}
	
	//cancella la portata con id_portata
	public void deletePortata(int id_portata) {
		portatarepository.deleteById(id_portata);
	}
	
	//aggiorna la porta con id_comanda
	public void updatePortata(int id_portata,Portata portata) {
		portatarepository.save(portata);
	}
	
	// aggiungi una nuova portata associata ad una comanda
	public void addPortataToComanda(Portata portata, int id_comanda) {
		portatarepository.save(portata);
		portatarepository.addPortataByIdComanda(id_comanda, portata.getId_portata());
	}
	
	// ritorna tutte le portate di una singola comanda
	public List<Portata> getPortateToComanda(int id_comanda){
		return portatarepository.findPortateByIdComanda(id_comanda);
	}
}
