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

import it.unicam.maceratesi.pizzeria.menums.model.Bibita;
import it.unicam.maceratesi.pizzeria.menums.service.BibitaService;

@RestController
@RequestMapping("/bibita")
public class BibitaController {

	@Autowired
	BibitaService bibitaservice = new BibitaService();

	@PostMapping
	public void addBibita(@RequestBody Bibita bibita) {
		bibitaservice.addBibita(bibita);
	}

	@GetMapping("/{id}")
	public Bibita getBibitaById(@PathVariable int id) {
		return bibitaservice.getBibitaById(id);
	}

	@GetMapping
	public List<Bibita> getBibite() {
		return bibitaservice.getBibite();
	}

	@DeleteMapping("/{id}")
	public void deleteBibita(@PathVariable int id) {
		bibitaservice.deleteBibita(id);
	}

	@PutMapping("/{id}")
	public void updateBibita(@PathVariable int id,@RequestBody Bibita bibita) {
		bibitaservice.updateBibita(id, bibita);
	}

}
