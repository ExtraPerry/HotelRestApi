package fr.gervais.rest.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

	@GetMapping(value = "/")
	public String getPage() {
		return "Merp : Welcome to the home page of my Rest Api. Nothing fancy but at least you have something to look at :D.";
	}
	
	@GetMapping(value = "/rooms")
	public String getRooms() {
		return "No rooms on data base yet !";
	}
}
