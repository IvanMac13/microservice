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

import it.unicam.maceratesi.pizzeria.menums.model.Menu;
import it.unicam.maceratesi.pizzeria.menums.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	MenuService menuservice = new MenuService();

	
	@PostMapping
	public void addMenu(@RequestBody Menu menu) {
		menuservice.addMenu(menu);
	}

	@GetMapping("/{id}")
	public Menu getMenuById(@PathVariable int id) {
		return menuservice.getMenuById(id);
	}

	@GetMapping
	public List<Menu> getMenu() {
		return menuservice.getAllMenu();
	
	}

	@DeleteMapping("/{id}")
	public void deleteMenu(@PathVariable int id) {
		menuservice.deleteMenu(id);
	}

	@PutMapping("/{id}")
	public void updateMenu(@PathVariable int id,@RequestBody Menu menu) {
		menuservice.updateMenu(id, menu);
	}

}
