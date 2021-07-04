package com.project.ProjectFitness.service;

import java.util.List;

import com.project.ProjectFitness.entity.Workout;

public interface WorkoutService {

	public List<Workout> getAllWorkouts();
	public Workout getWorkoutById(Long id);
	
}
