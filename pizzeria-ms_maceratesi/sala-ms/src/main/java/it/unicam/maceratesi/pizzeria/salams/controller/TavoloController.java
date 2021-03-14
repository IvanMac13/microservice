package it.unicam.maceratesi.pizzeria.salams.controller;


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

import it.unicam.maceratesi.pizzeria.salams.model.Tavolo;
import it.unicam.maceratesi.pizzeria.salams.model_query.TavoloL;
import it.unicam.maceratesi.pizzeria.salams.service.TavoloService;

@RestController
@RequestMapping("/tavolo")
public class TavoloController {
	
	@Autowired
	TavoloService tavoloservice = new TavoloService();
	
	@GetMapping
	public List<Tavolo> getTavoli() {
		return tavoloservice.getTavoli();
	}

	@PostMapping
	public void addTavolo(@RequestBody Tavolo tavolo) {
		tavoloservice.addTavolo(tavolo);
	}

	@DeleteMapping("/{tab}")
	public void deleteTavolo(@PathVariable("tab") int id_tavolo) {
		tavoloservice.deleteTavolo(id_tavolo);
	}

	@GetMapping("/{tab}")
	public Tavolo getTavoloById(@PathVariable("tab") int id_tavolo) {
		return tavoloservice.getTavoloById(id_tavolo);
	}

	@PutMapping("/{tab}")
	public void updateTavolo(@PathVariable("tab") int id_tavolo, @RequestBody Tavolo tavolo) {
		tavoloservice.updateTavoli(id_tavolo, tavolo);
	}
	
	@GetMapping("/free/{cap}")
	public List<TavoloL> getTavoliLiberi(@PathVariable("cap") int x) {
		return tavoloservice.getTavoliLiberi(x);
	}
	
	@PutMapping("/occupato/{id}")
	public void updateStatoTavoloOccupato(@PathVariable int id) {
		tavoloservice.updateStatoTavoloOccupato(id);
	}
	
	@PutMapping("/libero/{id}")
	public void updateStatoTavoloLibero(@PathVariable int id) {
		tavoloservice.updateStatoTavoloLibero(id);
	}
	
	@PutMapping("/inpgamento/{id}")
	public void updateStatoTavoloInpagamento(@PathVariable int id) {
		tavoloservice.updateStatoTavoloInpagamento(id);
	}
	
	@PutMapping("/prenotato/{id}")
	public void updateStatoTavoloPrenotato(@PathVariable int id) {
		tavoloservice.updateStatoTavoloPrenotato(id);
	}
}
