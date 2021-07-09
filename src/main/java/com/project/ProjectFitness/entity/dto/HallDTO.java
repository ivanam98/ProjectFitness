package com.project.ProjectFitness.entity.dto;

import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.Hall;

public class HallDTO {

	private long id;

	private long capacity;

	private String name;

	private long fitnessCentarId;

	private boolean deleted;

	public HallDTO(long id, long capacity, String name, boolean deleted) {
		super();
		this.id = id;
		this.capacity = capacity;
		this.name = name;
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
