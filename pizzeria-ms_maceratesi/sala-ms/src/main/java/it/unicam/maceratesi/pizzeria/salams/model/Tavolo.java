package it.unicam.maceratesi.pizzeria.salams.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tavolo")
public class Tavolo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tavolo;
	
	@Column(name = "capienza" )
	private int capienza;
	
	@Column(name = "stato_tavolo" )
	@Enumerated
	private StatoTavolo stato;
	
	
	public Tavolo() {
	}
	
	public Tavolo(int id_tavolo, int capienza, StatoTavolo stato) {
		this.id_tavolo = id_tavolo;
		this.capienza = capienza;
		this.stato = stato;
	}
	
	public int getId_tavolo() {
		return id_tavolo;
	}
	public void setId_tavolo(int id_tavolo) {
		this.id_tavolo = id_tavolo;
	} 
	public int getCapienza() {
		return this.capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	public StatoTavolo getStato() {
		return this.stato;
	}
	public void setStato(StatoTavolo stato) {
		this.stato = stato;
	}
	
}
