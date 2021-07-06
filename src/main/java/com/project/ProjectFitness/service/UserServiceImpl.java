package com.project.ProjectFitness.service;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.ProjectFitness.entity.Hall;
import com.project.ProjectFitness.entity.Member;
import com.project.ProjectFitness.entity.ScheduledWorkout;
import com.project.ProjectFitness.entity.User;
import com.project.ProjectFitness.entity.UserType;
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
	public User activateUser(User user) {
		user.setActive(true);
		return userRepository.save(user);
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
			if (sc.getDateTime().isAfter(LocalDateTime.now())) {
				member.getDoneWorkouts().add(sc);
				scheduledWorkouts.remove(sc);
			}
		}
		List<ScheduledWorkout> doneWorkouts = member.getDoneWorkouts();
		userRepository.save(member); // Proveriti da li dobro referencira na dobavljenog usera
		return doneWorkouts;
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
		}
		else return null;

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

	public User cancelScheduleWorkout(Long id) {
		ScheduledWorkout sc = scheduledWorkoutService.getScheduledWorkoutById(id);
		User u = getLoggedUser();
		if (u instanceof Member) {
			Member m = (Member) u;
			m.getCheckInWorkout().remove(sc);
			return userRepository.save(m);
		}
		return null;
	}

}
