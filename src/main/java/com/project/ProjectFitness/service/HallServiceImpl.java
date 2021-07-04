package com.project.ProjectFitness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.repository.HallRepository;

@Service
public class HallServiceImpl implements HallService{
	
	@Autowired
	HallRepository hallRepo;

}
