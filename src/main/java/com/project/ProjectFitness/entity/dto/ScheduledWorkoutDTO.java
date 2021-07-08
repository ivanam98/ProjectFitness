package com.project.ProjectFitness.entity.dto;

import java.time.LocalDateTime;

public class ScheduledWorkoutDTO {

	private long id;
	private Long workoutId;
	private LocalDateTime dateTime;
	private double price;
	private int membersCount;
	private Long hallId;
	private Long coachId;

	public ScheduledWorkoutDTO(long id, Long workoutId, LocalDateTime dateTime, double price, int membersCount,
			Long hallId, Long coachId) {
		super();
		this.id = id;
		this.workoutId = workoutId;
		this.dateTime = dateTime;
		this.price = price;
		this.membersCount = membersCount;
		this.hallId = hallId;
		this.coachId = coachId;
	}

	public ScheduledWorkoutDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(Long workoutId) {
		this.workoutId = workoutId;
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

	public Long getHallId() {
		return hallId;
	}

	public void setHallId(Long hallId) {
		this.hallId = hallId;
	}

	public Long getCoachId() {
		return coachId;
	}

	public void setCoachId(Long coachId) {
		this.coachId = coachId;
	}

}
