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

import it.unicam.maceratesi.pizzeria.comandams.model.Portata;
import it.unicam.maceratesi.pizzeria.comandams.service.PortataService;

@RestController
@RequestMapping("/portata")
public class PortataController {

	@Autowired
	PortataService portataservice = new PortataService();

	@PostMapping
	public void addPortata(@RequestBody Portata portata) {
		portataservice.addPortata(portata);
	}

	@GetMapping
	public List<Portata> getPortate() {
		return portataservice.getPortate();
	}

	@GetMapping("/{id_portata}")
	public Portata getPortataById(@PathVariable int id_portata) {
		return portataservice.getPortataById(id_portata);	
		}

	@DeleteMapping("/{id_portata}")
	public void deletePortata(@PathVariable int id_portata) {
		portataservice.deletePortata(id_portata);
	}

	@PutMapping("/{id_portata}")
	public void updatePortata(@PathVariable int id_portata, @RequestBody Portata portata) {
		portataservice.updatePortata(id_portata, portata);
	}
	
	@PostMapping("/add/{id_comanda}")
	public void addPortataToComanda(@RequestBody Portata portata, @PathVariable int id_comanda)
	{
		portataservice.addPortataToComanda(portata, id_comanda);
	}
	
	@GetMapping("portatebycomanda/{id_comanda}")
	public List<Portata> getPortateToComanda(@PathVariable int id_comanda)
	{
		return portataservice.getPortateToComanda(id_comanda);
	}
}
