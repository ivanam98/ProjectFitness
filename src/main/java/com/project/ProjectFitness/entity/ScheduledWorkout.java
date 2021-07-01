package com.project.ProjectFitness.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="scheduledWorkout")
public class ScheduledWorkout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	@ManyToOne
	private Workout workout;
	private LocalDateTime dateTime;
	private double price;
	private int membersCount;
	
	@ManyToOne
	private Hall hall;
	
	@ManyToOne
	private Coach coach;
	
	
	

}
