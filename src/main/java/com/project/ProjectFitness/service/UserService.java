package com.project.ProjectFitness.service;

import com.project.ProjectFitness.entity.User;
import com.project.ProjectFitness.entity.dto.UserDTO;

public interface UserService {

	
	public User saveUser(UserDTO userDTO);
	public User getUserByUsername(String username);
	public User getLoggedUser();
    public User activateUser(User user);
}
