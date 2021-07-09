package com.project.ProjectFitness.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.Hall;
import com.project.ProjectFitness.entity.dto.HallDTO;
import com.project.ProjectFitness.repository.FitnessCentarRepository;
import com.project.ProjectFitness.repository.HallRepository;

@Service
public class HallServiceImpl implements HallService{
	
	@Autowired
	private HallRepository hallRepo;
	
	@Autowired
	private FitnessCentarRepository fitnessCentarRepo;
	
	@Autowired
	private FitnessCentarServiceImpl fitnessCentarService;

	@Override
	public Hall getHallById(Long id) {
		return hallRepo.findById(id).orElse(null);
	}

	@Override
	public Hall saveHall(HallDTO hallDto) {
		FitnessCentar fc = fitnessCentarService.getFitnessCentarById(hallDto.getFitnessCentarId());
		
		Hall hall = new Hall(hallDto);
		hallRepo.save(hall);
		fc.getHalls().add(hall);
		fitnessCentarRepo.save(fc);
		return hall;
	}
	
	@Override 
	public Hall updateHall(HallDTO hallDto) {
		Hall hall = getHallById(hallDto.getId());
		hall.setCapacity(hallDto.getCapacity());
		hall.setName(hallDto.getName());
		return hallRepo.save(hall);
	}

	@Override
	public List<Hall> getAllHalls() {
		return hallRepo.findByDeletedFalse();
	}

	@Override
	public Hall deleteHall(Long id) {
		Hall hall = hallRepo.findById(id).orElse(null);
		hall.setDeleted(true);
		FitnessCentar fc = fitnessCentarService.getFitnessCentarById(hall.getFitnessCentarId());
		fc.getHalls().remove(hall);
		fitnessCentarRepo.save(fc);
		hallRepo.save(hall);
		return hall;
	}

	@Override
	public List<Hall> getHallForFitnessCentar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
