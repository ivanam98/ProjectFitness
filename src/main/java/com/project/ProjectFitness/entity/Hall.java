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

import com.project.ProjectFitness.entity.dto.HallDTO;

@Entity
@Table(name="hall")
public class Hall {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private long capacity;
	
	private String name;
	
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private FitnessCentar fitnessCentar;
	
	@OneToMany
	private List<ScheduledWorkout> scheduledWorkouts;
	
	private boolean deleted = false;

	public Hall() {
	}

	public Hall(long id, long capacity, String name, FitnessCentar fitnessCentar,
			List<ScheduledWorkout> scheduledWorkouts) {
		super();
		this.id = id;
		this.capacity = capacity;
		this.name = name;
		this.fitnessCentar = fitnessCentar;
		this.scheduledWorkouts = scheduledWorkouts;
	}

	public Hall(HallDTO hallDto) {
		if(hallDto.getId() != 0) {
			this.id = hallDto.getId();
		}
		this.capacity = hallDto.getCapacity();
		this.name = hallDto.getName();
		this.fitnessCentar = hallDto.getFitnessCentar();
		this.scheduledWorkouts = hallDto.getScheduledWorkouts();
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

	public FitnessCentar getFitnessCentar() {
		return fitnessCentar;
	}

	public void setFitnessCentar(FitnessCentar fitnessCentar) {
		this.fitnessCentar = fitnessCentar;
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
