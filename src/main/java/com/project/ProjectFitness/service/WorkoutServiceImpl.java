package com.project.ProjectFitness.service;

import java.util.ArrayList;
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
		return workoutRepo.findById(id).orElse(null);
	}

	@Override
	public List<Workout> getAllWorkoutsName(String name) {
		List<Workout> workouts = getAllWorkouts();
		List<Workout> sws = new ArrayList<Workout>();
		for (Workout workout : workouts) {
			if(workout.getName().toLowerCase().contains(name.toLowerCase())) {
				sws.add(workout);
			}
		}
		return sws;
	}
	
	@Override
	public List<Workout> getAllWorkoutsType(String type) {
		List<Workout> workouts = getAllWorkouts();
		List<Workout> sws = new ArrayList<Workout>();
		for (Workout workout : workouts) {
			if(workout.getTypeOfWorkout().toLowerCase().contains(type.toLowerCase())) {
				sws.add(workout);
			}
		}
		return sws;
	}
	
	@Override
	public List<Workout> getAllWorkoutsDescirption(String description) {
		List<Workout> workouts = getAllWorkouts();
		List<Workout> sws = new ArrayList<Workout>();
		for (Workout workout : workouts) {
			if(workout.getDescription().toLowerCase().contains(description.toLowerCase())) {
				sws.add(workout);
			}
		}
		return sws;
	}

}
