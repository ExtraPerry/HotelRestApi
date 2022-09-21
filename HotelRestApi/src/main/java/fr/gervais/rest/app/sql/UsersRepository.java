package fr.gervais.rest.app.sql;

import org.springframework.data.repository.CrudRepository;

import fr.gervais.rest.app.models.User;

//Create a table for the database.
public interface UsersRepository extends CrudRepository<User, Integer> {

}
