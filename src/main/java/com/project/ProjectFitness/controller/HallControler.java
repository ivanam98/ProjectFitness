package com.project.ProjectFitness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.ProjectFitness.entity.Hall;
import com.project.ProjectFitness.entity.dto.HallDTO;
import com.project.ProjectFitness.service.HallServiceImpl;

@RestController
@RequestMapping(value = "/hall")
public class HallControler {
	
	@Autowired
	private HallServiceImpl hallService;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HallDTO> getHall(@PathVariable("id") Long id) {
		Hall hall = hallService.getHallById(id);
		HallDTO hallDto = new HallDTO(hall);
		return new ResponseEntity<>(hallDto, HttpStatus.OK);
	}
	
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> createHall(@RequestBody HallDTO dto) {
		Hall hall = hallService.saveHall(dto);
		return new ResponseEntity<>(hall,HttpStatus.OK);
	}
	
	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateHall(@RequestBody HallDTO dto) {
		Hall hall = hallService.updateHall(dto);
		return new ResponseEntity<>(hall,HttpStatus.OK);
	}
	
	@PostMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteHall(@PathVariable("id") Long id) {
		Hall hall = hallService.deleteHall(id);
		return new ResponseEntity<>(hall,HttpStatus.OK);
	}
	
}
