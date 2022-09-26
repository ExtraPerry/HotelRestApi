package fr.gervais.rest.app.models;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Room {

	//Attributes.
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
			)
	private final UUID id = null;
	
	private String type;
	private int size;
	private int price;
	
	@JsonIgnore
    @ManyToMany(mappedBy = "roomReservations")
    private Set<Reservation> reservations = new HashSet<>();

	//Constructors.
	
	public Room() {
		
	}
	
	public Room(String type, int size, int price) {
		super();
		this.type = type;
		this.size = size;
		this.price = price;
	}

	//Get'er & Set'er Methods.
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UUID getId() {
		return this.id;
	}

	public int getSize() {
		return this.size;
	}

	public int getPrice() {
		return this.price;
	}
	
	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//Custom Methods.
	
}
