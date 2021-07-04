package com.project.ProjectFitness.service;

import java.util.List;

import com.project.ProjectFitness.entity.ScheduledWorkout;

public interface ScheduledWorkoutService {
	
	public List<ScheduledWorkout> getAllScheduledWorkouts();
	public List<ScheduledWorkout> getAllScheduledWorkoutsByWorkoutId(Long id);
	public ScheduledWorkout getScheduledWorkoutById(Long id);
	

}
