package it.unicam.maceratesi.pizzeria.menums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unicam.maceratesi.pizzeria.menums.model.Piatto;
import it.unicam.maceratesi.pizzeria.menums.repository.PiattoRepository;

@Service
public class PiattoService {
	
	@Autowired
	private PiattoRepository piattorepository;
	
	//getAll
	public List<Piatto> getPiatti(){
		return piattorepository.findAll();
	}
	
	//add
	public void addPiatto(Piatto piatto) {
		piattorepository.save(piatto);
	}
	
	//getById
	public Piatto getPiattoById(int id){
		return piattorepository.findById(id).orElse(null);
	}
	
	//update
	public void updatePiatto(int id, Piatto piatto) {
		piattorepository.save(piatto);
	}
	
	//delete 
	public void deletePiatto(int id) {
		piattorepository.deleteById(id);
	}
}
