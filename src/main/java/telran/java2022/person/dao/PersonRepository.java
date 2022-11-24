package telran.java2022.person.dao;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.springframework.data.repository.CrudRepository;

import telran.java2022.person.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

	Stream<Person> findPersonByName(String name);
	
	Stream<Person> findByAddressCity(String city);
	
	Stream<Person> findByBirthDateBetween(LocalDate minAge, LocalDate maxAge);
}
