package com.truongdev.service;

import com.truongdev.model.UserDtls;

public interface UserService {
	public UserDtls saveUser(UserDtls user);
	
	public Boolean exisUser(Integer id);
	 // Thêm phương thức xóa người dùng theo ID
    void deleteUserById(Integer id);
}
