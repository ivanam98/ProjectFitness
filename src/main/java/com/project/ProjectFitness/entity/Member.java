package com.project.ProjectFitness.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Member extends User {
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ScheduledWorkout> doneWorkouts;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ScheduledWorkout> checkInWorkout;
}

