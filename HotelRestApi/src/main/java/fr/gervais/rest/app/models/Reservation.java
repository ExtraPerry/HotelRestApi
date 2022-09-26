package fr.gervais.rest.app.models;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Reservation {

	//Attributes.
		@Id
		@GeneratedValue(generator = "UUID")
		@GenericGenerator(
				name = "UUID",
				strategy = "org.hibernate.id.UUIDGenerator"
				)
		private final UUID id = null;
		
		private Timestamp start;
		private Timestamp termination;
		
		@ManyToMany
		@JoinTable(
				name = "RoomReservation",
				joinColumns = @JoinColumn(name = "reservation_id"),
				inverseJoinColumns = @JoinColumn(name = "room_id")
		)
		Set<Room> roomReservations = new HashSet<>();
		
		@ManyToMany
		@JoinTable(
				name = "ProfileReservation",
				joinColumns = @JoinColumn(name = "reservation_id"),
				inverseJoinColumns = @JoinColumn(name = "profile_id")
		)
		Set<Profile> profileReservations = new HashSet<>();
		
		//Constructors.
		
		public Reservation() {
			
		}
		
		public Reservation(Timestamp start, Timestamp termination) {
			super();
			this.start = start;
			this.termination = termination;
		}

		//Get'er & Set'er Methods.
		
		public UUID getId() {
			return this.id;
		}

		public Timestamp getStart() {
			return this.start;
		}

		public Timestamp getTermination() {
			return this.termination;
		}
		
		public Set<Room> getRoomReservation(){
			return roomReservations;
		}
		
		public Set<Profile> getProfileReservation(){
			return profileReservations;
		}

		public void setStart(Timestamp start) {
			this.start = start;
		}

		public void setTermination(Timestamp termination) {
			this.termination = termination;
		}

				
		//Custom Methods.
		
}
