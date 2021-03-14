package it.unicam.maceratesi.pizzeria.salams.model;

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
@Table(name = "sala")
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_sala;
	
	@Column(name = "nome")
	private String nome;
	
	@OneToMany(targetEntity = Tavolo.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "st_FK" , referencedColumnName = "id_sala")
	private List<Tavolo> tavoli;
	

	public Sala() {	
	}
	
	public Sala(Integer id_sala, String nome, List<Tavolo> tavoli) {
		this.id_sala = id_sala;
		this.nome = nome;
		this.tavoli = tavoli;
	}


	public int getId_sala() {
		return id_sala;
	}
	public void setId_sala(int id_sala) {
		this.id_sala = id_sala;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Tavolo> getTavoli() {
		return this.tavoli;
	}

	public void setTavoli(List<Tavolo> tavoli) {
		this.tavoli = tavoli;
	}
	
	
}
	
	