package com.abdel.postgresTutorial;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import com.abdel.postgresTutorial.entity.Person;
import com.abdel.postgresTutorial.service.PersonService;

@SpringBootApplication
public class PostgresTutorialApplication{

	public static void main(String[] args) {
		SpringApplication.run(PostgresTutorialApplication.class, args);
	}

@Bean
	CommandLineRunner runner(PersonService userService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/people.json");
			try {
				List<Person> users = mapper.readValue(inputStream,typeReference);
				userService.save(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
	    };
	}

}
