package com.project.ProjectFitness.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.project.ProjectFitness.entity.dto.CoachDTO;

@Entity
@DiscriminatorValue("coach_user")
public class Coach extends User {

	@OneToMany()
    private List<ScheduledWorkout> workouts = new ArrayList<ScheduledWorkout>();

	private Long fitnessCentarId;


	public Coach() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Coach(long id, String username, String password, String firstName, String lastName, String phoneNumber,
			String email, LocalDate dateOfBirth, UserType userType, boolean active) {
		super(id, username, password, firstName, lastName, phoneNumber, email, dateOfBirth, userType, active);
		// TODO Auto-generated constructor stub
	}


	


	public Coach(long id, String username, String password, String firstName, String lastName, String phoneNumber,
			String email, LocalDate dateOfBirth, UserType userType, boolean active, List<ScheduledWorkout> workouts,
			Long fitnessCentarId) {
		super(id, username, password, firstName, lastName, phoneNumber, email, dateOfBirth, userType, active);
		this.workouts = workouts;
		this.fitnessCentarId = fitnessCentarId;
	}


	public Coach(CoachDTO coachDTO) {
		super(coachDTO);
		setFitnessCentarId(coachDTO.getFitnessCentarId());
		
	}


	public List<ScheduledWorkout> getWorkouts() {
		return workouts;
	}


	public void setWorkouts(List<ScheduledWorkout> workouts) {
		this.workouts = workouts;
	}


	public Long getFitnessCentarId() {
		return fitnessCentarId;
	}


	public void setFitnessCentarId(Long fitnessCentarId) {
		this.fitnessCentarId = fitnessCentarId;
	}


	
	
}
