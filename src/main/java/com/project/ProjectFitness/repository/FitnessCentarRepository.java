package com.project.ProjectFitness.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ProjectFitness.entity.FitnessCentar;

@Repository
public interface FitnessCentarRepository extends JpaRepository<FitnessCentar, Long> {
	
	List<FitnessCentar> findByDeletedFalse();
}
