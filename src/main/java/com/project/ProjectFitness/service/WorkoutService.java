package com.project.ProjectFitness.service;

import java.util.List;

import com.project.ProjectFitness.entity.Workout;

public interface WorkoutService {

	public List<Workout> getAllWorkouts();
	public Workout getWorkoutById(Long id);
	public List<Workout> getAllWorkoutsName(String name);
	public List<Workout> getAllWorkoutsDescirption(String name);
	public List<Workout> getAllWorkoutsType(String name);
	
}
