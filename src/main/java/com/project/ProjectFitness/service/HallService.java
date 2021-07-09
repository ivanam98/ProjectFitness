package com.project.ProjectFitness.service;

import java.util.List;

import com.project.ProjectFitness.entity.Hall;
import com.project.ProjectFitness.entity.dto.HallDTO;

public interface HallService {
	public Hall getHallById(Long id);
	public Hall saveHall(HallDTO hallDto);
	public List<Hall> getAllHalls();
	public Hall deleteHall(Long id);
	public Hall updateHall(HallDTO hallDto);
	

}
