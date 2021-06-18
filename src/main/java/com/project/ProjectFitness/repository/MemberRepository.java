package com.project.ProjectFitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ProjectFitness.entity.Member;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

	Member findByUsername(String username);

}
