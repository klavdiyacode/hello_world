package com.abdel.postgresTutorial.repositories;

import com.abdel.postgresTutorial.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}