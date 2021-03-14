package it.unicam.maceratesi.pizzeria.comandams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unicam.maceratesi.pizzeria.comandams.model.Comanda;
import it.unicam.maceratesi.pizzeria.comandams.model_query.DettaglioScontrino;
import it.unicam.maceratesi.pizzeria.comandams.service.ComandaService;

@RestController
@RequestMapping("/comanda")
public class ComandaController {

	@Autowired
	ComandaService comandaservice = new ComandaService();

	@PostMapping
	public int addComanda(@RequestBody Comanda comanda) {
		comandaservice.addComanda(comanda);
		return comanda.getId_comanda();
	}

	@GetMapping
	public List<Comanda> getComande() {
		return comandaservice.getComande();
	}

	@GetMapping("/{id_comanda}")
	public Comanda getComandaById(@PathVariable int id_comanda) {
		return comandaservice.getComandaById(id_comanda);
	}

	@DeleteMapping("/{id_comanda}")
	public void deleteComanda(@PathVariable int id_comanda) {
		comandaservice.deleteComanda(id_comanda);
	}

	@PutMapping("/{id_comanda}")
	public void updateComanda(@PathVariable int id_comanda, @RequestBody Comanda comanda) {
		comandaservice.updateComanda(id_comanda, comanda);
	}
	
	@GetMapping("/scontrino/{id_comanda}")
	public List<DettaglioScontrino> getDettagliConto(@PathVariable int id_comanda){
		return comandaservice.getDettagliConto(id_comanda);
	}
	
	@GetMapping("/totale/{id_comanda}")
	public Double getTotale(@PathVariable int id_comanda) {
		return comandaservice.getTotale(id_comanda);
	}
	
}
