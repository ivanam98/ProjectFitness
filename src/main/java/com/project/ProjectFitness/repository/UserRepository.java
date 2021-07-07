package com.project.ProjectFitness.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.ProjectFitness.entity.Coach;
import com.project.ProjectFitness.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);
	List<User> findByActiveFalse();
	
	
	
}
