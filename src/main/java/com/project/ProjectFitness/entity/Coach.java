package com.project.ProjectFitness.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("coach_user")
public class Coach extends User {

	@OneToMany(mappedBy = "coach", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ScheduledWorkout> workouts;

	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private FitnessCentar fitnessCentar;


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
			FitnessCentar fitnessCentar) {
		super(id, username, password, firstName, lastName, phoneNumber, email, dateOfBirth, userType, active);
		this.workouts = workouts;
		this.fitnessCentar = fitnessCentar;
	}


	public List<ScheduledWorkout> getWorkouts() {
		return workouts;
	}


	public void setWorkouts(List<ScheduledWorkout> workouts) {
		this.workouts = workouts;
	}


	public FitnessCentar getFitnessCentar() {
		return fitnessCentar;
	}


	public void setFitnessCentar(FitnessCentar fitnessCentar) {
		this.fitnessCentar = fitnessCentar;
	}
	
	
}
