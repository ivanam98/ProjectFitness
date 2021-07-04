package com.project.ProjectFitness.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ProjectFitness.entity.FitnessCentar;

@Repository
public interface FitnessCentarRepository extends JpaRepository<FitnessCentar, Long> {
}
