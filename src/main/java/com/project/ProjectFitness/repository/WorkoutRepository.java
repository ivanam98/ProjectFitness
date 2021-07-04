package com.project.ProjectFitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ProjectFitness.entity.Workout;
@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}
