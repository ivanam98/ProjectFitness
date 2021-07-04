package com.project.ProjectFitness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.repository.WorkoutRepository;

@Service
public class WorkoutServiceImpl implements WorkoutService{
	@Autowired
	WorkoutRepository workoutRepo;
	

}
