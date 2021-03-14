package it.unicam.maceratesi.pizzeria.menums.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "piatto")
public class Piatto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_piatto")
	private int id_piatto;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "prezzo")
	private double prezzo;
	
	@Column(name = "ingredienti")
	private String ingredienti;
	
	@Column(name = "tipo")
	@Enumerated
	private TipoPiatto tipo;
	
	@Column(name = "intolleranze")
	private String intolleranze;

	public Piatto() {

	}

	public Piatto(int id_piatto, String nome, double prezzo, String ingredienti, TipoPiatto tipo,
			String intolleranze) {
		this.id_piatto = id_piatto;
		this.nome = nome;
		this.prezzo = prezzo;
		this.ingredienti = ingredienti;
		this.tipo = tipo;
		this.intolleranze = intolleranze;
	}

	public int getId_piatto() {
		return id_piatto;
	}

	public void setId_piatto(int id_piatto) {
		this.id_piatto = id_piatto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}

	public TipoPiatto getTipo() {
		return tipo;
	}

	public void setTipo(TipoPiatto tipo) {
		this.tipo = tipo;
	}

	public String getIntolleranze() {
		return intolleranze;
	}

	public void setIntolleranze(String intolleranze) {
		this.intolleranze = intolleranze;
	}

}