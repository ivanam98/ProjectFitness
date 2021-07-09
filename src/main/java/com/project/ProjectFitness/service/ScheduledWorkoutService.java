package com.project.ProjectFitness.service;

import java.util.List;

import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.entity.dto.ScheduledWorkoutDTO;

public interface ScheduledWorkoutService {
	
	public List<ScheduledWorkout> getAllScheduledWorkouts();
	public ScheduledWorkout getScheduledWorkoutById(Long id);
	public ScheduledWorkout createScheduledWorkout(ScheduledWorkoutDTO dto);
	public List<ScheduledWorkout> getAllScheduledWorkoutsByWorkoutId(Long fcId, Long workoutId);

}
