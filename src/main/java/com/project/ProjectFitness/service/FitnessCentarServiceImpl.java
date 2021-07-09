package com.project.ProjectFitness.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.Coach;
import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.dto.FitnessCentarDTO;
import com.project.ProjectFitness.repository.FitnessCentarRepository;
import com.project.ProjectFitness.entity.User;
import com.project.ProjectFitness.entity.UserType;

@Service
public class FitnessCentarServiceImpl implements FitnessCentarService{
	
	@Autowired
	private FitnessCentarRepository fitnessCentarRepo;
	
	@Autowired
	private UserServiceImpl userService;

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
		User u = userService.getLoggedUser();
		if (u != null) {
			if(u.getUserType().equals(UserType.COACH)) {
				Coach c = (Coach) u;
				List<FitnessCentar> fcs = new ArrayList<FitnessCentar>();
				fcs.add(getFitnessCentarById(c.getFitnessCentarId()));
				return fcs;
			}
		}
		return fitnessCentarRepo.findByDeletedFalse();
	}
	@Override
	public FitnessCentar deleteFitnessCentar(Long id) {
		FitnessCentar fc = fitnessCentarRepo.getById(id);
		fc.setDeleted(true);
		return fitnessCentarRepo.save(fc);
	}

}
