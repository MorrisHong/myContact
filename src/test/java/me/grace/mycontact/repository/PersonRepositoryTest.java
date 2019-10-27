package me.grace.mycontact.repository;

import me.grace.mycontact.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    PersonRepository personRepository;

    @Test
    void crud() {
        Person person = new Person();
        person.setName("eunmo");
        person.setAge(29);
        personRepository.save(person);

        List<Person> people = personRepository.findAll();
        assertThat(people.size()).isEqualTo(1);
        assertThat(people.get(0).getName()).isEqualTo("eunmo");
        assertThat(people.get(0).getAge()).isEqualTo(29);
    }
}