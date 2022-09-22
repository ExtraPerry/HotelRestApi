package fr.gervais.rest.app.controllers;

import fr.gervais.rest.app.models.Reservation;
import fr.gervais.rest.app.models.Room;
import fr.gervais.rest.app.models.User;
import fr.gervais.rest.app.repositories.ReservationsRepository;
import fr.gervais.rest.app.repositories.RoomsRepository;
import fr.gervais.rest.app.repositories.UsersRepository;

//SpringBoot classes.
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiControllers {
	
	//Attributes.
	
	@Autowired	//Assign to the database.
	private UsersRepository userRepo;
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
	public Iterable<User> getUsers() {
		return getUserRepo().findAll();
	}
	
	@GetMapping(value = "/rooms")
	public Iterable<Room> getRooms(){
		return getRoomRepo().findAll();
	}
	
	@GetMapping(value = "/reservations")
	public Iterable<Reservation> getReservations(){
		return getReservationRepo().findAll();
	}

	//Put Mapping Methods.
	
	@GetMapping(value = "/addRandomUser")
	public void addRandomUser() {
		String vRandomUsername = "R_User_" + Math.random();
		User vRandomUser = new User(vRandomUsername, vRandomUsername, "default", "Random@mail.com", "Random_Number");
		this.getUserRepo().save(vRandomUser);
	}
	
	//Get'er Methods.
	
	public UsersRepository getUserRepo() {
		return this.userRepo;
	}

	public RoomsRepository getRoomRepo() {
		return this.roomRepo;
	}

	public ReservationsRepository getReservationRepo() {
		return this.reservationRepo;
	}
	
}
