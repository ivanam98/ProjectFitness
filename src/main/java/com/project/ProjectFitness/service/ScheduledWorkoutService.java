package com.project.ProjectFitness.service;

import java.util.List;

import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.entity.dto.ScheduledWorkoutDTO;

public interface ScheduledWorkoutService {
	
	public List<ScheduledWorkout> getAllScheduledWorkouts();
	public List<ScheduledWorkout> getAllScheduledWorkoutsByWorkoutId(Long id);
	public ScheduledWorkout getScheduledWorkoutById(Long id);
	public ScheduledWorkout createScheduledWorkout(ScheduledWorkoutDTO dto);

}
