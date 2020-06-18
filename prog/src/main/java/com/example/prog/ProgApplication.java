package com.example.prog;

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



import com.example.prog.entity.User;
import com.example.prog.service.UserService;



@SpringBootApplication
public class ProgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgApplication.class, args);
	}

@Bean
	CommandLineRunner runner(UserService userService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/uuusers.json");
			try {
				List<User> users = mapper.readValue(inputStream,typeReference);
				userService.userListsave(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
	    };
	}


}
