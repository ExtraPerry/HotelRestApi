package fr.gervais.rest.app.controllers;

import fr.gervais.rest.app.models.Reservation;
import fr.gervais.rest.app.models.Room;
import fr.gervais.rest.app.models.Profile;
import fr.gervais.rest.app.repositories.ReservationsRepository;
import fr.gervais.rest.app.repositories.RoomsRepository;
import fr.gervais.rest.app.repositories.ProfilesRepository;

//SpringBoot classes.
import org.springframework.web.bind.annotation.RestController;

import java.security.Timestamp;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ApiControllers {
	
	//Attributes.
	
	@Autowired	//Assign to the database.
	private ProfilesRepository profileRepo;
	@Autowired	//Assign to the database.
	private RoomsRepository roomRepo;
	@Autowired	//Assign to the database.
	private ReservationsRepository reservationRepo;
	
	//GET Mapping Methods.
	
	@GetMapping(value = "/")
	public String entryGateway() {
		return "Merp";
	}
	
	@GetMapping(value = "/users")
	public Iterable<Profile> getUsers() {
		return getProfileRepo().findAll();
	}
	
	@GetMapping(value = "/rooms")
	public Iterable<Room> getRooms(){
		return getRoomRepo().findAll();
	}
	
	@GetMapping(value = "/reservations")
	public Iterable<Reservation> getReservations(){
		return getReservationRepo().findAll();
	}

	//POST Mapping Methods.
	
	@PostMapping(value = "/addUser")	//Add a single user.
	public void addUser(@RequestBody Profile profile) {
		getProfileRepo().save(profile);
	}
	
	@PostMapping(value = "/addUsers")	//Add multiple users at a time.
	public void addUsers(@RequestBody Iterable<Profile> profiles) {
		for(Profile vElement : profiles) {
			getProfileRepo().save(vElement);
		}
	}
	
	@PostMapping(value = "/addRandomUser")	//Generate a random user.
	public void addRandomUser() {
		String randomNumber = "" + Math.random();
		String randomUsername = "rUser" + randomNumber.substring(2);
		Profile randomUser = new Profile(randomUsername, "default", randomUsername,  "Random@mail.com", "Random_Number");
		getProfileRepo().save(randomUser);
	}
	
	@PostMapping(value = "/addRoom")	//Add a single room.
	public void addRoom(@RequestBody Room room) {
		getRoomRepo().save(room);
	}
	
	@PostMapping(value = "/addRooms")	//Add multiple rooms at a time.
	public void addRooms(@RequestBody Iterable<Room> rooms) {
		for(Room vElement : rooms) {
			getRoomRepo().save(vElement);
		}
	}

	//Get'er Methods.
	
	public ProfilesRepository getProfileRepo() {
		return this.profileRepo;
	}

	public RoomsRepository getRoomRepo() {
		return this.roomRepo;
	}

	public ReservationsRepository getReservationRepo() {
		return this.reservationRepo;
	}
	
}
