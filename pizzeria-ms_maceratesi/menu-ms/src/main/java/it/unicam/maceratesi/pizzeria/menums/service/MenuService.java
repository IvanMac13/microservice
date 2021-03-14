package it.unicam.maceratesi.pizzeria.menums.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unicam.maceratesi.pizzeria.menums.model.Menu;
import it.unicam.maceratesi.pizzeria.menums.repository.MenuRepository;

@Service
public class MenuService {

	
	@Autowired
	private MenuRepository menurepository;
	
	//getAll
	public List<Menu> getAllMenu(){
		return menurepository.findAll();
	}
	
	//add
	public void addMenu(Menu menu) {
		menurepository.save(menu);
	}
	
	//getById
	public Menu getMenuById(int id){
		return menurepository.findById(id).orElse(null);
	}
	
	//update
	public void updateMenu(int id, Menu menu) {
		menurepository.save(menu);
	}
	
	//delete 
	public void deleteMenu(int id) {
		menurepository.deleteById(id);
	}
}
