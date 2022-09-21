package fr.gervais.rest.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {
	
	//Attributes - RoomTypes, Rooms, Users.
	private HashMap<String, RoomInfo> RoomTypes;
	private ArrayList<Room> Rooms;
	private ArrayList<User> Users;
	
	/**
	 * Constructor - Builds a Hotel Object.
	 * No parameters.
	 */
	public Hotel() {
		this.RoomTypes = new HashMap<String, RoomInfo>();
		this.initRoomTypes();
		this.Rooms = new ArrayList<Room>();
		this.initRooms();
		this.Users = new ArrayList<User>();
		this.initUsers();
	}
	
	//Initialization Method.
	
	private void initRoomTypes() {
		this.getRoomTypes().put("Standard", new RoomInfo(60, 2));
		this.getRoomTypes().put("King", new RoomInfo(100, 4));
		this.getRoomTypes().put("Luxe", new RoomInfo(200, 6));
	}
	
	private void initRooms() {
		this.getRooms().add(new Room(1, "Standard"));
		this.getRooms().add(new Room(2, "Standard"));
		this.getRooms().add(new Room(3, "Standard"));
		this.getRooms().add(new Room(4, "Standard"));
		this.getRooms().add(new Room(5, "Standard"));
		this.getRooms().add(new Room(6, "Standard"));
		this.getRooms().add(new Room(7, "King"));
		this.getRooms().add(new Room(8, "King"));
		this.getRooms().add(new Room(9, "King"));
		this.getRooms().add(new Room(10, "King"));
		this.getRooms().add(new Room(11, "Luxe"));
	}
	
	private void initUsers() {
		this.getUsers().add(new User(0, "admin", "root", "Gervais_Pierre", "gervais@et.intechinfo.fr", null));
	}
	
	//Get'er and Set'er Methods.
	
	public HashMap<String, RoomInfo> getRoomTypes() {
		return RoomTypes;
	}

	public ArrayList<Room> getRooms() {
		return Rooms;
	}

	public ArrayList<User> getUsers() {
		return Users;
	}
	
	//Custom Method.
	
}
