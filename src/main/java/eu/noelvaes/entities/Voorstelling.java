package eu.noelvaes.entities;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;


@Entity
@Table (name="voorstellingen")
public class Voorstelling {


	public Voorstelling() {};



	@Id
	private long id;

	private Date datum;

	private String titel;

	private String uitvoerders;

	@ManyToOne
	@JoinColumn(name="genreId")
	private Genre genre;
	
	private double prijs;
	
	private int vrijePlaatsen;


	public Voorstelling(long id, Date datum, String titel, String uitvoerders,
			long genreId, double prijs, int vrijePlaatsen) {


		this.id = id;

		this.datum = datum;
		this.titel = titel;

		this.uitvoerders = uitvoerders;

		// this.genreId = genreId;

		this.prijs = prijs;
		this.vrijePlaatsen = vrijePlaatsen;
	}


	public Date getDatum() {
		return datum;
	}


	public String getUitvoerders() {
		return uitvoerders;
	}

	/*
	public long getGenreId() {
		return genreId;
	}
	*/

	public int getVrijePlaatsen() {
		return vrijePlaatsen;
	}


	public String getTitel() {
		return this.titel;
	}


	public double getPrijs() {
		return prijs;
	}
	
	
	public Long getId() {
		
		return this.id;
	}


	@Override
	public String toString() {

		return String.format("%d %s %s %s %.2f %d%n%n", this.id, this.datum.toString(), this.titel, this.uitvoerders, this.prijs, this.vrijePlaatsen);

	}
}
