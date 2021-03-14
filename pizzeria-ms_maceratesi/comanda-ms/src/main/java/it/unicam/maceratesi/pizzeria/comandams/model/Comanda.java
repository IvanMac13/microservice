package it.unicam.maceratesi.pizzeria.comandams.model;


import java.time.LocalDateTime;
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
@Table(name = "comanda")
public class Comanda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_comanda")
	private int id_comanda;

	@Column(name = "tavolo_assegnato")
	private int tavolo_assegnato;

	@Column(name = "numero_coperti")
	private int numero_coperti;
	
	@Column(name = "data", columnDefinition = "TIMESTAMP")
	private LocalDateTime data;
	
	@OneToMany(targetEntity = Portata.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_FK", referencedColumnName = "id_comanda")
	@Column(name = "portata")
	private List<Portata> portate;

	public Comanda(int id_comanda, int tavolo_assegnato, int numero_coperti, LocalDateTime data, List<Portata> portate) {
		this.id_comanda = id_comanda;
		this.tavolo_assegnato = tavolo_assegnato;
		this.numero_coperti = numero_coperti;
		this.data = data;
		this.portate = portate;
	}
	
	public Comanda() {
	}

	public int getId_comanda() {
		return id_comanda;
	}

	public void setId_comanda(int id_comanda) {
		this.id_comanda = id_comanda;
	}

	public int getTavolo_assegnato() {
		return tavolo_assegnato;
	}

	public void setTavolo_assegnato(int tavolo_assegnato) {
		this.tavolo_assegnato = tavolo_assegnato;
	}

	public int getNumero_coperti() {
		return numero_coperti;
	}

	public void setNumero_coperti(int numero_coperti) {
		this.numero_coperti = numero_coperti;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public List<Portata> getPortate() {
		return portate;
	}

	public void setPortate(List<Portata> portate) {
		this.portate = portate;
	}
	
}