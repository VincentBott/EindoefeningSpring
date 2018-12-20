package eu.noelvaes.entities;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table (name="genres")
public class Genre {


	public Genre() {};


	@Id
	private long id;
	
	private String naam;

	
	public Genre(long id, String naam) {
		
		this.id = id;
		
		this.naam = naam;
	}


	@OneToMany(mappedBy = "genre")
	public List<Voorstelling> voorstellingen = new ArrayList<>();



	public List<Voorstelling> getVoorstellingen() {
		return voorstellingen;
	}


	public long getId() {
		return this.id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setNaam(String naam) {
		this.naam = naam;
	}


	public String getNaam() {
		return this.naam;
	}
}
