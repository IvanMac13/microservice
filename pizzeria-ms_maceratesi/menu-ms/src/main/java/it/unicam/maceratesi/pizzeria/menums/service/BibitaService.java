package it.unicam.maceratesi.pizzeria.menums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unicam.maceratesi.pizzeria.menums.model.Bibita;
import it.unicam.maceratesi.pizzeria.menums.repository.BibitaRepository;

@Service
public class BibitaService {

	@Autowired
	private BibitaRepository bibitarepository;
	
	//add
	public void addBibita(Bibita bibita) {
		bibitarepository.save(bibita);
	}
	//getById
	public Bibita getBibitaById(int id) {
		return bibitarepository.findById(id).orElse(null);
	}
	//getAll
	public List<Bibita> getBibite(){
		return bibitarepository.findAll();
	}
	//deleteById
	public void deleteBibita(int id) {
		bibitarepository.deleteById(id);
	}
	//update
	public void updateBibita(int id, Bibita bibita) {
		bibitarepository.save(bibita);
	}
}
