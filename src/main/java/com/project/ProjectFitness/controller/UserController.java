package com.project.ProjectFitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.entity.User;
import com.project.ProjectFitness.entity.dto.UserDTO;
import com.project.ProjectFitness.service.UserServiceImpl;


@RestController
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserServiceImpl userService;
	
	@PostMapping(value = "/register", consumes = "application/json")
	public ResponseEntity<User> registerMember(@RequestBody UserDTO userDTO) {
		User user = userService.registerMember(userDTO);
		if(user == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/done-workouts")
	public ResponseEntity<List<ScheduledWorkout>> getDoneWorkouts() {
		List<ScheduledWorkout> doneWorkouts = userService.getDoneWorkOuts();
		return new ResponseEntity<>(doneWorkouts, HttpStatus.OK);
	}
	
	@GetMapping(value = "/scheduled-workouts")
	public ResponseEntity<List<ScheduledWorkout>> getScheduledWorkouts() {
		List<ScheduledWorkout> doneWorkouts = userService.getScheduledWorkouts();
		return new ResponseEntity<>(doneWorkouts, HttpStatus.OK);
	}
	
	@PostMapping(value = "/schedule-workout/{id}")
	public ResponseEntity<User> scheduleWorkout(@PathVariable("id") Long id) {
		User u = userService.scheduleWorkout(id);
		if(u == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(u, HttpStatus.OK);
	}
	
	@PostMapping(value = "/cancel-schedule-workout/{id}")
	public ResponseEntity<User> cancelScheduleWorkout(@PathVariable("id") Long id) {
		User u = userService.cancelScheduleWorkout(id);
		if(u == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(u, HttpStatus.OK);
	}
	
	@GetMapping(value = "/me")
	public ResponseEntity<UserDTO> myProfile() {
		User u = userService.getLoggedUser();
		UserDTO uDto = new UserDTO(u);
		return new ResponseEntity<>(uDto, HttpStatus.OK);
	}
	
	
}
