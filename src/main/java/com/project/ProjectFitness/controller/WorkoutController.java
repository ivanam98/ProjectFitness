package com.project.ProjectFitness.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ProjectFitness.entity.Workout;
import com.project.ProjectFitness.service.WorkoutServiceImpl;

@RestController
@RequestMapping(value = "/workout")
public class WorkoutController {
	
	
	@Autowired
	WorkoutServiceImpl workoutService;
	
	

	@GetMapping()
	public ResponseEntity<List<Workout>>getAllWorkouts() {
		List<Workout> workouts = workoutService.getAllWorkouts();
		return new ResponseEntity<>(workouts,HttpStatus.OK);
	}
	
	@GetMapping("/search-name/{name}")
	public ResponseEntity<List<Workout>>searchName(@PathVariable("name") String name) {
		List<Workout> workouts = workoutService.getAllWorkoutsName(name);
		
		return new ResponseEntity<>(workouts,HttpStatus.OK);
	}
	
	@GetMapping("/search-type/{type}")
	public ResponseEntity<List<Workout>>searchType(@PathVariable("type") String type) {
		List<Workout> workouts = workoutService.getAllWorkoutsType(type);
		
		return new ResponseEntity<>(workouts,HttpStatus.OK);
	}
	
	
	@GetMapping("/search-description/{description}")
	public ResponseEntity<List<Workout>>searchDescription(@PathVariable("description") String description) {
		List<Workout> workouts = workoutService.getAllWorkoutsDescirption(description);
		return new ResponseEntity<>(workouts,HttpStatus.OK);
	}
	
	
	
	
	
}
