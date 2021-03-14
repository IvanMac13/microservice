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

import it.unicam.maceratesi.pizzeria.salams.model.Sala;
import it.unicam.maceratesi.pizzeria.salams.service.SalaService;

@RestController
@RequestMapping("/sala")
public class SalaController {

	@Autowired
	SalaService salaservice = new SalaService();
	

	@GetMapping
	public List<Sala> getSale() {
		return salaservice.getSale();
	}

	@PostMapping
	public void addSala(@RequestBody Sala sala) {
		salaservice.addSala(sala);
	}
	
	@DeleteMapping("/{id}")
	public void deleteSala(@PathVariable int id) {
		salaservice.deleteSala(id);
	}
	
	@PutMapping("/{tab}")
	public void updateSala(@PathVariable("tab") int id_sala, @RequestBody Sala sala) {
		salaservice.updateSala(id_sala, sala);
	}
	
	@GetMapping("/{id}")
	public Sala getSalaById(@PathVariable int id) {
		return salaservice.getSalaById(id);
	}

}
