package com.project.ProjectFitness.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.entity.dto.FitnessCentarDTO;
import com.project.ProjectFitness.entity.dto.ScheduledWorkoutDTO;
import com.project.ProjectFitness.service.ScheduledWorkoutServiceImpl;

@RestController
@RequestMapping(value = "/scheduled-workout")
public class ScheduledWorkoutController {
	
	
	@Autowired
	ScheduledWorkoutServiceImpl scheduledWorkoutService;
	

	
	@GetMapping(value = "/fitness-centar/{id}/workout/{workoutId}")
	public ResponseEntity<List<ScheduledWorkout>> getScheduledWorkoutsForWorkout(@PathVariable("id") Long fitnessCentarId, @PathVariable("workoutId") Long workoutId) {
		List<ScheduledWorkout> scws = scheduledWorkoutService.getAllScheduledWorkoutsByWorkoutId(fitnessCentarId, workoutId);
		return new ResponseEntity<>(scws,HttpStatus.OK);
	}
	
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createScheduledWorkout(@RequestBody ScheduledWorkoutDTO dto) {
		ScheduledWorkout sc = scheduledWorkoutService.createScheduledWorkout(dto);
		return new ResponseEntity<>(sc,HttpStatus.OK);
	}
	
	@GetMapping(value = "/fitness-centar/{id}/workout/{workoutId}/ascending")
	public ResponseEntity<List<ScheduledWorkout>> getScheduledWorkoutsForWorkoutAscending(@PathVariable("id") Long fitnessCentarId, @PathVariable("workoutId") Long workoutId) {
		List<ScheduledWorkout> scws = scheduledWorkoutService.getAllScheduledWorkoutsByWorkoutId(fitnessCentarId, workoutId);
		Collections.sort(scws);		
		return new ResponseEntity<>(scws,HttpStatus.OK);
	}
	
	@GetMapping(value = "/fitness-centar/{id}/workout/{workoutId}/descending")
	public ResponseEntity<List<ScheduledWorkout>> getScheduledWorkoutsForWorkoutDescending(@PathVariable("id") Long fitnessCentarId, @PathVariable("workoutId") Long workoutId) {
		List<ScheduledWorkout> scws = scheduledWorkoutService.getAllScheduledWorkoutsByWorkoutId(fitnessCentarId, workoutId);
		Collections.sort(scws);
		Collections.reverse(scws);
		return new ResponseEntity<>(scws,HttpStatus.OK);
	}
}
