package com.project.ProjectFitness.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.repository.ScheduledWorkoutRepository;

@Service
public class ScheduledWorkoutServiceImpl implements ScheduledWorkoutService{
	
	@Autowired
	ScheduledWorkoutRepository scheduledWorkoutRepo;

	@Override
	public List<ScheduledWorkout> getAllScheduledWorkouts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScheduledWorkout> getAllScheduledWorkoutsByWorkoutId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScheduledWorkout getScheduledWorkoutById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
