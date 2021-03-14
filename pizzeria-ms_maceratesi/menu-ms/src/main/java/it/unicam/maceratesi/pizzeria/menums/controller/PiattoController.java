package it.unicam.maceratesi.pizzeria.menums.controller;

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

import it.unicam.maceratesi.pizzeria.menums.model.Piatto;
import it.unicam.maceratesi.pizzeria.menums.service.PiattoService;

@RestController
@RequestMapping("/piatti")
public class PiattoController {

	@Autowired
	PiattoService piattoservice = new PiattoService();

	@GetMapping
	public List<Piatto> getPiatti() {
		return piattoservice.getPiatti();
	}

	@PostMapping
	public void addPiatto(@RequestBody Piatto piatto) {
		piattoservice.addPiatto(piatto);
	}
	
	@GetMapping("/{id}")
	public Piatto getPiattoById(@PathVariable int id) {
		return piattoservice.getPiattoById(id); 
	}
	
	@PutMapping("/{id}")
	public void updatePiatto(@PathVariable int id,@RequestBody Piatto piatto) {
		piattoservice.updatePiatto(id, piatto);
	}

	@DeleteMapping("/{id}")
	public void deletePiatto(@PathVariable int id) {
		piattoservice.deletePiatto(id);
	}
}
