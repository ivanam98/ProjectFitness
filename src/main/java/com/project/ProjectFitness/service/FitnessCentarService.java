package com.project.ProjectFitness.service;

import java.util.List;

import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.dto.FitnessCentarDTO;

public interface FitnessCentarService {
	public FitnessCentar saveFitnessCentar(FitnessCentarDTO fitnesCentarDto);
	public FitnessCentar getFitnessCentarById(Long id);
	public List<FitnessCentar> getAllFitnesCentar();
	public FitnessCentar deleteFitnessCentar(Long id);
	
	

}
