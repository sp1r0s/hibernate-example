package example.repository;

import example.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<Person, Long> {

    Person findById(int id);
}
