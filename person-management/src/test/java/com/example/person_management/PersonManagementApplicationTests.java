package com.example.person_management;

import com.example.person_management.model.Person;
import com.example.person_management.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PersonManagementApplicationTests {

	@Autowired
	private PersonService personService;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetAllPersons() {
		List<Person> persons = personService.getAllPersons();
		assertThat(persons).isNotEmpty();
	}

	@Test
	void testCreatePerson() {
		Person person = new Person();
		person.setName("Test Person");
		Person savedPerson = personService.savePerson(person);
		assertThat(savedPerson.getId()).isNotNull();
	}

}
