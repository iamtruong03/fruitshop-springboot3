package com.truongdev.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truongdev.dto.request.UserCreationRequest;
import com.truongdev.dto.request.UserUpdateRequest;
import com.truongdev.model.User;
import com.truongdev.repository.UserRepository;
import com.truongdev.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

//	// add new user v1
//	@Override
//	public UserDtls saveUser(UserDtls user) {
//		UserDtls saveUser = userRepository.save(user);
//		return saveUser;
//	}

	// add new user v2
	@Override
	public User createUser(UserCreationRequest request) {
		User user = new User();
		user.setName(request.getName());
		user.setMobileNumber(request.getMobileNumber());
		user.setEmail(request.getEmail());
		user.setAddress(request.getAddress());
		user.setCity(request.getCity());
		user.setDistrict(request.getDistrict());
		user.setPassword(request.getPassword());
		return userRepository.save(user);
	}

	@Override
	public User updateUser(Integer userId, UserUpdateRequest request) {
		User user = getUser(userId);

		user.setMobileNumber(request.getMobileNumber());
		user.setEmail(request.getEmail());
		user.setAddress(request.getAddress());
		user.setCity(request.getCity());
		user.setDistrict(request.getDistrict());
		user.setPassword(request.getPassword());

		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(Integer id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	}

	@Override
	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);

	}

}