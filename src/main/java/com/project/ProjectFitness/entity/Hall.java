package com.project.ProjectFitness.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.ProjectFitness.entity.dto.HallDTO;

@Entity
@Table(name = "hall")
public class Hall {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private long capacity;

	private String name;

	private Long fitnessCentarId;

	@OneToMany
	private List<ScheduledWorkout> scheduledWorkouts;

	private boolean deleted = false;

	public Hall() {
	}
	
	

	public Hall(long id, long capacity, String name, Long fitnessCentarId, List<ScheduledWorkout> scheduledWorkouts,
			boolean deleted) {
		super();
		this.id = id;
		this.capacity = capacity;
		this.name = name;
		this.fitnessCentarId = fitnessCentarId;
		this.scheduledWorkouts = scheduledWorkouts;
		this.deleted = deleted;
	}



	public Hall(HallDTO hallDto) {
		if (hallDto.getId() != 0) {
			this.id = hallDto.getId();
		}
		this.capacity = hallDto.getCapacity();
		this.name = hallDto.getName();
		this.fitnessCentarId = hallDto.getFitnessCentarId();
	}

	public Long getFitnessCentarId() {
		return fitnessCentarId;
	}

	public void setFitnessCentarId(Long fitnessCentarId) {
		this.fitnessCentarId = fitnessCentarId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCapacity() {
		return capacity;
	}

	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
