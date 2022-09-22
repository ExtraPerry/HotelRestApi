package fr.gervais.rest.app.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import fr.gervais.rest.app.models.Reservation;

//Create a table for the database.
public interface ReservationsRepository extends CrudRepository<Reservation, UUID> {

}
