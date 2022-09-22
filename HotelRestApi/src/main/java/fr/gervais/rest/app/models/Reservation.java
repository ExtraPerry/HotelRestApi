package fr.gervais.rest.app.models;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

		public void setStart(Timestamp start) {
			this.start = start;
		}

		public void setTermination(Timestamp termination) {
			this.termination = termination;
		}

				
		//Custom Methods.
		
}
