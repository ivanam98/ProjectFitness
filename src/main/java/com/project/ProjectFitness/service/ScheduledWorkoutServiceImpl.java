package com.project.ProjectFitness.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.entity.Workout;
import com.project.ProjectFitness.entity.dto.ScheduledWorkoutDTO;
import com.project.ProjectFitness.repository.ScheduledWorkoutRepository;

@Service
public class ScheduledWorkoutServiceImpl implements ScheduledWorkoutService {

	@Autowired
	private ScheduledWorkoutRepository scheduledWorkoutRepo;

	@Autowired
	private WorkoutServiceImpl workoutService;

	@Autowired
	private UserServiceImpl userService;

	@Override
	public List<ScheduledWorkout> getAllScheduledWorkouts() {
		return scheduledWorkoutRepo.findAll();
	}

	@Override
	public List<ScheduledWorkout> getAllScheduledWorkoutsByWorkoutId(Long id) {
		List<ScheduledWorkout> allScheduledWorkouts = scheduledWorkoutRepo.findAll();
		List<ScheduledWorkout> scheduledWorkoutsForWorkout = new ArrayList<ScheduledWorkout>();
		for (ScheduledWorkout scw : allScheduledWorkouts) {
			if (scw.getWorkout().getId() == id) {
				scheduledWorkoutsForWorkout.add(scw);
			}
		}
		return scheduledWorkoutsForWorkout;

	}

	@Override
	public ScheduledWorkout getScheduledWorkoutById(Long id) {
		return scheduledWorkoutRepo.findById(id).orElse(null);
	}

	@Override
	public ScheduledWorkout createScheduledWorkout(ScheduledWorkoutDTO dto) {
		Workout workout = workoutService.getWorkoutById(dto.getWorkoutId());
		ScheduledWorkout sw = new ScheduledWorkout(dto);
		sw.setWorkout(workout);
		sw.setCoachId(userService.getLoggedUser().getId());

		return scheduledWorkoutRepo.save(sw);
	}

}
