package com.truongdev.service;

import java.util.List;

import com.truongdev.dto.request.UserCreationRequest;
import com.truongdev.dto.request.UserUpdateRequest;
import com.truongdev.model.User;

public interface UserService {
//	public UserDtls saveUser(UserDtls user);
	
	// tao user
	public User createUser(UserCreationRequest request);
	public List<User> getUsers();
	public User getUser(Integer id);
	public void deleteUser(Integer userId);
	public User updateUser(Integer userId, UserUpdateRequest request);
}