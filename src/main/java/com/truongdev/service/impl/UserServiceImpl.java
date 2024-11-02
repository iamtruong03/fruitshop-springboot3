package com.truongdev.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truongdev.model.UserDtls;
import com.truongdev.repository.UserRepository;
import com.truongdev.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDtls saveUser(UserDtls user) {
		UserDtls saveUser = userRepository.save(user);
		return saveUser;
	}

	 @Override
	    public void deleteUserById(Integer id) {
	        // Kiểm tra xem người dùng có tồn tại không
	        if (!userRepository.existsById(id)) {
	            throw new NoSuchElementException("User not found with ID: " + id);
	        }
	        // Nếu tồn tại, xóa người dùng
	        userRepository.deleteById(id);
	    }

	@Override
	public Boolean exisUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
