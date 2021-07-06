package com.project.ProjectFitness.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.dto.FitnessCentarDTO;
import com.project.ProjectFitness.repository.FitnessCentarRepository;

@Service
public class FitnessCentarServiceImpl implements FitnessCentarService{
	
	@Autowired
	FitnessCentarRepository fitnessCentarRepo;

	@Override
	public FitnessCentar saveFitnessCentar(FitnessCentarDTO fitnesCentarDto) {
		FitnessCentar fc = new FitnessCentar(fitnesCentarDto);
		return fitnessCentarRepo.save(fc);
	}

	@Override
	public FitnessCentar getFitnessCentarById(Long id) {
		return fitnessCentarRepo.findById(id).orElse(null);
	}

	@Override
	public List<FitnessCentar> getAllFitnesCentar() {
		
		return fitnessCentarRepo.findAll();
	}
	@Override
	public FitnessCentar deleteFitnessCentar(Long id) {
		FitnessCentar fc = fitnessCentarRepo.getById(id);
		fc.setDeleted(true);
		return fitnessCentarRepo.save(fc);
	}

}
