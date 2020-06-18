package com.example.prog.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.example.prog.entity.User;
import com.example.prog.service.UserService;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.net.URL;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/")
public class UserController {
	@GetMapping
	public String index(Model model){
		return "index";
	}
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Iterable<User>usersList() {
        return userService.usersList();
    }

}