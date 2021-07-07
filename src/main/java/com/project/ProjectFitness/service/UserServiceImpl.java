package com.project.ProjectFitness.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.Coach;
import com.project.ProjectFitness.entity.Hall;
import com.project.ProjectFitness.entity.Member;
import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.entity.User;
import com.project.ProjectFitness.entity.UserType;
import com.project.ProjectFitness.entity.dto.CoachDTO;
import com.project.ProjectFitness.entity.dto.UserDTO;
import com.project.ProjectFitness.exception.EntityNotFoundException;
import com.project.ProjectFitness.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ScheduledWorkoutServiceImpl scheduledWorkoutService;

	@Autowired
	private HallServiceImpl hallService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Member registerMember(UserDTO userDTO) {
		Member member = new Member(userDTO);
		member.setUserType(UserType.MEMBER);
		member.setActive(false);
		member.setPassword(passwordEncoder.encode(userDTO.getPassword()));
		return userRepository.save(member);
	}

	@Override
	public User saveUser(UserDTO userDTO) {
		User user = new User(userDTO);
		user.setUserType(UserType.MEMBER);
		user.setActive(false);
		user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
		User saved = userRepository.save(user);
		return saved;
	}

	public User getUserByUsername(String username) {
		User user = userRepository.findByUsername(username);
		return user;
	}

	@Override
	public User getLoggedUser() {
		try {
			return getUserByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				return null;
			} else if (e instanceof EntityNotFoundException) {
				return null; // Vraca null za korisnika koji nije ulogovan kada se pozove getLoggedUser()
			}
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public User getUserById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User activateUser(Long id) {
		User user = getUserById(id);
		if (user != null) {
			user.setActive(true);
			return userRepository.save(user);
		} else {
			return user;
		}

	}

	@Override
	public List<ScheduledWorkout> getDoneWorkOuts() {
		Member member = (Member) getLoggedUser();

		List<ScheduledWorkout> scheduledWorkouts = member.getCheckInWorkout(); // Zakazani treninzi

		Iterator<ScheduledWorkout> itr = scheduledWorkouts.iterator(); // Ovde vrsimo svaki put proveru za one koji su
																		// zakazani ako im je prosao datum, da se brisu
																		// iz liste zakazanih i prebace u listu gotovih
		while (itr.hasNext()) {
			ScheduledWorkout sc = itr.next();
			if (sc.getDateTime().isBefore(LocalDateTime.now())) {
				member.getDoneWorkouts().add(sc);
				itr.remove();
			}
		}
		userRepository.save(member); // Proveriti da li dobro referencira na dobavljenog usera
		return member.getDoneWorkouts();
	}

	@Override
	public List<ScheduledWorkout> getScheduledWorkouts() {
		Member member = (Member) getLoggedUser();

		List<ScheduledWorkout> scheduledWorkouts = member.getCheckInWorkout(); // Zakazani treninzi
		if (scheduledWorkouts.size() != 0) {
			Iterator<ScheduledWorkout> itr = scheduledWorkouts.iterator(); // Ovde vrsimo svaki put proveru za one koji
																			// su
			// zakazani ako im je prosao datum, da se brisu
			// iz liste zakazanih i prebace u listu gotovih
			while (itr.hasNext()) {
				ScheduledWorkout sc = itr.next();
				if (sc.getDateTime().isBefore(LocalDateTime.now())) {
					member.getDoneWorkouts().add(sc);
					itr.remove();

				}
			}
			userRepository.save(member); // Proveriti da li dobro referencira na dobavljenog usera
			return scheduledWorkouts;
		} else
			return null;

	}

	@Override
	public User scheduleWorkout(Long id) {
		ScheduledWorkout sc = scheduledWorkoutService.getScheduledWorkoutById(id);
		Hall hall = hallService.getHallById(sc.getHallId());
		Member m = (Member) getLoggedUser();

		if (sc.getMembersCount() < hall.getCapacity()) {
			m.getCheckInWorkout().add(sc);
			return userRepository.save(m);
		}
		return null;

	}

	@Override
	public User cancelScheduleWorkout(Long id) {
		ScheduledWorkout sc = scheduledWorkoutService.getScheduledWorkoutById(id);
		Member m = (Member) getLoggedUser();

		m.getCheckInWorkout().remove(sc);
		return userRepository.save(m);
	}

	@Override
	public List<UserDTO> getInactiveUsers() {
		List<User> inactiveUsers = userRepository.findByActiveFalse();
		List<UserDTO> inactiveDTO = new ArrayList<UserDTO>();
		for (User user : inactiveUsers) {
			UserDTO dto = new UserDTO(user);
			inactiveDTO.add(dto);
		}
		return inactiveDTO;
	}
	@Override
	public Coach registerCoach(CoachDTO coachDTO) {
		Coach coach = new Coach(coachDTO);
		coach.setUserType(UserType.COACH);
		coach.setActive(true);
		coach.setPassword(passwordEncoder.encode(coach.getPassword()));
		return userRepository.save(coach);
	}
	
	@Override
	public List<Coach> getCoaches() {
		List<User> users = userRepository.findAll();
		List<Coach> coaches = new ArrayList<>();
		for (User user : users) {
			if(user.getUserType().equals(UserType.COACH)) {
				Coach c = (Coach) user;
				coaches.add(c);
			}
		}
		return coaches;
	}

}
