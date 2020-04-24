package com.abdel.postgresTutorial.service;

import org.springframework.stereotype.Service;
import com.abdel.postgresTutorial.entity.Person;
import com.abdel.postgresTutorial.repositories.PersonRepository;
	

import java.util.List;

@Service
public class PersonService{
	
	private PersonRepository personRepository;
	 
	public PersonService(PersonRepository personRepository){
	 	this.personRepository= personRepository;
	 }

	 public Iterable<Person>list(){
	 	return personRepository.findAll();
	 }

	 public Person save(Person person){
	 	return personRepository.save(person);
	 }

	 public void save(List<Person>persons){
	 	personRepository.saveAll(persons);
	 }

}



 