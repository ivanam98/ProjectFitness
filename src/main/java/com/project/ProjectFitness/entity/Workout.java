package com.project.ProjectFitness.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="workout")
public class Workout{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	private String name;
	
	private String description;
	
	private String typeOfWorkout;
	
	private int duration;

	public Workout(long id, String name, String description, String typeOfWorkout, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.typeOfWorkout = typeOfWorkout;
		this.duration = duration;
	}

	public Workout() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeOfWorkout() {
		return typeOfWorkout;
	}

	public void setTypeOfWorkout(String typeOfWorkout) {
		this.typeOfWorkout = typeOfWorkout;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	


}
