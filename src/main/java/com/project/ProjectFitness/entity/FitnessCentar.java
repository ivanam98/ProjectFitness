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

	public FitnessCentar() {
	}

	public FitnessCentar(long id, String name, String address, String phoneNumber, String email, List<Hall> halls,
			List<Coach> coaches, List<ScheduledWorkout> scheduledWorkouts) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.halls = halls;
		this.coaches = coaches;
		this.scheduledWorkouts = scheduledWorkouts;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Hall> getHalls() {
		return halls;
	}

	public void setHalls(List<Hall> halls) {
		this.halls = halls;
	}

	public List<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}

	public List<ScheduledWorkout> getScheduledWorkouts() {
		return scheduledWorkouts;
	}

	public void setScheduledWorkouts(List<ScheduledWorkout> scheduledWorkouts) {
		this.scheduledWorkouts = scheduledWorkouts;
	}
	
	
	
	
	
	
}
