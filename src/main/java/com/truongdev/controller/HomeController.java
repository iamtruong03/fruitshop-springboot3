package com.truongdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.truongdev.dto.request.UserCreationRequest;
import com.truongdev.model.User;
import com.truongdev.service.CategoryService;
import com.truongdev.service.UserService;

@Controller
public class HomeController {
 
	@Autowired
	private UserService userService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
//	// add new user v1
//	@PostMapping("/saveUser")
//	public String saveUser() {
//		return "redirect:/register";
//	}
	
	
	
}