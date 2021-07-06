package com.project.ProjectFitness.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.Hall;
import com.project.ProjectFitness.entity.dto.FitnessCentarDTO;
import com.project.ProjectFitness.service.FitnessCentarServiceImpl;



@RestController
@RequestMapping(value = "/fitness-centar")
public class FitnessCentarController {
	
	@Autowired
	private FitnessCentarServiceImpl fitnessCentarService;

	
	@GetMapping()
	public ResponseEntity<List<FitnessCentarDTO>> getAllFitnessCentar() {
		List<FitnessCentar> allFitnessCentar = fitnessCentarService.getAllFitnesCentar();
		List<FitnessCentarDTO> allFitnessCemtarDTO = new ArrayList<FitnessCentarDTO>();
		for (FitnessCentar fitnessCentar : allFitnessCentar) {
			FitnessCentarDTO fCDto = new FitnessCentarDTO(fitnessCentar);
			allFitnessCemtarDTO.add(fCDto);
		}
		return new ResponseEntity<>(allFitnessCemtarDTO, HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FitnessCentarDTO> getFitnessCentar(@PathVariable("id") Long id) {
		FitnessCentar fCentar = fitnessCentarService.getFitnessCentarById(id);
		FitnessCentarDTO fc = new FitnessCentarDTO(fCentar);
		return new ResponseEntity<>(fc, HttpStatus.OK);
	}
	
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createFitnessCentar(@RequestBody FitnessCentarDTO dto) {
		FitnessCentar fc = fitnessCentarService.saveFitnessCentar(dto);
		return new ResponseEntity<>(fc,HttpStatus.OK);
	}
	
	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateFitnessCentar(@RequestBody FitnessCentarDTO dto) {
		FitnessCentar fc = fitnessCentarService.saveFitnessCentar(dto);
		return new ResponseEntity<>(fc,HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteFitnessCentar(@PathVariable("id") Long id) {
		FitnessCentar fc = fitnessCentarService.deleteFitnessCentar(id);
		return new ResponseEntity<>(fc,HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}/halls", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Hall>> getFitnessCentarHalls(@PathVariable("id") Long id) {
		List<Hall> halls = fitnessCentarService.getFitnessCentarById(id).getHalls();
		return new ResponseEntity<>(halls, HttpStatus.OK);
	}
	
	
}
