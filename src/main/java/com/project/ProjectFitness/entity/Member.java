package com.project.ProjectFitness.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.project.ProjectFitness.entity.dto.UserDTO;

@Entity
@DiscriminatorValue("member_user")
public class Member extends User {
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ScheduledWorkout> doneWorkouts;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ScheduledWorkout> checkInWorkout;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(long id, String username, String password, String firstName, String lastName, String phoneNumber,
			String email, LocalDate dateOfBirth, UserType userType, boolean active) {
		super(id, username, password, firstName, lastName, phoneNumber, email, dateOfBirth, userType, active);
		// TODO Auto-generated constructor stub
	}

	public Member(long id, String username, String password, String firstName, String lastName, String phoneNumber,
			String email, LocalDate dateOfBirth, UserType userType, boolean active, List<ScheduledWorkout> doneWorkouts,
			List<ScheduledWorkout> checkInWorkout) {
		super(id, username, password, firstName, lastName, phoneNumber, email, dateOfBirth, userType, active);
		this.doneWorkouts = doneWorkouts;
		this.checkInWorkout = checkInWorkout;
	}

	public Member(UserDTO userDTO) {
		super(userDTO);
	}

	public List<ScheduledWorkout> getDoneWorkouts() {
		return doneWorkouts;
	}

	public void setDoneWorkouts(List<ScheduledWorkout> doneWorkouts) {
		this.doneWorkouts = doneWorkouts;
	}

	public List<ScheduledWorkout> getCheckInWorkout() {
		return checkInWorkout;
	}

	public void setCheckInWorkout(List<ScheduledWorkout> checkInWorkout) {
		this.checkInWorkout = checkInWorkout;
	}
    
    
}

