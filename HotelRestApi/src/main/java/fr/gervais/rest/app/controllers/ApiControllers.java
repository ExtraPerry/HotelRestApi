package fr.gervais.rest.app.controllers;

//My own made classes.
import fr.gervais.rest.app.sql.UsersRepository;
import fr.gervais.rest.app.models.User;

//Java classes.
import java.util.ArrayList;
import java.util.HashMap;

//SpringBoot classes.
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ApiControllers {
	
	@Autowired	//Assign to the database.
	private UsersRepository aUsersRepo;
	
	
	@GetMapping(value = "/users")
	public Iterable<User> getUsers() {
		return getUsersRepo().findAll();
	}
	
	@GetMapping(value = "/addRandomUser")
	public void addRandomUser() {
		String vRandomUsername = "R_User_" + Math.random();
		User vRandomUser = new User(vRandomUsername, vRandomUsername, "default", "Random@mail.com", "Random_Number");
		this.getUsersRepo().save(vRandomUser);
	}
	
	/**
	 * Get the assigned users repository from the database.
	 * @return
	 */
	private UsersRepository getUsersRepo() {
		return aUsersRepo;
	}
	
}
