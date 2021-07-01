package com.project.ProjectFitness.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="fitnessCentar")
public class FitnessCentar{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String name;
	
	
	private String address;
	
	
	private String phoneNumber;
	
	
	private String email;
	
	@OneToMany
	private List<Hall> halls;
	
	@OneToMany
	private List<Coach> coaches;
	
	@OneToMany
	private List<ScheduledWorkout> scheduledWorkouts;
	
	
	
	
	
}
