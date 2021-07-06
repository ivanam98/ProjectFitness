package com.project.ProjectFitness.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.ProjectFitness.entity.dto.FitnessCentarDTO;

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
	
	@JsonManagedReference
	@OneToMany
	private List<Hall> halls = new ArrayList<Hall>();;
	
	@JsonManagedReference
	@OneToMany
	private List<Coach> coaches = new ArrayList<Coach>();;
	
	@JsonManagedReference
	@OneToMany
	private List<ScheduledWorkout> scheduledWorkouts = new ArrayList<ScheduledWorkout>();
	
	private boolean deleted = false;

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
	
	public FitnessCentar(FitnessCentarDTO dto) {
		if(dto.getId() != 0) {
			this.id = dto.getId();
		}
		this.name = dto.getName();
		this.address = dto.getAddress();
		this.phoneNumber = dto.getPhoneNumber();
		this.email = dto.getEmail();
		this.halls = dto.getHalls();
		this.coaches = dto.getCoaches();
		this.scheduledWorkouts = dto.getScheduledWorkouts();
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	
	
	
	
	
	
	
	
}
