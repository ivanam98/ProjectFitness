package com.project.ProjectFitness.entity.dto;

import java.time.LocalDate;

import com.project.ProjectFitness.entity.FitnessCentar;
import com.project.ProjectFitness.entity.UserType;

public class CoachDTO {

	protected Long id;
	protected String firstName;
	protected String lastName;
	protected String password;
	protected String username;
	protected String email;
	protected String phoneNumber;
	protected LocalDate dateOfBirth;
	protected UserType userType;
	protected FitnessCentar fitnessCentar;
	protected Long fitnessCentarId;

	public CoachDTO(Long id, String firstName, String lastName, String password, String username, String email,
			String phoneNumber, LocalDate dateOfBirth, UserType userType, FitnessCentar fitnessCentar,
			Long fitnessCentarId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.username = username;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.userType = userType;
		this.fitnessCentar = fitnessCentar;
		this.fitnessCentarId = fitnessCentarId;
	}

	public CoachDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public FitnessCentar getFitnessCentar() {
		return fitnessCentar;
	}

	public void setFitnessCentar(FitnessCentar fitnessCentar) {
		this.fitnessCentar = fitnessCentar;
	}

	public Long getFitnessCentarId() {
		return fitnessCentarId;
	}

	public void setFitnessCentarId(Long fitnessCentarId) {
		this.fitnessCentarId = fitnessCentarId;
	}

}
