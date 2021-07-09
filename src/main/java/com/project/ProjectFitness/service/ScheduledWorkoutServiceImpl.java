package com.project.ProjectFitness.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.Hall;
import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.entity.Workout;
import com.project.ProjectFitness.entity.dto.ScheduledWorkoutDTO;
import com.project.ProjectFitness.repository.FitnessCentarRepository;
import com.project.ProjectFitness.repository.HallRepository;
import com.project.ProjectFitness.repository.ScheduledWorkoutRepository;

@Service
public class ScheduledWorkoutServiceImpl implements ScheduledWorkoutService {

	@Autowired
	private ScheduledWorkoutRepository scheduledWorkoutRepo;

	@Autowired
	private WorkoutServiceImpl workoutService;

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private HallServiceImpl hallService;
	
	@Autowired
	private HallRepository hallRepo;
	
	@Autowired
	private FitnessCentarServiceImpl fitnessCentarService;
	
	@Autowired
	private FitnessCentarRepository fitnessCentarRepo;
	
	@Override
	public List<ScheduledWorkout> getAllScheduledWorkouts() {
		return scheduledWorkoutRepo.findAll();
	}

	@Override
	public List<ScheduledWorkout> getAllScheduledWorkoutsByWorkoutId(Long fcId, Long workoutId) {
		FitnessCentar fc = fitnessCentarService.getFitnessCentarById(fcId);
		List<ScheduledWorkout> allScheduledWorkouts = fc.getScheduledWorkouts();
		List<ScheduledWorkout> scheduledWorkoutsForWorkout = new ArrayList<ScheduledWorkout>();
		for (ScheduledWorkout scw : allScheduledWorkouts) {
			if (scw.getWorkout().getId() == workoutId) {
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
		sw = scheduledWorkoutRepo.save(sw);
		Hall hall = hallService.getHallById(dto.getHallId());
		hall.getScheduledWorkouts().add(sw);
		hallRepo.save(hall);
		FitnessCentar fc = fitnessCentarService.getFitnessCentarById(hall.getFitnessCentarId());
		fc.getScheduledWorkouts().add(sw);
		fitnessCentarRepo.save(fc);
		return sw;
	}



}
