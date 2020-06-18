package com.example.prog.service;


import org.springframework.stereotype.Service;
import com.example.prog.entity.User;
import com.example.prog.repos.UserRepository;
import java.util.Collection;
import java.util.List;

@Service
public class UserService{
	private UserRepository userRepo;

	public UserService(UserRepository userRepo){
		this.userRepo=userRepo;
	}	

	public Iterable<User>usersList(){
		return userRepo.findAll();
	}

	public User userSave(User user){
		return userRepo.save(user);
	}

	public void userListsave(List<User>users){
		userRepo.saveAll(users);
	}

	public User userById(long id){
		return userRepo.findById(id).get();
	}


}

