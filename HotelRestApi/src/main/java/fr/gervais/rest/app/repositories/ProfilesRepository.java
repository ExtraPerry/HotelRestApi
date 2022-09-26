package fr.gervais.rest.app.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import fr.gervais.rest.app.models.Profile;

//Create a table for the database.
public interface ProfilesRepository extends CrudRepository<Profile, UUID> {

}
