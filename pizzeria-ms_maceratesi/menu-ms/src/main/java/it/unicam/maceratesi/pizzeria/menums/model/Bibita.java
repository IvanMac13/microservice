package it.unicam.maceratesi.pizzeria.menums.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bibita")
public class Bibita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bibita")
	private int id_bibita;
	
	@Column(name ="nome")
	private String nome;

	@Column(name = "isAlcolica")
	private String isAlcolica;
	
	@Column(name ="intolleranze")
	private String intolleranze;
	
	@Column(name ="descrizione")
	private String descrizione;
	
	@Column(name ="prezzo")
	private double prezzo;
	

	public Bibita() {

	}

	public Bibita(int id_bibita, String nome, String isAlcolica, String intolleranze, String descrizione,
			double prezzo) {
		this.id_bibita = id_bibita;
		this.nome = nome;
		this.isAlcolica = isAlcolica;
		this.intolleranze = intolleranze;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public int getId_bibita() {
		return id_bibita;
	}

	public void setId_bibita(int id_bibita) {
		this.id_bibita = id_bibita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsAlcolica() {
		return isAlcolica;
	}

	public void setIsAlcolica(String isAlcolica) {
		this.isAlcolica = isAlcolica;
	}

	public String getIntolleranze() {
		return intolleranze;
	}

	public void setIntolleranze(String intolleranze) {
		this.intolleranze = intolleranze;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

}