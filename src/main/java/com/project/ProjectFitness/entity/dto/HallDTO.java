package com.project.ProjectFitness.entity.dto;

import java.util.List;

import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.Hall;
import com.project.ProjectFitness.entity.ScheduledWorkout;

public class HallDTO {

	private long id;

	private long capacity;

	private String name;
	
	private long fitnessCentarId;

	private FitnessCentar fitnessCentar;

	private List<ScheduledWorkout> scheduledWorkouts;

	private boolean deleted;

	public HallDTO(long id, long capacity, String name, FitnessCentar fitnessCentar,
			List<ScheduledWorkout> scheduledWorkouts, boolean deleted) {
		super();
		this.id = id;
		this.capacity = capacity;
		this.name = name;
		this.fitnessCentar = fitnessCentar;
		this.scheduledWorkouts = scheduledWorkouts;
		this.deleted = deleted;
	}

	public HallDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HallDTO(Hall hall) {
		this.id = hall.getId();
		this.capacity = hall.getCapacity();
		this.name = hall.getName();
		this.fitnessCentarId = hall.getFitnessCentarId();
		this.scheduledWorkouts = hall.getScheduledWorkouts();
		this.deleted = hall.isDeleted();
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

	public long getFitnessCentarId() {
		return fitnessCentarId;
	}

	public void setFitnessCentarId(long fitnessCentarId) {
		this.fitnessCentarId = fitnessCentarId;
	}
	
	

}
