package com.project.ProjectFitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ProjectFitness.entity.Workout;

import java.util.List;
public interface WorkoutRepository extends JpaRepository<Workout, Long>{

	List<Workout> findAllByName(String name);
}
