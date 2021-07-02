package com.project.ProjectFitness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.User;


import com.project.ProjectFitness.entity.dto.UserDTO;
import com.project.ProjectFitness.exception.EntityNotFoundException;
import com.project.ProjectFitness.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	

	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User saveUser(UserDTO userDTO) {
		User user = new User(userDTO);
		user.setActive(false);
		user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
		User saved = userRepository.save(user);
		return saved;
	}

	public User getUserByUsername(String username) {	
		User user = userRepository.findByUsername(username);
		return user;
	}
	

	@Override
	public User getLoggedUser() {
		try {
			return getUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				return null;
			}
			else if(e instanceof EntityNotFoundException) {
				return null; //Vraca null za korisnika koji nije ulogovan kada se pozove getLoggedUser()
			}
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public User activateUser(User user) {
		user.setActive(true);
		return userRepository.save(user);
	}

}
