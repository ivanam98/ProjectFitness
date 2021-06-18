package com.project.ProjectFitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ProjectFitness.entity.Coach;


@Repository
public interface CoachRepository extends JpaRepository<Coach, Long> {
	
	Coach findByUsername(String username);
}
