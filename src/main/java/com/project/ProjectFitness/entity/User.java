package com.project.ProjectFitness.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.project.ProjectFitness.entity.dto.CoachDTO;
import com.project.ProjectFitness.entity.dto.UserDTO;

@Entity
@Table(name="user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_role", discriminatorType = DiscriminatorType.STRING)
public class User{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private long id;
	
	private String username;
	
	private String password;
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String email;
	
	private LocalDate dateOfBirth;
	
	private UserType userType;
	
	private boolean active;

	public User(long id, String username, String password, String firstName, String lastName, String phoneNumber,
			String email, LocalDate dateOfBirth, UserType userType, boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.userType = userType;
		this.active = active;
	}

	public User() {
	}

	public User(UserDTO userDTO) {
		this.username = userDTO.getUsername();
		this.password = userDTO.getPassword();
		this.firstName =  userDTO.getFirstName();
		this.lastName = userDTO.getLastName();
		this.phoneNumber = userDTO.getNumber();
		this.email = userDTO.getEmail();
		this.dateOfBirth = userDTO.getDateOfBirth();
	}
	
	public User(CoachDTO coachDTO) {
		this.username = coachDTO.getUsername();
		this.password = coachDTO.getPassword();
		this.firstName =  coachDTO.getFirstName();
		this.lastName = coachDTO.getLastName();
		this.phoneNumber = coachDTO.getPhoneNumber();
		this.email = coachDTO.getEmail();
		this.dateOfBirth = coachDTO.getDateOfBirth();
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	
	
	
}