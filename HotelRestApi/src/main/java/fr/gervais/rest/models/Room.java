package fr.gervais.rest.models;

import java.util.ArrayList;

public class Room {
	
	//Attributes - Id, Type, ReservationList.
	private int Id;
	private String Type;
	private ArrayList<Reservation> ReservationList;
	
	/**
	 * Constructor - Builds a Room Object.
	 * @param id [int] - The Id of the hotel room by which it should be designated. 
	 * @param type [String]	- The type of room the hotel room is. 
	 */
	public Room(int id, String type) {
		this.setId(id);
		this.setType(type);
		this.ReservationList = new ArrayList<Reservation>();
	}

	//Get'er and Set'er Methods.
	
	public int getId() {
		return Id;
	}

	private void setId(int id) {
		Id = id;
	}

	public String getType() {
		return Type;
	}

	private void setType(String type) {
		Type = type;
	}

	public ArrayList<Reservation> getReservationList() {
		return ReservationList;
	}
	
	//Custom Method.
	
}
