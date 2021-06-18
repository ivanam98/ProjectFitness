package com.project.ProjectFitness.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.project.ProjectFitness.entity.User;
import com.project.ProjectFitness.entity.dto.RegisterResponseDTO;
import com.project.ProjectFitness.entity.dto.RegisterUserDTO;
import com.project.ProjectFitness.service.UseraService;

@RestController
@RequestMapping(value = "/api/auth")
public class AuthController {

    @Autowired
    private UseraService useraService;

    @GetMapping("/login")
    public String log(Model model) {
        User user = new User();
        model.addAttribute("Usera", user);
        return "Login";
    }

    @PostMapping("/register")
    public ResponseEntity<RegisterResponseDTO> registerUser(@RequestBody RegisterUserDTO registerUserDTO) throws Exception {
        return new ResponseEntity<>(useraService.registerUser(registerUserDTO), HttpStatus.CREATED);
    }
}
