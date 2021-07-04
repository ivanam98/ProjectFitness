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

	public ScheduledWorkout() {
	}

	public ScheduledWorkout(long id, Workout workout, LocalDateTime dateTime, double price, int membersCount, Hall hall,
			Coach coach) {
		super();
		this.id = id;
		this.workout = workout;
		this.dateTime = dateTime;
		this.price = price;
		this.membersCount = membersCount;
		this.hall = hall;
		this.coach = coach;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Workout getWorkout() {
		return workout;
	}

	public void setWorkout(Workout workout) {
		this.workout = workout;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMembersCount() {
		return membersCount;
	}

	public void setMembersCount(int membersCount) {
		this.membersCount = membersCount;
	}

	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	
	
	
	
	
	
	
	
	

}
