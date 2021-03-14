package it.unicam.maceratesi.pizzeria.salams.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unicam.maceratesi.pizzeria.salams.model.Sala;
import it.unicam.maceratesi.pizzeria.salams.repository.SalaRepository;

@Service
public class SalaService {

	@Autowired
	private SalaRepository salarepository;

	public void addSala(Sala sala) {
		salarepository.save(sala);
	}

	public List<Sala> getSale() {
		return salarepository.findAll();
	}

	public void deleteSala(int id) {
		salarepository.deleteById(id);
	}

	public void updateSala(int id_sala, Sala sala) {
		salarepository.save(sala);
	}

	public Sala getSalaById(int id) {
		return salarepository.findById(id).orElse(null);
	}


}
