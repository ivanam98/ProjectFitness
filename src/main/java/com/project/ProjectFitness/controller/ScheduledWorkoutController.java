package com.project.ProjectFitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.service.ScheduledWorkoutServiceImpl;

@RestController
@RequestMapping(value = "/scheduled-workout")
public class ScheduledWorkoutController {
	
	
	@Autowired
	ScheduledWorkoutServiceImpl scheduledWorkoutService;
	

	
	@GetMapping(value = "/workout/{id}")
	public ResponseEntity<List<ScheduledWorkout>> getScheduledWorkoutsForWorkout(@PathVariable("id") Long id) {
		List<ScheduledWorkout> scws = scheduledWorkoutService.getAllScheduledWorkoutsByWorkoutId(id);
		return new ResponseEntity<>(scws,HttpStatus.OK);
	}
	
}
