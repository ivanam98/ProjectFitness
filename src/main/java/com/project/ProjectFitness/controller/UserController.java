package com.project.ProjectFitness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ProjectFitness.entity.User;
import com.project.ProjectFitness.entity.dto.UserDTO;
import com.project.ProjectFitness.service.UserServiceImpl;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserServiceImpl userService;
	
	@PostMapping(consumes = "application/json")
	public ResponseEntity<User> addUser(@RequestBody UserDTO userDTO) {
		User user = userService.saveUser(userDTO);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

}
