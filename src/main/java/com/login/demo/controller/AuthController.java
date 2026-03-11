package com.login.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.login.demo.DTO.LoginRequest;
import com.login.demo.DTO.RegisterRequest;
import com.login.demo.service.AuthService;
import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class AuthController {
	
	private final AuthService authService;
	
	@PostMapping("/register")
	public String register(@RequestBody RegisterRequest request)
	{
		return authService.register(request);
	}
	
	@PostMapping("/login")
	public String login(@RequestBody LoginRequest request)
	{
		return authService.login(request);
	}
}

