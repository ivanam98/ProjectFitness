package com.project.ProjectFitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ProjectFitness.entity.ScheduledWorkout;
@Repository
public interface ScheduledWorkoutRepository extends JpaRepository<ScheduledWorkout, Long> {

}
