package it.unicam.maceratesi.pizzeria.menums.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_menu")
	private int id_menu;

	@Column(name = "nome")
	private String nome;

	@OneToMany(targetEntity = Piatto.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "mp_FK", referencedColumnName = "id_menu")
	@Column(name = "piatti")
	private List<Piatto> piatti;

	@OneToMany(targetEntity = Bibita.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "mb_FK", referencedColumnName = "id_menu")
	@Column(name = "bibite")
	private List<Bibita> bibite;

	public Menu() {
	}

	public Menu(int id_menu, List<Piatto> piatti, List<Bibita> bibite) {
		this.id_menu = id_menu;
		this.piatti = piatti;
		this.bibite = bibite;
	}

	public int getId_menu() {
		return id_menu;
	}

	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}

	public List<Piatto> getPiatti() {
		return piatti;
	}

	public void setPiatti(ArrayList<Piatto> piatti) {
		this.piatti = piatti;
	}

	public List<Bibita> getBibite() {
		return bibite;
	}

	public void setBibite(List<Bibita> bibite) {
		this.bibite = bibite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}