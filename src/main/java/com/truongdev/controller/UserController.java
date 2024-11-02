package com.truongdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truongdev.dto.request.UserCreationRequest;
import com.truongdev.dto.request.UserUpdateRequest;
import com.truongdev.model.User;
import com.truongdev.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	// add new user v2
	@PostMapping
	User createUser(@RequestBody UserCreationRequest request) {
		return userService.createUser(request);
	}

	@GetMapping
	List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/{userId}")
	User getUser(@PathVariable("userId") Integer userId) {
		return userService.getUser(userId);
	}

	@PutMapping("/{userId}")
	User updateUser(@PathVariable Integer userId, @RequestBody UserUpdateRequest request) {
		return userService.updateUser(userId, request);
	}

	@DeleteMapping("/{userId}")
	String deleteUser(@PathVariable Integer userId) {
		userService.deleteUser(userId);
		return "User has been deleted";
	}
}
