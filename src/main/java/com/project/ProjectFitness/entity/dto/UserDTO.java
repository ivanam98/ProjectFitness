package com.project.ProjectFitness.entity.dto;

import java.time.LocalDate;

import com.project.ProjectFitness.entity.User;
import com.project.ProjectFitness.entity.UserType;

public class UserDTO {
	
	protected String firstName;
	protected String lastName;
	protected String password;
	protected String username;
    protected String email;
    protected String phoneNumber;
    protected String JWTToken;
    protected LocalDate dateOfBirth;
    protected UserType userType;

    public UserDTO() {
		super();
	}

	

	public UserDTO(String firstName, String lastName, String password, String username, String email,
			String phoneNumber, String jWTToken, LocalDate dateOfBirth, String companyName, UserType userType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.username = username;
		this.email = email;
		this.phoneNumber = phoneNumber;
		JWTToken = jWTToken;
		this.dateOfBirth = dateOfBirth;
		this.companyName = companyName;
		this.userType = userType;
	}



	public UserDTO(User user) {
    	setFirstName(user.getFirstName());
    	setLastName(user.getLastName());
    	setUsername(user.getUsername());
    	setEmail(user.getEmail());
    	setNumber(user.getPhoneNumber());
    	setDateOfBirth(user.getDateOfBirth());
    	setUserType(user.getUserType());
    	
    	
    }
    
    public String getJWTToken() {
		return JWTToken;
	}
    
	public void setJWTToken(String jWTToken) {
		JWTToken = jWTToken;
	}
	
	private String companyName;
    
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
	public String getNumber() {
		return phoneNumber;
	}
	
	public void setNumber(String number) {
		this.phoneNumber = number;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	
	
    
	
}
