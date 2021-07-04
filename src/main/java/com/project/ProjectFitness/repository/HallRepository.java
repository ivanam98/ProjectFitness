package com.project.ProjectFitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ProjectFitness.entity.Hall;

@Repository
public interface HallRepository extends JpaRepository<Hall, Long> {

}
