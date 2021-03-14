package it.unicam.maceratesi.pizzeria.comandams.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "portata")
public class Portata  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_portata")
	private int id_portata;
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "quantita")
	private int quantita;
	
	// id_ordine fa riferimento all'id del piatto o della bibita
	//viene copiato dal menu
	@Column(name = "id_ordine")
	private int id_ordine;
	
	//tipo indica se si tratta di una bibita o un piatto
	//viene copiato dal menu
	@Column(name = "tipo")
	@Enumerated
	private Tipo tipo;
	
	//viene copiato dal menu
	@Column(name = "nome_portata")
	private String nome_portata;
	
	//viene copiato dal menu
	@Column(name = "prezzo_unitario")
	private double prezzo_unitario;

	public Portata(int id_portata, String note, int quantita, int id_ordine, Tipo tipo, String nome_portata,
			double prezzo_unitario) {
		this.id_portata = id_portata;
		this.note = note;
		this.quantita = quantita;
		this.id_ordine = id_ordine;
		this.tipo = tipo;
		this.nome_portata = nome_portata;
		this.prezzo_unitario = prezzo_unitario;
	}
	
	public Portata() {
	}

	public int getId_portata() {
		return id_portata;
	}

	public void setId_portata(int id_portata) {
		this.id_portata = id_portata;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public int getId_ordine() {
		return id_ordine;
	}

	public void setId_ordine(int id_ordine) {
		this.id_ordine = id_ordine;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNome_portata() {
		return nome_portata;
	}

	public void setNome_portata(String nome_portata) {
		this.nome_portata = nome_portata;
	}

	public double getPrezzo_unitario() {
		return prezzo_unitario;
	}

	public void setPrezzo_unitario(double prezzo_unitario) {
		this.prezzo_unitario = prezzo_unitario;
	}

	
	
		
}
