package com.project.ProjectFitness.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.Workout;
import com.project.ProjectFitness.repository.WorkoutRepository;

@Service
public class WorkoutServiceImpl implements WorkoutService{
	@Autowired
	private WorkoutRepository workoutRepo;

	@Override
	public List<Workout> getAllWorkouts() {
		return workoutRepo.findAll();
	}

	@Override
	public Workout getWorkoutById(Long id) {
		return workoutRepo.getById(id);
	}
	

}
