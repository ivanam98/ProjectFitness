package com.project.ProjectFitness.service;

import java.util.List;

import com.project.ProjectFitness.entity.Coach;
import com.project.ProjectFitness.entity.Member;
import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.entity.User;
import com.project.ProjectFitness.entity.dto.CoachDTO;
import com.project.ProjectFitness.entity.dto.UserDTO;

public interface UserService {

	
	public User saveUser(UserDTO userDTO);
	public Member registerMember(UserDTO userDTO);
	public User getUserByUsername(String username);
	public User getLoggedUser();
    public List<ScheduledWorkout> getDoneWorkOuts();
    public List<ScheduledWorkout> getScheduledWorkouts();
    public User scheduleWorkout(Long id);
	public User cancelScheduleWorkout(Long id);
	public List<UserDTO> getInactiveUsers();
	public User activateUser(Long id);
	public User getUserById(Long id);
	public Coach registerCoach(CoachDTO coachDTO);
	public List<Coach> getCoaches();
}
