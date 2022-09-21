package fr.gervais.rest.models;

import java.sql.Timestamp; //Use sql.Timestamp ==> (int year, int month, int date, int hour, int minute, int second, int nano).
import java.util.ArrayList;

public class Reservation {
	
	//Attributes - Id, DateStart, DateEnd, Rooms, Price.
	private int Id;
	private Timestamp DateStart;
	private Timestamp DateEnd;
	private ArrayList<Room> Rooms;
	
	/**
	 * Constructor - Builds a Reservation Object.
	 * @param id [int] - The id of the user that has booked the reservation.
	 * @param date_start [UTC - time] - The time at which the reservation starts.
	 * @param date_end [UTC - time] - The time at which the reservation ends.
	 * @param price [int] - The total price to pay for the reservation.
	 */
	public Reservation(int id, Timestamp date_start, Timestamp date_end) {
		this.setId(id);
		this.setDateStart(date_start);
		this.setDateEnd(date_end);
		this.Rooms = new ArrayList<Room>();
	}

	//Get'er and Set'er Methods.

	public int getId() {
		return Id;
	}


	private void setId(int id) {
		Id = id;
	}


	public Timestamp getDateStart() {
		return DateStart;
	}


	private void setDateStart(Timestamp dateStart) {
		DateStart = dateStart;
	}


	public Timestamp getDateEnd() {
		return DateEnd;
	}


	private void setDateEnd(Timestamp dateEnd) {
		DateEnd = dateEnd;
	}


	public ArrayList<Room> getRooms() {
		return Rooms;
	}
	
	//Custom Method.
	
}
